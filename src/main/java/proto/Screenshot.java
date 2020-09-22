// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.Screenshot}
 */
public  final class Screenshot extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.Screenshot)
    ScreenshotOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Screenshot.newBuilder() to construct.
  private Screenshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Screenshot() {
    imageId_ = "";
    url_ = "";
    checksum_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_Screenshot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_Screenshot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.Screenshot.class, proto.Screenshot.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>uint64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int ALPHA_CHANNEL_FIELD_NUMBER = 2;
  private boolean alphaChannel_;
  /**
   * <code>bool alpha_channel = 2;</code>
   */
  public boolean getAlphaChannel() {
    return alphaChannel_;
  }

  public static final int ANIMATED_FIELD_NUMBER = 3;
  private boolean animated_;
  /**
   * <code>bool animated = 3;</code>
   */
  public boolean getAnimated() {
    return animated_;
  }

  public static final int GAME_FIELD_NUMBER = 4;
  private proto.Game game_;
  /**
   * <code>.proto.Game game = 4;</code>
   */
  public boolean hasGame() {
    return game_ != null;
  }
  /**
   * <code>.proto.Game game = 4;</code>
   */
  public proto.Game getGame() {
    return game_ == null ? proto.Game.getDefaultInstance() : game_;
  }
  /**
   * <code>.proto.Game game = 4;</code>
   */
  public proto.GameOrBuilder getGameOrBuilder() {
    return getGame();
  }

  public static final int HEIGHT_FIELD_NUMBER = 5;
  private int height_;
  /**
   * <code>int32 height = 5;</code>
   */
  public int getHeight() {
    return height_;
  }

  public static final int IMAGE_ID_FIELD_NUMBER = 6;
  private volatile java.lang.Object imageId_;
  /**
   * <code>string image_id = 6;</code>
   */
  public java.lang.String getImageId() {
    java.lang.Object ref = imageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageId_ = s;
      return s;
    }
  }
  /**
   * <code>string image_id = 6;</code>
   */
  public com.google.protobuf.ByteString
      getImageIdBytes() {
    java.lang.Object ref = imageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 7;
  private volatile java.lang.Object url_;
  /**
   * <code>string url = 7;</code>
   */
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
   * <code>string url = 7;</code>
   */
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

  public static final int WIDTH_FIELD_NUMBER = 8;
  private int width_;
  /**
   * <code>int32 width = 8;</code>
   */
  public int getWidth() {
    return width_;
  }

  public static final int CHECKSUM_FIELD_NUMBER = 9;
  private volatile java.lang.Object checksum_;
  /**
   * <code>string checksum = 9;</code>
   */
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
   * <code>string checksum = 9;</code>
   */
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

  public static proto.Screenshot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Screenshot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Screenshot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Screenshot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Screenshot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Screenshot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Screenshot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Screenshot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.Screenshot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.Screenshot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.Screenshot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Screenshot parseFrom(
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
  public static Builder newBuilder(proto.Screenshot prototype) {
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
   * Protobuf type {@code proto.Screenshot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Screenshot)
      proto.ScreenshotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_Screenshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_Screenshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.Screenshot.class, proto.Screenshot.Builder.class);
    }

    // Construct using proto.Screenshot.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      alphaChannel_ = false;

      animated_ = false;

      if (gameBuilder_ == null) {
        game_ = null;
      } else {
        game_ = null;
        gameBuilder_ = null;
      }
      height_ = 0;

      imageId_ = "";

      url_ = "";

      width_ = 0;

      checksum_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_Screenshot_descriptor;
    }

    @java.lang.Override
    public proto.Screenshot getDefaultInstanceForType() {
      return proto.Screenshot.getDefaultInstance();
    }

    @java.lang.Override
    public proto.Screenshot build() {
      proto.Screenshot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.Screenshot buildPartial() {
      proto.Screenshot result = new proto.Screenshot(this);
      result.id_ = id_;
      result.alphaChannel_ = alphaChannel_;
      result.animated_ = animated_;
      if (gameBuilder_ == null) {
        result.game_ = game_;
      } else {
        result.game_ = gameBuilder_.build();
      }
      result.height_ = height_;
      result.imageId_ = imageId_;
      result.url_ = url_;
      result.width_ = width_;
      result.checksum_ = checksum_;
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

    private long id_ ;
    /**
     * <code>uint64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private boolean alphaChannel_ ;
    /**
     * <code>bool alpha_channel = 2;</code>
     */
    public boolean getAlphaChannel() {
      return alphaChannel_;
    }
    /**
     * <code>bool alpha_channel = 2;</code>
     */
    public Builder setAlphaChannel(boolean value) {
      
      alphaChannel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool alpha_channel = 2;</code>
     */
    public Builder clearAlphaChannel() {
      
      alphaChannel_ = false;
      onChanged();
      return this;
    }

    private boolean animated_ ;
    /**
     * <code>bool animated = 3;</code>
     */
    public boolean getAnimated() {
      return animated_;
    }
    /**
     * <code>bool animated = 3;</code>
     */
    public Builder setAnimated(boolean value) {
      
      animated_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool animated = 3;</code>
     */
    public Builder clearAnimated() {
      
      animated_ = false;
      onChanged();
      return this;
    }

    private proto.Game game_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Game, proto.Game.Builder, proto.GameOrBuilder> gameBuilder_;
    /**
     * <code>.proto.Game game = 4;</code>
     */
    public boolean hasGame() {
      return gameBuilder_ != null || game_ != null;
    }
    /**
     * <code>.proto.Game game = 4;</code>
     */
    public proto.Game getGame() {
      if (gameBuilder_ == null) {
        return game_ == null ? proto.Game.getDefaultInstance() : game_;
      } else {
        return gameBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.Game game = 4;</code>
     */
    public Builder setGame(proto.Game value) {
      if (gameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        game_ = value;
        onChanged();
      } else {
        gameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 4;</code>
     */
    public Builder setGame(
        proto.Game.Builder builderForValue) {
      if (gameBuilder_ == null) {
        game_ = builderForValue.build();
        onChanged();
      } else {
        gameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 4;</code>
     */
    public Builder mergeGame(proto.Game value) {
      if (gameBuilder_ == null) {
        if (game_ != null) {
          game_ =
            proto.Game.newBuilder(game_).mergeFrom(value).buildPartial();
        } else {
          game_ = value;
        }
        onChanged();
      } else {
        gameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 4;</code>
     */
    public Builder clearGame() {
      if (gameBuilder_ == null) {
        game_ = null;
        onChanged();
      } else {
        game_ = null;
        gameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.Game game = 4;</code>
     */
    public proto.Game.Builder getGameBuilder() {
      
      onChanged();
      return getGameFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.Game game = 4;</code>
     */
    public proto.GameOrBuilder getGameOrBuilder() {
      if (gameBuilder_ != null) {
        return gameBuilder_.getMessageOrBuilder();
      } else {
        return game_ == null ?
            proto.Game.getDefaultInstance() : game_;
      }
    }
    /**
     * <code>.proto.Game game = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Game, proto.Game.Builder, proto.GameOrBuilder> 
        getGameFieldBuilder() {
      if (gameBuilder_ == null) {
        gameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto.Game, proto.Game.Builder, proto.GameOrBuilder>(
                getGame(),
                getParentForChildren(),
                isClean());
        game_ = null;
      }
      return gameBuilder_;
    }

    private int height_ ;
    /**
     * <code>int32 height = 5;</code>
     */
    public int getHeight() {
      return height_;
    }
    /**
     * <code>int32 height = 5;</code>
     */
    public Builder setHeight(int value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 height = 5;</code>
     */
    public Builder clearHeight() {
      
      height_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object imageId_ = "";
    /**
     * <code>string image_id = 6;</code>
     */
    public java.lang.String getImageId() {
      java.lang.Object ref = imageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string image_id = 6;</code>
     */
    public com.google.protobuf.ByteString
        getImageIdBytes() {
      java.lang.Object ref = imageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string image_id = 6;</code>
     */
    public Builder setImageId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string image_id = 6;</code>
     */
    public Builder clearImageId() {
      
      imageId_ = getDefaultInstance().getImageId();
      onChanged();
      return this;
    }
    /**
     * <code>string image_id = 6;</code>
     */
    public Builder setImageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <code>string url = 7;</code>
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
     * <code>string url = 7;</code>
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
     * <code>string url = 7;</code>
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string url = 7;</code>
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string url = 7;</code>
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }

    private int width_ ;
    /**
     * <code>int32 width = 8;</code>
     */
    public int getWidth() {
      return width_;
    }
    /**
     * <code>int32 width = 8;</code>
     */
    public Builder setWidth(int value) {
      
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 width = 8;</code>
     */
    public Builder clearWidth() {
      
      width_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object checksum_ = "";
    /**
     * <code>string checksum = 9;</code>
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
     * <code>string checksum = 9;</code>
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
     * <code>string checksum = 9;</code>
     */
    public Builder setChecksum(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checksum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string checksum = 9;</code>
     */
    public Builder clearChecksum() {
      
      checksum_ = getDefaultInstance().getChecksum();
      onChanged();
      return this;
    }
    /**
     * <code>string checksum = 9;</code>
     */
    public Builder setChecksumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checksum_ = value;
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


    // @@protoc_insertion_point(builder_scope:proto.Screenshot)
  }

  // @@protoc_insertion_point(class_scope:proto.Screenshot)
  private static final proto.Screenshot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.Screenshot();
  }

  public static proto.Screenshot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Screenshot>
      PARSER = new com.google.protobuf.AbstractParser<Screenshot>() {
    @java.lang.Override
    public Screenshot parsePartialFrom(
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

  public static com.google.protobuf.Parser<Screenshot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Screenshot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.Screenshot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

