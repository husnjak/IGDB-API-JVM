// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface MultiplayerModeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.MultiplayerMode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>bool campaigncoop = 2;</code>
   * @return The campaigncoop.
   */
  boolean getCampaigncoop();

  /**
   * <code>bool dropin = 3;</code>
   * @return The dropin.
   */
  boolean getDropin();

  /**
   * <code>.proto.Game game = 4;</code>
   * @return Whether the game field is set.
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 4;</code>
   * @return The game.
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 4;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>bool lancoop = 5;</code>
   * @return The lancoop.
   */
  boolean getLancoop();

  /**
   * <code>bool offlinecoop = 6;</code>
   * @return The offlinecoop.
   */
  boolean getOfflinecoop();

  /**
   * <code>int32 offlinecoopmax = 7;</code>
   * @return The offlinecoopmax.
   */
  int getOfflinecoopmax();

  /**
   * <code>int32 offlinemax = 8;</code>
   * @return The offlinemax.
   */
  int getOfflinemax();

  /**
   * <code>bool onlinecoop = 9;</code>
   * @return The onlinecoop.
   */
  boolean getOnlinecoop();

  /**
   * <code>int32 onlinecoopmax = 10;</code>
   * @return The onlinecoopmax.
   */
  int getOnlinecoopmax();

  /**
   * <code>int32 onlinemax = 11;</code>
   * @return The onlinemax.
   */
  int getOnlinemax();

  /**
   * <code>.proto.Platform platform = 12;</code>
   * @return Whether the platform field is set.
   */
  boolean hasPlatform();
  /**
   * <code>.proto.Platform platform = 12;</code>
   * @return The platform.
   */
  proto.Platform getPlatform();
  /**
   * <code>.proto.Platform platform = 12;</code>
   */
  proto.PlatformOrBuilder getPlatformOrBuilder();

  /**
   * <code>bool splitscreen = 13;</code>
   * @return The splitscreen.
   */
  boolean getSplitscreen();

  /**
   * <code>bool splitscreenonline = 14;</code>
   * @return The splitscreenonline.
   */
  boolean getSplitscreenonline();

  /**
   * <code>string checksum = 15;</code>
   * @return The checksum.
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 15;</code>
   * @return The bytes for checksum.
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
