// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface GenreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Genre)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string slug = 4;</code>
   */
  java.lang.String getSlug();
  /**
   * <code>string slug = 4;</code>
   */
  com.google.protobuf.ByteString
      getSlugBytes();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 5;</code>
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 5;</code>
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>string url = 6;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 6;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>string checksum = 7;</code>
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 7;</code>
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
