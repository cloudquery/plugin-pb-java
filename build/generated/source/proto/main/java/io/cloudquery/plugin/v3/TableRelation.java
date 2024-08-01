// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: cloudquery/plugin/v3/plugin.proto
// Protobuf Java Version: 4.27.3

package io.cloudquery.plugin.v3;

/**
 * Protobuf type {@code cloudquery.plugin.v3.TableRelation}
 */
public final class TableRelation extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:cloudquery.plugin.v3.TableRelation)
    TableRelationOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      TableRelation.class.getName());
  }
  // Use TableRelation.newBuilder() to construct.
  private TableRelation(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TableRelation() {
    tableName_ = "";
    parentTable_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_TableRelation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_TableRelation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.cloudquery.plugin.v3.TableRelation.class, io.cloudquery.plugin.v3.TableRelation.Builder.class);
  }

  public static final int TABLE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tableName_ = "";
  /**
   * <code>string table_name = 1;</code>
   * @return The tableName.
   */
  @java.lang.Override
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   * <code>string table_name = 1;</code>
   * @return The bytes for tableName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_TABLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parentTable_ = "";
  /**
   * <code>string parent_table = 2;</code>
   * @return The parentTable.
   */
  @java.lang.Override
  public java.lang.String getParentTable() {
    java.lang.Object ref = parentTable_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parentTable_ = s;
      return s;
    }
  }
  /**
   * <code>string parent_table = 2;</code>
   * @return The bytes for parentTable.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentTableBytes() {
    java.lang.Object ref = parentTable_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parentTable_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(tableName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, tableName_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parentTable_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, parentTable_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(tableName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, tableName_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parentTable_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, parentTable_);
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
    if (!(obj instanceof io.cloudquery.plugin.v3.TableRelation)) {
      return super.equals(obj);
    }
    io.cloudquery.plugin.v3.TableRelation other = (io.cloudquery.plugin.v3.TableRelation) obj;

    if (!getTableName()
        .equals(other.getTableName())) return false;
    if (!getParentTable()
        .equals(other.getParentTable())) return false;
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
    hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    hash = (37 * hash) + PARENT_TABLE_FIELD_NUMBER;
    hash = (53 * hash) + getParentTable().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.cloudquery.plugin.v3.TableRelation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.cloudquery.plugin.v3.TableRelation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.TableRelation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.cloudquery.plugin.v3.TableRelation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.TableRelation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.cloudquery.plugin.v3.TableRelation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.TableRelation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.cloudquery.plugin.v3.TableRelation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.cloudquery.plugin.v3.TableRelation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.cloudquery.plugin.v3.TableRelation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.TableRelation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.cloudquery.plugin.v3.TableRelation parseFrom(
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
  public static Builder newBuilder(io.cloudquery.plugin.v3.TableRelation prototype) {
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
   * Protobuf type {@code cloudquery.plugin.v3.TableRelation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cloudquery.plugin.v3.TableRelation)
      io.cloudquery.plugin.v3.TableRelationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_TableRelation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_TableRelation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.cloudquery.plugin.v3.TableRelation.class, io.cloudquery.plugin.v3.TableRelation.Builder.class);
    }

    // Construct using io.cloudquery.plugin.v3.TableRelation.newBuilder()
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
      tableName_ = "";
      parentTable_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_TableRelation_descriptor;
    }

    @java.lang.Override
    public io.cloudquery.plugin.v3.TableRelation getDefaultInstanceForType() {
      return io.cloudquery.plugin.v3.TableRelation.getDefaultInstance();
    }

    @java.lang.Override
    public io.cloudquery.plugin.v3.TableRelation build() {
      io.cloudquery.plugin.v3.TableRelation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.cloudquery.plugin.v3.TableRelation buildPartial() {
      io.cloudquery.plugin.v3.TableRelation result = new io.cloudquery.plugin.v3.TableRelation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.cloudquery.plugin.v3.TableRelation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tableName_ = tableName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parentTable_ = parentTable_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.cloudquery.plugin.v3.TableRelation) {
        return mergeFrom((io.cloudquery.plugin.v3.TableRelation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.cloudquery.plugin.v3.TableRelation other) {
      if (other == io.cloudquery.plugin.v3.TableRelation.getDefaultInstance()) return this;
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getParentTable().isEmpty()) {
        parentTable_ = other.parentTable_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 10: {
              tableName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              parentTable_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object tableName_ = "";
    /**
     * <code>string table_name = 1;</code>
     * @return The tableName.
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string table_name = 1;</code>
     * @return The bytes for tableName.
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string table_name = 1;</code>
     * @param value The tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tableName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string table_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTableName() {
      tableName_ = getDefaultInstance().getTableName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string table_name = 1;</code>
     * @param value The bytes for tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tableName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object parentTable_ = "";
    /**
     * <code>string parent_table = 2;</code>
     * @return The parentTable.
     */
    public java.lang.String getParentTable() {
      java.lang.Object ref = parentTable_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parentTable_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string parent_table = 2;</code>
     * @return The bytes for parentTable.
     */
    public com.google.protobuf.ByteString
        getParentTableBytes() {
      java.lang.Object ref = parentTable_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parentTable_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string parent_table = 2;</code>
     * @param value The parentTable to set.
     * @return This builder for chaining.
     */
    public Builder setParentTable(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parentTable_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string parent_table = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearParentTable() {
      parentTable_ = getDefaultInstance().getParentTable();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string parent_table = 2;</code>
     * @param value The bytes for parentTable to set.
     * @return This builder for chaining.
     */
    public Builder setParentTableBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parentTable_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:cloudquery.plugin.v3.TableRelation)
  }

  // @@protoc_insertion_point(class_scope:cloudquery.plugin.v3.TableRelation)
  private static final io.cloudquery.plugin.v3.TableRelation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.cloudquery.plugin.v3.TableRelation();
  }

  public static io.cloudquery.plugin.v3.TableRelation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableRelation>
      PARSER = new com.google.protobuf.AbstractParser<TableRelation>() {
    @java.lang.Override
    public TableRelation parsePartialFrom(
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

  public static com.google.protobuf.Parser<TableRelation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableRelation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.cloudquery.plugin.v3.TableRelation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

