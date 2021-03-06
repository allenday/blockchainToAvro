/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.google.blockToBq.generated;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroBitcoinBlock extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3166889701287631934L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroBitcoinBlock\",\"namespace\":\"com.google.blockToBq.generated\",\"fields\":[{\"name\":\"block_id\",\"type\":\"string\"},{\"name\":\"previous_block\",\"type\":\"string\"},{\"name\":\"merkle_root\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"difficulty\",\"type\":\"long\"},{\"name\":\"nonce\",\"type\":\"long\"},{\"name\":\"version\",\"type\":\"long\"},{\"name\":\"work\",\"type\":[\"long\",\"null\"]},{\"name\":\"work_error\",\"type\":[\"string\",\"null\"]},{\"name\":\"height\",\"type\":\"int\"},{\"name\":\"transactions\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AvroBitcoinTransaction\",\"fields\":[{\"name\":\"transaction_id\",\"type\":\"string\"},{\"name\":\"inputs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AvroBitcoinInput\",\"fields\":[{\"name\":\"script_bytes\",\"type\":\"bytes\"},{\"name\":\"script_string\",\"type\":[\"string\",\"null\"]},{\"name\":\"script_string_error\",\"type\":[\"string\",\"null\"]},{\"name\":\"sequence_number\",\"type\":\"long\"},{\"name\":\"pubkey_base58\",\"type\":[\"string\",\"null\"]},{\"name\":\"pubkey_base58_error\",\"type\":[\"string\",\"null\"]}]}}},{\"name\":\"outputs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AvroBitcoinOutput\",\"fields\":[{\"name\":\"satoshis\",\"type\":[\"long\",\"null\"]},{\"name\":\"script_bytes\",\"type\":\"bytes\"},{\"name\":\"script_string\",\"type\":[\"string\",\"null\"]},{\"name\":\"script_string_error\",\"type\":[\"string\",\"null\"]},{\"name\":\"pubkey_base58\",\"type\":[\"string\",\"null\"]},{\"name\":\"pubkey_base58_error\",\"type\":[\"string\",\"null\"]}]}}}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroBitcoinBlock> ENCODER =
      new BinaryMessageEncoder<AvroBitcoinBlock>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroBitcoinBlock> DECODER =
      new BinaryMessageDecoder<AvroBitcoinBlock>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<AvroBitcoinBlock> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<AvroBitcoinBlock> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroBitcoinBlock>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this AvroBitcoinBlock to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a AvroBitcoinBlock from a ByteBuffer. */
  public static AvroBitcoinBlock fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence block_id;
  @Deprecated public java.lang.CharSequence previous_block;
  @Deprecated public java.lang.CharSequence merkle_root;
  @Deprecated public long timestamp;
  @Deprecated public long difficulty;
  @Deprecated public long nonce;
  @Deprecated public long version;
  @Deprecated public java.lang.Long work;
  @Deprecated public java.lang.CharSequence work_error;
  @Deprecated public int height;
  @Deprecated public java.util.List<com.google.blockToBq.generated.AvroBitcoinTransaction> transactions;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroBitcoinBlock() {}

  /**
   * All-args constructor.
   * @param block_id The new value for block_id
   * @param previous_block The new value for previous_block
   * @param merkle_root The new value for merkle_root
   * @param timestamp The new value for timestamp
   * @param difficulty The new value for difficulty
   * @param nonce The new value for nonce
   * @param version The new value for version
   * @param work The new value for work
   * @param work_error The new value for work_error
   * @param height The new value for height
   * @param transactions The new value for transactions
   */
  public AvroBitcoinBlock(java.lang.CharSequence block_id, java.lang.CharSequence previous_block, java.lang.CharSequence merkle_root, java.lang.Long timestamp, java.lang.Long difficulty, java.lang.Long nonce, java.lang.Long version, java.lang.Long work, java.lang.CharSequence work_error, java.lang.Integer height, java.util.List<com.google.blockToBq.generated.AvroBitcoinTransaction> transactions) {
    this.block_id = block_id;
    this.previous_block = previous_block;
    this.merkle_root = merkle_root;
    this.timestamp = timestamp;
    this.difficulty = difficulty;
    this.nonce = nonce;
    this.version = version;
    this.work = work;
    this.work_error = work_error;
    this.height = height;
    this.transactions = transactions;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return block_id;
    case 1: return previous_block;
    case 2: return merkle_root;
    case 3: return timestamp;
    case 4: return difficulty;
    case 5: return nonce;
    case 6: return version;
    case 7: return work;
    case 8: return work_error;
    case 9: return height;
    case 10: return transactions;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: block_id = (java.lang.CharSequence)value$; break;
    case 1: previous_block = (java.lang.CharSequence)value$; break;
    case 2: merkle_root = (java.lang.CharSequence)value$; break;
    case 3: timestamp = (java.lang.Long)value$; break;
    case 4: difficulty = (java.lang.Long)value$; break;
    case 5: nonce = (java.lang.Long)value$; break;
    case 6: version = (java.lang.Long)value$; break;
    case 7: work = (java.lang.Long)value$; break;
    case 8: work_error = (java.lang.CharSequence)value$; break;
    case 9: height = (java.lang.Integer)value$; break;
    case 10: transactions = (java.util.List<com.google.blockToBq.generated.AvroBitcoinTransaction>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'block_id' field.
   * @return The value of the 'block_id' field.
   */
  public java.lang.CharSequence getBlockId() {
    return block_id;
  }

  /**
   * Sets the value of the 'block_id' field.
   * @param value the value to set.
   */
  public void setBlockId(java.lang.CharSequence value) {
    this.block_id = value;
  }

  /**
   * Gets the value of the 'previous_block' field.
   * @return The value of the 'previous_block' field.
   */
  public java.lang.CharSequence getPreviousBlock() {
    return previous_block;
  }

  /**
   * Sets the value of the 'previous_block' field.
   * @param value the value to set.
   */
  public void setPreviousBlock(java.lang.CharSequence value) {
    this.previous_block = value;
  }

  /**
   * Gets the value of the 'merkle_root' field.
   * @return The value of the 'merkle_root' field.
   */
  public java.lang.CharSequence getMerkleRoot() {
    return merkle_root;
  }

  /**
   * Sets the value of the 'merkle_root' field.
   * @param value the value to set.
   */
  public void setMerkleRoot(java.lang.CharSequence value) {
    this.merkle_root = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'difficulty' field.
   * @return The value of the 'difficulty' field.
   */
  public java.lang.Long getDifficulty() {
    return difficulty;
  }

  /**
   * Sets the value of the 'difficulty' field.
   * @param value the value to set.
   */
  public void setDifficulty(java.lang.Long value) {
    this.difficulty = value;
  }

  /**
   * Gets the value of the 'nonce' field.
   * @return The value of the 'nonce' field.
   */
  public java.lang.Long getNonce() {
    return nonce;
  }

  /**
   * Sets the value of the 'nonce' field.
   * @param value the value to set.
   */
  public void setNonce(java.lang.Long value) {
    this.nonce = value;
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public java.lang.Long getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.Long value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'work' field.
   * @return The value of the 'work' field.
   */
  public java.lang.Long getWork() {
    return work;
  }

  /**
   * Sets the value of the 'work' field.
   * @param value the value to set.
   */
  public void setWork(java.lang.Long value) {
    this.work = value;
  }

  /**
   * Gets the value of the 'work_error' field.
   * @return The value of the 'work_error' field.
   */
  public java.lang.CharSequence getWorkError() {
    return work_error;
  }

  /**
   * Sets the value of the 'work_error' field.
   * @param value the value to set.
   */
  public void setWorkError(java.lang.CharSequence value) {
    this.work_error = value;
  }

  /**
   * Gets the value of the 'height' field.
   * @return The value of the 'height' field.
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * Sets the value of the 'height' field.
   * @param value the value to set.
   */
  public void setHeight(java.lang.Integer value) {
    this.height = value;
  }

  /**
   * Gets the value of the 'transactions' field.
   * @return The value of the 'transactions' field.
   */
  public java.util.List<com.google.blockToBq.generated.AvroBitcoinTransaction> getTransactions() {
    return transactions;
  }

  /**
   * Sets the value of the 'transactions' field.
   * @param value the value to set.
   */
  public void setTransactions(java.util.List<com.google.blockToBq.generated.AvroBitcoinTransaction> value) {
    this.transactions = value;
  }

  /**
   * Creates a new AvroBitcoinBlock RecordBuilder.
   * @return A new AvroBitcoinBlock RecordBuilder
   */
  public static com.google.blockToBq.generated.AvroBitcoinBlock.Builder newBuilder() {
    return new com.google.blockToBq.generated.AvroBitcoinBlock.Builder();
  }

  /**
   * Creates a new AvroBitcoinBlock RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroBitcoinBlock RecordBuilder
   */
  public static com.google.blockToBq.generated.AvroBitcoinBlock.Builder newBuilder(com.google.blockToBq.generated.AvroBitcoinBlock.Builder other) {
    return new com.google.blockToBq.generated.AvroBitcoinBlock.Builder(other);
  }

  /**
   * Creates a new AvroBitcoinBlock RecordBuilder by copying an existing AvroBitcoinBlock instance.
   * @param other The existing instance to copy.
   * @return A new AvroBitcoinBlock RecordBuilder
   */
  public static com.google.blockToBq.generated.AvroBitcoinBlock.Builder newBuilder(com.google.blockToBq.generated.AvroBitcoinBlock other) {
    return new com.google.blockToBq.generated.AvroBitcoinBlock.Builder(other);
  }

  /**
   * RecordBuilder for AvroBitcoinBlock instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroBitcoinBlock>
    implements org.apache.avro.data.RecordBuilder<AvroBitcoinBlock> {

    private java.lang.CharSequence block_id;
    private java.lang.CharSequence previous_block;
    private java.lang.CharSequence merkle_root;
    private long timestamp;
    private long difficulty;
    private long nonce;
    private long version;
    private java.lang.Long work;
    private java.lang.CharSequence work_error;
    private int height;
    private java.util.List<com.google.blockToBq.generated.AvroBitcoinTransaction> transactions;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.google.blockToBq.generated.AvroBitcoinBlock.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.block_id)) {
        this.block_id = data().deepCopy(fields()[0].schema(), other.block_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.previous_block)) {
        this.previous_block = data().deepCopy(fields()[1].schema(), other.previous_block);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.merkle_root)) {
        this.merkle_root = data().deepCopy(fields()[2].schema(), other.merkle_root);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.difficulty)) {
        this.difficulty = data().deepCopy(fields()[4].schema(), other.difficulty);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.nonce)) {
        this.nonce = data().deepCopy(fields()[5].schema(), other.nonce);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.version)) {
        this.version = data().deepCopy(fields()[6].schema(), other.version);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.work)) {
        this.work = data().deepCopy(fields()[7].schema(), other.work);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.work_error)) {
        this.work_error = data().deepCopy(fields()[8].schema(), other.work_error);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.height)) {
        this.height = data().deepCopy(fields()[9].schema(), other.height);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.transactions)) {
        this.transactions = data().deepCopy(fields()[10].schema(), other.transactions);
        fieldSetFlags()[10] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvroBitcoinBlock instance
     * @param other The existing instance to copy.
     */
    private Builder(com.google.blockToBq.generated.AvroBitcoinBlock other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.block_id)) {
        this.block_id = data().deepCopy(fields()[0].schema(), other.block_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.previous_block)) {
        this.previous_block = data().deepCopy(fields()[1].schema(), other.previous_block);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.merkle_root)) {
        this.merkle_root = data().deepCopy(fields()[2].schema(), other.merkle_root);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[3].schema(), other.timestamp);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.difficulty)) {
        this.difficulty = data().deepCopy(fields()[4].schema(), other.difficulty);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.nonce)) {
        this.nonce = data().deepCopy(fields()[5].schema(), other.nonce);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.version)) {
        this.version = data().deepCopy(fields()[6].schema(), other.version);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.work)) {
        this.work = data().deepCopy(fields()[7].schema(), other.work);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.work_error)) {
        this.work_error = data().deepCopy(fields()[8].schema(), other.work_error);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.height)) {
        this.height = data().deepCopy(fields()[9].schema(), other.height);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.transactions)) {
        this.transactions = data().deepCopy(fields()[10].schema(), other.transactions);
        fieldSetFlags()[10] = true;
      }
    }

    /**
      * Gets the value of the 'block_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getBlockId() {
      return block_id;
    }

    /**
      * Sets the value of the 'block_id' field.
      * @param value The value of 'block_id'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder setBlockId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.block_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'block_id' field has been set.
      * @return True if the 'block_id' field has been set, false otherwise.
      */
    public boolean hasBlockId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'block_id' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder clearBlockId() {
      block_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'previous_block' field.
      * @return The value.
      */
    public java.lang.CharSequence getPreviousBlock() {
      return previous_block;
    }

    /**
      * Sets the value of the 'previous_block' field.
      * @param value The value of 'previous_block'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder setPreviousBlock(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.previous_block = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'previous_block' field has been set.
      * @return True if the 'previous_block' field has been set, false otherwise.
      */
    public boolean hasPreviousBlock() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'previous_block' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder clearPreviousBlock() {
      previous_block = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'merkle_root' field.
      * @return The value.
      */
    public java.lang.CharSequence getMerkleRoot() {
      return merkle_root;
    }

    /**
      * Sets the value of the 'merkle_root' field.
      * @param value The value of 'merkle_root'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder setMerkleRoot(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.merkle_root = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'merkle_root' field has been set.
      * @return True if the 'merkle_root' field has been set, false otherwise.
      */
    public boolean hasMerkleRoot() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'merkle_root' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder clearMerkleRoot() {
      merkle_root = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder setTimestamp(long value) {
      validate(fields()[3], value);
      this.timestamp = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder clearTimestamp() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'difficulty' field.
      * @return The value.
      */
    public java.lang.Long getDifficulty() {
      return difficulty;
    }

    /**
      * Sets the value of the 'difficulty' field.
      * @param value The value of 'difficulty'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder setDifficulty(long value) {
      validate(fields()[4], value);
      this.difficulty = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'difficulty' field has been set.
      * @return True if the 'difficulty' field has been set, false otherwise.
      */
    public boolean hasDifficulty() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'difficulty' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder clearDifficulty() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'nonce' field.
      * @return The value.
      */
    public java.lang.Long getNonce() {
      return nonce;
    }

    /**
      * Sets the value of the 'nonce' field.
      * @param value The value of 'nonce'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder setNonce(long value) {
      validate(fields()[5], value);
      this.nonce = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'nonce' field has been set.
      * @return True if the 'nonce' field has been set, false otherwise.
      */
    public boolean hasNonce() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'nonce' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder clearNonce() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public java.lang.Long getVersion() {
      return version;
    }

    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder setVersion(long value) {
      validate(fields()[6], value);
      this.version = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder clearVersion() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'work' field.
      * @return The value.
      */
    public java.lang.Long getWork() {
      return work;
    }

    /**
      * Sets the value of the 'work' field.
      * @param value The value of 'work'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder setWork(java.lang.Long value) {
      validate(fields()[7], value);
      this.work = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'work' field has been set.
      * @return True if the 'work' field has been set, false otherwise.
      */
    public boolean hasWork() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'work' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder clearWork() {
      work = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'work_error' field.
      * @return The value.
      */
    public java.lang.CharSequence getWorkError() {
      return work_error;
    }

    /**
      * Sets the value of the 'work_error' field.
      * @param value The value of 'work_error'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder setWorkError(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.work_error = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'work_error' field has been set.
      * @return True if the 'work_error' field has been set, false otherwise.
      */
    public boolean hasWorkError() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'work_error' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder clearWorkError() {
      work_error = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'height' field.
      * @return The value.
      */
    public java.lang.Integer getHeight() {
      return height;
    }

    /**
      * Sets the value of the 'height' field.
      * @param value The value of 'height'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder setHeight(int value) {
      validate(fields()[9], value);
      this.height = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'height' field has been set.
      * @return True if the 'height' field has been set, false otherwise.
      */
    public boolean hasHeight() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'height' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder clearHeight() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'transactions' field.
      * @return The value.
      */
    public java.util.List<com.google.blockToBq.generated.AvroBitcoinTransaction> getTransactions() {
      return transactions;
    }

    /**
      * Sets the value of the 'transactions' field.
      * @param value The value of 'transactions'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder setTransactions(java.util.List<com.google.blockToBq.generated.AvroBitcoinTransaction> value) {
      validate(fields()[10], value);
      this.transactions = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'transactions' field has been set.
      * @return True if the 'transactions' field has been set, false otherwise.
      */
    public boolean hasTransactions() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'transactions' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinBlock.Builder clearTransactions() {
      transactions = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroBitcoinBlock build() {
      try {
        AvroBitcoinBlock record = new AvroBitcoinBlock();
        record.block_id = fieldSetFlags()[0] ? this.block_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.previous_block = fieldSetFlags()[1] ? this.previous_block : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.merkle_root = fieldSetFlags()[2] ? this.merkle_root : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.timestamp = fieldSetFlags()[3] ? this.timestamp : (java.lang.Long) defaultValue(fields()[3]);
        record.difficulty = fieldSetFlags()[4] ? this.difficulty : (java.lang.Long) defaultValue(fields()[4]);
        record.nonce = fieldSetFlags()[5] ? this.nonce : (java.lang.Long) defaultValue(fields()[5]);
        record.version = fieldSetFlags()[6] ? this.version : (java.lang.Long) defaultValue(fields()[6]);
        record.work = fieldSetFlags()[7] ? this.work : (java.lang.Long) defaultValue(fields()[7]);
        record.work_error = fieldSetFlags()[8] ? this.work_error : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.height = fieldSetFlags()[9] ? this.height : (java.lang.Integer) defaultValue(fields()[9]);
        record.transactions = fieldSetFlags()[10] ? this.transactions : (java.util.List<com.google.blockToBq.generated.AvroBitcoinTransaction>) defaultValue(fields()[10]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroBitcoinBlock>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroBitcoinBlock>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroBitcoinBlock>
    READER$ = (org.apache.avro.io.DatumReader<AvroBitcoinBlock>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
