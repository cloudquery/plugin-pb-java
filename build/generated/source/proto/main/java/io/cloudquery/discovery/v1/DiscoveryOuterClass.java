// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudquery/discovery/v1/discovery.proto

package io.cloudquery.discovery.v1;

public final class DiscoveryOuterClass {
  private DiscoveryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cloudquery_discovery_v1_GetVersions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cloudquery_discovery_v1_GetVersions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cloudquery_discovery_v1_GetVersions_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cloudquery_discovery_v1_GetVersions_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cloudquery_discovery_v1_GetVersions_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cloudquery_discovery_v1_GetVersions_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'cloudquery/discovery/v1/discovery.prot" +
      "o\022\027cloudquery.discovery.v1\"6\n\013GetVersion" +
      "s\032\t\n\007Request\032\034\n\010Response\022\020\n\010versions\030\001 \003" +
      "(\0052w\n\tDiscovery\022j\n\013GetVersions\022,.cloudqu" +
      "ery.discovery.v1.GetVersions.Request\032-.c" +
      "loudquery.discovery.v1.GetVersions.Respo" +
      "nseB\\\n\032io.cloudquery.discovery.v1P\001Z<git" +
      "hub.com/cloudquery/plugin-pb-go/pb/disco" +
      "very/v1;discoveryb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_cloudquery_discovery_v1_GetVersions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cloudquery_discovery_v1_GetVersions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cloudquery_discovery_v1_GetVersions_descriptor,
        new java.lang.String[] { });
    internal_static_cloudquery_discovery_v1_GetVersions_Request_descriptor =
      internal_static_cloudquery_discovery_v1_GetVersions_descriptor.getNestedTypes().get(0);
    internal_static_cloudquery_discovery_v1_GetVersions_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cloudquery_discovery_v1_GetVersions_Request_descriptor,
        new java.lang.String[] { });
    internal_static_cloudquery_discovery_v1_GetVersions_Response_descriptor =
      internal_static_cloudquery_discovery_v1_GetVersions_descriptor.getNestedTypes().get(1);
    internal_static_cloudquery_discovery_v1_GetVersions_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cloudquery_discovery_v1_GetVersions_Response_descriptor,
        new java.lang.String[] { "Versions", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}