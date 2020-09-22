// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.ThemeResult}
 */
public  final class ThemeResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ThemeResult)
    ThemeResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThemeResult.newBuilder() to construct.
  private ThemeResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThemeResult() {
    themes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_ThemeResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_ThemeResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.ThemeResult.class, proto.ThemeResult.Builder.class);
  }

  public static final int THEMES_FIELD_NUMBER = 1;
  private java.util.List<proto.Theme> themes_;
  /**
   * <code>repeated .proto.Theme themes = 1;</code>
   */
  public java.util.List<proto.Theme> getThemesList() {
    return themes_;
  }
  /**
   * <code>repeated .proto.Theme themes = 1;</code>
   */
  public java.util.List<? extends proto.ThemeOrBuilder> 
      getThemesOrBuilderList() {
    return themes_;
  }
  /**
   * <code>repeated .proto.Theme themes = 1;</code>
   */
  public int getThemesCount() {
    return themes_.size();
  }
  /**
   * <code>repeated .proto.Theme themes = 1;</code>
   */
  public proto.Theme getThemes(int index) {
    return themes_.get(index);
  }
  /**
   * <code>repeated .proto.Theme themes = 1;</code>
   */
  public proto.ThemeOrBuilder getThemesOrBuilder(
      int index) {
    return themes_.get(index);
  }

  public static proto.ThemeResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ThemeResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ThemeResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ThemeResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ThemeResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ThemeResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ThemeResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ThemeResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ThemeResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.ThemeResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ThemeResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ThemeResult parseFrom(
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
  public static Builder newBuilder(proto.ThemeResult prototype) {
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
   * Protobuf type {@code proto.ThemeResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ThemeResult)
      proto.ThemeResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_ThemeResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_ThemeResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.ThemeResult.class, proto.ThemeResult.Builder.class);
    }

    // Construct using proto.ThemeResult.newBuilder()
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
        getThemesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (themesBuilder_ == null) {
        themes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        themesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_ThemeResult_descriptor;
    }

    @java.lang.Override
    public proto.ThemeResult getDefaultInstanceForType() {
      return proto.ThemeResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.ThemeResult build() {
      proto.ThemeResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.ThemeResult buildPartial() {
      proto.ThemeResult result = new proto.ThemeResult(this);
      int from_bitField0_ = bitField0_;
      if (themesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          themes_ = java.util.Collections.unmodifiableList(themes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.themes_ = themes_;
      } else {
        result.themes_ = themesBuilder_.build();
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

    private java.util.List<proto.Theme> themes_ =
      java.util.Collections.emptyList();
    private void ensureThemesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        themes_ = new java.util.ArrayList<proto.Theme>(themes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Theme, proto.Theme.Builder, proto.ThemeOrBuilder> themesBuilder_;

    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public java.util.List<proto.Theme> getThemesList() {
      if (themesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(themes_);
      } else {
        return themesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public int getThemesCount() {
      if (themesBuilder_ == null) {
        return themes_.size();
      } else {
        return themesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public proto.Theme getThemes(int index) {
      if (themesBuilder_ == null) {
        return themes_.get(index);
      } else {
        return themesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public Builder setThemes(
        int index, proto.Theme value) {
      if (themesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThemesIsMutable();
        themes_.set(index, value);
        onChanged();
      } else {
        themesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public Builder setThemes(
        int index, proto.Theme.Builder builderForValue) {
      if (themesBuilder_ == null) {
        ensureThemesIsMutable();
        themes_.set(index, builderForValue.build());
        onChanged();
      } else {
        themesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public Builder addThemes(proto.Theme value) {
      if (themesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThemesIsMutable();
        themes_.add(value);
        onChanged();
      } else {
        themesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public Builder addThemes(
        int index, proto.Theme value) {
      if (themesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureThemesIsMutable();
        themes_.add(index, value);
        onChanged();
      } else {
        themesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public Builder addThemes(
        proto.Theme.Builder builderForValue) {
      if (themesBuilder_ == null) {
        ensureThemesIsMutable();
        themes_.add(builderForValue.build());
        onChanged();
      } else {
        themesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public Builder addThemes(
        int index, proto.Theme.Builder builderForValue) {
      if (themesBuilder_ == null) {
        ensureThemesIsMutable();
        themes_.add(index, builderForValue.build());
        onChanged();
      } else {
        themesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public Builder addAllThemes(
        java.lang.Iterable<? extends proto.Theme> values) {
      if (themesBuilder_ == null) {
        ensureThemesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, themes_);
        onChanged();
      } else {
        themesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public Builder clearThemes() {
      if (themesBuilder_ == null) {
        themes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        themesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public Builder removeThemes(int index) {
      if (themesBuilder_ == null) {
        ensureThemesIsMutable();
        themes_.remove(index);
        onChanged();
      } else {
        themesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public proto.Theme.Builder getThemesBuilder(
        int index) {
      return getThemesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public proto.ThemeOrBuilder getThemesOrBuilder(
        int index) {
      if (themesBuilder_ == null) {
        return themes_.get(index);  } else {
        return themesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public java.util.List<? extends proto.ThemeOrBuilder> 
         getThemesOrBuilderList() {
      if (themesBuilder_ != null) {
        return themesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(themes_);
      }
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public proto.Theme.Builder addThemesBuilder() {
      return getThemesFieldBuilder().addBuilder(
          proto.Theme.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public proto.Theme.Builder addThemesBuilder(
        int index) {
      return getThemesFieldBuilder().addBuilder(
          index, proto.Theme.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Theme themes = 1;</code>
     */
    public java.util.List<proto.Theme.Builder> 
         getThemesBuilderList() {
      return getThemesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Theme, proto.Theme.Builder, proto.ThemeOrBuilder> 
        getThemesFieldBuilder() {
      if (themesBuilder_ == null) {
        themesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Theme, proto.Theme.Builder, proto.ThemeOrBuilder>(
                themes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        themes_ = null;
      }
      return themesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.ThemeResult)
  }

  // @@protoc_insertion_point(class_scope:proto.ThemeResult)
  private static final proto.ThemeResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.ThemeResult();
  }

  public static proto.ThemeResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThemeResult>
      PARSER = new com.google.protobuf.AbstractParser<ThemeResult>() {
    @java.lang.Override
    public ThemeResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThemeResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThemeResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.ThemeResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

