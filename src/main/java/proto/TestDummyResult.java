// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.TestDummyResult}
 */
public final class TestDummyResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.TestDummyResult)
    TestDummyResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TestDummyResult.newBuilder() to construct.
  private TestDummyResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestDummyResult() {
    testdummies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TestDummyResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_TestDummyResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_TestDummyResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.TestDummyResult.class, proto.TestDummyResult.Builder.class);
  }

  public static final int TESTDUMMIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<proto.TestDummy> testdummies_;
  /**
   * <code>repeated .proto.TestDummy testdummies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.TestDummy> getTestdummiesList() {
    return testdummies_;
  }
  /**
   * <code>repeated .proto.TestDummy testdummies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.TestDummyOrBuilder> 
      getTestdummiesOrBuilderList() {
    return testdummies_;
  }
  /**
   * <code>repeated .proto.TestDummy testdummies = 1;</code>
   */
  @java.lang.Override
  public int getTestdummiesCount() {
    return testdummies_.size();
  }
  /**
   * <code>repeated .proto.TestDummy testdummies = 1;</code>
   */
  @java.lang.Override
  public proto.TestDummy getTestdummies(int index) {
    return testdummies_.get(index);
  }
  /**
   * <code>repeated .proto.TestDummy testdummies = 1;</code>
   */
  @java.lang.Override
  public proto.TestDummyOrBuilder getTestdummiesOrBuilder(
      int index) {
    return testdummies_.get(index);
  }

  public static proto.TestDummyResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.TestDummyResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.TestDummyResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.TestDummyResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.TestDummyResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.TestDummyResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.TestDummyResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.TestDummyResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static proto.TestDummyResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static proto.TestDummyResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.TestDummyResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.TestDummyResult parseFrom(
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
  public static Builder newBuilder(proto.TestDummyResult prototype) {
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
   * Protobuf type {@code proto.TestDummyResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.TestDummyResult)
      proto.TestDummyResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_TestDummyResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_TestDummyResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.TestDummyResult.class, proto.TestDummyResult.Builder.class);
    }

    // Construct using proto.TestDummyResult.newBuilder()
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
      if (testdummiesBuilder_ == null) {
        testdummies_ = java.util.Collections.emptyList();
      } else {
        testdummies_ = null;
        testdummiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_TestDummyResult_descriptor;
    }

    @java.lang.Override
    public proto.TestDummyResult getDefaultInstanceForType() {
      return proto.TestDummyResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.TestDummyResult build() {
      proto.TestDummyResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.TestDummyResult buildPartial() {
      proto.TestDummyResult result = new proto.TestDummyResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(proto.TestDummyResult result) {
      if (testdummiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          testdummies_ = java.util.Collections.unmodifiableList(testdummies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.testdummies_ = testdummies_;
      } else {
        result.testdummies_ = testdummiesBuilder_.build();
      }
    }

    private void buildPartial0(proto.TestDummyResult result) {
      int from_bitField0_ = bitField0_;
    }

    private int bitField0_;

    private java.util.List<proto.TestDummy> testdummies_ =
      java.util.Collections.emptyList();
    private void ensureTestdummiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        testdummies_ = new java.util.ArrayList<proto.TestDummy>(testdummies_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.TestDummy, proto.TestDummy.Builder, proto.TestDummyOrBuilder> testdummiesBuilder_;

    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public java.util.List<proto.TestDummy> getTestdummiesList() {
      if (testdummiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(testdummies_);
      } else {
        return testdummiesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public int getTestdummiesCount() {
      if (testdummiesBuilder_ == null) {
        return testdummies_.size();
      } else {
        return testdummiesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public proto.TestDummy getTestdummies(int index) {
      if (testdummiesBuilder_ == null) {
        return testdummies_.get(index);
      } else {
        return testdummiesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public Builder setTestdummies(
        int index, proto.TestDummy value) {
      if (testdummiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestdummiesIsMutable();
        testdummies_.set(index, value);
        onChanged();
      } else {
        testdummiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public Builder setTestdummies(
        int index, proto.TestDummy.Builder builderForValue) {
      if (testdummiesBuilder_ == null) {
        ensureTestdummiesIsMutable();
        testdummies_.set(index, builderForValue.build());
        onChanged();
      } else {
        testdummiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public Builder addTestdummies(proto.TestDummy value) {
      if (testdummiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestdummiesIsMutable();
        testdummies_.add(value);
        onChanged();
      } else {
        testdummiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public Builder addTestdummies(
        int index, proto.TestDummy value) {
      if (testdummiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTestdummiesIsMutable();
        testdummies_.add(index, value);
        onChanged();
      } else {
        testdummiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public Builder addTestdummies(
        proto.TestDummy.Builder builderForValue) {
      if (testdummiesBuilder_ == null) {
        ensureTestdummiesIsMutable();
        testdummies_.add(builderForValue.build());
        onChanged();
      } else {
        testdummiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public Builder addTestdummies(
        int index, proto.TestDummy.Builder builderForValue) {
      if (testdummiesBuilder_ == null) {
        ensureTestdummiesIsMutable();
        testdummies_.add(index, builderForValue.build());
        onChanged();
      } else {
        testdummiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public Builder addAllTestdummies(
        java.lang.Iterable<? extends proto.TestDummy> values) {
      if (testdummiesBuilder_ == null) {
        ensureTestdummiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, testdummies_);
        onChanged();
      } else {
        testdummiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public Builder clearTestdummies() {
      if (testdummiesBuilder_ == null) {
        testdummies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        testdummiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public Builder removeTestdummies(int index) {
      if (testdummiesBuilder_ == null) {
        ensureTestdummiesIsMutable();
        testdummies_.remove(index);
        onChanged();
      } else {
        testdummiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public proto.TestDummy.Builder getTestdummiesBuilder(
        int index) {
      return getTestdummiesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public proto.TestDummyOrBuilder getTestdummiesOrBuilder(
        int index) {
      if (testdummiesBuilder_ == null) {
        return testdummies_.get(index);  } else {
        return testdummiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public java.util.List<? extends proto.TestDummyOrBuilder> 
         getTestdummiesOrBuilderList() {
      if (testdummiesBuilder_ != null) {
        return testdummiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(testdummies_);
      }
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public proto.TestDummy.Builder addTestdummiesBuilder() {
      return getTestdummiesFieldBuilder().addBuilder(
          proto.TestDummy.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public proto.TestDummy.Builder addTestdummiesBuilder(
        int index) {
      return getTestdummiesFieldBuilder().addBuilder(
          index, proto.TestDummy.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.TestDummy testdummies = 1;</code>
     */
    public java.util.List<proto.TestDummy.Builder> 
         getTestdummiesBuilderList() {
      return getTestdummiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.TestDummy, proto.TestDummy.Builder, proto.TestDummyOrBuilder> 
        getTestdummiesFieldBuilder() {
      if (testdummiesBuilder_ == null) {
        testdummiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.TestDummy, proto.TestDummy.Builder, proto.TestDummyOrBuilder>(
                testdummies_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        testdummies_ = null;
      }
      return testdummiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.TestDummyResult)
  }

  // @@protoc_insertion_point(class_scope:proto.TestDummyResult)
  private static final proto.TestDummyResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.TestDummyResult();
  }

  public static proto.TestDummyResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestDummyResult>
      PARSER = new com.google.protobuf.AbstractParser<TestDummyResult>() {
    @java.lang.Override
    public TestDummyResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<TestDummyResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestDummyResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.TestDummyResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

