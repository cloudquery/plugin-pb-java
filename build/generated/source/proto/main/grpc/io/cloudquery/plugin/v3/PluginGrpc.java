package io.cloudquery.plugin.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.0)",
    comments = "Source: cloudquery/plugin/v3/plugin.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PluginGrpc {

  private PluginGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cloudquery.plugin.v3.Plugin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetName.Request,
      io.cloudquery.plugin.v3.GetName.Response> getGetNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetName",
      requestType = io.cloudquery.plugin.v3.GetName.Request.class,
      responseType = io.cloudquery.plugin.v3.GetName.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetName.Request,
      io.cloudquery.plugin.v3.GetName.Response> getGetNameMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetName.Request, io.cloudquery.plugin.v3.GetName.Response> getGetNameMethod;
    if ((getGetNameMethod = PluginGrpc.getGetNameMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getGetNameMethod = PluginGrpc.getGetNameMethod) == null) {
          PluginGrpc.getGetNameMethod = getGetNameMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.GetName.Request, io.cloudquery.plugin.v3.GetName.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.GetName.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.GetName.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("GetName"))
              .build();
        }
      }
    }
    return getGetNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetVersion.Request,
      io.cloudquery.plugin.v3.GetVersion.Response> getGetVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVersion",
      requestType = io.cloudquery.plugin.v3.GetVersion.Request.class,
      responseType = io.cloudquery.plugin.v3.GetVersion.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetVersion.Request,
      io.cloudquery.plugin.v3.GetVersion.Response> getGetVersionMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetVersion.Request, io.cloudquery.plugin.v3.GetVersion.Response> getGetVersionMethod;
    if ((getGetVersionMethod = PluginGrpc.getGetVersionMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getGetVersionMethod = PluginGrpc.getGetVersionMethod) == null) {
          PluginGrpc.getGetVersionMethod = getGetVersionMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.GetVersion.Request, io.cloudquery.plugin.v3.GetVersion.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.GetVersion.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.GetVersion.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("GetVersion"))
              .build();
        }
      }
    }
    return getGetVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetSpecSchema.Request,
      io.cloudquery.plugin.v3.GetSpecSchema.Response> getGetSpecSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpecSchema",
      requestType = io.cloudquery.plugin.v3.GetSpecSchema.Request.class,
      responseType = io.cloudquery.plugin.v3.GetSpecSchema.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetSpecSchema.Request,
      io.cloudquery.plugin.v3.GetSpecSchema.Response> getGetSpecSchemaMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetSpecSchema.Request, io.cloudquery.plugin.v3.GetSpecSchema.Response> getGetSpecSchemaMethod;
    if ((getGetSpecSchemaMethod = PluginGrpc.getGetSpecSchemaMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getGetSpecSchemaMethod = PluginGrpc.getGetSpecSchemaMethod) == null) {
          PluginGrpc.getGetSpecSchemaMethod = getGetSpecSchemaMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.GetSpecSchema.Request, io.cloudquery.plugin.v3.GetSpecSchema.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpecSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.GetSpecSchema.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.GetSpecSchema.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("GetSpecSchema"))
              .build();
        }
      }
    }
    return getGetSpecSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Init.Request,
      io.cloudquery.plugin.v3.Init.Response> getInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Init",
      requestType = io.cloudquery.plugin.v3.Init.Request.class,
      responseType = io.cloudquery.plugin.v3.Init.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Init.Request,
      io.cloudquery.plugin.v3.Init.Response> getInitMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Init.Request, io.cloudquery.plugin.v3.Init.Response> getInitMethod;
    if ((getInitMethod = PluginGrpc.getInitMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getInitMethod = PluginGrpc.getInitMethod) == null) {
          PluginGrpc.getInitMethod = getInitMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.Init.Request, io.cloudquery.plugin.v3.Init.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Init"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Init.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Init.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("Init"))
              .build();
        }
      }
    }
    return getInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetTables.Request,
      io.cloudquery.plugin.v3.GetTables.Response> getGetTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTables",
      requestType = io.cloudquery.plugin.v3.GetTables.Request.class,
      responseType = io.cloudquery.plugin.v3.GetTables.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetTables.Request,
      io.cloudquery.plugin.v3.GetTables.Response> getGetTablesMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.GetTables.Request, io.cloudquery.plugin.v3.GetTables.Response> getGetTablesMethod;
    if ((getGetTablesMethod = PluginGrpc.getGetTablesMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getGetTablesMethod = PluginGrpc.getGetTablesMethod) == null) {
          PluginGrpc.getGetTablesMethod = getGetTablesMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.GetTables.Request, io.cloudquery.plugin.v3.GetTables.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.GetTables.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.GetTables.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("GetTables"))
              .build();
        }
      }
    }
    return getGetTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Sync.Request,
      io.cloudquery.plugin.v3.Sync.Response> getSyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sync",
      requestType = io.cloudquery.plugin.v3.Sync.Request.class,
      responseType = io.cloudquery.plugin.v3.Sync.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Sync.Request,
      io.cloudquery.plugin.v3.Sync.Response> getSyncMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Sync.Request, io.cloudquery.plugin.v3.Sync.Response> getSyncMethod;
    if ((getSyncMethod = PluginGrpc.getSyncMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getSyncMethod = PluginGrpc.getSyncMethod) == null) {
          PluginGrpc.getSyncMethod = getSyncMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.Sync.Request, io.cloudquery.plugin.v3.Sync.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Sync.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Sync.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("Sync"))
              .build();
        }
      }
    }
    return getSyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Read.Request,
      io.cloudquery.plugin.v3.Read.Response> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = io.cloudquery.plugin.v3.Read.Request.class,
      responseType = io.cloudquery.plugin.v3.Read.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Read.Request,
      io.cloudquery.plugin.v3.Read.Response> getReadMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Read.Request, io.cloudquery.plugin.v3.Read.Response> getReadMethod;
    if ((getReadMethod = PluginGrpc.getReadMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getReadMethod = PluginGrpc.getReadMethod) == null) {
          PluginGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.Read.Request, io.cloudquery.plugin.v3.Read.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Read.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Read.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Write.Request,
      io.cloudquery.plugin.v3.Write.Response> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = io.cloudquery.plugin.v3.Write.Request.class,
      responseType = io.cloudquery.plugin.v3.Write.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Write.Request,
      io.cloudquery.plugin.v3.Write.Response> getWriteMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Write.Request, io.cloudquery.plugin.v3.Write.Response> getWriteMethod;
    if ((getWriteMethod = PluginGrpc.getWriteMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getWriteMethod = PluginGrpc.getWriteMethod) == null) {
          PluginGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.Write.Request, io.cloudquery.plugin.v3.Write.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Write.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Write.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Transform.Request,
      io.cloudquery.plugin.v3.Transform.Response> getTransformMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transform",
      requestType = io.cloudquery.plugin.v3.Transform.Request.class,
      responseType = io.cloudquery.plugin.v3.Transform.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Transform.Request,
      io.cloudquery.plugin.v3.Transform.Response> getTransformMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Transform.Request, io.cloudquery.plugin.v3.Transform.Response> getTransformMethod;
    if ((getTransformMethod = PluginGrpc.getTransformMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getTransformMethod = PluginGrpc.getTransformMethod) == null) {
          PluginGrpc.getTransformMethod = getTransformMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.Transform.Request, io.cloudquery.plugin.v3.Transform.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transform"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Transform.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Transform.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("Transform"))
              .build();
        }
      }
    }
    return getTransformMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.TransformSchema.Request,
      io.cloudquery.plugin.v3.TransformSchema.Response> getTransformSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransformSchema",
      requestType = io.cloudquery.plugin.v3.TransformSchema.Request.class,
      responseType = io.cloudquery.plugin.v3.TransformSchema.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.TransformSchema.Request,
      io.cloudquery.plugin.v3.TransformSchema.Response> getTransformSchemaMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.TransformSchema.Request, io.cloudquery.plugin.v3.TransformSchema.Response> getTransformSchemaMethod;
    if ((getTransformSchemaMethod = PluginGrpc.getTransformSchemaMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getTransformSchemaMethod = PluginGrpc.getTransformSchemaMethod) == null) {
          PluginGrpc.getTransformSchemaMethod = getTransformSchemaMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.TransformSchema.Request, io.cloudquery.plugin.v3.TransformSchema.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransformSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.TransformSchema.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.TransformSchema.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("TransformSchema"))
              .build();
        }
      }
    }
    return getTransformSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Close.Request,
      io.cloudquery.plugin.v3.Close.Response> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = io.cloudquery.plugin.v3.Close.Request.class,
      responseType = io.cloudquery.plugin.v3.Close.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Close.Request,
      io.cloudquery.plugin.v3.Close.Response> getCloseMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.Close.Request, io.cloudquery.plugin.v3.Close.Response> getCloseMethod;
    if ((getCloseMethod = PluginGrpc.getCloseMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getCloseMethod = PluginGrpc.getCloseMethod) == null) {
          PluginGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.Close.Request, io.cloudquery.plugin.v3.Close.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Close.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.Close.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.TestConnection.Request,
      io.cloudquery.plugin.v3.TestConnection.Response> getTestConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestConnection",
      requestType = io.cloudquery.plugin.v3.TestConnection.Request.class,
      responseType = io.cloudquery.plugin.v3.TestConnection.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.TestConnection.Request,
      io.cloudquery.plugin.v3.TestConnection.Response> getTestConnectionMethod() {
    io.grpc.MethodDescriptor<io.cloudquery.plugin.v3.TestConnection.Request, io.cloudquery.plugin.v3.TestConnection.Response> getTestConnectionMethod;
    if ((getTestConnectionMethod = PluginGrpc.getTestConnectionMethod) == null) {
      synchronized (PluginGrpc.class) {
        if ((getTestConnectionMethod = PluginGrpc.getTestConnectionMethod) == null) {
          PluginGrpc.getTestConnectionMethod = getTestConnectionMethod =
              io.grpc.MethodDescriptor.<io.cloudquery.plugin.v3.TestConnection.Request, io.cloudquery.plugin.v3.TestConnection.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.TestConnection.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudquery.plugin.v3.TestConnection.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PluginMethodDescriptorSupplier("TestConnection"))
              .build();
        }
      }
    }
    return getTestConnectionMethod;
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
    default void getName(io.cloudquery.plugin.v3.GetName.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetName.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the current version of the plugin
     * </pre>
     */
    default void getVersion(io.cloudquery.plugin.v3.GetVersion.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetVersion.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get plugin spec schema.
     * This will allow validating the input even before calling Init.
     * Should be called before Init.
     * </pre>
     */
    default void getSpecSchema(io.cloudquery.plugin.v3.GetSpecSchema.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetSpecSchema.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSpecSchemaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Configure the plugin with the given credentials and mode
     * </pre>
     */
    default void init(io.cloudquery.plugin.v3.Init.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Init.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all tables the source plugin supports. Must be called after Init
     * </pre>
     */
    default void getTables(io.cloudquery.plugin.v3.GetTables.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetTables.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTablesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start a sync on the source plugin. It streams messages as output.
     * </pre>
     */
    default void sync(io.cloudquery.plugin.v3.Sync.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Sync.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start a Read on the source plugin for a given table and schema. It streams messages as output.
     * The plugin assume that that schema was used to also write the data beforehand
     * </pre>
     */
    default void read(io.cloudquery.plugin.v3.Read.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Read.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Write resources. Write is the mirror of Sync, expecting a stream of messages as input.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Write.Request> write(
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Write.Response> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWriteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transform resources.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Transform.Request> transform(
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Transform.Response> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTransformMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transform schemas.
     * </pre>
     */
    default void transformSchema(io.cloudquery.plugin.v3.TransformSchema.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.TransformSchema.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransformSchemaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send signal to flush and close open connections
     * </pre>
     */
    default void close(io.cloudquery.plugin.v3.Close.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Close.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate and test the connections used by the plugin
     * </pre>
     */
    default void testConnection(io.cloudquery.plugin.v3.TestConnection.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.TestConnection.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestConnectionMethod(), responseObserver);
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
    public void getName(io.cloudquery.plugin.v3.GetName.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetName.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the current version of the plugin
     * </pre>
     */
    public void getVersion(io.cloudquery.plugin.v3.GetVersion.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetVersion.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get plugin spec schema.
     * This will allow validating the input even before calling Init.
     * Should be called before Init.
     * </pre>
     */
    public void getSpecSchema(io.cloudquery.plugin.v3.GetSpecSchema.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetSpecSchema.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSpecSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Configure the plugin with the given credentials and mode
     * </pre>
     */
    public void init(io.cloudquery.plugin.v3.Init.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Init.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all tables the source plugin supports. Must be called after Init
     * </pre>
     */
    public void getTables(io.cloudquery.plugin.v3.GetTables.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetTables.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start a sync on the source plugin. It streams messages as output.
     * </pre>
     */
    public void sync(io.cloudquery.plugin.v3.Sync.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Sync.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start a Read on the source plugin for a given table and schema. It streams messages as output.
     * The plugin assume that that schema was used to also write the data beforehand
     * </pre>
     */
    public void read(io.cloudquery.plugin.v3.Read.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Read.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Write resources. Write is the mirror of Sync, expecting a stream of messages as input.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Write.Request> write(
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Write.Response> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Transform resources.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Transform.Request> transform(
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Transform.Response> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getTransformMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Transform schemas.
     * </pre>
     */
    public void transformSchema(io.cloudquery.plugin.v3.TransformSchema.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.TransformSchema.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransformSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send signal to flush and close open connections
     * </pre>
     */
    public void close(io.cloudquery.plugin.v3.Close.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Close.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate and test the connections used by the plugin
     * </pre>
     */
    public void testConnection(io.cloudquery.plugin.v3.TestConnection.Request request,
        io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.TestConnection.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestConnectionMethod(), getCallOptions()), request, responseObserver);
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
    public io.cloudquery.plugin.v3.GetName.Response getName(io.cloudquery.plugin.v3.GetName.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the current version of the plugin
     * </pre>
     */
    public io.cloudquery.plugin.v3.GetVersion.Response getVersion(io.cloudquery.plugin.v3.GetVersion.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get plugin spec schema.
     * This will allow validating the input even before calling Init.
     * Should be called before Init.
     * </pre>
     */
    public io.cloudquery.plugin.v3.GetSpecSchema.Response getSpecSchema(io.cloudquery.plugin.v3.GetSpecSchema.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSpecSchemaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Configure the plugin with the given credentials and mode
     * </pre>
     */
    public io.cloudquery.plugin.v3.Init.Response init(io.cloudquery.plugin.v3.Init.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all tables the source plugin supports. Must be called after Init
     * </pre>
     */
    public io.cloudquery.plugin.v3.GetTables.Response getTables(io.cloudquery.plugin.v3.GetTables.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start a sync on the source plugin. It streams messages as output.
     * </pre>
     */
    public java.util.Iterator<io.cloudquery.plugin.v3.Sync.Response> sync(
        io.cloudquery.plugin.v3.Sync.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSyncMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start a Read on the source plugin for a given table and schema. It streams messages as output.
     * The plugin assume that that schema was used to also write the data beforehand
     * </pre>
     */
    public java.util.Iterator<io.cloudquery.plugin.v3.Read.Response> read(
        io.cloudquery.plugin.v3.Read.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transform schemas.
     * </pre>
     */
    public io.cloudquery.plugin.v3.TransformSchema.Response transformSchema(io.cloudquery.plugin.v3.TransformSchema.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransformSchemaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send signal to flush and close open connections
     * </pre>
     */
    public io.cloudquery.plugin.v3.Close.Response close(io.cloudquery.plugin.v3.Close.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate and test the connections used by the plugin
     * </pre>
     */
    public io.cloudquery.plugin.v3.TestConnection.Response testConnection(io.cloudquery.plugin.v3.TestConnection.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestConnectionMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<io.cloudquery.plugin.v3.GetName.Response> getName(
        io.cloudquery.plugin.v3.GetName.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the current version of the plugin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudquery.plugin.v3.GetVersion.Response> getVersion(
        io.cloudquery.plugin.v3.GetVersion.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get plugin spec schema.
     * This will allow validating the input even before calling Init.
     * Should be called before Init.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudquery.plugin.v3.GetSpecSchema.Response> getSpecSchema(
        io.cloudquery.plugin.v3.GetSpecSchema.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSpecSchemaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Configure the plugin with the given credentials and mode
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudquery.plugin.v3.Init.Response> init(
        io.cloudquery.plugin.v3.Init.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all tables the source plugin supports. Must be called after Init
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudquery.plugin.v3.GetTables.Response> getTables(
        io.cloudquery.plugin.v3.GetTables.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transform schemas.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudquery.plugin.v3.TransformSchema.Response> transformSchema(
        io.cloudquery.plugin.v3.TransformSchema.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransformSchemaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send signal to flush and close open connections
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudquery.plugin.v3.Close.Response> close(
        io.cloudquery.plugin.v3.Close.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate and test the connections used by the plugin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudquery.plugin.v3.TestConnection.Response> testConnection(
        io.cloudquery.plugin.v3.TestConnection.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestConnectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NAME = 0;
  private static final int METHODID_GET_VERSION = 1;
  private static final int METHODID_GET_SPEC_SCHEMA = 2;
  private static final int METHODID_INIT = 3;
  private static final int METHODID_GET_TABLES = 4;
  private static final int METHODID_SYNC = 5;
  private static final int METHODID_READ = 6;
  private static final int METHODID_TRANSFORM_SCHEMA = 7;
  private static final int METHODID_CLOSE = 8;
  private static final int METHODID_TEST_CONNECTION = 9;
  private static final int METHODID_WRITE = 10;
  private static final int METHODID_TRANSFORM = 11;

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
          serviceImpl.getName((io.cloudquery.plugin.v3.GetName.Request) request,
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetName.Response>) responseObserver);
          break;
        case METHODID_GET_VERSION:
          serviceImpl.getVersion((io.cloudquery.plugin.v3.GetVersion.Request) request,
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetVersion.Response>) responseObserver);
          break;
        case METHODID_GET_SPEC_SCHEMA:
          serviceImpl.getSpecSchema((io.cloudquery.plugin.v3.GetSpecSchema.Request) request,
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetSpecSchema.Response>) responseObserver);
          break;
        case METHODID_INIT:
          serviceImpl.init((io.cloudquery.plugin.v3.Init.Request) request,
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Init.Response>) responseObserver);
          break;
        case METHODID_GET_TABLES:
          serviceImpl.getTables((io.cloudquery.plugin.v3.GetTables.Request) request,
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.GetTables.Response>) responseObserver);
          break;
        case METHODID_SYNC:
          serviceImpl.sync((io.cloudquery.plugin.v3.Sync.Request) request,
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Sync.Response>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((io.cloudquery.plugin.v3.Read.Request) request,
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Read.Response>) responseObserver);
          break;
        case METHODID_TRANSFORM_SCHEMA:
          serviceImpl.transformSchema((io.cloudquery.plugin.v3.TransformSchema.Request) request,
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.TransformSchema.Response>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((io.cloudquery.plugin.v3.Close.Request) request,
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Close.Response>) responseObserver);
          break;
        case METHODID_TEST_CONNECTION:
          serviceImpl.testConnection((io.cloudquery.plugin.v3.TestConnection.Request) request,
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.TestConnection.Response>) responseObserver);
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
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Write.Response>) responseObserver);
        case METHODID_TRANSFORM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.transform(
              (io.grpc.stub.StreamObserver<io.cloudquery.plugin.v3.Transform.Response>) responseObserver);
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
              io.cloudquery.plugin.v3.GetName.Request,
              io.cloudquery.plugin.v3.GetName.Response>(
                service, METHODID_GET_NAME)))
        .addMethod(
          getGetVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cloudquery.plugin.v3.GetVersion.Request,
              io.cloudquery.plugin.v3.GetVersion.Response>(
                service, METHODID_GET_VERSION)))
        .addMethod(
          getGetSpecSchemaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cloudquery.plugin.v3.GetSpecSchema.Request,
              io.cloudquery.plugin.v3.GetSpecSchema.Response>(
                service, METHODID_GET_SPEC_SCHEMA)))
        .addMethod(
          getInitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cloudquery.plugin.v3.Init.Request,
              io.cloudquery.plugin.v3.Init.Response>(
                service, METHODID_INIT)))
        .addMethod(
          getGetTablesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cloudquery.plugin.v3.GetTables.Request,
              io.cloudquery.plugin.v3.GetTables.Response>(
                service, METHODID_GET_TABLES)))
        .addMethod(
          getSyncMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.cloudquery.plugin.v3.Sync.Request,
              io.cloudquery.plugin.v3.Sync.Response>(
                service, METHODID_SYNC)))
        .addMethod(
          getReadMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.cloudquery.plugin.v3.Read.Request,
              io.cloudquery.plugin.v3.Read.Response>(
                service, METHODID_READ)))
        .addMethod(
          getWriteMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              io.cloudquery.plugin.v3.Write.Request,
              io.cloudquery.plugin.v3.Write.Response>(
                service, METHODID_WRITE)))
        .addMethod(
          getTransformMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              io.cloudquery.plugin.v3.Transform.Request,
              io.cloudquery.plugin.v3.Transform.Response>(
                service, METHODID_TRANSFORM)))
        .addMethod(
          getTransformSchemaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cloudquery.plugin.v3.TransformSchema.Request,
              io.cloudquery.plugin.v3.TransformSchema.Response>(
                service, METHODID_TRANSFORM_SCHEMA)))
        .addMethod(
          getCloseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cloudquery.plugin.v3.Close.Request,
              io.cloudquery.plugin.v3.Close.Response>(
                service, METHODID_CLOSE)))
        .addMethod(
          getTestConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.cloudquery.plugin.v3.TestConnection.Request,
              io.cloudquery.plugin.v3.TestConnection.Response>(
                service, METHODID_TEST_CONNECTION)))
        .build();
  }

  private static abstract class PluginBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PluginBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.cloudquery.plugin.v3.PluginOuterClass.getDescriptor();
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
              .addMethod(getGetSpecSchemaMethod())
              .addMethod(getInitMethod())
              .addMethod(getGetTablesMethod())
              .addMethod(getSyncMethod())
              .addMethod(getReadMethod())
              .addMethod(getWriteMethod())
              .addMethod(getTransformMethod())
              .addMethod(getTransformSchemaMethod())
              .addMethod(getCloseMethod())
              .addMethod(getTestConnectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
