// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventoryManagement.proto

package grpc.smartWarehouse.inventoryManagement;

public interface InventoryReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:smartwarehouse.InventoryReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string currentQuantities = 1;</code>
   */
  java.lang.String getCurrentQuantities();
  /**
   * <code>string currentQuantities = 1;</code>
   */
  com.google.protobuf.ByteString
      getCurrentQuantitiesBytes();

  /**
   * <code>string success_failureMessage = 2;</code>
   */
  java.lang.String getSuccessFailureMessage();
  /**
   * <code>string success_failureMessage = 2;</code>
   */
  com.google.protobuf.ByteString
      getSuccessFailureMessageBytes();

  /**
   * <code>string alertMessage = 3;</code>
   */
  java.lang.String getAlertMessage();
  /**
   * <code>string alertMessage = 3;</code>
   */
  com.google.protobuf.ByteString
      getAlertMessageBytes();
}