// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface GameLocalizationResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GameLocalizationResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .proto.GameLocalization gamelocalizations = 1;</code>
   */
  java.util.List<proto.GameLocalization> 
      getGamelocalizationsList();
  /**
   * <code>repeated .proto.GameLocalization gamelocalizations = 1;</code>
   */
  proto.GameLocalization getGamelocalizations(int index);
  /**
   * <code>repeated .proto.GameLocalization gamelocalizations = 1;</code>
   */
  int getGamelocalizationsCount();
  /**
   * <code>repeated .proto.GameLocalization gamelocalizations = 1;</code>
   */
  java.util.List<? extends proto.GameLocalizationOrBuilder> 
      getGamelocalizationsOrBuilderList();
  /**
   * <code>repeated .proto.GameLocalization gamelocalizations = 1;</code>
   */
  proto.GameLocalizationOrBuilder getGamelocalizationsOrBuilder(
      int index);
}