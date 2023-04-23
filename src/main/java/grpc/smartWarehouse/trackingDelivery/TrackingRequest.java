// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trackingDelivery.proto

package grpc.smartWarehouse.trackingDelivery;

/**
 * <pre>
 * Define the messages
 * </pre>
 *
 * Protobuf type {@code smartwarehouse.TrackingRequest}
 */
public  final class TrackingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartwarehouse.TrackingRequest)
    TrackingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrackingRequest.newBuilder() to construct.
  private TrackingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrackingRequest() {
    customerName_ = "";
    orderID_ = "";
    newDeliveryDetails_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrackingRequest(
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

            customerName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            orderID_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            newDeliveryDetails_ = s;
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
    return grpc.smartWarehouse.trackingDelivery.TrackingDeliveryServiceImpl.internal_static_smartwarehouse_TrackingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.smartWarehouse.trackingDelivery.TrackingDeliveryServiceImpl.internal_static_smartwarehouse_TrackingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.smartWarehouse.trackingDelivery.TrackingRequest.class, grpc.smartWarehouse.trackingDelivery.TrackingRequest.Builder.class);
  }

  public static final int CUSTOMERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerName_;
  /**
   * <code>string customerName = 1;</code>
   */
  public java.lang.String getCustomerName() {
    java.lang.Object ref = customerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerName_ = s;
      return s;
    }
  }
  /**
   * <code>string customerName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCustomerNameBytes() {
    java.lang.Object ref = customerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDERID_FIELD_NUMBER = 2;
  private volatile java.lang.Object orderID_;
  /**
   * <code>string orderID = 2;</code>
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
   * <code>string orderID = 2;</code>
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

  public static final int NEWDELIVERYDETAILS_FIELD_NUMBER = 3;
  private volatile java.lang.Object newDeliveryDetails_;
  /**
   * <code>string newDeliveryDetails = 3;</code>
   */
  public java.lang.String getNewDeliveryDetails() {
    java.lang.Object ref = newDeliveryDetails_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newDeliveryDetails_ = s;
      return s;
    }
  }
  /**
   * <code>string newDeliveryDetails = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNewDeliveryDetailsBytes() {
    java.lang.Object ref = newDeliveryDetails_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newDeliveryDetails_ = b;
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
    if (!getCustomerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerName_);
    }
    if (!getOrderIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, orderID_);
    }
    if (!getNewDeliveryDetailsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, newDeliveryDetails_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCustomerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerName_);
    }
    if (!getOrderIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, orderID_);
    }
    if (!getNewDeliveryDetailsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, newDeliveryDetails_);
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
    if (!(obj instanceof grpc.smartWarehouse.trackingDelivery.TrackingRequest)) {
      return super.equals(obj);
    }
    grpc.smartWarehouse.trackingDelivery.TrackingRequest other = (grpc.smartWarehouse.trackingDelivery.TrackingRequest) obj;

    boolean result = true;
    result = result && getCustomerName()
        .equals(other.getCustomerName());
    result = result && getOrderID()
        .equals(other.getOrderID());
    result = result && getNewDeliveryDetails()
        .equals(other.getNewDeliveryDetails());
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
    hash = (37 * hash) + CUSTOMERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerName().hashCode();
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderID().hashCode();
    hash = (37 * hash) + NEWDELIVERYDETAILS_FIELD_NUMBER;
    hash = (53 * hash) + getNewDeliveryDetails().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest parseFrom(
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
  public static Builder newBuilder(grpc.smartWarehouse.trackingDelivery.TrackingRequest prototype) {
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
   * <pre>
   * Define the messages
   * </pre>
   *
   * Protobuf type {@code smartwarehouse.TrackingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartwarehouse.TrackingRequest)
      grpc.smartWarehouse.trackingDelivery.TrackingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.smartWarehouse.trackingDelivery.TrackingDeliveryServiceImpl.internal_static_smartwarehouse_TrackingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.smartWarehouse.trackingDelivery.TrackingDeliveryServiceImpl.internal_static_smartwarehouse_TrackingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.smartWarehouse.trackingDelivery.TrackingRequest.class, grpc.smartWarehouse.trackingDelivery.TrackingRequest.Builder.class);
    }

    // Construct using grpc.smartWarehouse.trackingDelivery.TrackingRequest.newBuilder()
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
      customerName_ = "";

      orderID_ = "";

      newDeliveryDetails_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.smartWarehouse.trackingDelivery.TrackingDeliveryServiceImpl.internal_static_smartwarehouse_TrackingRequest_descriptor;
    }

    @java.lang.Override
    public grpc.smartWarehouse.trackingDelivery.TrackingRequest getDefaultInstanceForType() {
      return grpc.smartWarehouse.trackingDelivery.TrackingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.smartWarehouse.trackingDelivery.TrackingRequest build() {
      grpc.smartWarehouse.trackingDelivery.TrackingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.smartWarehouse.trackingDelivery.TrackingRequest buildPartial() {
      grpc.smartWarehouse.trackingDelivery.TrackingRequest result = new grpc.smartWarehouse.trackingDelivery.TrackingRequest(this);
      result.customerName_ = customerName_;
      result.orderID_ = orderID_;
      result.newDeliveryDetails_ = newDeliveryDetails_;
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
      if (other instanceof grpc.smartWarehouse.trackingDelivery.TrackingRequest) {
        return mergeFrom((grpc.smartWarehouse.trackingDelivery.TrackingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.smartWarehouse.trackingDelivery.TrackingRequest other) {
      if (other == grpc.smartWarehouse.trackingDelivery.TrackingRequest.getDefaultInstance()) return this;
      if (!other.getCustomerName().isEmpty()) {
        customerName_ = other.customerName_;
        onChanged();
      }
      if (!other.getOrderID().isEmpty()) {
        orderID_ = other.orderID_;
        onChanged();
      }
      if (!other.getNewDeliveryDetails().isEmpty()) {
        newDeliveryDetails_ = other.newDeliveryDetails_;
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
      grpc.smartWarehouse.trackingDelivery.TrackingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.smartWarehouse.trackingDelivery.TrackingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object customerName_ = "";
    /**
     * <code>string customerName = 1;</code>
     */
    public java.lang.String getCustomerName() {
      java.lang.Object ref = customerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customerName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCustomerNameBytes() {
      java.lang.Object ref = customerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customerName = 1;</code>
     */
    public Builder setCustomerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customerName = 1;</code>
     */
    public Builder clearCustomerName() {
      
      customerName_ = getDefaultInstance().getCustomerName();
      onChanged();
      return this;
    }
    /**
     * <code>string customerName = 1;</code>
     */
    public Builder setCustomerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object orderID_ = "";
    /**
     * <code>string orderID = 2;</code>
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
     * <code>string orderID = 2;</code>
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
     * <code>string orderID = 2;</code>
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
     * <code>string orderID = 2;</code>
     */
    public Builder clearOrderID() {
      
      orderID_ = getDefaultInstance().getOrderID();
      onChanged();
      return this;
    }
    /**
     * <code>string orderID = 2;</code>
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

    private java.lang.Object newDeliveryDetails_ = "";
    /**
     * <code>string newDeliveryDetails = 3;</code>
     */
    public java.lang.String getNewDeliveryDetails() {
      java.lang.Object ref = newDeliveryDetails_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newDeliveryDetails_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string newDeliveryDetails = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNewDeliveryDetailsBytes() {
      java.lang.Object ref = newDeliveryDetails_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newDeliveryDetails_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string newDeliveryDetails = 3;</code>
     */
    public Builder setNewDeliveryDetails(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      newDeliveryDetails_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string newDeliveryDetails = 3;</code>
     */
    public Builder clearNewDeliveryDetails() {
      
      newDeliveryDetails_ = getDefaultInstance().getNewDeliveryDetails();
      onChanged();
      return this;
    }
    /**
     * <code>string newDeliveryDetails = 3;</code>
     */
    public Builder setNewDeliveryDetailsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      newDeliveryDetails_ = value;
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


    // @@protoc_insertion_point(builder_scope:smartwarehouse.TrackingRequest)
  }

  // @@protoc_insertion_point(class_scope:smartwarehouse.TrackingRequest)
  private static final grpc.smartWarehouse.trackingDelivery.TrackingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.smartWarehouse.trackingDelivery.TrackingRequest();
  }

  public static grpc.smartWarehouse.trackingDelivery.TrackingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrackingRequest>
      PARSER = new com.google.protobuf.AbstractParser<TrackingRequest>() {
    @java.lang.Override
    public TrackingRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TrackingRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrackingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrackingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.smartWarehouse.trackingDelivery.TrackingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

