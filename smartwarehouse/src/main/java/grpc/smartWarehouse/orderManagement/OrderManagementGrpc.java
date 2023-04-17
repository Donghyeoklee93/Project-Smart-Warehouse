package grpc.smartWarehouse.orderManagement;

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
    comments = "Source: orderManagement.proto")
public final class OrderManagementGrpc {

  private OrderManagementGrpc() {}

  public static final String SERVICE_NAME = "smartwarehouse.OrderManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.orderRequest,
      grpc.smartWarehouse.orderManagement.orderReply> getOrderItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "orderItem",
      requestType = grpc.smartWarehouse.orderManagement.orderRequest.class,
      responseType = grpc.smartWarehouse.orderManagement.orderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.orderRequest,
      grpc.smartWarehouse.orderManagement.orderReply> getOrderItemMethod() {
    io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.orderRequest, grpc.smartWarehouse.orderManagement.orderReply> getOrderItemMethod;
    if ((getOrderItemMethod = OrderManagementGrpc.getOrderItemMethod) == null) {
      synchronized (OrderManagementGrpc.class) {
        if ((getOrderItemMethod = OrderManagementGrpc.getOrderItemMethod) == null) {
          OrderManagementGrpc.getOrderItemMethod = getOrderItemMethod = 
              io.grpc.MethodDescriptor.<grpc.smartWarehouse.orderManagement.orderRequest, grpc.smartWarehouse.orderManagement.orderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartwarehouse.OrderManagement", "orderItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.orderManagement.orderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.orderManagement.orderReply.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderManagementMethodDescriptorSupplier("orderItem"))
                  .build();
          }
        }
     }
     return getOrderItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderManagementStub newStub(io.grpc.Channel channel) {
    return new OrderManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrderManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrderManagementFutureStub(channel);
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static abstract class OrderManagementImplBase implements io.grpc.BindableService {

    /**
     */
    public void orderItem(grpc.smartWarehouse.orderManagement.orderRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.orderReply> responseObserver) {
      asyncUnimplementedUnaryCall(getOrderItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOrderItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.smartWarehouse.orderManagement.orderRequest,
                grpc.smartWarehouse.orderManagement.orderReply>(
                  this, METHODID_ORDER_ITEM)))
          .build();
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class OrderManagementStub extends io.grpc.stub.AbstractStub<OrderManagementStub> {
    private OrderManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderManagementStub(channel, callOptions);
    }

    /**
     */
    public void orderItem(grpc.smartWarehouse.orderManagement.orderRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.orderReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOrderItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class OrderManagementBlockingStub extends io.grpc.stub.AbstractStub<OrderManagementBlockingStub> {
    private OrderManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderManagementBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.smartWarehouse.orderManagement.orderReply orderItem(grpc.smartWarehouse.orderManagement.orderRequest request) {
      return blockingUnaryCall(
          getChannel(), getOrderItemMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class OrderManagementFutureStub extends io.grpc.stub.AbstractStub<OrderManagementFutureStub> {
    private OrderManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderManagementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.smartWarehouse.orderManagement.orderReply> orderItem(
        grpc.smartWarehouse.orderManagement.orderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOrderItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ORDER_ITEM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ORDER_ITEM:
          serviceImpl.orderItem((grpc.smartWarehouse.orderManagement.orderRequest) request,
              (io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.orderReply>) responseObserver);
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

  private static abstract class OrderManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.smartWarehouse.orderManagement.OrderManagementServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderManagement");
    }
  }

  private static final class OrderManagementFileDescriptorSupplier
      extends OrderManagementBaseDescriptorSupplier {
    OrderManagementFileDescriptorSupplier() {}
  }

  private static final class OrderManagementMethodDescriptorSupplier
      extends OrderManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrderManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderManagementFileDescriptorSupplier())
              .addMethod(getOrderItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
