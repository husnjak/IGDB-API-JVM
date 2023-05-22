// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.Keyword}
 */
public final class Keyword extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.Keyword)
    KeywordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Keyword.newBuilder() to construct.
  private Keyword(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Keyword() {
    name_ = "";
    slug_ = "";
    url_ = "";
    checksum_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Keyword();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_Keyword_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_Keyword_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.Keyword.class, proto.Keyword.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int CREATED_AT_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp createdAt_;
  /**
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return Whether the createdAt field is set.
   */
  @java.lang.Override
  public boolean hasCreatedAt() {
    return createdAt_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return The createdAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreatedAt() {
    return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
    return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SLUG_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object slug_ = "";
  /**
   * <code>string slug = 4;</code>
   * @return The slug.
   */
  @java.lang.Override
  public java.lang.String getSlug() {
    java.lang.Object ref = slug_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      slug_ = s;
      return s;
    }
  }
  /**
   * <code>string slug = 4;</code>
   * @return The bytes for slug.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSlugBytes() {
    java.lang.Object ref = slug_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      slug_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPDATED_AT_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp updatedAt_;
  /**
   * <code>.google.protobuf.Timestamp updated_at = 5;</code>
   * @return Whether the updatedAt field is set.
   */
  @java.lang.Override
  public boolean hasUpdatedAt() {
    return updatedAt_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp updated_at = 5;</code>
   * @return The updatedAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdatedAt() {
    return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp updated_at = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
    return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
  }

  public static final int URL_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";
  /**
   * <code>string url = 6;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <code>string url = 6;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHECKSUM_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private volatile java.lang.Object checksum_ = "";
  /**
   * <code>string checksum = 7;</code>
   * @return The checksum.
   */
  @java.lang.Override
  public java.lang.String getChecksum() {
    java.lang.Object ref = checksum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checksum_ = s;
      return s;
    }
  }
  /**
   * <code>string checksum = 7;</code>
   * @return The bytes for checksum.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChecksumBytes() {
    java.lang.Object ref = checksum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checksum_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static proto.Keyword parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Keyword parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Keyword parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Keyword parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Keyword parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Keyword parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Keyword parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Keyword parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static proto.Keyword parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static proto.Keyword parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.Keyword parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Keyword parseFrom(
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
  public static Builder newBuilder(proto.Keyword prototype) {
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
   * Protobuf type {@code proto.Keyword}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Keyword)
      proto.KeywordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_Keyword_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_Keyword_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.Keyword.class, proto.Keyword.Builder.class);
    }

    // Construct using proto.Keyword.newBuilder()
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
      id_ = 0L;
      createdAt_ = null;
      if (createdAtBuilder_ != null) {
        createdAtBuilder_.dispose();
        createdAtBuilder_ = null;
      }
      name_ = "";
      slug_ = "";
      updatedAt_ = null;
      if (updatedAtBuilder_ != null) {
        updatedAtBuilder_.dispose();
        updatedAtBuilder_ = null;
      }
      url_ = "";
      checksum_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_Keyword_descriptor;
    }

    @java.lang.Override
    public proto.Keyword getDefaultInstanceForType() {
      return proto.Keyword.getDefaultInstance();
    }

    @java.lang.Override
    public proto.Keyword build() {
      proto.Keyword result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.Keyword buildPartial() {
      proto.Keyword result = new proto.Keyword(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(proto.Keyword result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.createdAt_ = createdAtBuilder_ == null
            ? createdAt_
            : createdAtBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.slug_ = slug_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.updatedAt_ = updatedAtBuilder_ == null
            ? updatedAt_
            : updatedAtBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.url_ = url_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.checksum_ = checksum_;
      }
    }

    private int bitField0_;

    private long id_ ;
    /**
     * <code>uint64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createdAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     * @return Whether the createdAt field is set.
     */
    public boolean hasCreatedAt() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     * @return The createdAt.
     */
    public com.google.protobuf.Timestamp getCreatedAt() {
      if (createdAtBuilder_ == null) {
        return createdAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
      } else {
        return createdAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder setCreatedAt(com.google.protobuf.Timestamp value) {
      if (createdAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createdAt_ = value;
      } else {
        createdAtBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder setCreatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createdAtBuilder_ == null) {
        createdAt_ = builderForValue.build();
      } else {
        createdAtBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder mergeCreatedAt(com.google.protobuf.Timestamp value) {
      if (createdAtBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          createdAt_ != null &&
          createdAt_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCreatedAtBuilder().mergeFrom(value);
        } else {
          createdAt_ = value;
        }
      } else {
        createdAtBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public Builder clearCreatedAt() {
      bitField0_ = (bitField0_ & ~0x00000002);
      createdAt_ = null;
      if (createdAtBuilder_ != null) {
        createdAtBuilder_.dispose();
        createdAtBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreatedAtBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCreatedAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder() {
      if (createdAtBuilder_ != null) {
        return createdAtBuilder_.getMessageOrBuilder();
      } else {
        return createdAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createdAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp created_at = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreatedAtFieldBuilder() {
      if (createdAtBuilder_ == null) {
        createdAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreatedAt(),
                getParentForChildren(),
                isClean());
        createdAt_ = null;
      }
      return createdAtBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object slug_ = "";
    /**
     * <code>string slug = 4;</code>
     * @return The slug.
     */
    public java.lang.String getSlug() {
      java.lang.Object ref = slug_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        slug_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string slug = 4;</code>
     * @return The bytes for slug.
     */
    public com.google.protobuf.ByteString
        getSlugBytes() {
      java.lang.Object ref = slug_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        slug_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string slug = 4;</code>
     * @param value The slug to set.
     * @return This builder for chaining.
     */
    public Builder setSlug(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      slug_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string slug = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSlug() {
      slug_ = getDefaultInstance().getSlug();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string slug = 4;</code>
     * @param value The bytes for slug to set.
     * @return This builder for chaining.
     */
    public Builder setSlugBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      slug_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp updatedAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updatedAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp updated_at = 5;</code>
     * @return Whether the updatedAt field is set.
     */
    public boolean hasUpdatedAt() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 5;</code>
     * @return The updatedAt.
     */
    public com.google.protobuf.Timestamp getUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      } else {
        return updatedAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 5;</code>
     */
    public Builder setUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updatedAt_ = value;
      } else {
        updatedAtBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 5;</code>
     */
    public Builder setUpdatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = builderForValue.build();
      } else {
        updatedAtBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 5;</code>
     */
    public Builder mergeUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          updatedAt_ != null &&
          updatedAt_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpdatedAtBuilder().mergeFrom(value);
        } else {
          updatedAt_ = value;
        }
      } else {
        updatedAtBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 5;</code>
     */
    public Builder clearUpdatedAt() {
      bitField0_ = (bitField0_ & ~0x00000010);
      updatedAt_ = null;
      if (updatedAtBuilder_ != null) {
        updatedAtBuilder_.dispose();
        updatedAtBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 5;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdatedAtBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getUpdatedAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 5;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
      if (updatedAtBuilder_ != null) {
        return updatedAtBuilder_.getMessageOrBuilder();
      } else {
        return updatedAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp updated_at = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdatedAtFieldBuilder() {
      if (updatedAtBuilder_ == null) {
        updatedAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdatedAt(),
                getParentForChildren(),
                isClean());
        updatedAt_ = null;
      }
      return updatedAtBuilder_;
    }

    private java.lang.Object url_ = "";
    /**
     * <code>string url = 6;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string url = 6;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string url = 6;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      url_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>string url = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <code>string url = 6;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    private java.lang.Object checksum_ = "";
    /**
     * <code>string checksum = 7;</code>
     * @return The checksum.
     */
    public java.lang.String getChecksum() {
      java.lang.Object ref = checksum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checksum_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string checksum = 7;</code>
     * @return The bytes for checksum.
     */
    public com.google.protobuf.ByteString
        getChecksumBytes() {
      java.lang.Object ref = checksum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checksum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string checksum = 7;</code>
     * @param value The checksum to set.
     * @return This builder for chaining.
     */
    public Builder setChecksum(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      checksum_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>string checksum = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearChecksum() {
      checksum_ = getDefaultInstance().getChecksum();
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <code>string checksum = 7;</code>
     * @param value The bytes for checksum to set.
     * @return This builder for chaining.
     */
    public Builder setChecksumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      checksum_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:proto.Keyword)
  }

  // @@protoc_insertion_point(class_scope:proto.Keyword)
  private static final proto.Keyword DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.Keyword();
  }

  public static proto.Keyword getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Keyword>
      PARSER = new com.google.protobuf.AbstractParser<Keyword>() {
    @java.lang.Override
    public Keyword parsePartialFrom(
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

  public static com.google.protobuf.Parser<Keyword> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Keyword> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.Keyword getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

