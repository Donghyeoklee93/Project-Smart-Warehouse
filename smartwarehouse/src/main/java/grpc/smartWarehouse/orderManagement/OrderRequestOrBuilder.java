// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orderManagement.proto

package grpc.smartWarehouse.orderManagement;

public interface OrderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:smartwarehouse.OrderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string customerName = 1;</code>
   */
  java.lang.String getCustomerName();
  /**
   * <code>string customerName = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerNameBytes();

  /**
   * <code>string itemID = 2;</code>
   */
  java.lang.String getItemID();
  /**
   * <code>string itemID = 2;</code>
   */
  com.google.protobuf.ByteString
      getItemIDBytes();

  /**
   * <code>string currentQuantities = 3;</code>
   */
  java.lang.String getCurrentQuantities();
  /**
   * <code>string currentQuantities = 3;</code>
   */
  com.google.protobuf.ByteString
      getCurrentQuantitiesBytes();
}