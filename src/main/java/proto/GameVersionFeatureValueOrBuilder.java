// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface GameVersionFeatureValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GameVersionFeatureValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>.proto.Game game = 2;</code>
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 2;</code>
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 2;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>.proto.GameVersionFeature game_feature = 3;</code>
   */
  boolean hasGameFeature();
  /**
   * <code>.proto.GameVersionFeature game_feature = 3;</code>
   */
  proto.GameVersionFeature getGameFeature();
  /**
   * <code>.proto.GameVersionFeature game_feature = 3;</code>
   */
  proto.GameVersionFeatureOrBuilder getGameFeatureOrBuilder();

  /**
   * <code>.proto.GameVersionFeatureValueIncludedFeatureEnum included_feature = 4;</code>
   */
  int getIncludedFeatureValue();
  /**
   * <code>.proto.GameVersionFeatureValueIncludedFeatureEnum included_feature = 4;</code>
   */
  proto.GameVersionFeatureValueIncludedFeatureEnum getIncludedFeature();

  /**
   * <code>string note = 5;</code>
   */
  java.lang.String getNote();
  /**
   * <code>string note = 5;</code>
   */
  com.google.protobuf.ByteString
      getNoteBytes();

  /**
   * <code>string checksum = 6;</code>
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 6;</code>
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
