/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/service.proto

package com.google.monitoring.v3;

public interface ServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name for this Service. Of the form
   * `projects/{project_id}/services/{service_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name for this Service. Of the form
   * `projects/{project_id}/services/{service_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Name used for UI elements listing this Service.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Name used for UI elements listing this Service.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Custom service type.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Custom custom = 6;</code>
   *
   * @return Whether the custom field is set.
   */
  boolean hasCustom();
  /**
   *
   *
   * <pre>
   * Custom service type.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Custom custom = 6;</code>
   *
   * @return The custom.
   */
  com.google.monitoring.v3.Service.Custom getCustom();
  /**
   *
   *
   * <pre>
   * Custom service type.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Custom custom = 6;</code>
   */
  com.google.monitoring.v3.Service.CustomOrBuilder getCustomOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for App Engine services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.AppEngine app_engine = 7;</code>
   *
   * @return Whether the appEngine field is set.
   */
  boolean hasAppEngine();
  /**
   *
   *
   * <pre>
   * Type used for App Engine services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.AppEngine app_engine = 7;</code>
   *
   * @return The appEngine.
   */
  com.google.monitoring.v3.Service.AppEngine getAppEngine();
  /**
   *
   *
   * <pre>
   * Type used for App Engine services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.AppEngine app_engine = 7;</code>
   */
  com.google.monitoring.v3.Service.AppEngineOrBuilder getAppEngineOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for Cloud Endpoints services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.CloudEndpoints cloud_endpoints = 8;</code>
   *
   * @return Whether the cloudEndpoints field is set.
   */
  boolean hasCloudEndpoints();
  /**
   *
   *
   * <pre>
   * Type used for Cloud Endpoints services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.CloudEndpoints cloud_endpoints = 8;</code>
   *
   * @return The cloudEndpoints.
   */
  com.google.monitoring.v3.Service.CloudEndpoints getCloudEndpoints();
  /**
   *
   *
   * <pre>
   * Type used for Cloud Endpoints services.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.CloudEndpoints cloud_endpoints = 8;</code>
   */
  com.google.monitoring.v3.Service.CloudEndpointsOrBuilder getCloudEndpointsOrBuilder();

  /**
   *
   *
   * <pre>
   * Type used for Istio services that live in a Kubernetes cluster.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.ClusterIstio cluster_istio = 9;</code>
   *
   * @return Whether the clusterIstio field is set.
   */
  boolean hasClusterIstio();
  /**
   *
   *
   * <pre>
   * Type used for Istio services that live in a Kubernetes cluster.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.ClusterIstio cluster_istio = 9;</code>
   *
   * @return The clusterIstio.
   */
  com.google.monitoring.v3.Service.ClusterIstio getClusterIstio();
  /**
   *
   *
   * <pre>
   * Type used for Istio services that live in a Kubernetes cluster.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.ClusterIstio cluster_istio = 9;</code>
   */
  com.google.monitoring.v3.Service.ClusterIstioOrBuilder getClusterIstioOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for how to query telemetry on a Service.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Telemetry telemetry = 13;</code>
   *
   * @return Whether the telemetry field is set.
   */
  boolean hasTelemetry();
  /**
   *
   *
   * <pre>
   * Configuration for how to query telemetry on a Service.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Telemetry telemetry = 13;</code>
   *
   * @return The telemetry.
   */
  com.google.monitoring.v3.Service.Telemetry getTelemetry();
  /**
   *
   *
   * <pre>
   * Configuration for how to query telemetry on a Service.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service.Telemetry telemetry = 13;</code>
   */
  com.google.monitoring.v3.Service.TelemetryOrBuilder getTelemetryOrBuilder();

  public com.google.monitoring.v3.Service.IdentifierCase getIdentifierCase();
}
