// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface AgeRatingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.AgeRating)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.proto.AgeRatingCategoryEnum category = 2;</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <code>.proto.AgeRatingCategoryEnum category = 2;</code>
   * @return The category.
   */
  proto.AgeRatingCategoryEnum getCategory();

  /**
   * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
   */
  java.util.List<proto.AgeRatingContentDescription> 
      getContentDescriptionsList();
  /**
   * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
   */
  proto.AgeRatingContentDescription getContentDescriptions(int index);
  /**
   * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
   */
  int getContentDescriptionsCount();
  /**
   * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
   */
  java.util.List<? extends proto.AgeRatingContentDescriptionOrBuilder> 
      getContentDescriptionsOrBuilderList();
  /**
   * <code>repeated .proto.AgeRatingContentDescription content_descriptions = 3;</code>
   */
  proto.AgeRatingContentDescriptionOrBuilder getContentDescriptionsOrBuilder(
      int index);

  /**
   * <code>.proto.AgeRatingRatingEnum rating = 4;</code>
   * @return The enum numeric value on the wire for rating.
   */
  int getRatingValue();
  /**
   * <code>.proto.AgeRatingRatingEnum rating = 4;</code>
   * @return The rating.
   */
  proto.AgeRatingRatingEnum getRating();

  /**
   * <code>string rating_cover_url = 5;</code>
   * @return The ratingCoverUrl.
   */
  java.lang.String getRatingCoverUrl();
  /**
   * <code>string rating_cover_url = 5;</code>
   * @return The bytes for ratingCoverUrl.
   */
  com.google.protobuf.ByteString
      getRatingCoverUrlBytes();

  /**
   * <code>string synopsis = 6;</code>
   * @return The synopsis.
   */
  java.lang.String getSynopsis();
  /**
   * <code>string synopsis = 6;</code>
   * @return The bytes for synopsis.
   */
  com.google.protobuf.ByteString
      getSynopsisBytes();

  /**
   * <code>string checksum = 7;</code>
   * @return The checksum.
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 7;</code>
   * @return The bytes for checksum.
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
