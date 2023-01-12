// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.AgeRating}
 */
public final class AgeRating extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.AgeRating)
    AgeRatingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgeRating.newBuilder() to construct.
  private AgeRating(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgeRating() {
    category_ = 0;
    contentDescriptions_ = java.util.Collections.emptyList();
    rating_ = 0;
    ratingCoverUrl_ = "";
    synopsis_ = "";
    checksum_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgeRating();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_AgeRating_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_AgeRating_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.AgeRating.class, proto.AgeRating.Builder.class);
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

  public static final int CATEGORY_FIELD_NUMBER = 2;
  private int category_ = 0;
  /**
   * <code>.proto.AgeRatingCategoryEnum category = 2;</code>
   * @return The enum numeric value on the wire for category.
   */
  @java.lang.Override public int getCategoryValue() {
    return category_;
  }
  /**
   * <code>.proto.AgeRatingCategoryEnum category = 2;</code>
   * @return The category.
   */
  @java.lang.Override public proto.AgeRatingCategoryEnum getCategory() {
    proto.AgeRatingCategoryEnum result = proto.AgeRatingCategoryEnum.forNumber(category_);
    return result == null ? proto.AgeRatingCategoryEnum.UNRECOGNIZED : result;
  }

  public static final int CONTENT_DESCRIPTIONS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<proto.AgeRatingContentDescription> contentDescriptions_;
  /**
   * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
   */
  @java.lang.Override
  public java.util.List<proto.AgeRatingContentDescription> getContentDescriptionsList() {
    return contentDescriptions_;
  }
  /**
   * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.AgeRatingContentDescriptionOrBuilder> 
      getContentDescriptionsOrBuilderList() {
    return contentDescriptions_;
  }
  /**
   * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
   */
  @java.lang.Override
  public int getContentDescriptionsCount() {
    return contentDescriptions_.size();
  }
  /**
   * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
   */
  @java.lang.Override
  public proto.AgeRatingContentDescription getContentDescriptions(int index) {
    return contentDescriptions_.get(index);
  }
  /**
   * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
   */
  @java.lang.Override
  public proto.AgeRatingContentDescriptionOrBuilder getContentDescriptionsOrBuilder(
      int index) {
    return contentDescriptions_.get(index);
  }

  public static final int RATING_FIELD_NUMBER = 4;
  private int rating_ = 0;
  /**
   * <code>.proto.AgeRatingRatingEnum rating = 4;</code>
   * @return The enum numeric value on the wire for rating.
   */
  @java.lang.Override public int getRatingValue() {
    return rating_;
  }
  /**
   * <code>.proto.AgeRatingRatingEnum rating = 4;</code>
   * @return The rating.
   */
  @java.lang.Override public proto.AgeRatingRatingEnum getRating() {
    proto.AgeRatingRatingEnum result = proto.AgeRatingRatingEnum.forNumber(rating_);
    return result == null ? proto.AgeRatingRatingEnum.UNRECOGNIZED : result;
  }

  public static final int RATING_COVER_URL_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ratingCoverUrl_ = "";
  /**
   * <code>string rating_cover_url = 5;</code>
   * @return The ratingCoverUrl.
   */
  @java.lang.Override
  public java.lang.String getRatingCoverUrl() {
    java.lang.Object ref = ratingCoverUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ratingCoverUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string rating_cover_url = 5;</code>
   * @return The bytes for ratingCoverUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRatingCoverUrlBytes() {
    java.lang.Object ref = ratingCoverUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ratingCoverUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SYNOPSIS_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object synopsis_ = "";
  /**
   * <code>string synopsis = 6;</code>
   * @return The synopsis.
   */
  @java.lang.Override
  public java.lang.String getSynopsis() {
    java.lang.Object ref = synopsis_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      synopsis_ = s;
      return s;
    }
  }
  /**
   * <code>string synopsis = 6;</code>
   * @return The bytes for synopsis.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSynopsisBytes() {
    java.lang.Object ref = synopsis_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      synopsis_ = b;
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

  public static proto.AgeRating parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AgeRating parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AgeRating parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AgeRating parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AgeRating parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AgeRating parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AgeRating parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.AgeRating parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.AgeRating parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.AgeRating parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.AgeRating parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.AgeRating parseFrom(
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
  public static Builder newBuilder(proto.AgeRating prototype) {
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
   * Protobuf type {@code proto.AgeRating}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.AgeRating)
      proto.AgeRatingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_AgeRating_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_AgeRating_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.AgeRating.class, proto.AgeRating.Builder.class);
    }

    // Construct using proto.AgeRating.newBuilder()
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
      category_ = 0;
      if (contentDescriptionsBuilder_ == null) {
        contentDescriptions_ = java.util.Collections.emptyList();
      } else {
        contentDescriptions_ = null;
        contentDescriptionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      rating_ = 0;
      ratingCoverUrl_ = "";
      synopsis_ = "";
      checksum_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_AgeRating_descriptor;
    }

    @java.lang.Override
    public proto.AgeRating getDefaultInstanceForType() {
      return proto.AgeRating.getDefaultInstance();
    }

    @java.lang.Override
    public proto.AgeRating build() {
      proto.AgeRating result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.AgeRating buildPartial() {
      proto.AgeRating result = new proto.AgeRating(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(proto.AgeRating result) {
      if (contentDescriptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          contentDescriptions_ = java.util.Collections.unmodifiableList(contentDescriptions_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.contentDescriptions_ = contentDescriptions_;
      } else {
        result.contentDescriptions_ = contentDescriptionsBuilder_.build();
      }
    }

    private void buildPartial0(proto.AgeRating result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.category_ = category_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.rating_ = rating_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.ratingCoverUrl_ = ratingCoverUrl_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.synopsis_ = synopsis_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.checksum_ = checksum_;
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

    private int category_ = 0;
    /**
     * <code>.proto.AgeRatingCategoryEnum category = 2;</code>
     * @return The enum numeric value on the wire for category.
     */
    @java.lang.Override public int getCategoryValue() {
      return category_;
    }
    /**
     * <code>.proto.AgeRatingCategoryEnum category = 2;</code>
     * @param value The enum numeric value on the wire for category to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryValue(int value) {
      category_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.proto.AgeRatingCategoryEnum category = 2;</code>
     * @return The category.
     */
    @java.lang.Override
    public proto.AgeRatingCategoryEnum getCategory() {
      proto.AgeRatingCategoryEnum result = proto.AgeRatingCategoryEnum.forNumber(category_);
      return result == null ? proto.AgeRatingCategoryEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.proto.AgeRatingCategoryEnum category = 2;</code>
     * @param value The category to set.
     * @return This builder for chaining.
     */
    public Builder setCategory(proto.AgeRatingCategoryEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      category_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.proto.AgeRatingCategoryEnum category = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCategory() {
      bitField0_ = (bitField0_ & ~0x00000002);
      category_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<proto.AgeRatingContentDescription> contentDescriptions_ =
      java.util.Collections.emptyList();
    private void ensureContentDescriptionsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        contentDescriptions_ = new java.util.ArrayList<proto.AgeRatingContentDescription>(contentDescriptions_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.AgeRatingContentDescription, proto.AgeRatingContentDescription.Builder, proto.AgeRatingContentDescriptionOrBuilder> contentDescriptionsBuilder_;

    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public java.util.List<proto.AgeRatingContentDescription> getContentDescriptionsList() {
      if (contentDescriptionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(contentDescriptions_);
      } else {
        return contentDescriptionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public int getContentDescriptionsCount() {
      if (contentDescriptionsBuilder_ == null) {
        return contentDescriptions_.size();
      } else {
        return contentDescriptionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public proto.AgeRatingContentDescription getContentDescriptions(int index) {
      if (contentDescriptionsBuilder_ == null) {
        return contentDescriptions_.get(index);
      } else {
        return contentDescriptionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public Builder setContentDescriptions(
        int index, proto.AgeRatingContentDescription value) {
      if (contentDescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentDescriptionsIsMutable();
        contentDescriptions_.set(index, value);
        onChanged();
      } else {
        contentDescriptionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public Builder setContentDescriptions(
        int index, proto.AgeRatingContentDescription.Builder builderForValue) {
      if (contentDescriptionsBuilder_ == null) {
        ensureContentDescriptionsIsMutable();
        contentDescriptions_.set(index, builderForValue.build());
        onChanged();
      } else {
        contentDescriptionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public Builder addContentDescriptions(proto.AgeRatingContentDescription value) {
      if (contentDescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentDescriptionsIsMutable();
        contentDescriptions_.add(value);
        onChanged();
      } else {
        contentDescriptionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public Builder addContentDescriptions(
        int index, proto.AgeRatingContentDescription value) {
      if (contentDescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContentDescriptionsIsMutable();
        contentDescriptions_.add(index, value);
        onChanged();
      } else {
        contentDescriptionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public Builder addContentDescriptions(
        proto.AgeRatingContentDescription.Builder builderForValue) {
      if (contentDescriptionsBuilder_ == null) {
        ensureContentDescriptionsIsMutable();
        contentDescriptions_.add(builderForValue.build());
        onChanged();
      } else {
        contentDescriptionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public Builder addContentDescriptions(
        int index, proto.AgeRatingContentDescription.Builder builderForValue) {
      if (contentDescriptionsBuilder_ == null) {
        ensureContentDescriptionsIsMutable();
        contentDescriptions_.add(index, builderForValue.build());
        onChanged();
      } else {
        contentDescriptionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public Builder addAllContentDescriptions(
        java.lang.Iterable<? extends proto.AgeRatingContentDescription> values) {
      if (contentDescriptionsBuilder_ == null) {
        ensureContentDescriptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, contentDescriptions_);
        onChanged();
      } else {
        contentDescriptionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public Builder clearContentDescriptions() {
      if (contentDescriptionsBuilder_ == null) {
        contentDescriptions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        contentDescriptionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public Builder removeContentDescriptions(int index) {
      if (contentDescriptionsBuilder_ == null) {
        ensureContentDescriptionsIsMutable();
        contentDescriptions_.remove(index);
        onChanged();
      } else {
        contentDescriptionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public proto.AgeRatingContentDescription.Builder getContentDescriptionsBuilder(
        int index) {
      return getContentDescriptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public proto.AgeRatingContentDescriptionOrBuilder getContentDescriptionsOrBuilder(
        int index) {
      if (contentDescriptionsBuilder_ == null) {
        return contentDescriptions_.get(index);  } else {
        return contentDescriptionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public java.util.List<? extends proto.AgeRatingContentDescriptionOrBuilder> 
         getContentDescriptionsOrBuilderList() {
      if (contentDescriptionsBuilder_ != null) {
        return contentDescriptionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(contentDescriptions_);
      }
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public proto.AgeRatingContentDescription.Builder addContentDescriptionsBuilder() {
      return getContentDescriptionsFieldBuilder().addBuilder(
          proto.AgeRatingContentDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public proto.AgeRatingContentDescription.Builder addContentDescriptionsBuilder(
        int index) {
      return getContentDescriptionsFieldBuilder().addBuilder(
          index, proto.AgeRatingContentDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
     */
    public java.util.List<proto.AgeRatingContentDescription.Builder> 
         getContentDescriptionsBuilderList() {
      return getContentDescriptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.AgeRatingContentDescription, proto.AgeRatingContentDescription.Builder, proto.AgeRatingContentDescriptionOrBuilder> 
        getContentDescriptionsFieldBuilder() {
      if (contentDescriptionsBuilder_ == null) {
        contentDescriptionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.AgeRatingContentDescription, proto.AgeRatingContentDescription.Builder, proto.AgeRatingContentDescriptionOrBuilder>(
                contentDescriptions_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        contentDescriptions_ = null;
      }
      return contentDescriptionsBuilder_;
    }

    private int rating_ = 0;
    /**
     * <code>.proto.AgeRatingRatingEnum rating = 4;</code>
     * @return The enum numeric value on the wire for rating.
     */
    @java.lang.Override public int getRatingValue() {
      return rating_;
    }
    /**
     * <code>.proto.AgeRatingRatingEnum rating = 4;</code>
     * @param value The enum numeric value on the wire for rating to set.
     * @return This builder for chaining.
     */
    public Builder setRatingValue(int value) {
      rating_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.proto.AgeRatingRatingEnum rating = 4;</code>
     * @return The rating.
     */
    @java.lang.Override
    public proto.AgeRatingRatingEnum getRating() {
      proto.AgeRatingRatingEnum result = proto.AgeRatingRatingEnum.forNumber(rating_);
      return result == null ? proto.AgeRatingRatingEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.proto.AgeRatingRatingEnum rating = 4;</code>
     * @param value The rating to set.
     * @return This builder for chaining.
     */
    public Builder setRating(proto.AgeRatingRatingEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      rating_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.proto.AgeRatingRatingEnum rating = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRating() {
      bitField0_ = (bitField0_ & ~0x00000008);
      rating_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object ratingCoverUrl_ = "";
    /**
     * <code>string rating_cover_url = 5;</code>
     * @return The ratingCoverUrl.
     */
    public java.lang.String getRatingCoverUrl() {
      java.lang.Object ref = ratingCoverUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ratingCoverUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rating_cover_url = 5;</code>
     * @return The bytes for ratingCoverUrl.
     */
    public com.google.protobuf.ByteString
        getRatingCoverUrlBytes() {
      java.lang.Object ref = ratingCoverUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ratingCoverUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rating_cover_url = 5;</code>
     * @param value The ratingCoverUrl to set.
     * @return This builder for chaining.
     */
    public Builder setRatingCoverUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ratingCoverUrl_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string rating_cover_url = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearRatingCoverUrl() {
      ratingCoverUrl_ = getDefaultInstance().getRatingCoverUrl();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string rating_cover_url = 5;</code>
     * @param value The bytes for ratingCoverUrl to set.
     * @return This builder for chaining.
     */
    public Builder setRatingCoverUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ratingCoverUrl_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object synopsis_ = "";
    /**
     * <code>string synopsis = 6;</code>
     * @return The synopsis.
     */
    public java.lang.String getSynopsis() {
      java.lang.Object ref = synopsis_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        synopsis_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string synopsis = 6;</code>
     * @return The bytes for synopsis.
     */
    public com.google.protobuf.ByteString
        getSynopsisBytes() {
      java.lang.Object ref = synopsis_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        synopsis_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string synopsis = 6;</code>
     * @param value The synopsis to set.
     * @return This builder for chaining.
     */
    public Builder setSynopsis(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      synopsis_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>string synopsis = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSynopsis() {
      synopsis_ = getDefaultInstance().getSynopsis();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <code>string synopsis = 6;</code>
     * @param value The bytes for synopsis to set.
     * @return This builder for chaining.
     */
    public Builder setSynopsisBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      synopsis_ = value;
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


    // @@protoc_insertion_point(builder_scope:proto.AgeRating)
  }

  // @@protoc_insertion_point(class_scope:proto.AgeRating)
  private static final proto.AgeRating DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.AgeRating();
  }

  public static proto.AgeRating getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgeRating>
      PARSER = new com.google.protobuf.AbstractParser<AgeRating>() {
    @java.lang.Override
    public AgeRating parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgeRating> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgeRating> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.AgeRating getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

