// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudquery/plugin/v3/plugin.proto

// Protobuf Java Version: 3.25.3
package io.cloudquery.plugin.v3;

public interface PredicatesGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cloudquery.plugin.v3.PredicatesGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cloudquery.plugin.v3.PredicatesGroup.GroupingType grouping_type = 1;</code>
   * @return The enum numeric value on the wire for groupingType.
   */
  int getGroupingTypeValue();
  /**
   * <code>.cloudquery.plugin.v3.PredicatesGroup.GroupingType grouping_type = 1;</code>
   * @return The groupingType.
   */
  io.cloudquery.plugin.v3.PredicatesGroup.GroupingType getGroupingType();

  /**
   * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
   */
  java.util.List<io.cloudquery.plugin.v3.Predicate> 
      getPredicatesList();
  /**
   * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
   */
  io.cloudquery.plugin.v3.Predicate getPredicates(int index);
  /**
   * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
   */
  int getPredicatesCount();
  /**
   * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
   */
  java.util.List<? extends io.cloudquery.plugin.v3.PredicateOrBuilder> 
      getPredicatesOrBuilderList();
  /**
   * <code>repeated .cloudquery.plugin.v3.Predicate predicates = 2;</code>
   */
  io.cloudquery.plugin.v3.PredicateOrBuilder getPredicatesOrBuilder(
      int index);
}
