// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf enum {@code proto.GenderGenderEnum}
 */
public enum GenderGenderEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>GENDER_GENDER_NULL = 0;</code>
   */
  GENDER_GENDER_NULL(0),
  /**
   * <code>MALE = 1;</code>
   */
  MALE(1),
  /**
   * <code>FEMALE = 2;</code>
   */
  FEMALE(2),
  /**
   * <code>OTHER = 3;</code>
   */
  OTHER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>GENDER_GENDER_NULL = 0;</code>
   */
  public static final int GENDER_GENDER_NULL_VALUE = 0;
  /**
   * <code>MALE = 1;</code>
   */
  public static final int MALE_VALUE = 1;
  /**
   * <code>FEMALE = 2;</code>
   */
  public static final int FEMALE_VALUE = 2;
  /**
   * <code>OTHER = 3;</code>
   */
  public static final int OTHER_VALUE = 3;


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
  public static GenderGenderEnum valueOf(int value) {
    return forNumber(value);
  }

  public static GenderGenderEnum forNumber(int value) {
    switch (value) {
      case 0: return GENDER_GENDER_NULL;
      case 1: return MALE;
      case 2: return FEMALE;
      case 3: return OTHER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GenderGenderEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GenderGenderEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GenderGenderEnum>() {
          public GenderGenderEnum findValueByNumber(int number) {
            return GenderGenderEnum.forNumber(number);
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
    return proto.Igdbproto.getDescriptor().getEnumTypes().get(2);
  }

  private static final GenderGenderEnum[] VALUES = values();

  public static GenderGenderEnum valueOf(
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

  private GenderGenderEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.GenderGenderEnum)
}

