// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface PlatformWebsiteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.PlatformWebsite)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>.proto.WebsiteCategoryEnum category = 2;</code>
   */
  int getCategoryValue();
  /**
   * <code>.proto.WebsiteCategoryEnum category = 2;</code>
   */
  proto.WebsiteCategoryEnum getCategory();

  /**
   * <code>bool trusted = 3;</code>
   */
  boolean getTrusted();

  /**
   * <code>string url = 4;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 4;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>string checksum = 5;</code>
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 5;</code>
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
