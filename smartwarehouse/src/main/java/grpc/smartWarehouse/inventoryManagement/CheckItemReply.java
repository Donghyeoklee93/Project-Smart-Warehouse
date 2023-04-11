// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventoryManagement.proto

package grpc.smartWarehouse.inventoryManagement;

/**
 * Protobuf type {@code smartwarehouse.checkItemReply}
 */
public  final class CheckItemReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartwarehouse.checkItemReply)
    CheckItemReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckItemReply.newBuilder() to construct.
  private CheckItemReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckItemReply() {
    currentQuantities_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckItemReply(
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
    return grpc.smartWarehouse.inventoryManagement.InventoryManagementServiceImpl.internal_static_smartwarehouse_checkItemReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.smartWarehouse.inventoryManagement.InventoryManagementServiceImpl.internal_static_smartwarehouse_checkItemReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.smartWarehouse.inventoryManagement.CheckItemReply.class, grpc.smartWarehouse.inventoryManagement.CheckItemReply.Builder.class);
  }

  public static final int CURRENTQUANTITIES_FIELD_NUMBER = 1;
  private volatile java.lang.Object currentQuantities_;
  /**
   * <code>string currentQuantities = 1;</code>
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
   * <code>string currentQuantities = 1;</code>
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
    if (!getCurrentQuantitiesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, currentQuantities_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCurrentQuantitiesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, currentQuantities_);
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
    if (!(obj instanceof grpc.smartWarehouse.inventoryManagement.CheckItemReply)) {
      return super.equals(obj);
    }
    grpc.smartWarehouse.inventoryManagement.CheckItemReply other = (grpc.smartWarehouse.inventoryManagement.CheckItemReply) obj;

    boolean result = true;
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
    hash = (37 * hash) + CURRENTQUANTITIES_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentQuantities().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply parseFrom(
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
  public static Builder newBuilder(grpc.smartWarehouse.inventoryManagement.CheckItemReply prototype) {
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
   * Protobuf type {@code smartwarehouse.checkItemReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartwarehouse.checkItemReply)
      grpc.smartWarehouse.inventoryManagement.CheckItemReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.smartWarehouse.inventoryManagement.InventoryManagementServiceImpl.internal_static_smartwarehouse_checkItemReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.smartWarehouse.inventoryManagement.InventoryManagementServiceImpl.internal_static_smartwarehouse_checkItemReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.smartWarehouse.inventoryManagement.CheckItemReply.class, grpc.smartWarehouse.inventoryManagement.CheckItemReply.Builder.class);
    }

    // Construct using grpc.smartWarehouse.inventoryManagement.CheckItemReply.newBuilder()
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
      currentQuantities_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.smartWarehouse.inventoryManagement.InventoryManagementServiceImpl.internal_static_smartwarehouse_checkItemReply_descriptor;
    }

    @java.lang.Override
    public grpc.smartWarehouse.inventoryManagement.CheckItemReply getDefaultInstanceForType() {
      return grpc.smartWarehouse.inventoryManagement.CheckItemReply.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.smartWarehouse.inventoryManagement.CheckItemReply build() {
      grpc.smartWarehouse.inventoryManagement.CheckItemReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.smartWarehouse.inventoryManagement.CheckItemReply buildPartial() {
      grpc.smartWarehouse.inventoryManagement.CheckItemReply result = new grpc.smartWarehouse.inventoryManagement.CheckItemReply(this);
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
      if (other instanceof grpc.smartWarehouse.inventoryManagement.CheckItemReply) {
        return mergeFrom((grpc.smartWarehouse.inventoryManagement.CheckItemReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.smartWarehouse.inventoryManagement.CheckItemReply other) {
      if (other == grpc.smartWarehouse.inventoryManagement.CheckItemReply.getDefaultInstance()) return this;
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
      grpc.smartWarehouse.inventoryManagement.CheckItemReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.smartWarehouse.inventoryManagement.CheckItemReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object currentQuantities_ = "";
    /**
     * <code>string currentQuantities = 1;</code>
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
     * <code>string currentQuantities = 1;</code>
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
     * <code>string currentQuantities = 1;</code>
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
     * <code>string currentQuantities = 1;</code>
     */
    public Builder clearCurrentQuantities() {
      
      currentQuantities_ = getDefaultInstance().getCurrentQuantities();
      onChanged();
      return this;
    }
    /**
     * <code>string currentQuantities = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:smartwarehouse.checkItemReply)
  }

  // @@protoc_insertion_point(class_scope:smartwarehouse.checkItemReply)
  private static final grpc.smartWarehouse.inventoryManagement.CheckItemReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.smartWarehouse.inventoryManagement.CheckItemReply();
  }

  public static grpc.smartWarehouse.inventoryManagement.CheckItemReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckItemReply>
      PARSER = new com.google.protobuf.AbstractParser<CheckItemReply>() {
    @java.lang.Override
    public CheckItemReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckItemReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckItemReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckItemReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.smartWarehouse.inventoryManagement.CheckItemReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
