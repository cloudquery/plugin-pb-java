// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudquery/plugin/v3/plugin.proto

// Protobuf Java Version: 3.25.2
package io.cloudquery.plugin.v3;

/**
 * Protobuf type {@code cloudquery.plugin.v3.PredicatesGroup}
 */
public final class PredicatesGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cloudquery.plugin.v3.PredicatesGroup)
    PredicatesGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PredicatesGroup.newBuilder() to construct.
  private PredicatesGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PredicatesGroup() {
    groupingType_ = 0;
    predicates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PredicatesGroup();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_PredicatesGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_PredicatesGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.cloudquery.plugin.v3.PredicatesGroup.class, io.cloudquery.plugin.v3.PredicatesGroup.Builder.class);
  }

  /**
   * Protobuf enum {@code cloudquery.plugin.v3.PredicatesGroup.GroupingType}
   */
  public enum GroupingType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>AND = 0;</code>
     */
    AND(0),
    /**
     * <code>OR = 1;</code>
     */
    OR(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>AND = 0;</code>
     */
    public static final int AND_VALUE = 0;
    /**
     * <code>OR = 1;</code>
     */
    public static final int OR_VALUE = 1;


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
    public static GroupingType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GroupingType forNumber(int value) {
      switch (value) {
        case 0: return AND;
        case 1: return OR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GroupingType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GroupingType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GroupingType>() {
            public GroupingType findValueByNumber(int number) {
              return GroupingType.forNumber(number);
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
      return io.cloudquery.plugin.v3.PredicatesGroup.getDescriptor().getEnumTypes().get(0);
    }

    private static final GroupingType[] VALUES = values();

    public static GroupingType valueOf(
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

    private GroupingType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:cloudquery.plugin.v3.PredicatesGroup.GroupingType)
  }

  public static final int GROUPING_TYPE_FIELD_NUMBER = 1;
  private int groupingType_ = 0;
  /**
   * <code>.cloudquery.plugin.v3.PredicatesGroup.GroupingType grouping_type = 1;</code>
   * @return The enum numeric value on the wire for groupingType.
   */
  @java.lang.Override public int getGroupingTypeValue() {
    return groupingType_;
  }
  /**
   * <code>.cloudquery.plugin.v3.PredicatesGroup.GroupingType grouping_type = 1;</code>
   * @return The groupingType.
   */
  @java.lang.Override public io.cloudquery.plugin.v3.PredicatesGroup.GroupingType getGroupingType() {
    io.cloudquery.plugin.v3.PredicatesGroup.GroupingType result = io.cloudquery.plugin.v3.PredicatesGroup.GroupingType.forNumber(groupingType_);
    return result == null ? io.cloudquery.plugin.v3.PredicatesGroup.GroupingType.UNRECOGNIZED : result;
  }

  public static final int PREDICATES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<io.cloudquery.plugin.v3.Predicate> predicates_;
  /**
   * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
   */
  @java.lang.Override
  public java.util.List<io.cloudquery.plugin.v3.Predicate> getPredicatesList() {
    return predicates_;
  }
  /**
   * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.cloudquery.plugin.v3.PredicateOrBuilder> 
      getPredicatesOrBuilderList() {
    return predicates_;
  }
  /**
   * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
   */
  @java.lang.Override
  public int getPredicatesCount() {
    return predicates_.size();
  }
  /**
   * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
   */
  @java.lang.Override
  public io.cloudquery.plugin.v3.Predicate getPredicates(int index) {
    return predicates_.get(index);
  }
  /**
   * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
   */
  @java.lang.Override
  public io.cloudquery.plugin.v3.PredicateOrBuilder getPredicatesOrBuilder(
      int index) {
    return predicates_.get(index);
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
    if (groupingType_ != io.cloudquery.plugin.v3.PredicatesGroup.GroupingType.AND.getNumber()) {
      output.writeEnum(1, groupingType_);
    }
    for (int i = 0; i < predicates_.size(); i++) {
      output.writeMessage(2, predicates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (groupingType_ != io.cloudquery.plugin.v3.PredicatesGroup.GroupingType.AND.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, groupingType_);
    }
    for (int i = 0; i < predicates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, predicates_.get(i));
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
    if (!(obj instanceof io.cloudquery.plugin.v3.PredicatesGroup)) {
      return super.equals(obj);
    }
    io.cloudquery.plugin.v3.PredicatesGroup other = (io.cloudquery.plugin.v3.PredicatesGroup) obj;

    if (groupingType_ != other.groupingType_) return false;
    if (!getPredicatesList()
        .equals(other.getPredicatesList())) return false;
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
    hash = (37 * hash) + GROUPING_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + groupingType_;
    if (getPredicatesCount() > 0) {
      hash = (37 * hash) + PREDICATES_FIELD_NUMBER;
      hash = (53 * hash) + getPredicatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.cloudquery.plugin.v3.PredicatesGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.cloudquery.plugin.v3.PredicatesGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.PredicatesGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.cloudquery.plugin.v3.PredicatesGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.PredicatesGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.cloudquery.plugin.v3.PredicatesGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.PredicatesGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.cloudquery.plugin.v3.PredicatesGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.cloudquery.plugin.v3.PredicatesGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.cloudquery.plugin.v3.PredicatesGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.cloudquery.plugin.v3.PredicatesGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.cloudquery.plugin.v3.PredicatesGroup parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.cloudquery.plugin.v3.PredicatesGroup prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code cloudquery.plugin.v3.PredicatesGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cloudquery.plugin.v3.PredicatesGroup)
      io.cloudquery.plugin.v3.PredicatesGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_PredicatesGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_PredicatesGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.cloudquery.plugin.v3.PredicatesGroup.class, io.cloudquery.plugin.v3.PredicatesGroup.Builder.class);
    }

    // Construct using io.cloudquery.plugin.v3.PredicatesGroup.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      groupingType_ = 0;
      if (predicatesBuilder_ == null) {
        predicates_ = java.util.Collections.emptyList();
      } else {
        predicates_ = null;
        predicatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.cloudquery.plugin.v3.PluginOuterClass.internal_static_cloudquery_plugin_v3_PredicatesGroup_descriptor;
    }

    @java.lang.Override
    public io.cloudquery.plugin.v3.PredicatesGroup getDefaultInstanceForType() {
      return io.cloudquery.plugin.v3.PredicatesGroup.getDefaultInstance();
    }

    @java.lang.Override
    public io.cloudquery.plugin.v3.PredicatesGroup build() {
      io.cloudquery.plugin.v3.PredicatesGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.cloudquery.plugin.v3.PredicatesGroup buildPartial() {
      io.cloudquery.plugin.v3.PredicatesGroup result = new io.cloudquery.plugin.v3.PredicatesGroup(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.cloudquery.plugin.v3.PredicatesGroup result) {
      if (predicatesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          predicates_ = java.util.Collections.unmodifiableList(predicates_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.predicates_ = predicates_;
      } else {
        result.predicates_ = predicatesBuilder_.build();
      }
    }

    private void buildPartial0(io.cloudquery.plugin.v3.PredicatesGroup result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.groupingType_ = groupingType_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.cloudquery.plugin.v3.PredicatesGroup) {
        return mergeFrom((io.cloudquery.plugin.v3.PredicatesGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.cloudquery.plugin.v3.PredicatesGroup other) {
      if (other == io.cloudquery.plugin.v3.PredicatesGroup.getDefaultInstance()) return this;
      if (other.groupingType_ != 0) {
        setGroupingTypeValue(other.getGroupingTypeValue());
      }
      if (predicatesBuilder_ == null) {
        if (!other.predicates_.isEmpty()) {
          if (predicates_.isEmpty()) {
            predicates_ = other.predicates_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePredicatesIsMutable();
            predicates_.addAll(other.predicates_);
          }
          onChanged();
        }
      } else {
        if (!other.predicates_.isEmpty()) {
          if (predicatesBuilder_.isEmpty()) {
            predicatesBuilder_.dispose();
            predicatesBuilder_ = null;
            predicates_ = other.predicates_;
            bitField0_ = (bitField0_ & ~0x00000002);
            predicatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPredicatesFieldBuilder() : null;
          } else {
            predicatesBuilder_.addAllMessages(other.predicates_);
          }
        }
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
              groupingType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              io.cloudquery.plugin.v3.Predicate m =
                  input.readMessage(
                      io.cloudquery.plugin.v3.Predicate.parser(),
                      extensionRegistry);
              if (predicatesBuilder_ == null) {
                ensurePredicatesIsMutable();
                predicates_.add(m);
              } else {
                predicatesBuilder_.addMessage(m);
              }
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

    private int groupingType_ = 0;
    /**
     * <code>.cloudquery.plugin.v3.PredicatesGroup.GroupingType grouping_type = 1;</code>
     * @return The enum numeric value on the wire for groupingType.
     */
    @java.lang.Override public int getGroupingTypeValue() {
      return groupingType_;
    }
    /**
     * <code>.cloudquery.plugin.v3.PredicatesGroup.GroupingType grouping_type = 1;</code>
     * @param value The enum numeric value on the wire for groupingType to set.
     * @return This builder for chaining.
     */
    public Builder setGroupingTypeValue(int value) {
      groupingType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cloudquery.plugin.v3.PredicatesGroup.GroupingType grouping_type = 1;</code>
     * @return The groupingType.
     */
    @java.lang.Override
    public io.cloudquery.plugin.v3.PredicatesGroup.GroupingType getGroupingType() {
      io.cloudquery.plugin.v3.PredicatesGroup.GroupingType result = io.cloudquery.plugin.v3.PredicatesGroup.GroupingType.forNumber(groupingType_);
      return result == null ? io.cloudquery.plugin.v3.PredicatesGroup.GroupingType.UNRECOGNIZED : result;
    }
    /**
     * <code>.cloudquery.plugin.v3.PredicatesGroup.GroupingType grouping_type = 1;</code>
     * @param value The groupingType to set.
     * @return This builder for chaining.
     */
    public Builder setGroupingType(io.cloudquery.plugin.v3.PredicatesGroup.GroupingType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      groupingType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.cloudquery.plugin.v3.PredicatesGroup.GroupingType grouping_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupingType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      groupingType_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<io.cloudquery.plugin.v3.Predicate> predicates_ =
      java.util.Collections.emptyList();
    private void ensurePredicatesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        predicates_ = new java.util.ArrayList<io.cloudquery.plugin.v3.Predicate>(predicates_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.cloudquery.plugin.v3.Predicate, io.cloudquery.plugin.v3.Predicate.Builder, io.cloudquery.plugin.v3.PredicateOrBuilder> predicatesBuilder_;

    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public java.util.List<io.cloudquery.plugin.v3.Predicate> getPredicatesList() {
      if (predicatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(predicates_);
      } else {
        return predicatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public int getPredicatesCount() {
      if (predicatesBuilder_ == null) {
        return predicates_.size();
      } else {
        return predicatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public io.cloudquery.plugin.v3.Predicate getPredicates(int index) {
      if (predicatesBuilder_ == null) {
        return predicates_.get(index);
      } else {
        return predicatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public Builder setPredicates(
        int index, io.cloudquery.plugin.v3.Predicate value) {
      if (predicatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePredicatesIsMutable();
        predicates_.set(index, value);
        onChanged();
      } else {
        predicatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public Builder setPredicates(
        int index, io.cloudquery.plugin.v3.Predicate.Builder builderForValue) {
      if (predicatesBuilder_ == null) {
        ensurePredicatesIsMutable();
        predicates_.set(index, builderForValue.build());
        onChanged();
      } else {
        predicatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public Builder addPredicates(io.cloudquery.plugin.v3.Predicate value) {
      if (predicatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePredicatesIsMutable();
        predicates_.add(value);
        onChanged();
      } else {
        predicatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public Builder addPredicates(
        int index, io.cloudquery.plugin.v3.Predicate value) {
      if (predicatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePredicatesIsMutable();
        predicates_.add(index, value);
        onChanged();
      } else {
        predicatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public Builder addPredicates(
        io.cloudquery.plugin.v3.Predicate.Builder builderForValue) {
      if (predicatesBuilder_ == null) {
        ensurePredicatesIsMutable();
        predicates_.add(builderForValue.build());
        onChanged();
      } else {
        predicatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public Builder addPredicates(
        int index, io.cloudquery.plugin.v3.Predicate.Builder builderForValue) {
      if (predicatesBuilder_ == null) {
        ensurePredicatesIsMutable();
        predicates_.add(index, builderForValue.build());
        onChanged();
      } else {
        predicatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public Builder addAllPredicates(
        java.lang.Iterable<? extends io.cloudquery.plugin.v3.Predicate> values) {
      if (predicatesBuilder_ == null) {
        ensurePredicatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, predicates_);
        onChanged();
      } else {
        predicatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public Builder clearPredicates() {
      if (predicatesBuilder_ == null) {
        predicates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        predicatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public Builder removePredicates(int index) {
      if (predicatesBuilder_ == null) {
        ensurePredicatesIsMutable();
        predicates_.remove(index);
        onChanged();
      } else {
        predicatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public io.cloudquery.plugin.v3.Predicate.Builder getPredicatesBuilder(
        int index) {
      return getPredicatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public io.cloudquery.plugin.v3.PredicateOrBuilder getPredicatesOrBuilder(
        int index) {
      if (predicatesBuilder_ == null) {
        return predicates_.get(index);  } else {
        return predicatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public java.util.List<? extends io.cloudquery.plugin.v3.PredicateOrBuilder> 
         getPredicatesOrBuilderList() {
      if (predicatesBuilder_ != null) {
        return predicatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(predicates_);
      }
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public io.cloudquery.plugin.v3.Predicate.Builder addPredicatesBuilder() {
      return getPredicatesFieldBuilder().addBuilder(
          io.cloudquery.plugin.v3.Predicate.getDefaultInstance());
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public io.cloudquery.plugin.v3.Predicate.Builder addPredicatesBuilder(
        int index) {
      return getPredicatesFieldBuilder().addBuilder(
          index, io.cloudquery.plugin.v3.Predicate.getDefaultInstance());
    }
    /**
     * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
     */
    public java.util.List<io.cloudquery.plugin.v3.Predicate.Builder> 
         getPredicatesBuilderList() {
      return getPredicatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.cloudquery.plugin.v3.Predicate, io.cloudquery.plugin.v3.Predicate.Builder, io.cloudquery.plugin.v3.PredicateOrBuilder> 
        getPredicatesFieldBuilder() {
      if (predicatesBuilder_ == null) {
        predicatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.cloudquery.plugin.v3.Predicate, io.cloudquery.plugin.v3.Predicate.Builder, io.cloudquery.plugin.v3.PredicateOrBuilder>(
                predicates_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        predicates_ = null;
      }
      return predicatesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cloudquery.plugin.v3.PredicatesGroup)
  }

  // @@protoc_insertion_point(class_scope:cloudquery.plugin.v3.PredicatesGroup)
  private static final io.cloudquery.plugin.v3.PredicatesGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.cloudquery.plugin.v3.PredicatesGroup();
  }

  public static io.cloudquery.plugin.v3.PredicatesGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredicatesGroup>
      PARSER = new com.google.protobuf.AbstractParser<PredicatesGroup>() {
    @java.lang.Override
    public PredicatesGroup parsePartialFrom(
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

  public static com.google.protobuf.Parser<PredicatesGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredicatesGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.cloudquery.plugin.v3.PredicatesGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

