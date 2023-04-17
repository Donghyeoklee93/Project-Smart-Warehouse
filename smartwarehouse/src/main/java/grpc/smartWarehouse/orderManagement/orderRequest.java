// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orderManagement.proto

package grpc.smartWarehouse.orderManagement;

/**
 * <pre>
 * Define the messages
 * </pre>
 *
 * Protobuf type {@code smartwarehouse.orderRequest}
 */
public  final class orderRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartwarehouse.orderRequest)
    orderRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use orderRequest.newBuilder() to construct.
  private orderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private orderRequest() {
    customerName_ = "";
    itemID_ = "";
    currentQuantities_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private orderRequest(
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

            itemID_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            currentQuantities_ = s;
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
    return grpc.smartWarehouse.orderManagement.OrderManagementServiceImpl.internal_static_smartwarehouse_orderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.smartWarehouse.orderManagement.OrderManagementServiceImpl.internal_static_smartwarehouse_orderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.smartWarehouse.orderManagement.orderRequest.class, grpc.smartWarehouse.orderManagement.orderRequest.Builder.class);
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

  public static final int ITEMID_FIELD_NUMBER = 2;
  private volatile java.lang.Object itemID_;
  /**
   * <code>string itemID = 2;</code>
   */
  public java.lang.String getItemID() {
    java.lang.Object ref = itemID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemID_ = s;
      return s;
    }
  }
  /**
   * <code>string itemID = 2;</code>
   */
  public com.google.protobuf.ByteString
      getItemIDBytes() {
    java.lang.Object ref = itemID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURRENTQUANTITIES_FIELD_NUMBER = 3;
  private volatile java.lang.Object currentQuantities_;
  /**
   * <code>string currentQuantities = 3;</code>
   */
  public java.lang.String getCurrentQuantities() {
    java.lang.Object ref = currentQuantities_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currentQuantities_ = s;
      return s;
    }
  }
  /**
   * <code>string currentQuantities = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCurrentQuantitiesBytes() {
    java.lang.Object ref = currentQuantities_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currentQuantities_ = b;
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
    if (!getItemIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, itemID_);
    }
    if (!getCurrentQuantitiesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, currentQuantities_);
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
    if (!getItemIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, itemID_);
    }
    if (!getCurrentQuantitiesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, currentQuantities_);
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
    if (!(obj instanceof grpc.smartWarehouse.orderManagement.orderRequest)) {
      return super.equals(obj);
    }
    grpc.smartWarehouse.orderManagement.orderRequest other = (grpc.smartWarehouse.orderManagement.orderRequest) obj;

    boolean result = true;
    result = result && getCustomerName()
        .equals(other.getCustomerName());
    result = result && getItemID()
        .equals(other.getItemID());
    result = result && getCurrentQuantities()
        .equals(other.getCurrentQuantities());
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
    hash = (37 * hash) + ITEMID_FIELD_NUMBER;
    hash = (53 * hash) + getItemID().hashCode();
    hash = (37 * hash) + CURRENTQUANTITIES_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentQuantities().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.smartWarehouse.orderManagement.orderRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.orderManagement.orderRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.orderManagement.orderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.orderManagement.orderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.orderManagement.orderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.orderManagement.orderRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.orderManagement.orderRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.orderManagement.orderRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.orderManagement.orderRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.orderManagement.orderRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.orderManagement.orderRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.orderManagement.orderRequest parseFrom(
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
  public static Builder newBuilder(grpc.smartWarehouse.orderManagement.orderRequest prototype) {
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
   * Protobuf type {@code smartwarehouse.orderRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartwarehouse.orderRequest)
      grpc.smartWarehouse.orderManagement.orderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.smartWarehouse.orderManagement.OrderManagementServiceImpl.internal_static_smartwarehouse_orderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.smartWarehouse.orderManagement.OrderManagementServiceImpl.internal_static_smartwarehouse_orderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.smartWarehouse.orderManagement.orderRequest.class, grpc.smartWarehouse.orderManagement.orderRequest.Builder.class);
    }

    // Construct using grpc.smartWarehouse.orderManagement.orderRequest.newBuilder()
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

      itemID_ = "";

      currentQuantities_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.smartWarehouse.orderManagement.OrderManagementServiceImpl.internal_static_smartwarehouse_orderRequest_descriptor;
    }

    @java.lang.Override
    public grpc.smartWarehouse.orderManagement.orderRequest getDefaultInstanceForType() {
      return grpc.smartWarehouse.orderManagement.orderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.smartWarehouse.orderManagement.orderRequest build() {
      grpc.smartWarehouse.orderManagement.orderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.smartWarehouse.orderManagement.orderRequest buildPartial() {
      grpc.smartWarehouse.orderManagement.orderRequest result = new grpc.smartWarehouse.orderManagement.orderRequest(this);
      result.customerName_ = customerName_;
      result.itemID_ = itemID_;
      result.currentQuantities_ = currentQuantities_;
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
      if (other instanceof grpc.smartWarehouse.orderManagement.orderRequest) {
        return mergeFrom((grpc.smartWarehouse.orderManagement.orderRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.smartWarehouse.orderManagement.orderRequest other) {
      if (other == grpc.smartWarehouse.orderManagement.orderRequest.getDefaultInstance()) return this;
      if (!other.getCustomerName().isEmpty()) {
        customerName_ = other.customerName_;
        onChanged();
      }
      if (!other.getItemID().isEmpty()) {
        itemID_ = other.itemID_;
        onChanged();
      }
      if (!other.getCurrentQuantities().isEmpty()) {
        currentQuantities_ = other.currentQuantities_;
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
      grpc.smartWarehouse.orderManagement.orderRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.smartWarehouse.orderManagement.orderRequest) e.getUnfinishedMessage();
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

    private java.lang.Object itemID_ = "";
    /**
     * <code>string itemID = 2;</code>
     */
    public java.lang.String getItemID() {
      java.lang.Object ref = itemID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string itemID = 2;</code>
     */
    public com.google.protobuf.ByteString
        getItemIDBytes() {
      java.lang.Object ref = itemID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string itemID = 2;</code>
     */
    public Builder setItemID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string itemID = 2;</code>
     */
    public Builder clearItemID() {
      
      itemID_ = getDefaultInstance().getItemID();
      onChanged();
      return this;
    }
    /**
     * <code>string itemID = 2;</code>
     */
    public Builder setItemIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object currentQuantities_ = "";
    /**
     * <code>string currentQuantities = 3;</code>
     */
    public java.lang.String getCurrentQuantities() {
      java.lang.Object ref = currentQuantities_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currentQuantities_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string currentQuantities = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCurrentQuantitiesBytes() {
      java.lang.Object ref = currentQuantities_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currentQuantities_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string currentQuantities = 3;</code>
     */
    public Builder setCurrentQuantities(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currentQuantities_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string currentQuantities = 3;</code>
     */
    public Builder clearCurrentQuantities() {
      
      currentQuantities_ = getDefaultInstance().getCurrentQuantities();
      onChanged();
      return this;
    }
    /**
     * <code>string currentQuantities = 3;</code>
     */
    public Builder setCurrentQuantitiesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currentQuantities_ = value;
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


    // @@protoc_insertion_point(builder_scope:smartwarehouse.orderRequest)
  }

  // @@protoc_insertion_point(class_scope:smartwarehouse.orderRequest)
  private static final grpc.smartWarehouse.orderManagement.orderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.smartWarehouse.orderManagement.orderRequest();
  }

  public static grpc.smartWarehouse.orderManagement.orderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<orderRequest>
      PARSER = new com.google.protobuf.AbstractParser<orderRequest>() {
    @java.lang.Override
    public orderRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new orderRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<orderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<orderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.smartWarehouse.orderManagement.orderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

