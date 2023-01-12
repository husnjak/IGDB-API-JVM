// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.GameModeResult}
 */
public final class GameModeResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GameModeResult)
    GameModeResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameModeResult.newBuilder() to construct.
  private GameModeResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameModeResult() {
    gamemodes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GameModeResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_GameModeResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_GameModeResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.GameModeResult.class, proto.GameModeResult.Builder.class);
  }

  public static final int GAMEMODES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<proto.GameMode> gamemodes_;
  /**
   * <code>repeated .proto.GameMode gamemodes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.GameMode> getGamemodesList() {
    return gamemodes_;
  }
  /**
   * <code>repeated .proto.GameMode gamemodes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.GameModeOrBuilder> 
      getGamemodesOrBuilderList() {
    return gamemodes_;
  }
  /**
   * <code>repeated .proto.GameMode gamemodes = 1;</code>
   */
  @java.lang.Override
  public int getGamemodesCount() {
    return gamemodes_.size();
  }
  /**
   * <code>repeated .proto.GameMode gamemodes = 1;</code>
   */
  @java.lang.Override
  public proto.GameMode getGamemodes(int index) {
    return gamemodes_.get(index);
  }
  /**
   * <code>repeated .proto.GameMode gamemodes = 1;</code>
   */
  @java.lang.Override
  public proto.GameModeOrBuilder getGamemodesOrBuilder(
      int index) {
    return gamemodes_.get(index);
  }

  public static proto.GameModeResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameModeResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameModeResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameModeResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameModeResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameModeResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameModeResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GameModeResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GameModeResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.GameModeResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GameModeResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GameModeResult parseFrom(
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
  public static Builder newBuilder(proto.GameModeResult prototype) {
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
   * Protobuf type {@code proto.GameModeResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.GameModeResult)
      proto.GameModeResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_GameModeResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_GameModeResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.GameModeResult.class, proto.GameModeResult.Builder.class);
    }

    // Construct using proto.GameModeResult.newBuilder()
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
      if (gamemodesBuilder_ == null) {
        gamemodes_ = java.util.Collections.emptyList();
      } else {
        gamemodes_ = null;
        gamemodesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_GameModeResult_descriptor;
    }

    @java.lang.Override
    public proto.GameModeResult getDefaultInstanceForType() {
      return proto.GameModeResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.GameModeResult build() {
      proto.GameModeResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.GameModeResult buildPartial() {
      proto.GameModeResult result = new proto.GameModeResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(proto.GameModeResult result) {
      if (gamemodesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          gamemodes_ = java.util.Collections.unmodifiableList(gamemodes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.gamemodes_ = gamemodes_;
      } else {
        result.gamemodes_ = gamemodesBuilder_.build();
      }
    }

    private void buildPartial0(proto.GameModeResult result) {
      int from_bitField0_ = bitField0_;
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

    private java.util.List<proto.GameMode> gamemodes_ =
      java.util.Collections.emptyList();
    private void ensureGamemodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        gamemodes_ = new java.util.ArrayList<proto.GameMode>(gamemodes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.GameMode, proto.GameMode.Builder, proto.GameModeOrBuilder> gamemodesBuilder_;

    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public java.util.List<proto.GameMode> getGamemodesList() {
      if (gamemodesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(gamemodes_);
      } else {
        return gamemodesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public int getGamemodesCount() {
      if (gamemodesBuilder_ == null) {
        return gamemodes_.size();
      } else {
        return gamemodesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public proto.GameMode getGamemodes(int index) {
      if (gamemodesBuilder_ == null) {
        return gamemodes_.get(index);
      } else {
        return gamemodesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public Builder setGamemodes(
        int index, proto.GameMode value) {
      if (gamemodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGamemodesIsMutable();
        gamemodes_.set(index, value);
        onChanged();
      } else {
        gamemodesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public Builder setGamemodes(
        int index, proto.GameMode.Builder builderForValue) {
      if (gamemodesBuilder_ == null) {
        ensureGamemodesIsMutable();
        gamemodes_.set(index, builderForValue.build());
        onChanged();
      } else {
        gamemodesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public Builder addGamemodes(proto.GameMode value) {
      if (gamemodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGamemodesIsMutable();
        gamemodes_.add(value);
        onChanged();
      } else {
        gamemodesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public Builder addGamemodes(
        int index, proto.GameMode value) {
      if (gamemodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGamemodesIsMutable();
        gamemodes_.add(index, value);
        onChanged();
      } else {
        gamemodesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public Builder addGamemodes(
        proto.GameMode.Builder builderForValue) {
      if (gamemodesBuilder_ == null) {
        ensureGamemodesIsMutable();
        gamemodes_.add(builderForValue.build());
        onChanged();
      } else {
        gamemodesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public Builder addGamemodes(
        int index, proto.GameMode.Builder builderForValue) {
      if (gamemodesBuilder_ == null) {
        ensureGamemodesIsMutable();
        gamemodes_.add(index, builderForValue.build());
        onChanged();
      } else {
        gamemodesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public Builder addAllGamemodes(
        java.lang.Iterable<? extends proto.GameMode> values) {
      if (gamemodesBuilder_ == null) {
        ensureGamemodesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gamemodes_);
        onChanged();
      } else {
        gamemodesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public Builder clearGamemodes() {
      if (gamemodesBuilder_ == null) {
        gamemodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        gamemodesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public Builder removeGamemodes(int index) {
      if (gamemodesBuilder_ == null) {
        ensureGamemodesIsMutable();
        gamemodes_.remove(index);
        onChanged();
      } else {
        gamemodesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public proto.GameMode.Builder getGamemodesBuilder(
        int index) {
      return getGamemodesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public proto.GameModeOrBuilder getGamemodesOrBuilder(
        int index) {
      if (gamemodesBuilder_ == null) {
        return gamemodes_.get(index);  } else {
        return gamemodesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public java.util.List<? extends proto.GameModeOrBuilder> 
         getGamemodesOrBuilderList() {
      if (gamemodesBuilder_ != null) {
        return gamemodesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(gamemodes_);
      }
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public proto.GameMode.Builder addGamemodesBuilder() {
      return getGamemodesFieldBuilder().addBuilder(
          proto.GameMode.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public proto.GameMode.Builder addGamemodesBuilder(
        int index) {
      return getGamemodesFieldBuilder().addBuilder(
          index, proto.GameMode.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.GameMode gamemodes = 1;</code>
     */
    public java.util.List<proto.GameMode.Builder> 
         getGamemodesBuilderList() {
      return getGamemodesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.GameMode, proto.GameMode.Builder, proto.GameModeOrBuilder> 
        getGamemodesFieldBuilder() {
      if (gamemodesBuilder_ == null) {
        gamemodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.GameMode, proto.GameMode.Builder, proto.GameModeOrBuilder>(
                gamemodes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        gamemodes_ = null;
      }
      return gamemodesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.GameModeResult)
  }

  // @@protoc_insertion_point(class_scope:proto.GameModeResult)
  private static final proto.GameModeResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.GameModeResult();
  }

  public static proto.GameModeResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameModeResult>
      PARSER = new com.google.protobuf.AbstractParser<GameModeResult>() {
    @java.lang.Override
    public GameModeResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<GameModeResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameModeResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.GameModeResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

