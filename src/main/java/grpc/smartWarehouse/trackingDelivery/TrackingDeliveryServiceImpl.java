// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trackingDelivery.proto

package grpc.smartWarehouse.trackingDelivery;

public final class TrackingDeliveryServiceImpl {
  private TrackingDeliveryServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartwarehouse_TrackingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartwarehouse_TrackingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartwarehouse_TrackingReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartwarehouse_TrackingReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026trackingDelivery.proto\022\016smartwarehouse" +
      "\"T\n\017TrackingRequest\022\024\n\014customerName\030\001 \001(" +
      "\t\022\017\n\007orderID\030\002 \001(\t\022\032\n\022newDeliveryDetails" +
      "\030\003 \001(\t\"\220\001\n\rTrackingReply\022\026\n\016deliveryDeta" +
      "il\030\001 \001(\t\022\027\n\017currentLocation\030\002 \001(\t\022\035\n\025est" +
      "imatedDeliveryDate\030\003 \001(\t\022\036\n\026success_fail" +
      "ureMessage\030\004 \001(\t\022\017\n\007orderID\030\005 \001(\t2\314\001\n\022Tr" +
      "ackingManagement\022Y\n\023CheckShippingDetail\022" +
      "\037.smartwarehouse.TrackingRequest\032\035.smart" +
      "warehouse.TrackingReply\"\0000\001\022[\n\025UpdateShi" +
      "ppingDetails\022\037.smartwarehouse.TrackingRe" +
      "quest\032\035.smartwarehouse.TrackingReply\"\000(\001" +
      "BE\n$grpc.smartWarehouse.trackingDelivery" +
      "B\033TrackingDeliveryServiceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_smartwarehouse_TrackingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartwarehouse_TrackingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartwarehouse_TrackingRequest_descriptor,
        new java.lang.String[] { "CustomerName", "OrderID", "NewDeliveryDetails", });
    internal_static_smartwarehouse_TrackingReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartwarehouse_TrackingReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartwarehouse_TrackingReply_descriptor,
        new java.lang.String[] { "DeliveryDetail", "CurrentLocation", "EstimatedDeliveryDate", "SuccessFailureMessage", "OrderID", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}