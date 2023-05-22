// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.CharacterMugShotResult}
 */
public final class CharacterMugShotResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.CharacterMugShotResult)
    CharacterMugShotResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CharacterMugShotResult.newBuilder() to construct.
  private CharacterMugShotResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CharacterMugShotResult() {
    charactermugshots_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CharacterMugShotResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_CharacterMugShotResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_CharacterMugShotResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.CharacterMugShotResult.class, proto.CharacterMugShotResult.Builder.class);
  }

  public static final int CHARACTERMUGSHOTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<proto.CharacterMugShot> charactermugshots_;
  /**
   * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.CharacterMugShot> getCharactermugshotsList() {
    return charactermugshots_;
  }
  /**
   * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.CharacterMugShotOrBuilder> 
      getCharactermugshotsOrBuilderList() {
    return charactermugshots_;
  }
  /**
   * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
   */
  @java.lang.Override
  public int getCharactermugshotsCount() {
    return charactermugshots_.size();
  }
  /**
   * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
   */
  @java.lang.Override
  public proto.CharacterMugShot getCharactermugshots(int index) {
    return charactermugshots_.get(index);
  }
  /**
   * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
   */
  @java.lang.Override
  public proto.CharacterMugShotOrBuilder getCharactermugshotsOrBuilder(
      int index) {
    return charactermugshots_.get(index);
  }

  public static proto.CharacterMugShotResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CharacterMugShotResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CharacterMugShotResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CharacterMugShotResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CharacterMugShotResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CharacterMugShotResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CharacterMugShotResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CharacterMugShotResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static proto.CharacterMugShotResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static proto.CharacterMugShotResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CharacterMugShotResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CharacterMugShotResult parseFrom(
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
  public static Builder newBuilder(proto.CharacterMugShotResult prototype) {
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
   * Protobuf type {@code proto.CharacterMugShotResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.CharacterMugShotResult)
      proto.CharacterMugShotResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_CharacterMugShotResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_CharacterMugShotResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.CharacterMugShotResult.class, proto.CharacterMugShotResult.Builder.class);
    }

    // Construct using proto.CharacterMugShotResult.newBuilder()
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
      if (charactermugshotsBuilder_ == null) {
        charactermugshots_ = java.util.Collections.emptyList();
      } else {
        charactermugshots_ = null;
        charactermugshotsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_CharacterMugShotResult_descriptor;
    }

    @java.lang.Override
    public proto.CharacterMugShotResult getDefaultInstanceForType() {
      return proto.CharacterMugShotResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.CharacterMugShotResult build() {
      proto.CharacterMugShotResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.CharacterMugShotResult buildPartial() {
      proto.CharacterMugShotResult result = new proto.CharacterMugShotResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(proto.CharacterMugShotResult result) {
      if (charactermugshotsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          charactermugshots_ = java.util.Collections.unmodifiableList(charactermugshots_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.charactermugshots_ = charactermugshots_;
      } else {
        result.charactermugshots_ = charactermugshotsBuilder_.build();
      }
    }

    private void buildPartial0(proto.CharacterMugShotResult result) {
      int from_bitField0_ = bitField0_;
    }

    private int bitField0_;

    private java.util.List<proto.CharacterMugShot> charactermugshots_ =
      java.util.Collections.emptyList();
    private void ensureCharactermugshotsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        charactermugshots_ = new java.util.ArrayList<proto.CharacterMugShot>(charactermugshots_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.CharacterMugShot, proto.CharacterMugShot.Builder, proto.CharacterMugShotOrBuilder> charactermugshotsBuilder_;

    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public java.util.List<proto.CharacterMugShot> getCharactermugshotsList() {
      if (charactermugshotsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(charactermugshots_);
      } else {
        return charactermugshotsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public int getCharactermugshotsCount() {
      if (charactermugshotsBuilder_ == null) {
        return charactermugshots_.size();
      } else {
        return charactermugshotsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public proto.CharacterMugShot getCharactermugshots(int index) {
      if (charactermugshotsBuilder_ == null) {
        return charactermugshots_.get(index);
      } else {
        return charactermugshotsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public Builder setCharactermugshots(
        int index, proto.CharacterMugShot value) {
      if (charactermugshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCharactermugshotsIsMutable();
        charactermugshots_.set(index, value);
        onChanged();
      } else {
        charactermugshotsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public Builder setCharactermugshots(
        int index, proto.CharacterMugShot.Builder builderForValue) {
      if (charactermugshotsBuilder_ == null) {
        ensureCharactermugshotsIsMutable();
        charactermugshots_.set(index, builderForValue.build());
        onChanged();
      } else {
        charactermugshotsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public Builder addCharactermugshots(proto.CharacterMugShot value) {
      if (charactermugshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCharactermugshotsIsMutable();
        charactermugshots_.add(value);
        onChanged();
      } else {
        charactermugshotsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public Builder addCharactermugshots(
        int index, proto.CharacterMugShot value) {
      if (charactermugshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCharactermugshotsIsMutable();
        charactermugshots_.add(index, value);
        onChanged();
      } else {
        charactermugshotsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public Builder addCharactermugshots(
        proto.CharacterMugShot.Builder builderForValue) {
      if (charactermugshotsBuilder_ == null) {
        ensureCharactermugshotsIsMutable();
        charactermugshots_.add(builderForValue.build());
        onChanged();
      } else {
        charactermugshotsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public Builder addCharactermugshots(
        int index, proto.CharacterMugShot.Builder builderForValue) {
      if (charactermugshotsBuilder_ == null) {
        ensureCharactermugshotsIsMutable();
        charactermugshots_.add(index, builderForValue.build());
        onChanged();
      } else {
        charactermugshotsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public Builder addAllCharactermugshots(
        java.lang.Iterable<? extends proto.CharacterMugShot> values) {
      if (charactermugshotsBuilder_ == null) {
        ensureCharactermugshotsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, charactermugshots_);
        onChanged();
      } else {
        charactermugshotsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public Builder clearCharactermugshots() {
      if (charactermugshotsBuilder_ == null) {
        charactermugshots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        charactermugshotsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public Builder removeCharactermugshots(int index) {
      if (charactermugshotsBuilder_ == null) {
        ensureCharactermugshotsIsMutable();
        charactermugshots_.remove(index);
        onChanged();
      } else {
        charactermugshotsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public proto.CharacterMugShot.Builder getCharactermugshotsBuilder(
        int index) {
      return getCharactermugshotsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public proto.CharacterMugShotOrBuilder getCharactermugshotsOrBuilder(
        int index) {
      if (charactermugshotsBuilder_ == null) {
        return charactermugshots_.get(index);  } else {
        return charactermugshotsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public java.util.List<? extends proto.CharacterMugShotOrBuilder> 
         getCharactermugshotsOrBuilderList() {
      if (charactermugshotsBuilder_ != null) {
        return charactermugshotsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(charactermugshots_);
      }
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public proto.CharacterMugShot.Builder addCharactermugshotsBuilder() {
      return getCharactermugshotsFieldBuilder().addBuilder(
          proto.CharacterMugShot.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public proto.CharacterMugShot.Builder addCharactermugshotsBuilder(
        int index) {
      return getCharactermugshotsFieldBuilder().addBuilder(
          index, proto.CharacterMugShot.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.CharacterMugShot charactermugshots = 1;</code>
     */
    public java.util.List<proto.CharacterMugShot.Builder> 
         getCharactermugshotsBuilderList() {
      return getCharactermugshotsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.CharacterMugShot, proto.CharacterMugShot.Builder, proto.CharacterMugShotOrBuilder> 
        getCharactermugshotsFieldBuilder() {
      if (charactermugshotsBuilder_ == null) {
        charactermugshotsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.CharacterMugShot, proto.CharacterMugShot.Builder, proto.CharacterMugShotOrBuilder>(
                charactermugshots_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        charactermugshots_ = null;
      }
      return charactermugshotsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.CharacterMugShotResult)
  }

  // @@protoc_insertion_point(class_scope:proto.CharacterMugShotResult)
  private static final proto.CharacterMugShotResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.CharacterMugShotResult();
  }

  public static proto.CharacterMugShotResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CharacterMugShotResult>
      PARSER = new com.google.protobuf.AbstractParser<CharacterMugShotResult>() {
    @java.lang.Override
    public CharacterMugShotResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<CharacterMugShotResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CharacterMugShotResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.CharacterMugShotResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

