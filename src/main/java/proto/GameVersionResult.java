// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.GameVersionResult}
 */
public final class GameVersionResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GameVersionResult)
    GameVersionResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameVersionResult.newBuilder() to construct.
  private GameVersionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameVersionResult() {
    gameversions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GameVersionResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_GameVersionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_GameVersionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.GameVersionResult.class, proto.GameVersionResult.Builder.class);
  }

  public static final int GAMEVERSIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<proto.GameVersion> gameversions_;
  /**
   * <code>repeated .proto.GameVersion gameversions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.GameVersion> getGameversionsList() {
    return gameversions_;
  }
  /**
   * <code>repeated .proto.GameVersion gameversions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.GameVersionOrBuilder> 
      getGameversionsOrBuilderList() {
    return gameversions_;
  }
  /**
   * <code>repeated .proto.GameVersion gameversions = 1;</code>
   */
  @java.lang.Override
  public int getGameversionsCount() {
    return gameversions_.size();
  }
  /**
   * <code>repeated .proto.GameVersion gameversions = 1;</code>
   */
  @java.lang.Override
  public proto.GameVersion getGameversions(int index) {
    return gameversions_.get(index);
  }
  /**
   * <code>repeated .proto.GameVersion gameversions = 1;</code>
   */
  @java.lang.Override
  public proto.GameVersionOrBuilder getGameversionsOrBuilder(
      int index) {
    return gameversions_.get(index);
  }

  public static proto.GameVersionResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameVersionResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameVersionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameVersionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameVersionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GameVersionResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GameVersionResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GameVersionResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GameVersionResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.GameVersionResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GameVersionResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GameVersionResult parseFrom(
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
  public static Builder newBuilder(proto.GameVersionResult prototype) {
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
   * Protobuf type {@code proto.GameVersionResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.GameVersionResult)
      proto.GameVersionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_GameVersionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_GameVersionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.GameVersionResult.class, proto.GameVersionResult.Builder.class);
    }

    // Construct using proto.GameVersionResult.newBuilder()
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
      if (gameversionsBuilder_ == null) {
        gameversions_ = java.util.Collections.emptyList();
      } else {
        gameversions_ = null;
        gameversionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_GameVersionResult_descriptor;
    }

    @java.lang.Override
    public proto.GameVersionResult getDefaultInstanceForType() {
      return proto.GameVersionResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.GameVersionResult build() {
      proto.GameVersionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.GameVersionResult buildPartial() {
      proto.GameVersionResult result = new proto.GameVersionResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(proto.GameVersionResult result) {
      if (gameversionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          gameversions_ = java.util.Collections.unmodifiableList(gameversions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.gameversions_ = gameversions_;
      } else {
        result.gameversions_ = gameversionsBuilder_.build();
      }
    }

    private void buildPartial0(proto.GameVersionResult result) {
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

    private java.util.List<proto.GameVersion> gameversions_ =
      java.util.Collections.emptyList();
    private void ensureGameversionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        gameversions_ = new java.util.ArrayList<proto.GameVersion>(gameversions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.GameVersion, proto.GameVersion.Builder, proto.GameVersionOrBuilder> gameversionsBuilder_;

    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public java.util.List<proto.GameVersion> getGameversionsList() {
      if (gameversionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(gameversions_);
      } else {
        return gameversionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public int getGameversionsCount() {
      if (gameversionsBuilder_ == null) {
        return gameversions_.size();
      } else {
        return gameversionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public proto.GameVersion getGameversions(int index) {
      if (gameversionsBuilder_ == null) {
        return gameversions_.get(index);
      } else {
        return gameversionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public Builder setGameversions(
        int index, proto.GameVersion value) {
      if (gameversionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGameversionsIsMutable();
        gameversions_.set(index, value);
        onChanged();
      } else {
        gameversionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public Builder setGameversions(
        int index, proto.GameVersion.Builder builderForValue) {
      if (gameversionsBuilder_ == null) {
        ensureGameversionsIsMutable();
        gameversions_.set(index, builderForValue.build());
        onChanged();
      } else {
        gameversionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public Builder addGameversions(proto.GameVersion value) {
      if (gameversionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGameversionsIsMutable();
        gameversions_.add(value);
        onChanged();
      } else {
        gameversionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public Builder addGameversions(
        int index, proto.GameVersion value) {
      if (gameversionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGameversionsIsMutable();
        gameversions_.add(index, value);
        onChanged();
      } else {
        gameversionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public Builder addGameversions(
        proto.GameVersion.Builder builderForValue) {
      if (gameversionsBuilder_ == null) {
        ensureGameversionsIsMutable();
        gameversions_.add(builderForValue.build());
        onChanged();
      } else {
        gameversionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public Builder addGameversions(
        int index, proto.GameVersion.Builder builderForValue) {
      if (gameversionsBuilder_ == null) {
        ensureGameversionsIsMutable();
        gameversions_.add(index, builderForValue.build());
        onChanged();
      } else {
        gameversionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public Builder addAllGameversions(
        java.lang.Iterable<? extends proto.GameVersion> values) {
      if (gameversionsBuilder_ == null) {
        ensureGameversionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gameversions_);
        onChanged();
      } else {
        gameversionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public Builder clearGameversions() {
      if (gameversionsBuilder_ == null) {
        gameversions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        gameversionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public Builder removeGameversions(int index) {
      if (gameversionsBuilder_ == null) {
        ensureGameversionsIsMutable();
        gameversions_.remove(index);
        onChanged();
      } else {
        gameversionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public proto.GameVersion.Builder getGameversionsBuilder(
        int index) {
      return getGameversionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public proto.GameVersionOrBuilder getGameversionsOrBuilder(
        int index) {
      if (gameversionsBuilder_ == null) {
        return gameversions_.get(index);  } else {
        return gameversionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public java.util.List<? extends proto.GameVersionOrBuilder> 
         getGameversionsOrBuilderList() {
      if (gameversionsBuilder_ != null) {
        return gameversionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(gameversions_);
      }
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public proto.GameVersion.Builder addGameversionsBuilder() {
      return getGameversionsFieldBuilder().addBuilder(
          proto.GameVersion.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public proto.GameVersion.Builder addGameversionsBuilder(
        int index) {
      return getGameversionsFieldBuilder().addBuilder(
          index, proto.GameVersion.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.GameVersion gameversions = 1;</code>
     */
    public java.util.List<proto.GameVersion.Builder> 
         getGameversionsBuilderList() {
      return getGameversionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.GameVersion, proto.GameVersion.Builder, proto.GameVersionOrBuilder> 
        getGameversionsFieldBuilder() {
      if (gameversionsBuilder_ == null) {
        gameversionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.GameVersion, proto.GameVersion.Builder, proto.GameVersionOrBuilder>(
                gameversions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        gameversions_ = null;
      }
      return gameversionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.GameVersionResult)
  }

  // @@protoc_insertion_point(class_scope:proto.GameVersionResult)
  private static final proto.GameVersionResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.GameVersionResult();
  }

  public static proto.GameVersionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameVersionResult>
      PARSER = new com.google.protobuf.AbstractParser<GameVersionResult>() {
    @java.lang.Override
    public GameVersionResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<GameVersionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameVersionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.GameVersionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

