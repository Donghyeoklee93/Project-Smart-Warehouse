// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventoryManagement.proto

package grpc.smartWarehouse.inventoryManagement;

/**
 * <pre>
 * Define the messages
 * </pre>
 *
 * Protobuf type {@code smartwarehouse.checkItemRequest}
 */
public  final class CheckItemRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartwarehouse.checkItemRequest)
    CheckItemRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckItemRequest.newBuilder() to construct.
  private CheckItemRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckItemRequest() {
    itemID_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckItemRequest(
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

            itemID_ = s;
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
    return grpc.smartWarehouse.inventoryManagement.InventoryManagementServiceImpl.internal_static_smartwarehouse_checkItemRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.smartWarehouse.inventoryManagement.InventoryManagementServiceImpl.internal_static_smartwarehouse_checkItemRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.smartWarehouse.inventoryManagement.CheckItemRequest.class, grpc.smartWarehouse.inventoryManagement.CheckItemRequest.Builder.class);
  }

  public static final int ITEMID_FIELD_NUMBER = 1;
  private volatile java.lang.Object itemID_;
  /**
   * <code>string itemID = 1;</code>
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
   * <code>string itemID = 1;</code>
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
    if (!getItemIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, itemID_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getItemIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, itemID_);
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
    if (!(obj instanceof grpc.smartWarehouse.inventoryManagement.CheckItemRequest)) {
      return super.equals(obj);
    }
    grpc.smartWarehouse.inventoryManagement.CheckItemRequest other = (grpc.smartWarehouse.inventoryManagement.CheckItemRequest) obj;

    boolean result = true;
    result = result && getItemID()
        .equals(other.getItemID());
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
    hash = (37 * hash) + ITEMID_FIELD_NUMBER;
    hash = (53 * hash) + getItemID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest parseFrom(
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
  public static Builder newBuilder(grpc.smartWarehouse.inventoryManagement.CheckItemRequest prototype) {
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
   * Protobuf type {@code smartwarehouse.checkItemRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartwarehouse.checkItemRequest)
      grpc.smartWarehouse.inventoryManagement.CheckItemRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.smartWarehouse.inventoryManagement.InventoryManagementServiceImpl.internal_static_smartwarehouse_checkItemRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.smartWarehouse.inventoryManagement.InventoryManagementServiceImpl.internal_static_smartwarehouse_checkItemRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.smartWarehouse.inventoryManagement.CheckItemRequest.class, grpc.smartWarehouse.inventoryManagement.CheckItemRequest.Builder.class);
    }

    // Construct using grpc.smartWarehouse.inventoryManagement.CheckItemRequest.newBuilder()
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
      itemID_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.smartWarehouse.inventoryManagement.InventoryManagementServiceImpl.internal_static_smartwarehouse_checkItemRequest_descriptor;
    }

    @java.lang.Override
    public grpc.smartWarehouse.inventoryManagement.CheckItemRequest getDefaultInstanceForType() {
      return grpc.smartWarehouse.inventoryManagement.CheckItemRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.smartWarehouse.inventoryManagement.CheckItemRequest build() {
      grpc.smartWarehouse.inventoryManagement.CheckItemRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.smartWarehouse.inventoryManagement.CheckItemRequest buildPartial() {
      grpc.smartWarehouse.inventoryManagement.CheckItemRequest result = new grpc.smartWarehouse.inventoryManagement.CheckItemRequest(this);
      result.itemID_ = itemID_;
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
      if (other instanceof grpc.smartWarehouse.inventoryManagement.CheckItemRequest) {
        return mergeFrom((grpc.smartWarehouse.inventoryManagement.CheckItemRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.smartWarehouse.inventoryManagement.CheckItemRequest other) {
      if (other == grpc.smartWarehouse.inventoryManagement.CheckItemRequest.getDefaultInstance()) return this;
      if (!other.getItemID().isEmpty()) {
        itemID_ = other.itemID_;
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
      grpc.smartWarehouse.inventoryManagement.CheckItemRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.smartWarehouse.inventoryManagement.CheckItemRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object itemID_ = "";
    /**
     * <code>string itemID = 1;</code>
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
     * <code>string itemID = 1;</code>
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
     * <code>string itemID = 1;</code>
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
     * <code>string itemID = 1;</code>
     */
    public Builder clearItemID() {
      
      itemID_ = getDefaultInstance().getItemID();
      onChanged();
      return this;
    }
    /**
     * <code>string itemID = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:smartwarehouse.checkItemRequest)
  }

  // @@protoc_insertion_point(class_scope:smartwarehouse.checkItemRequest)
  private static final grpc.smartWarehouse.inventoryManagement.CheckItemRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.smartWarehouse.inventoryManagement.CheckItemRequest();
  }

  public static grpc.smartWarehouse.inventoryManagement.CheckItemRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckItemRequest>
      PARSER = new com.google.protobuf.AbstractParser<CheckItemRequest>() {
    @java.lang.Override
    public CheckItemRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckItemRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckItemRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckItemRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.smartWarehouse.inventoryManagement.CheckItemRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
