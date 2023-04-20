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
  private static volatile io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.OrderRequest,
      grpc.smartWarehouse.orderManagement.OrderReply> getOrderItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrderItem",
      requestType = grpc.smartWarehouse.orderManagement.OrderRequest.class,
      responseType = grpc.smartWarehouse.orderManagement.OrderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.OrderRequest,
      grpc.smartWarehouse.orderManagement.OrderReply> getOrderItemMethod() {
    io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.OrderRequest, grpc.smartWarehouse.orderManagement.OrderReply> getOrderItemMethod;
    if ((getOrderItemMethod = OrderManagementGrpc.getOrderItemMethod) == null) {
      synchronized (OrderManagementGrpc.class) {
        if ((getOrderItemMethod = OrderManagementGrpc.getOrderItemMethod) == null) {
          OrderManagementGrpc.getOrderItemMethod = getOrderItemMethod = 
              io.grpc.MethodDescriptor.<grpc.smartWarehouse.orderManagement.OrderRequest, grpc.smartWarehouse.orderManagement.OrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartwarehouse.OrderManagement", "OrderItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.orderManagement.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.orderManagement.OrderReply.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderManagementMethodDescriptorSupplier("OrderItem"))
                  .build();
          }
        }
     }
     return getOrderItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.OrderRequest,
      grpc.smartWarehouse.orderManagement.OrderReply> getUpdateOrderStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrderStatus",
      requestType = grpc.smartWarehouse.orderManagement.OrderRequest.class,
      responseType = grpc.smartWarehouse.orderManagement.OrderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.OrderRequest,
      grpc.smartWarehouse.orderManagement.OrderReply> getUpdateOrderStatusMethod() {
    io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.OrderRequest, grpc.smartWarehouse.orderManagement.OrderReply> getUpdateOrderStatusMethod;
    if ((getUpdateOrderStatusMethod = OrderManagementGrpc.getUpdateOrderStatusMethod) == null) {
      synchronized (OrderManagementGrpc.class) {
        if ((getUpdateOrderStatusMethod = OrderManagementGrpc.getUpdateOrderStatusMethod) == null) {
          OrderManagementGrpc.getUpdateOrderStatusMethod = getUpdateOrderStatusMethod = 
              io.grpc.MethodDescriptor.<grpc.smartWarehouse.orderManagement.OrderRequest, grpc.smartWarehouse.orderManagement.OrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartwarehouse.OrderManagement", "UpdateOrderStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.orderManagement.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.orderManagement.OrderReply.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderManagementMethodDescriptorSupplier("UpdateOrderStatus"))
                  .build();
          }
        }
     }
     return getUpdateOrderStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.OrderRequest,
      grpc.smartWarehouse.orderManagement.OrderReply> getCancelOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOrder",
      requestType = grpc.smartWarehouse.orderManagement.OrderRequest.class,
      responseType = grpc.smartWarehouse.orderManagement.OrderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.OrderRequest,
      grpc.smartWarehouse.orderManagement.OrderReply> getCancelOrderMethod() {
    io.grpc.MethodDescriptor<grpc.smartWarehouse.orderManagement.OrderRequest, grpc.smartWarehouse.orderManagement.OrderReply> getCancelOrderMethod;
    if ((getCancelOrderMethod = OrderManagementGrpc.getCancelOrderMethod) == null) {
      synchronized (OrderManagementGrpc.class) {
        if ((getCancelOrderMethod = OrderManagementGrpc.getCancelOrderMethod) == null) {
          OrderManagementGrpc.getCancelOrderMethod = getCancelOrderMethod = 
              io.grpc.MethodDescriptor.<grpc.smartWarehouse.orderManagement.OrderRequest, grpc.smartWarehouse.orderManagement.OrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartwarehouse.OrderManagement", "CancelOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.orderManagement.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.orderManagement.OrderReply.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderManagementMethodDescriptorSupplier("CancelOrder"))
                  .build();
          }
        }
     }
     return getCancelOrderMethod;
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
    public void orderItem(grpc.smartWarehouse.orderManagement.OrderRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.OrderReply> responseObserver) {
      asyncUnimplementedUnaryCall(getOrderItemMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.OrderRequest> updateOrderStatus(
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.OrderReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getUpdateOrderStatusMethod(), responseObserver);
    }

    /**
     */
    public void cancelOrder(grpc.smartWarehouse.orderManagement.OrderRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.OrderReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOrderItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.smartWarehouse.orderManagement.OrderRequest,
                grpc.smartWarehouse.orderManagement.OrderReply>(
                  this, METHODID_ORDER_ITEM)))
          .addMethod(
            getUpdateOrderStatusMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.smartWarehouse.orderManagement.OrderRequest,
                grpc.smartWarehouse.orderManagement.OrderReply>(
                  this, METHODID_UPDATE_ORDER_STATUS)))
          .addMethod(
            getCancelOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.smartWarehouse.orderManagement.OrderRequest,
                grpc.smartWarehouse.orderManagement.OrderReply>(
                  this, METHODID_CANCEL_ORDER)))
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
    public void orderItem(grpc.smartWarehouse.orderManagement.OrderRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.OrderReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOrderItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.OrderRequest> updateOrderStatus(
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.OrderReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getUpdateOrderStatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void cancelOrder(grpc.smartWarehouse.orderManagement.OrderRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.OrderReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request, responseObserver);
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
    public grpc.smartWarehouse.orderManagement.OrderReply orderItem(grpc.smartWarehouse.orderManagement.OrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getOrderItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.smartWarehouse.orderManagement.OrderReply cancelOrder(grpc.smartWarehouse.orderManagement.OrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelOrderMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<grpc.smartWarehouse.orderManagement.OrderReply> orderItem(
        grpc.smartWarehouse.orderManagement.OrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOrderItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.smartWarehouse.orderManagement.OrderReply> cancelOrder(
        grpc.smartWarehouse.orderManagement.OrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ORDER_ITEM = 0;
  private static final int METHODID_CANCEL_ORDER = 1;
  private static final int METHODID_UPDATE_ORDER_STATUS = 2;

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
          serviceImpl.orderItem((grpc.smartWarehouse.orderManagement.OrderRequest) request,
              (io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.OrderReply>) responseObserver);
          break;
        case METHODID_CANCEL_ORDER:
          serviceImpl.cancelOrder((grpc.smartWarehouse.orderManagement.OrderRequest) request,
              (io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.OrderReply>) responseObserver);
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
        case METHODID_UPDATE_ORDER_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateOrderStatus(
              (io.grpc.stub.StreamObserver<grpc.smartWarehouse.orderManagement.OrderReply>) responseObserver);
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
              .addMethod(getUpdateOrderStatusMethod())
              .addMethod(getCancelOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
