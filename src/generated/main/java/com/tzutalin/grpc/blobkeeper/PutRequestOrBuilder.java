// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blob.proto

package com.tzutalin.grpc.blobkeeper;

public interface PutRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:blobkeeper.PutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes data = 1;</code>
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>int64 offset = 2;</code>
   */
  long getOffset();
}