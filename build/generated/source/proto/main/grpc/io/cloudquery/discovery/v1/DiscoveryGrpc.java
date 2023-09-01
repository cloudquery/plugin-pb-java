package io.cloudquery.discovery.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: cloudquery/discovery/v1/discovery.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DiscoveryGrpc {

  private DiscoveryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cloudquery.discovery.v1.Discovery";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.cloudquery.discovery.v1.GetVersions.Request,
      io.cloudquery.discovery.v1.GetVersions.Response> getGetVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVersions",
      requestType = io.cloudquery.discovery.v1.GetVersions.Request.class,
      responseType = io.cloudquery.discovery.v1.GetVersions.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudquery.discovery.v1.GetVersions.Request,
      io.cloudquery.discovery.v1.GetVersions.Response> getGetVersionsMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.discovery.v1.GetVersions.Request, io.cloudquery.discovery.v1.GetVersions.Response> getGetVersionsMethod;
    if ((getGetVersionsMethod = DiscoveryGrpc.getGetVersionsMethod) == null) {
      synchronized (DiscoveryGrpc.class) {
        if ((getGetVersionsMethod = DiscoveryGrpc.getGetVersionsMethod) == null) {
          DiscoveryGrpc.getGetVersionsMethod = getGetVersionsMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.discovery.v1.GetVersions.Request, io.cloudquery.discovery.v1.GetVersions.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.discovery.v1.GetVersions.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.discovery.v1.GetVersions.Response.getDefaultInstance()))
              .setSchemaDescriptor(new DiscoveryMethodDescriptorSupplier("GetVersions"))
              .build();
        }
      }
    }
    return getGetVersionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiscoveryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryStub>() {
        @java.lang.Override
        public DiscoveryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryStub(channel, callOptions);
        }
      };
    return DiscoveryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiscoveryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryBlockingStub>() {
        @java.lang.Override
        public DiscoveryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryBlockingStub(channel, callOptions);
        }
      };
    return DiscoveryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiscoveryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryFutureStub>() {
        @java.lang.Override
        public DiscoveryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryFutureStub(channel, callOptions);
        }
      };
    return DiscoveryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get the name of the plugin
     * </pre>
     */
    default void getVersions(io.cloudquery.discovery.v1.GetVersions.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.discovery.v1.GetVersions.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVersionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Discovery.
   */
  public static abstract class DiscoveryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DiscoveryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Discovery.
   */
  public static final class DiscoveryStub
      extends io.grpc.stub.AbstractAsyncStub<DiscoveryStub> {
    private DiscoveryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the name of the plugin
     * </pre>
     */
    public void getVersions(io.cloudquery.discovery.v1.GetVersions.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.discovery.v1.GetVersions.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVersionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Discovery.
   */
  public static final class DiscoveryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DiscoveryBlockingStub> {
    private DiscoveryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the name of the plugin
     * </pre>
     */
    public io.cloudquery.discovery.v1.GetVersions.Response getVersions(io.cloudquery.discovery.v1.GetVersions.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVersionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Discovery.
   */
  public static final class DiscoveryFutureStub
      extends io.grpc.stub.AbstractFutureStub<DiscoveryFutureStub> {
    private DiscoveryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the name of the plugin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudquery.discovery.v1.GetVersions.Response> getVersions(
        io.cloudquery.discovery.v1.GetVersions.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVersionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VERSIONS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VERSIONS:
          serviceImpl.getVersions((io.cloudquery.discovery.v1.GetVersions.Request) request,
              (io.grpc.stub.StreamObserver<io.cloudquery.discovery.v1.GetVersions.Response>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetVersionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cloudquery.discovery.v1.GetVersions.Request,
              io.cloudquery.discovery.v1.GetVersions.Response>(
                service, METHODID_GET_VERSIONS)))
        .build();
  }

  private static abstract class DiscoveryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiscoveryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.cloudquery.discovery.v1.DiscoveryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Discovery");
    }
  }

  private static final class DiscoveryFileDescriptorSupplier
      extends DiscoveryBaseDescriptorSupplier {
    DiscoveryFileDescriptorSupplier() {}
  }

  private static final class DiscoveryMethodDescriptorSupplier
      extends DiscoveryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DiscoveryMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DiscoveryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiscoveryFileDescriptorSupplier())
              .addMethod(getGetVersionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
