package cloudquery.plugin.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.0)",
    comments = "Source: cloudquery/plugin/v3/plugin.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PluginGrpc {

  private PluginGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cloudquery.plugin.v3.Plugin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.GetName.Request,
      cloudquery.plugin.v3.PluginOuterClass.GetName.Response> getGetNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetName",
      requestType = cloudquery.plugin.v3.PluginOuterClass.GetName.Request.class,
      responseType = cloudquery.plugin.v3.PluginOuterClass.GetName.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.GetName.Request,
      cloudquery.plugin.v3.PluginOuterClass.GetName.Response> getGetNameMethod() {
    io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.GetName.Request, cloudquery.plugin.v3.PluginOuterClass.GetName.Response> getGetNameMethod;
    if ((getGetNameMethod = PluginGrpc.getGetNameMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getGetNameMethod = PluginGrpc.getGetNameMethod) == null) {
          PluginGrpc.getGetNameMethod = getGetNameMethod =
              io.grpc.MethodDescriptor.<cloudquery.plugin.v3.PluginOuterClass.GetName.Request, cloudquery.plugin.v3.PluginOuterClass.GetName.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.GetName.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.GetName.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("GetName"))
              .build();
        }
      }
    }
    return getGetNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request,
      cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response> getGetVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVersion",
      requestType = cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request.class,
      responseType = cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request,
      cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response> getGetVersionMethod() {
    io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request, cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response> getGetVersionMethod;
    if ((getGetVersionMethod = PluginGrpc.getGetVersionMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getGetVersionMethod = PluginGrpc.getGetVersionMethod) == null) {
          PluginGrpc.getGetVersionMethod = getGetVersionMethod =
              io.grpc.MethodDescriptor.<cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request, cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("GetVersion"))
              .build();
        }
      }
    }
    return getGetVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Init.Request,
      cloudquery.plugin.v3.PluginOuterClass.Init.Response> getInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Init",
      requestType = cloudquery.plugin.v3.PluginOuterClass.Init.Request.class,
      responseType = cloudquery.plugin.v3.PluginOuterClass.Init.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Init.Request,
      cloudquery.plugin.v3.PluginOuterClass.Init.Response> getInitMethod() {
    io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Init.Request, cloudquery.plugin.v3.PluginOuterClass.Init.Response> getInitMethod;
    if ((getInitMethod = PluginGrpc.getInitMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getInitMethod = PluginGrpc.getInitMethod) == null) {
          PluginGrpc.getInitMethod = getInitMethod =
              io.grpc.MethodDescriptor.<cloudquery.plugin.v3.PluginOuterClass.Init.Request, cloudquery.plugin.v3.PluginOuterClass.Init.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Init"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.Init.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.Init.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("Init"))
              .build();
        }
      }
    }
    return getInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.GetTables.Request,
      cloudquery.plugin.v3.PluginOuterClass.GetTables.Response> getGetTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTables",
      requestType = cloudquery.plugin.v3.PluginOuterClass.GetTables.Request.class,
      responseType = cloudquery.plugin.v3.PluginOuterClass.GetTables.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.GetTables.Request,
      cloudquery.plugin.v3.PluginOuterClass.GetTables.Response> getGetTablesMethod() {
    io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.GetTables.Request, cloudquery.plugin.v3.PluginOuterClass.GetTables.Response> getGetTablesMethod;
    if ((getGetTablesMethod = PluginGrpc.getGetTablesMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getGetTablesMethod = PluginGrpc.getGetTablesMethod) == null) {
          PluginGrpc.getGetTablesMethod = getGetTablesMethod =
              io.grpc.MethodDescriptor.<cloudquery.plugin.v3.PluginOuterClass.GetTables.Request, cloudquery.plugin.v3.PluginOuterClass.GetTables.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.GetTables.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.GetTables.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("GetTables"))
              .build();
        }
      }
    }
    return getGetTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Sync.Request,
      cloudquery.plugin.v3.PluginOuterClass.Sync.Response> getSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sync",
      requestType = cloudquery.plugin.v3.PluginOuterClass.Sync.Request.class,
      responseType = cloudquery.plugin.v3.PluginOuterClass.Sync.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Sync.Request,
      cloudquery.plugin.v3.PluginOuterClass.Sync.Response> getSyncMethod() {
    io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Sync.Request, cloudquery.plugin.v3.PluginOuterClass.Sync.Response> getSyncMethod;
    if ((getSyncMethod = PluginGrpc.getSyncMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getSyncMethod = PluginGrpc.getSyncMethod) == null) {
          PluginGrpc.getSyncMethod = getSyncMethod =
              io.grpc.MethodDescriptor.<cloudquery.plugin.v3.PluginOuterClass.Sync.Request, cloudquery.plugin.v3.PluginOuterClass.Sync.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.Sync.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.Sync.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("Sync"))
              .build();
        }
      }
    }
    return getSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Read.Request,
      cloudquery.plugin.v3.PluginOuterClass.Read.Response> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = cloudquery.plugin.v3.PluginOuterClass.Read.Request.class,
      responseType = cloudquery.plugin.v3.PluginOuterClass.Read.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Read.Request,
      cloudquery.plugin.v3.PluginOuterClass.Read.Response> getReadMethod() {
    io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Read.Request, cloudquery.plugin.v3.PluginOuterClass.Read.Response> getReadMethod;
    if ((getReadMethod = PluginGrpc.getReadMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getReadMethod = PluginGrpc.getReadMethod) == null) {
          PluginGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<cloudquery.plugin.v3.PluginOuterClass.Read.Request, cloudquery.plugin.v3.PluginOuterClass.Read.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.Read.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.Read.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Write.Request,
      cloudquery.plugin.v3.PluginOuterClass.Write.Response> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = cloudquery.plugin.v3.PluginOuterClass.Write.Request.class,
      responseType = cloudquery.plugin.v3.PluginOuterClass.Write.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Write.Request,
      cloudquery.plugin.v3.PluginOuterClass.Write.Response> getWriteMethod() {
    io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Write.Request, cloudquery.plugin.v3.PluginOuterClass.Write.Response> getWriteMethod;
    if ((getWriteMethod = PluginGrpc.getWriteMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getWriteMethod = PluginGrpc.getWriteMethod) == null) {
          PluginGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<cloudquery.plugin.v3.PluginOuterClass.Write.Request, cloudquery.plugin.v3.PluginOuterClass.Write.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.Write.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.Write.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Close.Request,
      cloudquery.plugin.v3.PluginOuterClass.Close.Response> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = cloudquery.plugin.v3.PluginOuterClass.Close.Request.class,
      responseType = cloudquery.plugin.v3.PluginOuterClass.Close.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Close.Request,
      cloudquery.plugin.v3.PluginOuterClass.Close.Response> getCloseMethod() {
    io.grpc.MethodDescriptor<cloudquery.plugin.v3.PluginOuterClass.Close.Request, cloudquery.plugin.v3.PluginOuterClass.Close.Response> getCloseMethod;
    if ((getCloseMethod = PluginGrpc.getCloseMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getCloseMethod = PluginGrpc.getCloseMethod) == null) {
          PluginGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<cloudquery.plugin.v3.PluginOuterClass.Close.Request, cloudquery.plugin.v3.PluginOuterClass.Close.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.Close.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cloudquery.plugin.v3.PluginOuterClass.Close.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PluginStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PluginStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PluginStub>() {
        @java.lang.Override
        public PluginStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PluginStub(channel, callOptions);
        }
      };
    return PluginStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PluginBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PluginBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PluginBlockingStub>() {
        @java.lang.Override
        public PluginBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PluginBlockingStub(channel, callOptions);
        }
      };
    return PluginBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PluginFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PluginFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PluginFutureStub>() {
        @java.lang.Override
        public PluginFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PluginFutureStub(channel, callOptions);
        }
      };
    return PluginFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get the name of the plugin
     * </pre>
     */
    default void getName(cloudquery.plugin.v3.PluginOuterClass.GetName.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.GetName.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the current version of the plugin
     * </pre>
     */
    default void getVersion(cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Configure the plugin with the given credentials and mode
     * </pre>
     */
    default void init(cloudquery.plugin.v3.PluginOuterClass.Init.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Init.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all tables the source plugin supports. Must be called after Init
     * </pre>
     */
    default void getTables(cloudquery.plugin.v3.PluginOuterClass.GetTables.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.GetTables.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTablesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start a sync on the source plugin. It streams messages as output.
     * </pre>
     */
    default void sync(cloudquery.plugin.v3.PluginOuterClass.Sync.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Sync.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start a Read on the source plugin for a given table and schema. It streams messages as output.
     * The plugin assume that that schema was used to also write the data beforehand
     * </pre>
     */
    default void read(cloudquery.plugin.v3.PluginOuterClass.Read.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Read.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Write resources. Write is the mirror of Sync, expecting a stream of messages as input.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Write.Request> write(
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Write.Response> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWriteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send signal to flush and close open connections
     * </pre>
     */
    default void close(cloudquery.plugin.v3.PluginOuterClass.Close.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Close.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Plugin.
   */
  public static abstract class PluginImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PluginGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Plugin.
   */
  public static final class PluginStub
      extends io.grpc.stub.AbstractAsyncStub<PluginStub> {
    private PluginStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PluginStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PluginStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the name of the plugin
     * </pre>
     */
    public void getName(cloudquery.plugin.v3.PluginOuterClass.GetName.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.GetName.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the current version of the plugin
     * </pre>
     */
    public void getVersion(cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configure the plugin with the given credentials and mode
     * </pre>
     */
    public void init(cloudquery.plugin.v3.PluginOuterClass.Init.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Init.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all tables the source plugin supports. Must be called after Init
     * </pre>
     */
    public void getTables(cloudquery.plugin.v3.PluginOuterClass.GetTables.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.GetTables.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start a sync on the source plugin. It streams messages as output.
     * </pre>
     */
    public void sync(cloudquery.plugin.v3.PluginOuterClass.Sync.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Sync.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start a Read on the source plugin for a given table and schema. It streams messages as output.
     * The plugin assume that that schema was used to also write the data beforehand
     * </pre>
     */
    public void read(cloudquery.plugin.v3.PluginOuterClass.Read.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Read.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Write resources. Write is the mirror of Sync, expecting a stream of messages as input.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Write.Request> write(
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Write.Response> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Send signal to flush and close open connections
     * </pre>
     */
    public void close(cloudquery.plugin.v3.PluginOuterClass.Close.Request request,
        io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Close.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Plugin.
   */
  public static final class PluginBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PluginBlockingStub> {
    private PluginBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PluginBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PluginBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the name of the plugin
     * </pre>
     */
    public cloudquery.plugin.v3.PluginOuterClass.GetName.Response getName(cloudquery.plugin.v3.PluginOuterClass.GetName.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the current version of the plugin
     * </pre>
     */
    public cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response getVersion(cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Configure the plugin with the given credentials and mode
     * </pre>
     */
    public cloudquery.plugin.v3.PluginOuterClass.Init.Response init(cloudquery.plugin.v3.PluginOuterClass.Init.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all tables the source plugin supports. Must be called after Init
     * </pre>
     */
    public cloudquery.plugin.v3.PluginOuterClass.GetTables.Response getTables(cloudquery.plugin.v3.PluginOuterClass.GetTables.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start a sync on the source plugin. It streams messages as output.
     * </pre>
     */
    public java.util.Iterator<cloudquery.plugin.v3.PluginOuterClass.Sync.Response> sync(
        cloudquery.plugin.v3.PluginOuterClass.Sync.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSyncMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start a Read on the source plugin for a given table and schema. It streams messages as output.
     * The plugin assume that that schema was used to also write the data beforehand
     * </pre>
     */
    public java.util.Iterator<cloudquery.plugin.v3.PluginOuterClass.Read.Response> read(
        cloudquery.plugin.v3.PluginOuterClass.Read.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send signal to flush and close open connections
     * </pre>
     */
    public cloudquery.plugin.v3.PluginOuterClass.Close.Response close(cloudquery.plugin.v3.PluginOuterClass.Close.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Plugin.
   */
  public static final class PluginFutureStub
      extends io.grpc.stub.AbstractFutureStub<PluginFutureStub> {
    private PluginFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PluginFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PluginFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the name of the plugin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudquery.plugin.v3.PluginOuterClass.GetName.Response> getName(
        cloudquery.plugin.v3.PluginOuterClass.GetName.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the current version of the plugin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response> getVersion(
        cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Configure the plugin with the given credentials and mode
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudquery.plugin.v3.PluginOuterClass.Init.Response> init(
        cloudquery.plugin.v3.PluginOuterClass.Init.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all tables the source plugin supports. Must be called after Init
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudquery.plugin.v3.PluginOuterClass.GetTables.Response> getTables(
        cloudquery.plugin.v3.PluginOuterClass.GetTables.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send signal to flush and close open connections
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cloudquery.plugin.v3.PluginOuterClass.Close.Response> close(
        cloudquery.plugin.v3.PluginOuterClass.Close.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NAME = 0;
  private static final int METHODID_GET_VERSION = 1;
  private static final int METHODID_INIT = 2;
  private static final int METHODID_GET_TABLES = 3;
  private static final int METHODID_SYNC = 4;
  private static final int METHODID_READ = 5;
  private static final int METHODID_CLOSE = 6;
  private static final int METHODID_WRITE = 7;

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
        case METHODID_GET_NAME:
          serviceImpl.getName((cloudquery.plugin.v3.PluginOuterClass.GetName.Request) request,
              (io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.GetName.Response>) responseObserver);
          break;
        case METHODID_GET_VERSION:
          serviceImpl.getVersion((cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request) request,
              (io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response>) responseObserver);
          break;
        case METHODID_INIT:
          serviceImpl.init((cloudquery.plugin.v3.PluginOuterClass.Init.Request) request,
              (io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Init.Response>) responseObserver);
          break;
        case METHODID_GET_TABLES:
          serviceImpl.getTables((cloudquery.plugin.v3.PluginOuterClass.GetTables.Request) request,
              (io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.GetTables.Response>) responseObserver);
          break;
        case METHODID_SYNC:
          serviceImpl.sync((cloudquery.plugin.v3.PluginOuterClass.Sync.Request) request,
              (io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Sync.Response>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((cloudquery.plugin.v3.PluginOuterClass.Read.Request) request,
              (io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Read.Response>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((cloudquery.plugin.v3.PluginOuterClass.Close.Request) request,
              (io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Close.Response>) responseObserver);
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
        case METHODID_WRITE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.write(
              (io.grpc.stub.StreamObserver<cloudquery.plugin.v3.PluginOuterClass.Write.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloudquery.plugin.v3.PluginOuterClass.GetName.Request,
              cloudquery.plugin.v3.PluginOuterClass.GetName.Response>(
                service, METHODID_GET_NAME)))
        .addMethod(
          getGetVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloudquery.plugin.v3.PluginOuterClass.GetVersion.Request,
              cloudquery.plugin.v3.PluginOuterClass.GetVersion.Response>(
                service, METHODID_GET_VERSION)))
        .addMethod(
          getInitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloudquery.plugin.v3.PluginOuterClass.Init.Request,
              cloudquery.plugin.v3.PluginOuterClass.Init.Response>(
                service, METHODID_INIT)))
        .addMethod(
          getGetTablesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloudquery.plugin.v3.PluginOuterClass.GetTables.Request,
              cloudquery.plugin.v3.PluginOuterClass.GetTables.Response>(
                service, METHODID_GET_TABLES)))
        .addMethod(
          getSyncMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              cloudquery.plugin.v3.PluginOuterClass.Sync.Request,
              cloudquery.plugin.v3.PluginOuterClass.Sync.Response>(
                service, METHODID_SYNC)))
        .addMethod(
          getReadMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              cloudquery.plugin.v3.PluginOuterClass.Read.Request,
              cloudquery.plugin.v3.PluginOuterClass.Read.Response>(
                service, METHODID_READ)))
        .addMethod(
          getWriteMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              cloudquery.plugin.v3.PluginOuterClass.Write.Request,
              cloudquery.plugin.v3.PluginOuterClass.Write.Response>(
                service, METHODID_WRITE)))
        .addMethod(
          getCloseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cloudquery.plugin.v3.PluginOuterClass.Close.Request,
              cloudquery.plugin.v3.PluginOuterClass.Close.Response>(
                service, METHODID_CLOSE)))
        .build();
  }

  private static abstract class PluginBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PluginBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cloudquery.plugin.v3.PluginOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Plugin");
    }
  }

  private static final class PluginFileDescriptorSupplier
      extends PluginBaseDescriptorSupplier {
    PluginFileDescriptorSupplier() {}
  }

  private static final class PluginMethodDescriptorSupplier
      extends PluginBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PluginMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PluginGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PluginFileDescriptorSupplier())
              .addMethod(getGetNameMethod())
              .addMethod(getGetVersionMethod())
              .addMethod(getInitMethod())
              .addMethod(getGetTablesMethod())
              .addMethod(getSyncMethod())
              .addMethod(getReadMethod())
              .addMethod(getWriteMethod())
              .addMethod(getCloseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
