// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.PlayerPerspectiveResult}
 */
public final class PlayerPerspectiveResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.PlayerPerspectiveResult)
    PlayerPerspectiveResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayerPerspectiveResult.newBuilder() to construct.
  private PlayerPerspectiveResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayerPerspectiveResult() {
    playerperspectives_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayerPerspectiveResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_PlayerPerspectiveResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_PlayerPerspectiveResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.PlayerPerspectiveResult.class, proto.PlayerPerspectiveResult.Builder.class);
  }

  public static final int PLAYERPERSPECTIVES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<proto.PlayerPerspective> playerperspectives_;
  /**
   * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.PlayerPerspective> getPlayerperspectivesList() {
    return playerperspectives_;
  }
  /**
   * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.PlayerPerspectiveOrBuilder> 
      getPlayerperspectivesOrBuilderList() {
    return playerperspectives_;
  }
  /**
   * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
   */
  @java.lang.Override
  public int getPlayerperspectivesCount() {
    return playerperspectives_.size();
  }
  /**
   * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
   */
  @java.lang.Override
  public proto.PlayerPerspective getPlayerperspectives(int index) {
    return playerperspectives_.get(index);
  }
  /**
   * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
   */
  @java.lang.Override
  public proto.PlayerPerspectiveOrBuilder getPlayerperspectivesOrBuilder(
      int index) {
    return playerperspectives_.get(index);
  }

  public static proto.PlayerPerspectiveResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PlayerPerspectiveResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PlayerPerspectiveResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PlayerPerspectiveResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PlayerPerspectiveResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.PlayerPerspectiveResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.PlayerPerspectiveResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PlayerPerspectiveResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static proto.PlayerPerspectiveResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static proto.PlayerPerspectiveResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.PlayerPerspectiveResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.PlayerPerspectiveResult parseFrom(
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
  public static Builder newBuilder(proto.PlayerPerspectiveResult prototype) {
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
   * Protobuf type {@code proto.PlayerPerspectiveResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.PlayerPerspectiveResult)
      proto.PlayerPerspectiveResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_PlayerPerspectiveResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_PlayerPerspectiveResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.PlayerPerspectiveResult.class, proto.PlayerPerspectiveResult.Builder.class);
    }

    // Construct using proto.PlayerPerspectiveResult.newBuilder()
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
      if (playerperspectivesBuilder_ == null) {
        playerperspectives_ = java.util.Collections.emptyList();
      } else {
        playerperspectives_ = null;
        playerperspectivesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_PlayerPerspectiveResult_descriptor;
    }

    @java.lang.Override
    public proto.PlayerPerspectiveResult getDefaultInstanceForType() {
      return proto.PlayerPerspectiveResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.PlayerPerspectiveResult build() {
      proto.PlayerPerspectiveResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.PlayerPerspectiveResult buildPartial() {
      proto.PlayerPerspectiveResult result = new proto.PlayerPerspectiveResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(proto.PlayerPerspectiveResult result) {
      if (playerperspectivesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          playerperspectives_ = java.util.Collections.unmodifiableList(playerperspectives_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.playerperspectives_ = playerperspectives_;
      } else {
        result.playerperspectives_ = playerperspectivesBuilder_.build();
      }
    }

    private void buildPartial0(proto.PlayerPerspectiveResult result) {
      int from_bitField0_ = bitField0_;
    }

    private int bitField0_;

    private java.util.List<proto.PlayerPerspective> playerperspectives_ =
      java.util.Collections.emptyList();
    private void ensurePlayerperspectivesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        playerperspectives_ = new java.util.ArrayList<proto.PlayerPerspective>(playerperspectives_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PlayerPerspective, proto.PlayerPerspective.Builder, proto.PlayerPerspectiveOrBuilder> playerperspectivesBuilder_;

    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public java.util.List<proto.PlayerPerspective> getPlayerperspectivesList() {
      if (playerperspectivesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(playerperspectives_);
      } else {
        return playerperspectivesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public int getPlayerperspectivesCount() {
      if (playerperspectivesBuilder_ == null) {
        return playerperspectives_.size();
      } else {
        return playerperspectivesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public proto.PlayerPerspective getPlayerperspectives(int index) {
      if (playerperspectivesBuilder_ == null) {
        return playerperspectives_.get(index);
      } else {
        return playerperspectivesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public Builder setPlayerperspectives(
        int index, proto.PlayerPerspective value) {
      if (playerperspectivesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayerperspectivesIsMutable();
        playerperspectives_.set(index, value);
        onChanged();
      } else {
        playerperspectivesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public Builder setPlayerperspectives(
        int index, proto.PlayerPerspective.Builder builderForValue) {
      if (playerperspectivesBuilder_ == null) {
        ensurePlayerperspectivesIsMutable();
        playerperspectives_.set(index, builderForValue.build());
        onChanged();
      } else {
        playerperspectivesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public Builder addPlayerperspectives(proto.PlayerPerspective value) {
      if (playerperspectivesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayerperspectivesIsMutable();
        playerperspectives_.add(value);
        onChanged();
      } else {
        playerperspectivesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public Builder addPlayerperspectives(
        int index, proto.PlayerPerspective value) {
      if (playerperspectivesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayerperspectivesIsMutable();
        playerperspectives_.add(index, value);
        onChanged();
      } else {
        playerperspectivesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public Builder addPlayerperspectives(
        proto.PlayerPerspective.Builder builderForValue) {
      if (playerperspectivesBuilder_ == null) {
        ensurePlayerperspectivesIsMutable();
        playerperspectives_.add(builderForValue.build());
        onChanged();
      } else {
        playerperspectivesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public Builder addPlayerperspectives(
        int index, proto.PlayerPerspective.Builder builderForValue) {
      if (playerperspectivesBuilder_ == null) {
        ensurePlayerperspectivesIsMutable();
        playerperspectives_.add(index, builderForValue.build());
        onChanged();
      } else {
        playerperspectivesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public Builder addAllPlayerperspectives(
        java.lang.Iterable<? extends proto.PlayerPerspective> values) {
      if (playerperspectivesBuilder_ == null) {
        ensurePlayerperspectivesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, playerperspectives_);
        onChanged();
      } else {
        playerperspectivesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public Builder clearPlayerperspectives() {
      if (playerperspectivesBuilder_ == null) {
        playerperspectives_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        playerperspectivesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public Builder removePlayerperspectives(int index) {
      if (playerperspectivesBuilder_ == null) {
        ensurePlayerperspectivesIsMutable();
        playerperspectives_.remove(index);
        onChanged();
      } else {
        playerperspectivesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public proto.PlayerPerspective.Builder getPlayerperspectivesBuilder(
        int index) {
      return getPlayerperspectivesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public proto.PlayerPerspectiveOrBuilder getPlayerperspectivesOrBuilder(
        int index) {
      if (playerperspectivesBuilder_ == null) {
        return playerperspectives_.get(index);  } else {
        return playerperspectivesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public java.util.List<? extends proto.PlayerPerspectiveOrBuilder> 
         getPlayerperspectivesOrBuilderList() {
      if (playerperspectivesBuilder_ != null) {
        return playerperspectivesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(playerperspectives_);
      }
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public proto.PlayerPerspective.Builder addPlayerperspectivesBuilder() {
      return getPlayerperspectivesFieldBuilder().addBuilder(
          proto.PlayerPerspective.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public proto.PlayerPerspective.Builder addPlayerperspectivesBuilder(
        int index) {
      return getPlayerperspectivesFieldBuilder().addBuilder(
          index, proto.PlayerPerspective.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.PlayerPerspective playerperspectives = 1;</code>
     */
    public java.util.List<proto.PlayerPerspective.Builder> 
         getPlayerperspectivesBuilderList() {
      return getPlayerperspectivesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.PlayerPerspective, proto.PlayerPerspective.Builder, proto.PlayerPerspectiveOrBuilder> 
        getPlayerperspectivesFieldBuilder() {
      if (playerperspectivesBuilder_ == null) {
        playerperspectivesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.PlayerPerspective, proto.PlayerPerspective.Builder, proto.PlayerPerspectiveOrBuilder>(
                playerperspectives_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        playerperspectives_ = null;
      }
      return playerperspectivesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.PlayerPerspectiveResult)
  }

  // @@protoc_insertion_point(class_scope:proto.PlayerPerspectiveResult)
  private static final proto.PlayerPerspectiveResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.PlayerPerspectiveResult();
  }

  public static proto.PlayerPerspectiveResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayerPerspectiveResult>
      PARSER = new com.google.protobuf.AbstractParser<PlayerPerspectiveResult>() {
    @java.lang.Override
    public PlayerPerspectiveResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlayerPerspectiveResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayerPerspectiveResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.PlayerPerspectiveResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

