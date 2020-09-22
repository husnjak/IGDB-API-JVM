// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf enum {@code proto.AgeRatingCategoryEnum}
 */
public enum AgeRatingCategoryEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AGERATING_CATEGORY_NULL = 0;</code>
   */
  AGERATING_CATEGORY_NULL(0),
  /**
   * <code>ESRB = 1;</code>
   */
  ESRB(1),
  /**
   * <code>PEGI = 2;</code>
   */
  PEGI(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AGERATING_CATEGORY_NULL = 0;</code>
   */
  public static final int AGERATING_CATEGORY_NULL_VALUE = 0;
  /**
   * <code>ESRB = 1;</code>
   */
  public static final int ESRB_VALUE = 1;
  /**
   * <code>PEGI = 2;</code>
   */
  public static final int PEGI_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AgeRatingCategoryEnum valueOf(int value) {
    return forNumber(value);
  }

  public static AgeRatingCategoryEnum forNumber(int value) {
    switch (value) {
      case 0: return AGERATING_CATEGORY_NULL;
      case 1: return ESRB;
      case 2: return PEGI;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AgeRatingCategoryEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AgeRatingCategoryEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AgeRatingCategoryEnum>() {
          public AgeRatingCategoryEnum findValueByNumber(int number) {
            return AgeRatingCategoryEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return proto.Igdbproto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AgeRatingCategoryEnum[] VALUES = values();

  public static AgeRatingCategoryEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AgeRatingCategoryEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.AgeRatingCategoryEnum)
}

