// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.KeywordResult}
 */
public  final class KeywordResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.KeywordResult)
    KeywordResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordResult.newBuilder() to construct.
  private KeywordResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordResult() {
    keywords_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_KeywordResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_KeywordResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.KeywordResult.class, proto.KeywordResult.Builder.class);
  }

  public static final int KEYWORDS_FIELD_NUMBER = 1;
  private java.util.List<proto.Keyword> keywords_;
  /**
   * <code>repeated .proto.Keyword keywords = 1;</code>
   */
  public java.util.List<proto.Keyword> getKeywordsList() {
    return keywords_;
  }
  /**
   * <code>repeated .proto.Keyword keywords = 1;</code>
   */
  public java.util.List<? extends proto.KeywordOrBuilder> 
      getKeywordsOrBuilderList() {
    return keywords_;
  }
  /**
   * <code>repeated .proto.Keyword keywords = 1;</code>
   */
  public int getKeywordsCount() {
    return keywords_.size();
  }
  /**
   * <code>repeated .proto.Keyword keywords = 1;</code>
   */
  public proto.Keyword getKeywords(int index) {
    return keywords_.get(index);
  }
  /**
   * <code>repeated .proto.Keyword keywords = 1;</code>
   */
  public proto.KeywordOrBuilder getKeywordsOrBuilder(
      int index) {
    return keywords_.get(index);
  }

  public static proto.KeywordResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.KeywordResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.KeywordResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.KeywordResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.KeywordResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.KeywordResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.KeywordResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.KeywordResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.KeywordResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.KeywordResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.KeywordResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.KeywordResult parseFrom(
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
  public static Builder newBuilder(proto.KeywordResult prototype) {
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
   * Protobuf type {@code proto.KeywordResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.KeywordResult)
      proto.KeywordResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_KeywordResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_KeywordResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.KeywordResult.class, proto.KeywordResult.Builder.class);
    }

    // Construct using proto.KeywordResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getKeywordsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keywordsBuilder_ == null) {
        keywords_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        keywordsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_KeywordResult_descriptor;
    }

    @java.lang.Override
    public proto.KeywordResult getDefaultInstanceForType() {
      return proto.KeywordResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.KeywordResult build() {
      proto.KeywordResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.KeywordResult buildPartial() {
      proto.KeywordResult result = new proto.KeywordResult(this);
      int from_bitField0_ = bitField0_;
      if (keywordsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          keywords_ = java.util.Collections.unmodifiableList(keywords_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.keywords_ = keywords_;
      } else {
        result.keywords_ = keywordsBuilder_.build();
      }
      onBuilt();
      return result;
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

    private java.util.List<proto.Keyword> keywords_ =
      java.util.Collections.emptyList();
    private void ensureKeywordsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keywords_ = new java.util.ArrayList<proto.Keyword>(keywords_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Keyword, proto.Keyword.Builder, proto.KeywordOrBuilder> keywordsBuilder_;

    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public java.util.List<proto.Keyword> getKeywordsList() {
      if (keywordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keywords_);
      } else {
        return keywordsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public int getKeywordsCount() {
      if (keywordsBuilder_ == null) {
        return keywords_.size();
      } else {
        return keywordsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public proto.Keyword getKeywords(int index) {
      if (keywordsBuilder_ == null) {
        return keywords_.get(index);
      } else {
        return keywordsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public Builder setKeywords(
        int index, proto.Keyword value) {
      if (keywordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordsIsMutable();
        keywords_.set(index, value);
        onChanged();
      } else {
        keywordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public Builder setKeywords(
        int index, proto.Keyword.Builder builderForValue) {
      if (keywordsBuilder_ == null) {
        ensureKeywordsIsMutable();
        keywords_.set(index, builderForValue.build());
        onChanged();
      } else {
        keywordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public Builder addKeywords(proto.Keyword value) {
      if (keywordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordsIsMutable();
        keywords_.add(value);
        onChanged();
      } else {
        keywordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public Builder addKeywords(
        int index, proto.Keyword value) {
      if (keywordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordsIsMutable();
        keywords_.add(index, value);
        onChanged();
      } else {
        keywordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public Builder addKeywords(
        proto.Keyword.Builder builderForValue) {
      if (keywordsBuilder_ == null) {
        ensureKeywordsIsMutable();
        keywords_.add(builderForValue.build());
        onChanged();
      } else {
        keywordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public Builder addKeywords(
        int index, proto.Keyword.Builder builderForValue) {
      if (keywordsBuilder_ == null) {
        ensureKeywordsIsMutable();
        keywords_.add(index, builderForValue.build());
        onChanged();
      } else {
        keywordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public Builder addAllKeywords(
        java.lang.Iterable<? extends proto.Keyword> values) {
      if (keywordsBuilder_ == null) {
        ensureKeywordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keywords_);
        onChanged();
      } else {
        keywordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public Builder clearKeywords() {
      if (keywordsBuilder_ == null) {
        keywords_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keywordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public Builder removeKeywords(int index) {
      if (keywordsBuilder_ == null) {
        ensureKeywordsIsMutable();
        keywords_.remove(index);
        onChanged();
      } else {
        keywordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public proto.Keyword.Builder getKeywordsBuilder(
        int index) {
      return getKeywordsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public proto.KeywordOrBuilder getKeywordsOrBuilder(
        int index) {
      if (keywordsBuilder_ == null) {
        return keywords_.get(index);  } else {
        return keywordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public java.util.List<? extends proto.KeywordOrBuilder> 
         getKeywordsOrBuilderList() {
      if (keywordsBuilder_ != null) {
        return keywordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keywords_);
      }
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public proto.Keyword.Builder addKeywordsBuilder() {
      return getKeywordsFieldBuilder().addBuilder(
          proto.Keyword.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public proto.Keyword.Builder addKeywordsBuilder(
        int index) {
      return getKeywordsFieldBuilder().addBuilder(
          index, proto.Keyword.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Keyword keywords = 1;</code>
     */
    public java.util.List<proto.Keyword.Builder> 
         getKeywordsBuilderList() {
      return getKeywordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Keyword, proto.Keyword.Builder, proto.KeywordOrBuilder> 
        getKeywordsFieldBuilder() {
      if (keywordsBuilder_ == null) {
        keywordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Keyword, proto.Keyword.Builder, proto.KeywordOrBuilder>(
                keywords_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        keywords_ = null;
      }
      return keywordsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.KeywordResult)
  }

  // @@protoc_insertion_point(class_scope:proto.KeywordResult)
  private static final proto.KeywordResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.KeywordResult();
  }

  public static proto.KeywordResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordResult>
      PARSER = new com.google.protobuf.AbstractParser<KeywordResult>() {
    @java.lang.Override
    public KeywordResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<KeywordResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.KeywordResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

