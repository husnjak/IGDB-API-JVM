// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.AgeRatingContentDescriptionResult}
 */
public final class AgeRatingContentDescriptionResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.AgeRatingContentDescriptionResult)
    AgeRatingContentDescriptionResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgeRatingContentDescriptionResult.newBuilder() to construct.
  private AgeRatingContentDescriptionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgeRatingContentDescriptionResult() {
    ageratingcontentdescriptions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgeRatingContentDescriptionResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_AgeRatingContentDescriptionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_AgeRatingContentDescriptionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.AgeRatingContentDescriptionResult.class, proto.AgeRatingContentDescriptionResult.Builder.class);
  }

  public static final int AGERATINGCONTENTDESCRIPTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<proto.AgeRatingContentDescription> ageratingcontentdescriptions_;
  /**
   * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.AgeRatingContentDescription> getAgeratingcontentdescriptionsList() {
    return ageratingcontentdescriptions_;
  }
  /**
   * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.AgeRatingContentDescriptionOrBuilder> 
      getAgeratingcontentdescriptionsOrBuilderList() {
    return ageratingcontentdescriptions_;
  }
  /**
   * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
   */
  @java.lang.Override
  public int getAgeratingcontentdescriptionsCount() {
    return ageratingcontentdescriptions_.size();
  }
  /**
   * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
   */
  @java.lang.Override
  public proto.AgeRatingContentDescription getAgeratingcontentdescriptions(int index) {
    return ageratingcontentdescriptions_.get(index);
  }
  /**
   * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
   */
  @java.lang.Override
  public proto.AgeRatingContentDescriptionOrBuilder getAgeratingcontentdescriptionsOrBuilder(
      int index) {
    return ageratingcontentdescriptions_.get(index);
  }

  public static proto.AgeRatingContentDescriptionResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AgeRatingContentDescriptionResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AgeRatingContentDescriptionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AgeRatingContentDescriptionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AgeRatingContentDescriptionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AgeRatingContentDescriptionResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AgeRatingContentDescriptionResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.AgeRatingContentDescriptionResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static proto.AgeRatingContentDescriptionResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static proto.AgeRatingContentDescriptionResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.AgeRatingContentDescriptionResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.AgeRatingContentDescriptionResult parseFrom(
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
  public static Builder newBuilder(proto.AgeRatingContentDescriptionResult prototype) {
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
   * Protobuf type {@code proto.AgeRatingContentDescriptionResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.AgeRatingContentDescriptionResult)
      proto.AgeRatingContentDescriptionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_AgeRatingContentDescriptionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_AgeRatingContentDescriptionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.AgeRatingContentDescriptionResult.class, proto.AgeRatingContentDescriptionResult.Builder.class);
    }

    // Construct using proto.AgeRatingContentDescriptionResult.newBuilder()
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
      if (ageratingcontentdescriptionsBuilder_ == null) {
        ageratingcontentdescriptions_ = java.util.Collections.emptyList();
      } else {
        ageratingcontentdescriptions_ = null;
        ageratingcontentdescriptionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_AgeRatingContentDescriptionResult_descriptor;
    }

    @java.lang.Override
    public proto.AgeRatingContentDescriptionResult getDefaultInstanceForType() {
      return proto.AgeRatingContentDescriptionResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.AgeRatingContentDescriptionResult build() {
      proto.AgeRatingContentDescriptionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.AgeRatingContentDescriptionResult buildPartial() {
      proto.AgeRatingContentDescriptionResult result = new proto.AgeRatingContentDescriptionResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(proto.AgeRatingContentDescriptionResult result) {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ageratingcontentdescriptions_ = java.util.Collections.unmodifiableList(ageratingcontentdescriptions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ageratingcontentdescriptions_ = ageratingcontentdescriptions_;
      } else {
        result.ageratingcontentdescriptions_ = ageratingcontentdescriptionsBuilder_.build();
      }
    }

    private void buildPartial0(proto.AgeRatingContentDescriptionResult result) {
      int from_bitField0_ = bitField0_;
    }

    private int bitField0_;

    private java.util.List<proto.AgeRatingContentDescription> ageratingcontentdescriptions_ =
      java.util.Collections.emptyList();
    private void ensureAgeratingcontentdescriptionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ageratingcontentdescriptions_ = new java.util.ArrayList<proto.AgeRatingContentDescription>(ageratingcontentdescriptions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.AgeRatingContentDescription, proto.AgeRatingContentDescription.Builder, proto.AgeRatingContentDescriptionOrBuilder> ageratingcontentdescriptionsBuilder_;

    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public java.util.List<proto.AgeRatingContentDescription> getAgeratingcontentdescriptionsList() {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ageratingcontentdescriptions_);
      } else {
        return ageratingcontentdescriptionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public int getAgeratingcontentdescriptionsCount() {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        return ageratingcontentdescriptions_.size();
      } else {
        return ageratingcontentdescriptionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public proto.AgeRatingContentDescription getAgeratingcontentdescriptions(int index) {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        return ageratingcontentdescriptions_.get(index);
      } else {
        return ageratingcontentdescriptionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public Builder setAgeratingcontentdescriptions(
        int index, proto.AgeRatingContentDescription value) {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeratingcontentdescriptionsIsMutable();
        ageratingcontentdescriptions_.set(index, value);
        onChanged();
      } else {
        ageratingcontentdescriptionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public Builder setAgeratingcontentdescriptions(
        int index, proto.AgeRatingContentDescription.Builder builderForValue) {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        ensureAgeratingcontentdescriptionsIsMutable();
        ageratingcontentdescriptions_.set(index, builderForValue.build());
        onChanged();
      } else {
        ageratingcontentdescriptionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public Builder addAgeratingcontentdescriptions(proto.AgeRatingContentDescription value) {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeratingcontentdescriptionsIsMutable();
        ageratingcontentdescriptions_.add(value);
        onChanged();
      } else {
        ageratingcontentdescriptionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public Builder addAgeratingcontentdescriptions(
        int index, proto.AgeRatingContentDescription value) {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeratingcontentdescriptionsIsMutable();
        ageratingcontentdescriptions_.add(index, value);
        onChanged();
      } else {
        ageratingcontentdescriptionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public Builder addAgeratingcontentdescriptions(
        proto.AgeRatingContentDescription.Builder builderForValue) {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        ensureAgeratingcontentdescriptionsIsMutable();
        ageratingcontentdescriptions_.add(builderForValue.build());
        onChanged();
      } else {
        ageratingcontentdescriptionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public Builder addAgeratingcontentdescriptions(
        int index, proto.AgeRatingContentDescription.Builder builderForValue) {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        ensureAgeratingcontentdescriptionsIsMutable();
        ageratingcontentdescriptions_.add(index, builderForValue.build());
        onChanged();
      } else {
        ageratingcontentdescriptionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public Builder addAllAgeratingcontentdescriptions(
        java.lang.Iterable<? extends proto.AgeRatingContentDescription> values) {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        ensureAgeratingcontentdescriptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ageratingcontentdescriptions_);
        onChanged();
      } else {
        ageratingcontentdescriptionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public Builder clearAgeratingcontentdescriptions() {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        ageratingcontentdescriptions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ageratingcontentdescriptionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public Builder removeAgeratingcontentdescriptions(int index) {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        ensureAgeratingcontentdescriptionsIsMutable();
        ageratingcontentdescriptions_.remove(index);
        onChanged();
      } else {
        ageratingcontentdescriptionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public proto.AgeRatingContentDescription.Builder getAgeratingcontentdescriptionsBuilder(
        int index) {
      return getAgeratingcontentdescriptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public proto.AgeRatingContentDescriptionOrBuilder getAgeratingcontentdescriptionsOrBuilder(
        int index) {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        return ageratingcontentdescriptions_.get(index);  } else {
        return ageratingcontentdescriptionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public java.util.List<? extends proto.AgeRatingContentDescriptionOrBuilder> 
         getAgeratingcontentdescriptionsOrBuilderList() {
      if (ageratingcontentdescriptionsBuilder_ != null) {
        return ageratingcontentdescriptionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ageratingcontentdescriptions_);
      }
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public proto.AgeRatingContentDescription.Builder addAgeratingcontentdescriptionsBuilder() {
      return getAgeratingcontentdescriptionsFieldBuilder().addBuilder(
          proto.AgeRatingContentDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public proto.AgeRatingContentDescription.Builder addAgeratingcontentdescriptionsBuilder(
        int index) {
      return getAgeratingcontentdescriptionsFieldBuilder().addBuilder(
          index, proto.AgeRatingContentDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.AgeRatingContentDescription ageratingcontentdescriptions = 1;</code>
     */
    public java.util.List<proto.AgeRatingContentDescription.Builder> 
         getAgeratingcontentdescriptionsBuilderList() {
      return getAgeratingcontentdescriptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.AgeRatingContentDescription, proto.AgeRatingContentDescription.Builder, proto.AgeRatingContentDescriptionOrBuilder> 
        getAgeratingcontentdescriptionsFieldBuilder() {
      if (ageratingcontentdescriptionsBuilder_ == null) {
        ageratingcontentdescriptionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.AgeRatingContentDescription, proto.AgeRatingContentDescription.Builder, proto.AgeRatingContentDescriptionOrBuilder>(
                ageratingcontentdescriptions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ageratingcontentdescriptions_ = null;
      }
      return ageratingcontentdescriptionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.AgeRatingContentDescriptionResult)
  }

  // @@protoc_insertion_point(class_scope:proto.AgeRatingContentDescriptionResult)
  private static final proto.AgeRatingContentDescriptionResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.AgeRatingContentDescriptionResult();
  }

  public static proto.AgeRatingContentDescriptionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgeRatingContentDescriptionResult>
      PARSER = new com.google.protobuf.AbstractParser<AgeRatingContentDescriptionResult>() {
    @java.lang.Override
    public AgeRatingContentDescriptionResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgeRatingContentDescriptionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgeRatingContentDescriptionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.AgeRatingContentDescriptionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

