// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orderManagement.proto

package grpc.smartWarehouse.orderManagement;

/**
 * Protobuf type {@code smartwarehouse.OrderReply}
 */
public  final class OrderReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartwarehouse.OrderReply)
    OrderReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderReply.newBuilder() to construct.
  private OrderReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderReply() {
    orderID_ = "";
    currentStatus_ = "";
    successFailureMessage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            orderID_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            currentStatus_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            successFailureMessage_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.smartWarehouse.orderManagement.OrderManagementServiceImpl.internal_static_smartwarehouse_OrderReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.smartWarehouse.orderManagement.OrderManagementServiceImpl.internal_static_smartwarehouse_OrderReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.smartWarehouse.orderManagement.OrderReply.class, grpc.smartWarehouse.orderManagement.OrderReply.Builder.class);
  }

  public static final int ORDERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object orderID_;
  /**
   * <code>string orderID = 1;</code>
   */
  public java.lang.String getOrderID() {
    java.lang.Object ref = orderID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderID_ = s;
      return s;
    }
  }
  /**
   * <code>string orderID = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOrderIDBytes() {
    java.lang.Object ref = orderID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURRENTSTATUS_FIELD_NUMBER = 2;
  private volatile java.lang.Object currentStatus_;
  /**
   * <code>string currentStatus = 2;</code>
   */
  public java.lang.String getCurrentStatus() {
    java.lang.Object ref = currentStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currentStatus_ = s;
      return s;
    }
  }
  /**
   * <code>string currentStatus = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCurrentStatusBytes() {
    java.lang.Object ref = currentStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currentStatus_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUCCESS_FAILUREMESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object successFailureMessage_;
  /**
   * <code>string success_failureMessage = 3;</code>
   */
  public java.lang.String getSuccessFailureMessage() {
    java.lang.Object ref = successFailureMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      successFailureMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string success_failureMessage = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSuccessFailureMessageBytes() {
    java.lang.Object ref = successFailureMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      successFailureMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getOrderIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderID_);
    }
    if (!getCurrentStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, currentStatus_);
    }
    if (!getSuccessFailureMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, successFailureMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOrderIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderID_);
    }
    if (!getCurrentStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, currentStatus_);
    }
    if (!getSuccessFailureMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, successFailureMessage_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.smartWarehouse.orderManagement.OrderReply)) {
      return super.equals(obj);
    }
    grpc.smartWarehouse.orderManagement.OrderReply other = (grpc.smartWarehouse.orderManagement.OrderReply) obj;

    boolean result = true;
    result = result && getOrderID()
        .equals(other.getOrderID());
    result = result && getCurrentStatus()
        .equals(other.getCurrentStatus());
    result = result && getSuccessFailureMessage()
        .equals(other.getSuccessFailureMessage());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderID().hashCode();
    hash = (37 * hash) + CURRENTSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentStatus().hashCode();
    hash = (37 * hash) + SUCCESS_FAILUREMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getSuccessFailureMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.smartWarehouse.orderManagement.OrderReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.orderManagement.OrderReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.orderManagement.OrderReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.orderManagement.OrderReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.orderManagement.OrderReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.orderManagement.OrderReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.orderManagement.OrderReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.orderManagement.OrderReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.orderManagement.OrderReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.orderManagement.OrderReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.orderManagement.OrderReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.orderManagement.OrderReply parseFrom(
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
  public static Builder newBuilder(grpc.smartWarehouse.orderManagement.OrderReply prototype) {
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
   * Protobuf type {@code smartwarehouse.OrderReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartwarehouse.OrderReply)
      grpc.smartWarehouse.orderManagement.OrderReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.smartWarehouse.orderManagement.OrderManagementServiceImpl.internal_static_smartwarehouse_OrderReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.smartWarehouse.orderManagement.OrderManagementServiceImpl.internal_static_smartwarehouse_OrderReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.smartWarehouse.orderManagement.OrderReply.class, grpc.smartWarehouse.orderManagement.OrderReply.Builder.class);
    }

    // Construct using grpc.smartWarehouse.orderManagement.OrderReply.newBuilder()
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
      orderID_ = "";

      currentStatus_ = "";

      successFailureMessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.smartWarehouse.orderManagement.OrderManagementServiceImpl.internal_static_smartwarehouse_OrderReply_descriptor;
    }

    @java.lang.Override
    public grpc.smartWarehouse.orderManagement.OrderReply getDefaultInstanceForType() {
      return grpc.smartWarehouse.orderManagement.OrderReply.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.smartWarehouse.orderManagement.OrderReply build() {
      grpc.smartWarehouse.orderManagement.OrderReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.smartWarehouse.orderManagement.OrderReply buildPartial() {
      grpc.smartWarehouse.orderManagement.OrderReply result = new grpc.smartWarehouse.orderManagement.OrderReply(this);
      result.orderID_ = orderID_;
      result.currentStatus_ = currentStatus_;
      result.successFailureMessage_ = successFailureMessage_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.smartWarehouse.orderManagement.OrderReply) {
        return mergeFrom((grpc.smartWarehouse.orderManagement.OrderReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.smartWarehouse.orderManagement.OrderReply other) {
      if (other == grpc.smartWarehouse.orderManagement.OrderReply.getDefaultInstance()) return this;
      if (!other.getOrderID().isEmpty()) {
        orderID_ = other.orderID_;
        onChanged();
      }
      if (!other.getCurrentStatus().isEmpty()) {
        currentStatus_ = other.currentStatus_;
        onChanged();
      }
      if (!other.getSuccessFailureMessage().isEmpty()) {
        successFailureMessage_ = other.successFailureMessage_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.smartWarehouse.orderManagement.OrderReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.smartWarehouse.orderManagement.OrderReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object orderID_ = "";
    /**
     * <code>string orderID = 1;</code>
     */
    public java.lang.String getOrderID() {
      java.lang.Object ref = orderID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOrderIDBytes() {
      java.lang.Object ref = orderID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderID = 1;</code>
     */
    public Builder setOrderID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderID = 1;</code>
     */
    public Builder clearOrderID() {
      
      orderID_ = getDefaultInstance().getOrderID();
      onChanged();
      return this;
    }
    /**
     * <code>string orderID = 1;</code>
     */
    public Builder setOrderIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object currentStatus_ = "";
    /**
     * <code>string currentStatus = 2;</code>
     */
    public java.lang.String getCurrentStatus() {
      java.lang.Object ref = currentStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currentStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string currentStatus = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCurrentStatusBytes() {
      java.lang.Object ref = currentStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currentStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string currentStatus = 2;</code>
     */
    public Builder setCurrentStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currentStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string currentStatus = 2;</code>
     */
    public Builder clearCurrentStatus() {
      
      currentStatus_ = getDefaultInstance().getCurrentStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string currentStatus = 2;</code>
     */
    public Builder setCurrentStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currentStatus_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object successFailureMessage_ = "";
    /**
     * <code>string success_failureMessage = 3;</code>
     */
    public java.lang.String getSuccessFailureMessage() {
      java.lang.Object ref = successFailureMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        successFailureMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string success_failureMessage = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSuccessFailureMessageBytes() {
      java.lang.Object ref = successFailureMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        successFailureMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string success_failureMessage = 3;</code>
     */
    public Builder setSuccessFailureMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      successFailureMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string success_failureMessage = 3;</code>
     */
    public Builder clearSuccessFailureMessage() {
      
      successFailureMessage_ = getDefaultInstance().getSuccessFailureMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string success_failureMessage = 3;</code>
     */
    public Builder setSuccessFailureMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      successFailureMessage_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:smartwarehouse.OrderReply)
  }

  // @@protoc_insertion_point(class_scope:smartwarehouse.OrderReply)
  private static final grpc.smartWarehouse.orderManagement.OrderReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.smartWarehouse.orderManagement.OrderReply();
  }

  public static grpc.smartWarehouse.orderManagement.OrderReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderReply>
      PARSER = new com.google.protobuf.AbstractParser<OrderReply>() {
    @java.lang.Override
    public OrderReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.smartWarehouse.orderManagement.OrderReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

