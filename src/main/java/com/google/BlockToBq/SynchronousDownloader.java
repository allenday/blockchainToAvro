package com.google.BlockToBq;

import com.google.BlockToBq.Ingestion;
import com.google.common.collect.Iterables;
import com.google.common.util.concurrent.ListenableFuture;
import org.bitcoinj.core.*;
import org.bitcoinj.core.listeners.BlocksDownloadedEventListener;
import org.bitcoinj.core.listeners.PeerConnectedEventListener;
import org.bitcoinj.core.listeners.PreMessageReceivedEventListener;
import org.bitcoinj.net.discovery.DnsDiscovery;
import org.bitcoinj.net.discovery.PeerDiscovery;
import org.bitcoinj.net.discovery.PeerDiscoveryException;
import org.bitcoinj.net.discovery.SeedPeers;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.store.*;
import org.bitcoinj.utils.Threading;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;

public class SynchronousDownloader {
  public static final String AGENT_NAME = "BQ-BTC";
  public static final String AGENT_VERSION = "1.0";
  public static final int MAX_CONNECTIONS = 1000;
  public static final int CONNECTION_TIMEOUT_MILLIS = 5000;
  private static Ingestion.AvroFileWriter writer;
  private static Ingestion ingester;

  final static NetworkParameters NETWORK_PARAMETERS = MainNetParams.get();
  final static VersionMessage ver = new VersionMessage(NETWORK_PARAMETERS, 42);
  private static Sha256Hash bitcoindChainHead = NETWORK_PARAMETERS.getGenesisBlock().getHash();

  final static String recentHash = "000000000000000000734abec19060f1dfb71cc3543338f9466424adc1ef5936";

  public static void main(String[] args) throws BlockStoreException, ExecutionException, InterruptedException, IOException {

    File file = new File(args[0]);//args[0]);
    writer = new Ingestion.AvroFileWriter(file);
    ingester = new Ingestion(writer);

//    ver.localServices = VersionMessage.NODE_NETWORK;
//    final Peer bitcoind = new Peer(NETWORK_PARAMETERS, ver,
//        new BlockChain(NETWORK_PARAMETERS, new MemoryBlockStore(NETWORK_PARAMETERS)),
//        new PeerAddress(NETWORK_PARAMETERS, InetAddress.getLocalHost()));

    //BlockStore blockStore = new PostgresFullPrunedBlockStore(NETWORK_PARAMETERS, 1000, "35.225.83.56", "bitcoinj", "postgres", "root1234");
    LevelDBFullPrunedBlockStore blockStore = new LevelDBFullPrunedBlockStore(NETWORK_PARAMETERS, ".data/", Integer.MAX_VALUE);
    //BlockChain blockChain = new BlockChain(NETWORK_PARAMETERS, blockStore);
    FullPrunedBlockChain blockChain = new FullPrunedBlockChain(NETWORK_PARAMETERS, blockStore);

    // configure what peers we connect to
    PeerGroup peerGroup = new PeerGroup(NETWORK_PARAMETERS, blockChain);
    peerGroup.setUserAgent(AGENT_NAME, AGENT_VERSION);
    peerGroup.addPeerDiscovery(new DnsDiscovery(NETWORK_PARAMETERS));
    peerGroup.addPeerDiscovery(new SeedPeers(NETWORK_PARAMETERS));
    peerGroup.setUserAgent(AGENT_NAME, AGENT_VERSION);
    peerGroup.setMaxConnections(MAX_CONNECTIONS);
    peerGroup.setConnectTimeoutMillis(CONNECTION_TIMEOUT_MILLIS);

    peerGroup.start();

    while (null == peerGroup.getDownloadPeer()) {
      System.err.println("connecting to peers");
      Thread.sleep(1000*5);
    }

    Peer peer = peerGroup.getDownloadPeer();

    Sha256Hash genesisBlock = NETWORK_PARAMETERS.getGenesisBlock().getHash();
    //TODO
    Sha256Hash recentBlock = Sha256Hash.wrap(recentHash);

    //Block b = peer.getBlock(blockStore.getChainHead().getHeader().getHash()).get();
    Block block = peer.getBlock(recentBlock).get();
    int height = blockChain.getBestChainHeight();
    int retrieved = 0;
    while (block.getHash() != Sha256Hash.ZERO_HASH) {
      System.err.println("ingestion count: "+retrieved);
      ingester.onBlock(block);
      /*
      Long difficulty = block.getDifficultyTarget();
      Long blockVersion = block.getVersion();
      Date blockDate = block.getTime();
      Long nonce = block.getNonce();
      BigInteger work = block.getWork();
      String blockHash = block.getHashAsString();

      System.err.println("height="+height+" retrieved="+retrieved+" hash="+blockHash);
      for (Transaction tx : block.getTransactions()) {
        String txHash = tx.getHashAsString();
        Long txVersion = tx.getVersion();
        Long coinRate = tx.getExchangeRate().coin.getValue();
        Long fiatRate = tx.getExchangeRate().fiat.getValue();
        String fiatCode = tx.getExchangeRate().fiat.currencyCode;
        Long fee = tx.getFee().getValue();
        String memo = tx.getMemo();
        Long inputValue = tx.getInputSum().getValue();
        Long outputValue = tx.getOutputSum().getValue();

        for (TransactionInput i : tx.getInputs()) {

        }
        for (TransactionOutput o : tx.getOutputs()) {

        }
      }
      */
      retrieved++;
      block = peer.getBlock(block.getPrevBlockHash()).get();
      //System.err.println(b);
    }
  }
}