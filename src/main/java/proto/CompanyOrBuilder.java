// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface CompanyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Company)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.google.protobuf.Timestamp change_date = 2;</code>
   * @return Whether the changeDate field is set.
   */
  boolean hasChangeDate();
  /**
   * <code>.google.protobuf.Timestamp change_date = 2;</code>
   * @return The changeDate.
   */
  com.google.protobuf.Timestamp getChangeDate();
  /**
   * <code>.google.protobuf.Timestamp change_date = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getChangeDateOrBuilder();

  /**
   * <code>.proto.DateFormatChangeDateCategoryEnum change_date_category = 3;</code>
   * @return The enum numeric value on the wire for changeDateCategory.
   */
  int getChangeDateCategoryValue();
  /**
   * <code>.proto.DateFormatChangeDateCategoryEnum change_date_category = 3;</code>
   * @return The changeDateCategory.
   */
  proto.DateFormatChangeDateCategoryEnum getChangeDateCategory();

  /**
   * <code>.proto.Company changed_company_id = 4;</code>
   * @return Whether the changedCompanyId field is set.
   */
  boolean hasChangedCompanyId();
  /**
   * <code>.proto.Company changed_company_id = 4;</code>
   * @return The changedCompanyId.
   */
  proto.Company getChangedCompanyId();
  /**
   * <code>.proto.Company changed_company_id = 4;</code>
   */
  proto.CompanyOrBuilder getChangedCompanyIdOrBuilder();

  /**
   * <code>int32 country = 5;</code>
   * @return The country.
   */
  int getCountry();

  /**
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>string description = 7;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 7;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .proto.Game developed = 8;</code>
   */
  java.util.List<proto.Game> 
      getDevelopedList();
  /**
   * <code>repeated .proto.Game developed = 8;</code>
   */
  proto.Game getDeveloped(int index);
  /**
   * <code>repeated .proto.Game developed = 8;</code>
   */
  int getDevelopedCount();
  /**
   * <code>repeated .proto.Game developed = 8;</code>
   */
  java.util.List<? extends proto.GameOrBuilder> 
      getDevelopedOrBuilderList();
  /**
   * <code>repeated .proto.Game developed = 8;</code>
   */
  proto.GameOrBuilder getDevelopedOrBuilder(
      int index);

  /**
   * <code>.proto.CompanyLogo logo = 9;</code>
   * @return Whether the logo field is set.
   */
  boolean hasLogo();
  /**
   * <code>.proto.CompanyLogo logo = 9;</code>
   * @return The logo.
   */
  proto.CompanyLogo getLogo();
  /**
   * <code>.proto.CompanyLogo logo = 9;</code>
   */
  proto.CompanyLogoOrBuilder getLogoOrBuilder();

  /**
   * <code>string name = 10;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 10;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.proto.Company parent = 11;</code>
   * @return Whether the parent field is set.
   */
  boolean hasParent();
  /**
   * <code>.proto.Company parent = 11;</code>
   * @return The parent.
   */
  proto.Company getParent();
  /**
   * <code>.proto.Company parent = 11;</code>
   */
  proto.CompanyOrBuilder getParentOrBuilder();

  /**
   * <code>repeated .proto.Game published = 12;</code>
   */
  java.util.List<proto.Game> 
      getPublishedList();
  /**
   * <code>repeated .proto.Game published = 12;</code>
   */
  proto.Game getPublished(int index);
  /**
   * <code>repeated .proto.Game published = 12;</code>
   */
  int getPublishedCount();
  /**
   * <code>repeated .proto.Game published = 12;</code>
   */
  java.util.List<? extends proto.GameOrBuilder> 
      getPublishedOrBuilderList();
  /**
   * <code>repeated .proto.Game published = 12;</code>
   */
  proto.GameOrBuilder getPublishedOrBuilder(
      int index);

  /**
   * <code>string slug = 13;</code>
   * @return The slug.
   */
  java.lang.String getSlug();
  /**
   * <code>string slug = 13;</code>
   * @return The bytes for slug.
   */
  com.google.protobuf.ByteString
      getSlugBytes();

  /**
   * <code>.google.protobuf.Timestamp start_date = 14;</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <code>.google.protobuf.Timestamp start_date = 14;</code>
   * @return The startDate.
   */
  com.google.protobuf.Timestamp getStartDate();
  /**
   * <code>.google.protobuf.Timestamp start_date = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder();

  /**
   * <code>.proto.DateFormatChangeDateCategoryEnum start_date_category = 15;</code>
   * @return The enum numeric value on the wire for startDateCategory.
   */
  int getStartDateCategoryValue();
  /**
   * <code>.proto.DateFormatChangeDateCategoryEnum start_date_category = 15;</code>
   * @return The startDateCategory.
   */
  proto.DateFormatChangeDateCategoryEnum getStartDateCategory();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 16;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 16;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 16;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>string url = 17;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 17;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>repeated .proto.CompanyWebsite websites = 18;</code>
   */
  java.util.List<proto.CompanyWebsite> 
      getWebsitesList();
  /**
   * <code>repeated .proto.CompanyWebsite websites = 18;</code>
   */
  proto.CompanyWebsite getWebsites(int index);
  /**
   * <code>repeated .proto.CompanyWebsite websites = 18;</code>
   */
  int getWebsitesCount();
  /**
   * <code>repeated .proto.CompanyWebsite websites = 18;</code>
   */
  java.util.List<? extends proto.CompanyWebsiteOrBuilder> 
      getWebsitesOrBuilderList();
  /**
   * <code>repeated .proto.CompanyWebsite websites = 18;</code>
   */
  proto.CompanyWebsiteOrBuilder getWebsitesOrBuilder(
      int index);

  /**
   * <code>string checksum = 19;</code>
   * @return The checksum.
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 19;</code>
   * @return The bytes for checksum.
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
