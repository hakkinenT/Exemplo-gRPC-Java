// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: agenda.proto

package br.ufs.dcomp.ExemplogRPCJava;

/**
 * Protobuf enum {@code ExemplogRPCJava.CodigoDeStatus}
 */
public enum CodigoDeStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ADDED = 0;</code>
   */
  ADDED(0),
  /**
   * <code>ALREDY_EXISTS = 1;</code>
   */
  ALREDY_EXISTS(1),
  /**
   * <code>UPDATED = 2;</code>
   */
  UPDATED(2),
  /**
   * <code>ERROR = 3;</code>
   */
  ERROR(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ADDED = 0;</code>
   */
  public static final int ADDED_VALUE = 0;
  /**
   * <code>ALREDY_EXISTS = 1;</code>
   */
  public static final int ALREDY_EXISTS_VALUE = 1;
  /**
   * <code>UPDATED = 2;</code>
   */
  public static final int UPDATED_VALUE = 2;
  /**
   * <code>ERROR = 3;</code>
   */
  public static final int ERROR_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CodigoDeStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CodigoDeStatus forNumber(int value) {
    switch (value) {
      case 0: return ADDED;
      case 1: return ALREDY_EXISTS;
      case 2: return UPDATED;
      case 3: return ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CodigoDeStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CodigoDeStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CodigoDeStatus>() {
          public CodigoDeStatus findValueByNumber(int number) {
            return CodigoDeStatus.forNumber(number);
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
    return br.ufs.dcomp.ExemplogRPCJava.ContatosProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final CodigoDeStatus[] VALUES = values();

  public static CodigoDeStatus valueOf(
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

  private CodigoDeStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ExemplogRPCJava.CodigoDeStatus)
}

