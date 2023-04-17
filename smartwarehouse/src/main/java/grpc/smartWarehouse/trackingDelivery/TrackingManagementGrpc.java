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
  private static volatile io.grpc.MethodDescriptor<grpc.smartWarehouse.trackingDelivery.trackingRequest,
      grpc.smartWarehouse.trackingDelivery.trackingReply> getTrackItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "trackItem",
      requestType = grpc.smartWarehouse.trackingDelivery.trackingRequest.class,
      responseType = grpc.smartWarehouse.trackingDelivery.trackingReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.smartWarehouse.trackingDelivery.trackingRequest,
      grpc.smartWarehouse.trackingDelivery.trackingReply> getTrackItemMethod() {
    io.grpc.MethodDescriptor<grpc.smartWarehouse.trackingDelivery.trackingRequest, grpc.smartWarehouse.trackingDelivery.trackingReply> getTrackItemMethod;
    if ((getTrackItemMethod = TrackingManagementGrpc.getTrackItemMethod) == null) {
      synchronized (TrackingManagementGrpc.class) {
        if ((getTrackItemMethod = TrackingManagementGrpc.getTrackItemMethod) == null) {
          TrackingManagementGrpc.getTrackItemMethod = getTrackItemMethod = 
              io.grpc.MethodDescriptor.<grpc.smartWarehouse.trackingDelivery.trackingRequest, grpc.smartWarehouse.trackingDelivery.trackingReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartwarehouse.TrackingManagement", "trackItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.trackingDelivery.trackingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.trackingDelivery.trackingReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TrackingManagementMethodDescriptorSupplier("trackItem"))
                  .build();
          }
        }
     }
     return getTrackItemMethod;
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
    public void trackItem(grpc.smartWarehouse.trackingDelivery.trackingRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.trackingDelivery.trackingReply> responseObserver) {
      asyncUnimplementedUnaryCall(getTrackItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTrackItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.smartWarehouse.trackingDelivery.trackingRequest,
                grpc.smartWarehouse.trackingDelivery.trackingReply>(
                  this, METHODID_TRACK_ITEM)))
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
    public void trackItem(grpc.smartWarehouse.trackingDelivery.trackingRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.trackingDelivery.trackingReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTrackItemMethod(), getCallOptions()), request, responseObserver);
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
    public grpc.smartWarehouse.trackingDelivery.trackingReply trackItem(grpc.smartWarehouse.trackingDelivery.trackingRequest request) {
      return blockingUnaryCall(
          getChannel(), getTrackItemMethod(), getCallOptions(), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.smartWarehouse.trackingDelivery.trackingReply> trackItem(
        grpc.smartWarehouse.trackingDelivery.trackingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTrackItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRACK_ITEM = 0;

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
        case METHODID_TRACK_ITEM:
          serviceImpl.trackItem((grpc.smartWarehouse.trackingDelivery.trackingRequest) request,
              (io.grpc.stub.StreamObserver<grpc.smartWarehouse.trackingDelivery.trackingReply>) responseObserver);
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
              .addMethod(getTrackItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
