package grpc.smartWarehouse.inventoryManagement;

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
    comments = "Source: inventoryManagement.proto")
public final class InventoryManagementGrpc {

  private InventoryManagementGrpc() {}

  public static final String SERVICE_NAME = "smartwarehouse.InventoryManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.smartWarehouse.inventoryManagement.InventoryRequest,
      grpc.smartWarehouse.inventoryManagement.InventoryReply> getCheckItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckItem",
      requestType = grpc.smartWarehouse.inventoryManagement.InventoryRequest.class,
      responseType = grpc.smartWarehouse.inventoryManagement.InventoryReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.smartWarehouse.inventoryManagement.InventoryRequest,
      grpc.smartWarehouse.inventoryManagement.InventoryReply> getCheckItemMethod() {
    io.grpc.MethodDescriptor<grpc.smartWarehouse.inventoryManagement.InventoryRequest, grpc.smartWarehouse.inventoryManagement.InventoryReply> getCheckItemMethod;
    if ((getCheckItemMethod = InventoryManagementGrpc.getCheckItemMethod) == null) {
      synchronized (InventoryManagementGrpc.class) {
        if ((getCheckItemMethod = InventoryManagementGrpc.getCheckItemMethod) == null) {
          InventoryManagementGrpc.getCheckItemMethod = getCheckItemMethod = 
              io.grpc.MethodDescriptor.<grpc.smartWarehouse.inventoryManagement.InventoryRequest, grpc.smartWarehouse.inventoryManagement.InventoryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartwarehouse.InventoryManagement", "CheckItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.inventoryManagement.InventoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.inventoryManagement.InventoryReply.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryManagementMethodDescriptorSupplier("CheckItem"))
                  .build();
          }
        }
     }
     return getCheckItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.smartWarehouse.inventoryManagement.InventoryRequest,
      grpc.smartWarehouse.inventoryManagement.InventoryReply> getModifyQuantityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyQuantity",
      requestType = grpc.smartWarehouse.inventoryManagement.InventoryRequest.class,
      responseType = grpc.smartWarehouse.inventoryManagement.InventoryReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.smartWarehouse.inventoryManagement.InventoryRequest,
      grpc.smartWarehouse.inventoryManagement.InventoryReply> getModifyQuantityMethod() {
    io.grpc.MethodDescriptor<grpc.smartWarehouse.inventoryManagement.InventoryRequest, grpc.smartWarehouse.inventoryManagement.InventoryReply> getModifyQuantityMethod;
    if ((getModifyQuantityMethod = InventoryManagementGrpc.getModifyQuantityMethod) == null) {
      synchronized (InventoryManagementGrpc.class) {
        if ((getModifyQuantityMethod = InventoryManagementGrpc.getModifyQuantityMethod) == null) {
          InventoryManagementGrpc.getModifyQuantityMethod = getModifyQuantityMethod = 
              io.grpc.MethodDescriptor.<grpc.smartWarehouse.inventoryManagement.InventoryRequest, grpc.smartWarehouse.inventoryManagement.InventoryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartwarehouse.InventoryManagement", "ModifyQuantity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.inventoryManagement.InventoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.smartWarehouse.inventoryManagement.InventoryReply.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryManagementMethodDescriptorSupplier("ModifyQuantity"))
                  .build();
          }
        }
     }
     return getModifyQuantityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryManagementStub newStub(io.grpc.Channel channel) {
    return new InventoryManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InventoryManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InventoryManagementFutureStub(channel);
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static abstract class InventoryManagementImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkItem(grpc.smartWarehouse.inventoryManagement.InventoryRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.inventoryManagement.InventoryReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckItemMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.smartWarehouse.inventoryManagement.InventoryRequest> modifyQuantity(
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.inventoryManagement.InventoryReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getModifyQuantityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.smartWarehouse.inventoryManagement.InventoryRequest,
                grpc.smartWarehouse.inventoryManagement.InventoryReply>(
                  this, METHODID_CHECK_ITEM)))
          .addMethod(
            getModifyQuantityMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.smartWarehouse.inventoryManagement.InventoryRequest,
                grpc.smartWarehouse.inventoryManagement.InventoryReply>(
                  this, METHODID_MODIFY_QUANTITY)))
          .build();
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class InventoryManagementStub extends io.grpc.stub.AbstractStub<InventoryManagementStub> {
    private InventoryManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryManagementStub(channel, callOptions);
    }

    /**
     */
    public void checkItem(grpc.smartWarehouse.inventoryManagement.InventoryRequest request,
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.inventoryManagement.InventoryReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.smartWarehouse.inventoryManagement.InventoryRequest> modifyQuantity(
        io.grpc.stub.StreamObserver<grpc.smartWarehouse.inventoryManagement.InventoryReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getModifyQuantityMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class InventoryManagementBlockingStub extends io.grpc.stub.AbstractStub<InventoryManagementBlockingStub> {
    private InventoryManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryManagementBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.smartWarehouse.inventoryManagement.InventoryReply checkItem(grpc.smartWarehouse.inventoryManagement.InventoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckItemMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service Definition
   * </pre>
   */
  public static final class InventoryManagementFutureStub extends io.grpc.stub.AbstractStub<InventoryManagementFutureStub> {
    private InventoryManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryManagementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.smartWarehouse.inventoryManagement.InventoryReply> checkItem(
        grpc.smartWarehouse.inventoryManagement.InventoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_ITEM = 0;
  private static final int METHODID_MODIFY_QUANTITY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InventoryManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventoryManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_ITEM:
          serviceImpl.checkItem((grpc.smartWarehouse.inventoryManagement.InventoryRequest) request,
              (io.grpc.stub.StreamObserver<grpc.smartWarehouse.inventoryManagement.InventoryReply>) responseObserver);
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
        case METHODID_MODIFY_QUANTITY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.modifyQuantity(
              (io.grpc.stub.StreamObserver<grpc.smartWarehouse.inventoryManagement.InventoryReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InventoryManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.smartWarehouse.inventoryManagement.InventoryManagementServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryManagement");
    }
  }

  private static final class InventoryManagementFileDescriptorSupplier
      extends InventoryManagementBaseDescriptorSupplier {
    InventoryManagementFileDescriptorSupplier() {}
  }

  private static final class InventoryManagementMethodDescriptorSupplier
      extends InventoryManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventoryManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (InventoryManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryManagementFileDescriptorSupplier())
              .addMethod(getCheckItemMethod())
              .addMethod(getModifyQuantityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
