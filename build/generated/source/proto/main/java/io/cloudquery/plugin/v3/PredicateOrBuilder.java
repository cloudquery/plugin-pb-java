// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudquery/plugin/v3/plugin.proto

// Protobuf Java Version: 4.26.1
package io.cloudquery.plugin.v3;

public interface PredicateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cloudquery.plugin.v3.Predicate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cloudquery.plugin.v3.Predicate.Operator operator = 1;</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <code>.cloudquery.plugin.v3.Predicate.Operator operator = 1;</code>
   * @return The operator.
   */
  io.cloudquery.plugin.v3.Predicate.Operator getOperator();

  /**
   * <code>string column = 2;</code>
   * @return The column.
   */
  java.lang.String getColumn();
  /**
   * <code>string column = 2;</code>
   * @return The bytes for column.
   */
  com.google.protobuf.ByteString
      getColumnBytes();

  /**
   * <pre>
   * marshalled arrow.Record
   * </pre>
   *
   * <code>bytes record = 3;</code>
   * @return The record.
   */
  com.google.protobuf.ByteString getRecord();
}
