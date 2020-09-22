// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface CollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Collection)
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
   * <code>repeated .proto.Game games = 3;</code>
   */
  java.util.List<proto.Game> 
      getGamesList();
  /**
   * <code>repeated .proto.Game games = 3;</code>
   */
  proto.Game getGames(int index);
  /**
   * <code>repeated .proto.Game games = 3;</code>
   */
  int getGamesCount();
  /**
   * <code>repeated .proto.Game games = 3;</code>
   */
  java.util.List<? extends proto.GameOrBuilder> 
      getGamesOrBuilderList();
  /**
   * <code>repeated .proto.Game games = 3;</code>
   */
  proto.GameOrBuilder getGamesOrBuilder(
      int index);

  /**
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string slug = 5;</code>
   */
  java.lang.String getSlug();
  /**
   * <code>string slug = 5;</code>
   */
  com.google.protobuf.ByteString
      getSlugBytes();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 6;</code>
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 6;</code>
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>string url = 7;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 7;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>string checksum = 8;</code>
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 8;</code>
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
