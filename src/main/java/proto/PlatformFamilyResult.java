// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.PlatformFamilyResult}
 */
public final class PlatformFamilyResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.PlatformFamilyResult)
    PlatformFamilyResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformFamilyResult.newBuilder() to construct.
  private PlatformFamilyResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformFamilyResult() {
    platformfamilies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformFamilyResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_PlatformFamilyResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_PlatformFamilyResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.PlatformFamilyResult.class, proto.PlatformFamilyResult.Builder.class);
  }

  public static final int PLATFORMFAMILIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<proto.PlatformFamily> platformfamilies_;
  /**
   * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.PlatformFamily> getPlatformfamiliesList() {
    return platformfamilies_;
  }
  /**
   * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.PlatformFamilyOrBuilder> 
      getPlatformfamiliesOrBuilderList() {
    return platformfamilies_;
  }
  /**
   * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
   */
  @java.lang.Override
  public int getPlatformfamiliesCount() {
    return platformfamilies_.size();
  }
  /**
   * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
   */
  @java.lang.Override
  public proto.PlatformFamily getPlatformfamilies(int index) {
    return platformfamilies_.get(index);
  }
  /**
   * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
   */
  @java.lang.Override
  public proto.PlatformFamilyOrBuilder getPlatformfamiliesOrBuilder(
      int index) {
    return platformfamilies_.get(index);
  }

  public static proto.PlatformFamilyResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PlatformFamilyResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PlatformFamilyResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PlatformFamilyResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PlatformFamilyResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PlatformFamilyResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PlatformFamilyResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PlatformFamilyResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static proto.PlatformFamilyResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static proto.PlatformFamilyResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PlatformFamilyResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PlatformFamilyResult parseFrom(
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
  public static Builder newBuilder(proto.PlatformFamilyResult prototype) {
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
   * Protobuf type {@code proto.PlatformFamilyResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.PlatformFamilyResult)
      proto.PlatformFamilyResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_PlatformFamilyResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_PlatformFamilyResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.PlatformFamilyResult.class, proto.PlatformFamilyResult.Builder.class);
    }

    // Construct using proto.PlatformFamilyResult.newBuilder()
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
      if (platformfamiliesBuilder_ == null) {
        platformfamilies_ = java.util.Collections.emptyList();
      } else {
        platformfamilies_ = null;
        platformfamiliesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_PlatformFamilyResult_descriptor;
    }

    @java.lang.Override
    public proto.PlatformFamilyResult getDefaultInstanceForType() {
      return proto.PlatformFamilyResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.PlatformFamilyResult build() {
      proto.PlatformFamilyResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.PlatformFamilyResult buildPartial() {
      proto.PlatformFamilyResult result = new proto.PlatformFamilyResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(proto.PlatformFamilyResult result) {
      if (platformfamiliesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          platformfamilies_ = java.util.Collections.unmodifiableList(platformfamilies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.platformfamilies_ = platformfamilies_;
      } else {
        result.platformfamilies_ = platformfamiliesBuilder_.build();
      }
    }

    private void buildPartial0(proto.PlatformFamilyResult result) {
      int from_bitField0_ = bitField0_;
    }

    private int bitField0_;

    private java.util.List<proto.PlatformFamily> platformfamilies_ =
      java.util.Collections.emptyList();
    private void ensurePlatformfamiliesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        platformfamilies_ = new java.util.ArrayList<proto.PlatformFamily>(platformfamilies_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PlatformFamily, proto.PlatformFamily.Builder, proto.PlatformFamilyOrBuilder> platformfamiliesBuilder_;

    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public java.util.List<proto.PlatformFamily> getPlatformfamiliesList() {
      if (platformfamiliesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(platformfamilies_);
      } else {
        return platformfamiliesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public int getPlatformfamiliesCount() {
      if (platformfamiliesBuilder_ == null) {
        return platformfamilies_.size();
      } else {
        return platformfamiliesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public proto.PlatformFamily getPlatformfamilies(int index) {
      if (platformfamiliesBuilder_ == null) {
        return platformfamilies_.get(index);
      } else {
        return platformfamiliesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public Builder setPlatformfamilies(
        int index, proto.PlatformFamily value) {
      if (platformfamiliesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformfamiliesIsMutable();
        platformfamilies_.set(index, value);
        onChanged();
      } else {
        platformfamiliesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public Builder setPlatformfamilies(
        int index, proto.PlatformFamily.Builder builderForValue) {
      if (platformfamiliesBuilder_ == null) {
        ensurePlatformfamiliesIsMutable();
        platformfamilies_.set(index, builderForValue.build());
        onChanged();
      } else {
        platformfamiliesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public Builder addPlatformfamilies(proto.PlatformFamily value) {
      if (platformfamiliesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformfamiliesIsMutable();
        platformfamilies_.add(value);
        onChanged();
      } else {
        platformfamiliesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public Builder addPlatformfamilies(
        int index, proto.PlatformFamily value) {
      if (platformfamiliesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlatformfamiliesIsMutable();
        platformfamilies_.add(index, value);
        onChanged();
      } else {
        platformfamiliesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public Builder addPlatformfamilies(
        proto.PlatformFamily.Builder builderForValue) {
      if (platformfamiliesBuilder_ == null) {
        ensurePlatformfamiliesIsMutable();
        platformfamilies_.add(builderForValue.build());
        onChanged();
      } else {
        platformfamiliesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public Builder addPlatformfamilies(
        int index, proto.PlatformFamily.Builder builderForValue) {
      if (platformfamiliesBuilder_ == null) {
        ensurePlatformfamiliesIsMutable();
        platformfamilies_.add(index, builderForValue.build());
        onChanged();
      } else {
        platformfamiliesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public Builder addAllPlatformfamilies(
        java.lang.Iterable<? extends proto.PlatformFamily> values) {
      if (platformfamiliesBuilder_ == null) {
        ensurePlatformfamiliesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, platformfamilies_);
        onChanged();
      } else {
        platformfamiliesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public Builder clearPlatformfamilies() {
      if (platformfamiliesBuilder_ == null) {
        platformfamilies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        platformfamiliesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public Builder removePlatformfamilies(int index) {
      if (platformfamiliesBuilder_ == null) {
        ensurePlatformfamiliesIsMutable();
        platformfamilies_.remove(index);
        onChanged();
      } else {
        platformfamiliesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public proto.PlatformFamily.Builder getPlatformfamiliesBuilder(
        int index) {
      return getPlatformfamiliesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public proto.PlatformFamilyOrBuilder getPlatformfamiliesOrBuilder(
        int index) {
      if (platformfamiliesBuilder_ == null) {
        return platformfamilies_.get(index);  } else {
        return platformfamiliesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public java.util.List<? extends proto.PlatformFamilyOrBuilder> 
         getPlatformfamiliesOrBuilderList() {
      if (platformfamiliesBuilder_ != null) {
        return platformfamiliesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(platformfamilies_);
      }
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public proto.PlatformFamily.Builder addPlatformfamiliesBuilder() {
      return getPlatformfamiliesFieldBuilder().addBuilder(
          proto.PlatformFamily.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public proto.PlatformFamily.Builder addPlatformfamiliesBuilder(
        int index) {
      return getPlatformfamiliesFieldBuilder().addBuilder(
          index, proto.PlatformFamily.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PlatformFamily platformfamilies = 1;</code>
     */
    public java.util.List<proto.PlatformFamily.Builder> 
         getPlatformfamiliesBuilderList() {
      return getPlatformfamiliesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PlatformFamily, proto.PlatformFamily.Builder, proto.PlatformFamilyOrBuilder> 
        getPlatformfamiliesFieldBuilder() {
      if (platformfamiliesBuilder_ == null) {
        platformfamiliesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.PlatformFamily, proto.PlatformFamily.Builder, proto.PlatformFamilyOrBuilder>(
                platformfamilies_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        platformfamilies_ = null;
      }
      return platformfamiliesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.PlatformFamilyResult)
  }

  // @@protoc_insertion_point(class_scope:proto.PlatformFamilyResult)
  private static final proto.PlatformFamilyResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.PlatformFamilyResult();
  }

  public static proto.PlatformFamilyResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformFamilyResult>
      PARSER = new com.google.protobuf.AbstractParser<PlatformFamilyResult>() {
    @java.lang.Override
    public PlatformFamilyResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlatformFamilyResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformFamilyResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.PlatformFamilyResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

