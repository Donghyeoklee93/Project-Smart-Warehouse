// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventoryManagement.proto

package grpc.smartWarehouse.inventoryManagement;

public interface InventoryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:smartwarehouse.InventoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string itemID = 1;</code>
   */
  java.lang.String getItemID();
  /**
   * <code>string itemID = 1;</code>
   */
  com.google.protobuf.ByteString
      getItemIDBytes();

  /**
   * <code>string quantity = 2;</code>
   */
  java.lang.String getQuantity();
  /**
   * <code>string quantity = 2;</code>
   */
  com.google.protobuf.ByteString
      getQuantityBytes();

  /**
   * <code>string threshold = 3;</code>
   */
  java.lang.String getThreshold();
  /**
   * <code>string threshold = 3;</code>
   */
  com.google.protobuf.ByteString
      getThresholdBytes();
}