// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trackingDelivery.proto

package grpc.smartWarehouse.trackingDelivery;

/**
 * Protobuf type {@code smartwarehouse.TrackingReply}
 */
public  final class TrackingReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartwarehouse.TrackingReply)
    TrackingReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrackingReply.newBuilder() to construct.
  private TrackingReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrackingReply() {
    deliveryDetail_ = "";
    currentLocation_ = "";
    estimatedDeliveryDate_ = "";
    successFailureMessage_ = "";
    orderID_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrackingReply(
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

            deliveryDetail_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            currentLocation_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            estimatedDeliveryDate_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            successFailureMessage_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            orderID_ = s;
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
    return grpc.smartWarehouse.trackingDelivery.TrackingDeliveryServiceImpl.internal_static_smartwarehouse_TrackingReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.smartWarehouse.trackingDelivery.TrackingDeliveryServiceImpl.internal_static_smartwarehouse_TrackingReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.smartWarehouse.trackingDelivery.TrackingReply.class, grpc.smartWarehouse.trackingDelivery.TrackingReply.Builder.class);
  }

  public static final int DELIVERYDETAIL_FIELD_NUMBER = 1;
  private volatile java.lang.Object deliveryDetail_;
  /**
   * <code>string deliveryDetail = 1;</code>
   */
  public java.lang.String getDeliveryDetail() {
    java.lang.Object ref = deliveryDetail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deliveryDetail_ = s;
      return s;
    }
  }
  /**
   * <code>string deliveryDetail = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDeliveryDetailBytes() {
    java.lang.Object ref = deliveryDetail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deliveryDetail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURRENTLOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object currentLocation_;
  /**
   * <code>string currentLocation = 2;</code>
   */
  public java.lang.String getCurrentLocation() {
    java.lang.Object ref = currentLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currentLocation_ = s;
      return s;
    }
  }
  /**
   * <code>string currentLocation = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCurrentLocationBytes() {
    java.lang.Object ref = currentLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currentLocation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ESTIMATEDDELIVERYDATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object estimatedDeliveryDate_;
  /**
   * <code>string estimatedDeliveryDate = 3;</code>
   */
  public java.lang.String getEstimatedDeliveryDate() {
    java.lang.Object ref = estimatedDeliveryDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      estimatedDeliveryDate_ = s;
      return s;
    }
  }
  /**
   * <code>string estimatedDeliveryDate = 3;</code>
   */
  public com.google.protobuf.ByteString
      getEstimatedDeliveryDateBytes() {
    java.lang.Object ref = estimatedDeliveryDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      estimatedDeliveryDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUCCESS_FAILUREMESSAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object successFailureMessage_;
  /**
   * <code>string success_failureMessage = 4;</code>
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
   * <code>string success_failureMessage = 4;</code>
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

  public static final int ORDERID_FIELD_NUMBER = 5;
  private volatile java.lang.Object orderID_;
  /**
   * <code>string orderID = 5;</code>
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
   * <code>string orderID = 5;</code>
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
    if (!getDeliveryDetailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deliveryDetail_);
    }
    if (!getCurrentLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, currentLocation_);
    }
    if (!getEstimatedDeliveryDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, estimatedDeliveryDate_);
    }
    if (!getSuccessFailureMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, successFailureMessage_);
    }
    if (!getOrderIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, orderID_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDeliveryDetailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deliveryDetail_);
    }
    if (!getCurrentLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, currentLocation_);
    }
    if (!getEstimatedDeliveryDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, estimatedDeliveryDate_);
    }
    if (!getSuccessFailureMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, successFailureMessage_);
    }
    if (!getOrderIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, orderID_);
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
    if (!(obj instanceof grpc.smartWarehouse.trackingDelivery.TrackingReply)) {
      return super.equals(obj);
    }
    grpc.smartWarehouse.trackingDelivery.TrackingReply other = (grpc.smartWarehouse.trackingDelivery.TrackingReply) obj;

    boolean result = true;
    result = result && getDeliveryDetail()
        .equals(other.getDeliveryDetail());
    result = result && getCurrentLocation()
        .equals(other.getCurrentLocation());
    result = result && getEstimatedDeliveryDate()
        .equals(other.getEstimatedDeliveryDate());
    result = result && getSuccessFailureMessage()
        .equals(other.getSuccessFailureMessage());
    result = result && getOrderID()
        .equals(other.getOrderID());
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
    hash = (37 * hash) + DELIVERYDETAIL_FIELD_NUMBER;
    hash = (53 * hash) + getDeliveryDetail().hashCode();
    hash = (37 * hash) + CURRENTLOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentLocation().hashCode();
    hash = (37 * hash) + ESTIMATEDDELIVERYDATE_FIELD_NUMBER;
    hash = (53 * hash) + getEstimatedDeliveryDate().hashCode();
    hash = (37 * hash) + SUCCESS_FAILUREMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getSuccessFailureMessage().hashCode();
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingReply parseFrom(
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
  public static Builder newBuilder(grpc.smartWarehouse.trackingDelivery.TrackingReply prototype) {
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
   * Protobuf type {@code smartwarehouse.TrackingReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartwarehouse.TrackingReply)
      grpc.smartWarehouse.trackingDelivery.TrackingReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.smartWarehouse.trackingDelivery.TrackingDeliveryServiceImpl.internal_static_smartwarehouse_TrackingReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.smartWarehouse.trackingDelivery.TrackingDeliveryServiceImpl.internal_static_smartwarehouse_TrackingReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.smartWarehouse.trackingDelivery.TrackingReply.class, grpc.smartWarehouse.trackingDelivery.TrackingReply.Builder.class);
    }

    // Construct using grpc.smartWarehouse.trackingDelivery.TrackingReply.newBuilder()
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
      deliveryDetail_ = "";

      currentLocation_ = "";

      estimatedDeliveryDate_ = "";

      successFailureMessage_ = "";

      orderID_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.smartWarehouse.trackingDelivery.TrackingDeliveryServiceImpl.internal_static_smartwarehouse_TrackingReply_descriptor;
    }

    @java.lang.Override
    public grpc.smartWarehouse.trackingDelivery.TrackingReply getDefaultInstanceForType() {
      return grpc.smartWarehouse.trackingDelivery.TrackingReply.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.smartWarehouse.trackingDelivery.TrackingReply build() {
      grpc.smartWarehouse.trackingDelivery.TrackingReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.smartWarehouse.trackingDelivery.TrackingReply buildPartial() {
      grpc.smartWarehouse.trackingDelivery.TrackingReply result = new grpc.smartWarehouse.trackingDelivery.TrackingReply(this);
      result.deliveryDetail_ = deliveryDetail_;
      result.currentLocation_ = currentLocation_;
      result.estimatedDeliveryDate_ = estimatedDeliveryDate_;
      result.successFailureMessage_ = successFailureMessage_;
      result.orderID_ = orderID_;
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
      if (other instanceof grpc.smartWarehouse.trackingDelivery.TrackingReply) {
        return mergeFrom((grpc.smartWarehouse.trackingDelivery.TrackingReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.smartWarehouse.trackingDelivery.TrackingReply other) {
      if (other == grpc.smartWarehouse.trackingDelivery.TrackingReply.getDefaultInstance()) return this;
      if (!other.getDeliveryDetail().isEmpty()) {
        deliveryDetail_ = other.deliveryDetail_;
        onChanged();
      }
      if (!other.getCurrentLocation().isEmpty()) {
        currentLocation_ = other.currentLocation_;
        onChanged();
      }
      if (!other.getEstimatedDeliveryDate().isEmpty()) {
        estimatedDeliveryDate_ = other.estimatedDeliveryDate_;
        onChanged();
      }
      if (!other.getSuccessFailureMessage().isEmpty()) {
        successFailureMessage_ = other.successFailureMessage_;
        onChanged();
      }
      if (!other.getOrderID().isEmpty()) {
        orderID_ = other.orderID_;
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
      grpc.smartWarehouse.trackingDelivery.TrackingReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.smartWarehouse.trackingDelivery.TrackingReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object deliveryDetail_ = "";
    /**
     * <code>string deliveryDetail = 1;</code>
     */
    public java.lang.String getDeliveryDetail() {
      java.lang.Object ref = deliveryDetail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deliveryDetail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deliveryDetail = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDeliveryDetailBytes() {
      java.lang.Object ref = deliveryDetail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deliveryDetail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deliveryDetail = 1;</code>
     */
    public Builder setDeliveryDetail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deliveryDetail_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string deliveryDetail = 1;</code>
     */
    public Builder clearDeliveryDetail() {
      
      deliveryDetail_ = getDefaultInstance().getDeliveryDetail();
      onChanged();
      return this;
    }
    /**
     * <code>string deliveryDetail = 1;</code>
     */
    public Builder setDeliveryDetailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deliveryDetail_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object currentLocation_ = "";
    /**
     * <code>string currentLocation = 2;</code>
     */
    public java.lang.String getCurrentLocation() {
      java.lang.Object ref = currentLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currentLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string currentLocation = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCurrentLocationBytes() {
      java.lang.Object ref = currentLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currentLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string currentLocation = 2;</code>
     */
    public Builder setCurrentLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currentLocation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string currentLocation = 2;</code>
     */
    public Builder clearCurrentLocation() {
      
      currentLocation_ = getDefaultInstance().getCurrentLocation();
      onChanged();
      return this;
    }
    /**
     * <code>string currentLocation = 2;</code>
     */
    public Builder setCurrentLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currentLocation_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object estimatedDeliveryDate_ = "";
    /**
     * <code>string estimatedDeliveryDate = 3;</code>
     */
    public java.lang.String getEstimatedDeliveryDate() {
      java.lang.Object ref = estimatedDeliveryDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        estimatedDeliveryDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string estimatedDeliveryDate = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEstimatedDeliveryDateBytes() {
      java.lang.Object ref = estimatedDeliveryDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        estimatedDeliveryDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string estimatedDeliveryDate = 3;</code>
     */
    public Builder setEstimatedDeliveryDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      estimatedDeliveryDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string estimatedDeliveryDate = 3;</code>
     */
    public Builder clearEstimatedDeliveryDate() {
      
      estimatedDeliveryDate_ = getDefaultInstance().getEstimatedDeliveryDate();
      onChanged();
      return this;
    }
    /**
     * <code>string estimatedDeliveryDate = 3;</code>
     */
    public Builder setEstimatedDeliveryDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      estimatedDeliveryDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object successFailureMessage_ = "";
    /**
     * <code>string success_failureMessage = 4;</code>
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
     * <code>string success_failureMessage = 4;</code>
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
     * <code>string success_failureMessage = 4;</code>
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
     * <code>string success_failureMessage = 4;</code>
     */
    public Builder clearSuccessFailureMessage() {
      
      successFailureMessage_ = getDefaultInstance().getSuccessFailureMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string success_failureMessage = 4;</code>
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

    private java.lang.Object orderID_ = "";
    /**
     * <code>string orderID = 5;</code>
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
     * <code>string orderID = 5;</code>
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
     * <code>string orderID = 5;</code>
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
     * <code>string orderID = 5;</code>
     */
    public Builder clearOrderID() {
      
      orderID_ = getDefaultInstance().getOrderID();
      onChanged();
      return this;
    }
    /**
     * <code>string orderID = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:smartwarehouse.TrackingReply)
  }

  // @@protoc_insertion_point(class_scope:smartwarehouse.TrackingReply)
  private static final grpc.smartWarehouse.trackingDelivery.TrackingReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.smartWarehouse.trackingDelivery.TrackingReply();
  }

  public static grpc.smartWarehouse.trackingDelivery.TrackingReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrackingReply>
      PARSER = new com.google.protobuf.AbstractParser<TrackingReply>() {
    @java.lang.Override
    public TrackingReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TrackingReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrackingReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrackingReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.smartWarehouse.trackingDelivery.TrackingReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

