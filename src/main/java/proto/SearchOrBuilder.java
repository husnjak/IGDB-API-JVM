// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface SearchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Search)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>string alternative_name = 2;</code>
   */
  java.lang.String getAlternativeName();
  /**
   * <code>string alternative_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getAlternativeNameBytes();

  /**
   * <code>.proto.Character character = 3;</code>
   */
  boolean hasCharacter();
  /**
   * <code>.proto.Character character = 3;</code>
   */
  proto.Character getCharacter();
  /**
   * <code>.proto.Character character = 3;</code>
   */
  proto.CharacterOrBuilder getCharacterOrBuilder();

  /**
   * <code>.proto.Collection collection = 4;</code>
   */
  boolean hasCollection();
  /**
   * <code>.proto.Collection collection = 4;</code>
   */
  proto.Collection getCollection();
  /**
   * <code>.proto.Collection collection = 4;</code>
   */
  proto.CollectionOrBuilder getCollectionOrBuilder();

  /**
   * <code>.proto.Company company = 5;</code>
   */
  boolean hasCompany();
  /**
   * <code>.proto.Company company = 5;</code>
   */
  proto.Company getCompany();
  /**
   * <code>.proto.Company company = 5;</code>
   */
  proto.CompanyOrBuilder getCompanyOrBuilder();

  /**
   * <code>string description = 6;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 6;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.proto.Game game = 7;</code>
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 7;</code>
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 7;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>string name = 8;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 8;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.proto.Platform platform = 9;</code>
   */
  boolean hasPlatform();
  /**
   * <code>.proto.Platform platform = 9;</code>
   */
  proto.Platform getPlatform();
  /**
   * <code>.proto.Platform platform = 9;</code>
   */
  proto.PlatformOrBuilder getPlatformOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp published_at = 10;</code>
   */
  boolean hasPublishedAt();
  /**
   * <code>.google.protobuf.Timestamp published_at = 10;</code>
   */
  com.google.protobuf.Timestamp getPublishedAt();
  /**
   * <code>.google.protobuf.Timestamp published_at = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPublishedAtOrBuilder();

  /**
   * <code>.proto.TestDummy test_dummy = 11;</code>
   */
  boolean hasTestDummy();
  /**
   * <code>.proto.TestDummy test_dummy = 11;</code>
   */
  proto.TestDummy getTestDummy();
  /**
   * <code>.proto.TestDummy test_dummy = 11;</code>
   */
  proto.TestDummyOrBuilder getTestDummyOrBuilder();

  /**
   * <code>.proto.Theme theme = 12;</code>
   */
  boolean hasTheme();
  /**
   * <code>.proto.Theme theme = 12;</code>
   */
  proto.Theme getTheme();
  /**
   * <code>.proto.Theme theme = 12;</code>
   */
  proto.ThemeOrBuilder getThemeOrBuilder();

  /**
   * <code>string checksum = 13;</code>
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 13;</code>
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
