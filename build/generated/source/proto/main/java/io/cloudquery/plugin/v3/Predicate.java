// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudquery/plugin/v3/plugin.proto

// Protobuf Java Version: 4.26.1
package io.cloudquery.plugin.v3;

/**
 * Protobuf type {@code cloudquery.plugin.v3.Predicate}
 */
public final class Predicate extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:cloudquery.plugin.v3.Predicate)
    PredicateOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Predicate.class.getName());
  }
  // Use Predicate.newBuilder() to construct.
  private Predicate(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Predicate() {
    operator_ = 0;
    column_ = "";
    record_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_Predicate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_Predicate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.cloudquery.plugin.v3.Predicate.class, io.cloudquery.plugin.v3.Predicate.Builder.class);
  }

  /**
   * Protobuf enum {@code cloudquery.plugin.v3.Predicate.Operator}
   */
  public enum Operator
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * LT = 1;
     * LTE = 2;
     * GT = 3;  
     * GTE = 4;
     * </pre>
     *
     * <code>EQ = 0;</code>
     */
    EQ(0),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 26,
        /* patch= */ 1,
        /* suffix= */ "",
        Operator.class.getName());
    }
    /**
     * <pre>
     * LT = 1;
     * LTE = 2;
     * GT = 3;  
     * GTE = 4;
     * </pre>
     *
     * <code>EQ = 0;</code>
     */
    public static final int EQ_VALUE = 0;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Operator valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Operator forNumber(int value) {
      switch (value) {
        case 0: return EQ;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operator>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operator> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operator>() {
            public Operator findValueByNumber(int number) {
              return Operator.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.cloudquery.plugin.v3.Predicate.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operator[] VALUES = values();

    public static Operator valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Operator(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:cloudquery.plugin.v3.Predicate.Operator)
  }

  public static final int OPERATOR_FIELD_NUMBER = 1;
  private int operator_ = 0;
  /**
   * <code>.cloudquery.plugin.v3.Predicate.Operator operator = 1;</code>
   * @return The enum numeric value on the wire for operator.
   */
  @java.lang.Override public int getOperatorValue() {
    return operator_;
  }
  /**
   * <code>.cloudquery.plugin.v3.Predicate.Operator operator = 1;</code>
   * @return The operator.
   */
  @java.lang.Override public io.cloudquery.plugin.v3.Predicate.Operator getOperator() {
    io.cloudquery.plugin.v3.Predicate.Operator result = io.cloudquery.plugin.v3.Predicate.Operator.forNumber(operator_);
    return result == null ? io.cloudquery.plugin.v3.Predicate.Operator.UNRECOGNIZED : result;
  }

  public static final int COLUMN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object column_ = "";
  /**
   * <code>string column = 2;</code>
   * @return The column.
   */
  @java.lang.Override
  public java.lang.String getColumn() {
    java.lang.Object ref = column_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      column_ = s;
      return s;
    }
  }
  /**
   * <code>string column = 2;</code>
   * @return The bytes for column.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getColumnBytes() {
    java.lang.Object ref = column_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      column_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECORD_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString record_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * marshalled arrow.Record
   * </pre>
   *
   * <code>bytes record = 3;</code>
   * @return The record.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRecord() {
    return record_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (operator_ != io.cloudquery.plugin.v3.Predicate.Operator.EQ.getNumber()) {
      output.writeEnum(1, operator_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(column_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, column_);
    }
    if (!record_.isEmpty()) {
      output.writeBytes(3, record_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operator_ != io.cloudquery.plugin.v3.Predicate.Operator.EQ.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operator_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(column_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, column_);
    }
    if (!record_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, record_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.cloudquery.plugin.v3.Predicate)) {
      return super.equals(obj);
    }
    io.cloudquery.plugin.v3.Predicate other = (io.cloudquery.plugin.v3.Predicate) obj;

    if (operator_ != other.operator_) return false;
    if (!getColumn()
        .equals(other.getColumn())) return false;
    if (!getRecord()
        .equals(other.getRecord())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + operator_;
    hash = (37 * hash) + COLUMN_FIELD_NUMBER;
    hash = (53 * hash) + getColumn().hashCode();
    hash = (37 * hash) + RECORD_FIELD_NUMBER;
    hash = (53 * hash) + getRecord().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.cloudquery.plugin.v3.Predicate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.cloudquery.plugin.v3.Predicate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.Predicate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.cloudquery.plugin.v3.Predicate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.Predicate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.cloudquery.plugin.v3.Predicate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.Predicate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.cloudquery.plugin.v3.Predicate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.cloudquery.plugin.v3.Predicate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.cloudquery.plugin.v3.Predicate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.Predicate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.cloudquery.plugin.v3.Predicate parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.cloudquery.plugin.v3.Predicate prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code cloudquery.plugin.v3.Predicate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cloudquery.plugin.v3.Predicate)
      io.cloudquery.plugin.v3.PredicateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_Predicate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_Predicate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.cloudquery.plugin.v3.Predicate.class, io.cloudquery.plugin.v3.Predicate.Builder.class);
    }

    // Construct using io.cloudquery.plugin.v3.Predicate.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      operator_ = 0;
      column_ = "";
      record_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_Predicate_descriptor;
    }

    @java.lang.Override
    public io.cloudquery.plugin.v3.Predicate getDefaultInstanceForType() {
      return io.cloudquery.plugin.v3.Predicate.getDefaultInstance();
    }

    @java.lang.Override
    public io.cloudquery.plugin.v3.Predicate build() {
      io.cloudquery.plugin.v3.Predicate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.cloudquery.plugin.v3.Predicate buildPartial() {
      io.cloudquery.plugin.v3.Predicate result = new io.cloudquery.plugin.v3.Predicate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.cloudquery.plugin.v3.Predicate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operator_ = operator_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.column_ = column_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.record_ = record_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.cloudquery.plugin.v3.Predicate) {
        return mergeFrom((io.cloudquery.plugin.v3.Predicate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.cloudquery.plugin.v3.Predicate other) {
      if (other == io.cloudquery.plugin.v3.Predicate.getDefaultInstance()) return this;
      if (other.operator_ != 0) {
        setOperatorValue(other.getOperatorValue());
      }
      if (!other.getColumn().isEmpty()) {
        column_ = other.column_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getRecord() != com.google.protobuf.ByteString.EMPTY) {
        setRecord(other.getRecord());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              operator_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              column_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              record_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int operator_ = 0;
    /**
     * <code>.cloudquery.plugin.v3.Predicate.Operator operator = 1;</code>
     * @return The enum numeric value on the wire for operator.
     */
    @java.lang.Override public int getOperatorValue() {
      return operator_;
    }
    /**
     * <code>.cloudquery.plugin.v3.Predicate.Operator operator = 1;</code>
     * @param value The enum numeric value on the wire for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorValue(int value) {
      operator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cloudquery.plugin.v3.Predicate.Operator operator = 1;</code>
     * @return The operator.
     */
    @java.lang.Override
    public io.cloudquery.plugin.v3.Predicate.Operator getOperator() {
      io.cloudquery.plugin.v3.Predicate.Operator result = io.cloudquery.plugin.v3.Predicate.Operator.forNumber(operator_);
      return result == null ? io.cloudquery.plugin.v3.Predicate.Operator.UNRECOGNIZED : result;
    }
    /**
     * <code>.cloudquery.plugin.v3.Predicate.Operator operator = 1;</code>
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(io.cloudquery.plugin.v3.Predicate.Operator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      operator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.cloudquery.plugin.v3.Predicate.Operator operator = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      bitField0_ = (bitField0_ & ~0x00000001);
      operator_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object column_ = "";
    /**
     * <code>string column = 2;</code>
     * @return The column.
     */
    public java.lang.String getColumn() {
      java.lang.Object ref = column_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        column_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string column = 2;</code>
     * @return The bytes for column.
     */
    public com.google.protobuf.ByteString
        getColumnBytes() {
      java.lang.Object ref = column_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        column_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string column = 2;</code>
     * @param value The column to set.
     * @return This builder for chaining.
     */
    public Builder setColumn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      column_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string column = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearColumn() {
      column_ = getDefaultInstance().getColumn();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string column = 2;</code>
     * @param value The bytes for column to set.
     * @return This builder for chaining.
     */
    public Builder setColumnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      column_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString record_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * marshalled arrow.Record
     * </pre>
     *
     * <code>bytes record = 3;</code>
     * @return The record.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRecord() {
      return record_;
    }
    /**
     * <pre>
     * marshalled arrow.Record
     * </pre>
     *
     * <code>bytes record = 3;</code>
     * @param value The record to set.
     * @return This builder for chaining.
     */
    public Builder setRecord(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      record_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * marshalled arrow.Record
     * </pre>
     *
     * <code>bytes record = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecord() {
      bitField0_ = (bitField0_ & ~0x00000004);
      record_ = getDefaultInstance().getRecord();
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:cloudquery.plugin.v3.Predicate)
  }

  // @@protoc_insertion_point(class_scope:cloudquery.plugin.v3.Predicate)
  private static final io.cloudquery.plugin.v3.Predicate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.cloudquery.plugin.v3.Predicate();
  }

  public static io.cloudquery.plugin.v3.Predicate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Predicate>
      PARSER = new com.google.protobuf.AbstractParser<Predicate>() {
    @java.lang.Override
    public Predicate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Predicate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Predicate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.cloudquery.plugin.v3.Predicate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

