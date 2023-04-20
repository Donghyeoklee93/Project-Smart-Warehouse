package grpc.smartWarehouse.trackingDelivery;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *Service Definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: trackingDelivery.proto")
public final class TrackingManagementGrpc {

  private TrackingManagementGrpc() {}

  public static final String SERVICE_NAME = "smartwarehouse.TrackingManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.smartWarehouse.trackingDelivery.TrackingRequest,
      grpc.smartWarehouse.trackingDelivery.TrackingReply> getCheckShippingDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckShippingDetail",
      requestType = grpc.smartWarehouse.trackingDelivery.TrackingRequest.class,
      responseType = grpc.smartWarehouse.trackingDelivery.TrackingReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.smartWarehouse.trackingDelivery.TrackingRequest,
      grpc.smartWarehouse.trackingDelivery.TrackingReply> getCheckShippingDetailMethod() {
    io.grpc.MethodDescriptor<grpc.smartWarehouse.trackingDelivery.TrackingRequest, grpc.smartWarehouse.trackingDelivery.TrackingReply> getCheckShippingDetailMethod;
    if ((getCheckShippingDetailMethod = TrackingManagementGrpc.getCheckShippingDetailMethod) == null) {
      synchronized (TrackingManagementGrpc.class) {
        if ((getCheckShippingDetailMethod = TrackingManagementGrpc.getCheckShippingDetailMethod) == null) {
          TrackingManagementGrpc.getCheckShippingDetailMethod = getCheckShippingDetailMethod = 
              io.grpc.MethodDescriptor.<grpc.smartWarehouse.trackingDelivery.TrackingRequest, grpc.smartWarehouse.trackingDelivery.TrackingReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartwarehouse.TrackingManagement", "CheckShippingDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.trackingDelivery.TrackingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.trackingDelivery.TrackingReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TrackingManagementMethodDescriptorSupplier("CheckShippingDetail"))
                  .build();
          }
        }
     }
     return getCheckShippingDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.smartWarehouse.trackingDelivery.TrackingRequest,
      grpc.smartWarehouse.trackingDelivery.TrackingReply> getUpdateShippingDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateShippingDetails",
      requestType = grpc.smartWarehouse.trackingDelivery.TrackingRequest.class,
      responseType = grpc.smartWarehouse.trackingDelivery.TrackingReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.smartWarehouse.trackingDelivery.TrackingRequest,
      grpc.smartWarehouse.trackingDelivery.TrackingReply> getUpdateShippingDetailsMethod() {
    io.grpc.MethodDescriptor<grpc.smartWarehouse.trackingDelivery.TrackingRequest, grpc.smartWarehouse.trackingDelivery.TrackingReply> getUpdateShippingDetailsMethod;
    if ((getUpdateShippingDetailsMethod = TrackingManagementGrpc.getUpdateShippingDetailsMethod) == null) {
      synchronized (TrackingManagementGrpc.class) {
        if ((getUpdateShippingDetailsMethod = TrackingManagementGrpc.getUpdateShippingDetailsMethod) == null) {
          TrackingManagementGrpc.getUpdateShippingDetailsMethod = getUpdateShippingDetailsMethod = 
              io.grpc.MethodDescriptor.<grpc.smartWarehouse.trackingDelivery.TrackingRequest, grpc.smartWarehouse.trackingDelivery.TrackingReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartwarehouse.TrackingManagement", "UpdateShippingDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.trackingDelivery.TrackingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.trackingDelivery.TrackingReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TrackingManagementMethodDescriptorSupplier("UpdateShippingDetails"))
                  .build();
          }
        }
     }
     return getUpdateShippingDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrackingManagementStub newStub(io.grpc.Channel channel) {
    return new TrackingManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrackingManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrackingManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrackingManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrackingManagementFutureStub(channel);
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static abstract class TrackingManagementImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkShippingDetail(grpc.smartWarehouse.trackingDelivery.TrackingRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.trackingDelivery.TrackingReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckShippingDetailMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.smartWarehouse.trackingDelivery.TrackingRequest> updateShippingDetails(
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.trackingDelivery.TrackingReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getUpdateShippingDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckShippingDetailMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.smartWarehouse.trackingDelivery.TrackingRequest,
                grpc.smartWarehouse.trackingDelivery.TrackingReply>(
                  this, METHODID_CHECK_SHIPPING_DETAIL)))
          .addMethod(
            getUpdateShippingDetailsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.smartWarehouse.trackingDelivery.TrackingRequest,
                grpc.smartWarehouse.trackingDelivery.TrackingReply>(
                  this, METHODID_UPDATE_SHIPPING_DETAILS)))
          .build();
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class TrackingManagementStub extends io.grpc.stub.AbstractStub<TrackingManagementStub> {
    private TrackingManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackingManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackingManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackingManagementStub(channel, callOptions);
    }

    /**
     */
    public void checkShippingDetail(grpc.smartWarehouse.trackingDelivery.TrackingRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.trackingDelivery.TrackingReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCheckShippingDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.smartWarehouse.trackingDelivery.TrackingRequest> updateShippingDetails(
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.trackingDelivery.TrackingReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getUpdateShippingDetailsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class TrackingManagementBlockingStub extends io.grpc.stub.AbstractStub<TrackingManagementBlockingStub> {
    private TrackingManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackingManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackingManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackingManagementBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<grpc.smartWarehouse.trackingDelivery.TrackingReply> checkShippingDetail(
        grpc.smartWarehouse.trackingDelivery.TrackingRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getCheckShippingDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class TrackingManagementFutureStub extends io.grpc.stub.AbstractStub<TrackingManagementFutureStub> {
    private TrackingManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackingManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackingManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackingManagementFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CHECK_SHIPPING_DETAIL = 0;
  private static final int METHODID_UPDATE_SHIPPING_DETAILS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrackingManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrackingManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_SHIPPING_DETAIL:
          serviceImpl.checkShippingDetail((grpc.smartWarehouse.trackingDelivery.TrackingRequest) request,
              (io.grpc.stub.StreamObserver<grpc.smartWarehouse.trackingDelivery.TrackingReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_SHIPPING_DETAILS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateShippingDetails(
              (io.grpc.stub.StreamObserver<grpc.smartWarehouse.trackingDelivery.TrackingReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TrackingManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrackingManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.smartWarehouse.trackingDelivery.TrackingDeliveryServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrackingManagement");
    }
  }

  private static final class TrackingManagementFileDescriptorSupplier
      extends TrackingManagementBaseDescriptorSupplier {
    TrackingManagementFileDescriptorSupplier() {}
  }

  private static final class TrackingManagementMethodDescriptorSupplier
      extends TrackingManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrackingManagementMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TrackingManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrackingManagementFileDescriptorSupplier())
              .addMethod(getCheckShippingDetailMethod())
              .addMethod(getUpdateShippingDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
