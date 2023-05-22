// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface ReleaseDateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.ReleaseDate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.proto.DateFormatChangeDateCategoryEnum category = 2;</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <code>.proto.DateFormatChangeDateCategoryEnum category = 2;</code>
   * @return The category.
   */
  proto.DateFormatChangeDateCategoryEnum getCategory();

  /**
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp date = 4;</code>
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   * <code>.google.protobuf.Timestamp date = 4;</code>
   * @return The date.
   */
  com.google.protobuf.Timestamp getDate();
  /**
   * <code>.google.protobuf.Timestamp date = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateOrBuilder();

  /**
   * <code>.proto.Game game = 5;</code>
   * @return Whether the game field is set.
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 5;</code>
   * @return The game.
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 5;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>string human = 6;</code>
   * @return The human.
   */
  java.lang.String getHuman();
  /**
   * <code>string human = 6;</code>
   * @return The bytes for human.
   */
  com.google.protobuf.ByteString
      getHumanBytes();

  /**
   * <code>int32 m = 7;</code>
   * @return The m.
   */
  int getM();

  /**
   * <code>.proto.Platform platform = 8;</code>
   * @return Whether the platform field is set.
   */
  boolean hasPlatform();
  /**
   * <code>.proto.Platform platform = 8;</code>
   * @return The platform.
   */
  proto.Platform getPlatform();
  /**
   * <code>.proto.Platform platform = 8;</code>
   */
  proto.PlatformOrBuilder getPlatformOrBuilder();

  /**
   * <code>.proto.RegionRegionEnum region = 9;</code>
   * @return The enum numeric value on the wire for region.
   */
  int getRegionValue();
  /**
   * <code>.proto.RegionRegionEnum region = 9;</code>
   * @return The region.
   */
  proto.RegionRegionEnum getRegion();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 10;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 10;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>int32 y = 11;</code>
   * @return The y.
   */
  int getY();

  /**
   * <code>string checksum = 12;</code>
   * @return The checksum.
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 12;</code>
   * @return The bytes for checksum.
   */
  com.google.protobuf.ByteString
      getChecksumBytes();

  /**
   * <code>.proto.ReleaseDateStatus status = 13;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.proto.ReleaseDateStatus status = 13;</code>
   * @return The status.
   */
  proto.ReleaseDateStatus getStatus();
  /**
   * <code>.proto.ReleaseDateStatus status = 13;</code>
   */
  proto.ReleaseDateStatusOrBuilder getStatusOrBuilder();
}
