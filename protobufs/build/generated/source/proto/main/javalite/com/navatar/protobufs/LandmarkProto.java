// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LandmarkProto.proto

package com.navatar.protobufs;

public final class LandmarkProto {
  private LandmarkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface LandmarkOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.navatar.protobufs.Landmark)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * The landmark's x,y coordinates. 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
     */
    boolean hasLocation();
    /**
     * <pre>
     * The landmark's x,y coordinates. 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
     */
    com.navatar.protobufs.CoordinatesProto.Coordinates getLocation();

    /**
     * <pre>
     * The landmark's name. 
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    boolean hasName();
    /**
     * <pre>
     * The landmark's name. 
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * The landmark's name. 
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * The object the landmark represents (see LandmarkType enum) 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Landmark.LandmarkType type = 3;</code>
     */
    boolean hasType();
    /**
     * <pre>
     * The object the landmark represents (see LandmarkType enum) 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Landmark.LandmarkType type = 3;</code>
     */
    com.navatar.protobufs.LandmarkProto.Landmark.LandmarkType getType();

    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    java.util.List<com.navatar.protobufs.CoordinatesProto.Coordinates> 
        getParticlesList();
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    com.navatar.protobufs.CoordinatesProto.Coordinates getParticles(int index);
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    int getParticlesCount();
  }
  /**
   * <pre>
   **
   * The protobuf definition for the Landmark class. Landmarks are used by the BuildingMap protobufs 
   * as a variable to represent doors, stairs, etc..
   * </pre>
   *
   * Protobuf type {@code com.navatar.protobufs.Landmark}
   */
  public  static final class Landmark extends
      com.google.protobuf.GeneratedMessageLite<
          Landmark, Landmark.Builder> implements
      // @@protoc_insertion_point(message_implements:com.navatar.protobufs.Landmark)
      LandmarkOrBuilder {
    private Landmark() {
      name_ = "";
      type_ = 1;
      particles_ = emptyProtobufList();
    }
    /**
     * <pre>
     * The different types landmarks. 
     * </pre>
     *
     * Protobuf enum {@code com.navatar.protobufs.Landmark.LandmarkType}
     */
    public enum LandmarkType
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>DOOR = 1;</code>
       */
      DOOR(1),
      /**
       * <code>HALLWAY_INTERSECTION = 2;</code>
       */
      HALLWAY_INTERSECTION(2),
      /**
       * <code>STAIRS = 3;</code>
       */
      STAIRS(3),
      /**
       * <code>ELEVATOR = 4;</code>
       */
      ELEVATOR(4),
      ;

      /**
       * <code>DOOR = 1;</code>
       */
      public static final int DOOR_VALUE = 1;
      /**
       * <code>HALLWAY_INTERSECTION = 2;</code>
       */
      public static final int HALLWAY_INTERSECTION_VALUE = 2;
      /**
       * <code>STAIRS = 3;</code>
       */
      public static final int STAIRS_VALUE = 3;
      /**
       * <code>ELEVATOR = 4;</code>
       */
      public static final int ELEVATOR_VALUE = 4;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static LandmarkType valueOf(int value) {
        return forNumber(value);
      }

      public static LandmarkType forNumber(int value) {
        switch (value) {
          case 1: return DOOR;
          case 2: return HALLWAY_INTERSECTION;
          case 3: return STAIRS;
          case 4: return ELEVATOR;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<LandmarkType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          LandmarkType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<LandmarkType>() {
              public LandmarkType findValueByNumber(int number) {
                return LandmarkType.forNumber(number);
              }
            };

      private final int value;

      private LandmarkType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:com.navatar.protobufs.Landmark.LandmarkType)
    }

    private int bitField0_;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private com.navatar.protobufs.CoordinatesProto.Coordinates location_;
    /**
     * <pre>
     * The landmark's x,y coordinates. 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
     */
    public boolean hasLocation() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * The landmark's x,y coordinates. 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
     */
    public com.navatar.protobufs.CoordinatesProto.Coordinates getLocation() {
      return location_ == null ? com.navatar.protobufs.CoordinatesProto.Coordinates.getDefaultInstance() : location_;
    }
    /**
     * <pre>
     * The landmark's x,y coordinates. 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
     */
    private void setLocation(com.navatar.protobufs.CoordinatesProto.Coordinates value) {
      if (value == null) {
        throw new NullPointerException();
      }
      location_ = value;
      bitField0_ |= 0x00000001;
      }
    /**
     * <pre>
     * The landmark's x,y coordinates. 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
     */
    private void setLocation(
        com.navatar.protobufs.CoordinatesProto.Coordinates.Builder builderForValue) {
      location_ = builderForValue.build();
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The landmark's x,y coordinates. 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
     */
    private void mergeLocation(com.navatar.protobufs.CoordinatesProto.Coordinates value) {
      if (location_ != null &&
          location_ != com.navatar.protobufs.CoordinatesProto.Coordinates.getDefaultInstance()) {
        location_ =
          com.navatar.protobufs.CoordinatesProto.Coordinates.newBuilder(location_).mergeFrom(value).buildPartial();
      } else {
        location_ = value;
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The landmark's x,y coordinates. 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
     */
    private void clearLocation() {  location_ = null;
      bitField0_ = (bitField0_ & ~0x00000001);
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.String name_;
    /**
     * <pre>
     * The landmark's name. 
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * The landmark's name. 
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      return name_;
    }
    /**
     * <pre>
     * The landmark's name. 
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }
    /**
     * <pre>
     * The landmark's name. 
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    private void setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
    }
    /**
     * <pre>
     * The landmark's name. 
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    private void clearName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = getDefaultInstance().getName();
    }
    /**
     * <pre>
     * The landmark's name. 
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value.toStringUtf8();
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <pre>
     * The object the landmark represents (see LandmarkType enum) 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Landmark.LandmarkType type = 3;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * The object the landmark represents (see LandmarkType enum) 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Landmark.LandmarkType type = 3;</code>
     */
    public com.navatar.protobufs.LandmarkProto.Landmark.LandmarkType getType() {
      com.navatar.protobufs.LandmarkProto.Landmark.LandmarkType result = com.navatar.protobufs.LandmarkProto.Landmark.LandmarkType.forNumber(type_);
      return result == null ? com.navatar.protobufs.LandmarkProto.Landmark.LandmarkType.DOOR : result;
    }
    /**
     * <pre>
     * The object the landmark represents (see LandmarkType enum) 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Landmark.LandmarkType type = 3;</code>
     */
    private void setType(com.navatar.protobufs.LandmarkProto.Landmark.LandmarkType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      type_ = value.getNumber();
    }
    /**
     * <pre>
     * The object the landmark represents (see LandmarkType enum) 
     * </pre>
     *
     * <code>optional .com.navatar.protobufs.Landmark.LandmarkType type = 3;</code>
     */
    private void clearType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      type_ = 1;
    }

    public static final int PARTICLES_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.ProtobufList<com.navatar.protobufs.CoordinatesProto.Coordinates> particles_;
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    public java.util.List<com.navatar.protobufs.CoordinatesProto.Coordinates> getParticlesList() {
      return particles_;
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    public java.util.List<? extends com.navatar.protobufs.CoordinatesProto.CoordinatesOrBuilder> 
        getParticlesOrBuilderList() {
      return particles_;
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    public int getParticlesCount() {
      return particles_.size();
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    public com.navatar.protobufs.CoordinatesProto.Coordinates getParticles(int index) {
      return particles_.get(index);
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    public com.navatar.protobufs.CoordinatesProto.CoordinatesOrBuilder getParticlesOrBuilder(
        int index) {
      return particles_.get(index);
    }
    private void ensureParticlesIsMutable() {
      if (!particles_.isModifiable()) {
        particles_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(particles_);
       }
    }

    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    private void setParticles(
        int index, com.navatar.protobufs.CoordinatesProto.Coordinates value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureParticlesIsMutable();
      particles_.set(index, value);
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    private void setParticles(
        int index, com.navatar.protobufs.CoordinatesProto.Coordinates.Builder builderForValue) {
      ensureParticlesIsMutable();
      particles_.set(index, builderForValue.build());
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    private void addParticles(com.navatar.protobufs.CoordinatesProto.Coordinates value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureParticlesIsMutable();
      particles_.add(value);
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    private void addParticles(
        int index, com.navatar.protobufs.CoordinatesProto.Coordinates value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureParticlesIsMutable();
      particles_.add(index, value);
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    private void addParticles(
        com.navatar.protobufs.CoordinatesProto.Coordinates.Builder builderForValue) {
      ensureParticlesIsMutable();
      particles_.add(builderForValue.build());
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    private void addParticles(
        int index, com.navatar.protobufs.CoordinatesProto.Coordinates.Builder builderForValue) {
      ensureParticlesIsMutable();
      particles_.add(index, builderForValue.build());
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    private void addAllParticles(
        java.lang.Iterable<? extends com.navatar.protobufs.CoordinatesProto.Coordinates> values) {
      ensureParticlesIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, particles_);
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    private void clearParticles() {
      particles_ = emptyProtobufList();
    }
    /**
     * <pre>
     * Particles used to define an accessible area close to the landmark. 
     * </pre>
     *
     * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
     */
    private void removeParticles(int index) {
      ensureParticlesIsMutable();
      particles_.remove(index);
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getLocation());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeString(2, getName());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, type_);
      }
      for (int i = 0; i < particles_.size(); i++) {
        output.writeMessage(4, particles_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getLocation());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getName());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_);
      }
      for (int i = 0; i < particles_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, particles_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.navatar.protobufs.LandmarkProto.Landmark parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.navatar.protobufs.LandmarkProto.Landmark parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.navatar.protobufs.LandmarkProto.Landmark parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.navatar.protobufs.LandmarkProto.Landmark parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.navatar.protobufs.LandmarkProto.Landmark parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.navatar.protobufs.LandmarkProto.Landmark parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.navatar.protobufs.LandmarkProto.Landmark parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.navatar.protobufs.LandmarkProto.Landmark parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.navatar.protobufs.LandmarkProto.Landmark parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.navatar.protobufs.LandmarkProto.Landmark parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.navatar.protobufs.LandmarkProto.Landmark prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     **
     * The protobuf definition for the Landmark class. Landmarks are used by the BuildingMap protobufs 
     * as a variable to represent doors, stairs, etc..
     * </pre>
     *
     * Protobuf type {@code com.navatar.protobufs.Landmark}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.navatar.protobufs.LandmarkProto.Landmark, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.navatar.protobufs.Landmark)
        com.navatar.protobufs.LandmarkProto.LandmarkOrBuilder {
      // Construct using com.navatar.protobufs.LandmarkProto.Landmark.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * The landmark's x,y coordinates. 
       * </pre>
       *
       * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
       */
      public boolean hasLocation() {
        return instance.hasLocation();
      }
      /**
       * <pre>
       * The landmark's x,y coordinates. 
       * </pre>
       *
       * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
       */
      public com.navatar.protobufs.CoordinatesProto.Coordinates getLocation() {
        return instance.getLocation();
      }
      /**
       * <pre>
       * The landmark's x,y coordinates. 
       * </pre>
       *
       * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
       */
      public Builder setLocation(com.navatar.protobufs.CoordinatesProto.Coordinates value) {
        copyOnWrite();
        instance.setLocation(value);
        return this;
        }
      /**
       * <pre>
       * The landmark's x,y coordinates. 
       * </pre>
       *
       * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
       */
      public Builder setLocation(
          com.navatar.protobufs.CoordinatesProto.Coordinates.Builder builderForValue) {
        copyOnWrite();
        instance.setLocation(builderForValue);
        return this;
      }
      /**
       * <pre>
       * The landmark's x,y coordinates. 
       * </pre>
       *
       * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
       */
      public Builder mergeLocation(com.navatar.protobufs.CoordinatesProto.Coordinates value) {
        copyOnWrite();
        instance.mergeLocation(value);
        return this;
      }
      /**
       * <pre>
       * The landmark's x,y coordinates. 
       * </pre>
       *
       * <code>optional .com.navatar.protobufs.Coordinates location = 1;</code>
       */
      public Builder clearLocation() {  copyOnWrite();
        instance.clearLocation();
        return this;
      }

      /**
       * <pre>
       * The landmark's name. 
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public boolean hasName() {
        return instance.hasName();
      }
      /**
       * <pre>
       * The landmark's name. 
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public java.lang.String getName() {
        return instance.getName();
      }
      /**
       * <pre>
       * The landmark's name. 
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <pre>
       * The landmark's name. 
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <pre>
       * The landmark's name. 
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <pre>
       * The landmark's name. 
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      /**
       * <pre>
       * The object the landmark represents (see LandmarkType enum) 
       * </pre>
       *
       * <code>optional .com.navatar.protobufs.Landmark.LandmarkType type = 3;</code>
       */
      public boolean hasType() {
        return instance.hasType();
      }
      /**
       * <pre>
       * The object the landmark represents (see LandmarkType enum) 
       * </pre>
       *
       * <code>optional .com.navatar.protobufs.Landmark.LandmarkType type = 3;</code>
       */
      public com.navatar.protobufs.LandmarkProto.Landmark.LandmarkType getType() {
        return instance.getType();
      }
      /**
       * <pre>
       * The object the landmark represents (see LandmarkType enum) 
       * </pre>
       *
       * <code>optional .com.navatar.protobufs.Landmark.LandmarkType type = 3;</code>
       */
      public Builder setType(com.navatar.protobufs.LandmarkProto.Landmark.LandmarkType value) {
        copyOnWrite();
        instance.setType(value);
        return this;
      }
      /**
       * <pre>
       * The object the landmark represents (see LandmarkType enum) 
       * </pre>
       *
       * <code>optional .com.navatar.protobufs.Landmark.LandmarkType type = 3;</code>
       */
      public Builder clearType() {
        copyOnWrite();
        instance.clearType();
        return this;
      }

      /**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public java.util.List<com.navatar.protobufs.CoordinatesProto.Coordinates> getParticlesList() {
        return java.util.Collections.unmodifiableList(
            instance.getParticlesList());
      }
      /**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public int getParticlesCount() {
        return instance.getParticlesCount();
      }/**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public com.navatar.protobufs.CoordinatesProto.Coordinates getParticles(int index) {
        return instance.getParticles(index);
      }
      /**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public Builder setParticles(
          int index, com.navatar.protobufs.CoordinatesProto.Coordinates value) {
        copyOnWrite();
        instance.setParticles(index, value);
        return this;
      }
      /**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public Builder setParticles(
          int index, com.navatar.protobufs.CoordinatesProto.Coordinates.Builder builderForValue) {
        copyOnWrite();
        instance.setParticles(index, builderForValue);
        return this;
      }
      /**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public Builder addParticles(com.navatar.protobufs.CoordinatesProto.Coordinates value) {
        copyOnWrite();
        instance.addParticles(value);
        return this;
      }
      /**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public Builder addParticles(
          int index, com.navatar.protobufs.CoordinatesProto.Coordinates value) {
        copyOnWrite();
        instance.addParticles(index, value);
        return this;
      }
      /**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public Builder addParticles(
          com.navatar.protobufs.CoordinatesProto.Coordinates.Builder builderForValue) {
        copyOnWrite();
        instance.addParticles(builderForValue);
        return this;
      }
      /**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public Builder addParticles(
          int index, com.navatar.protobufs.CoordinatesProto.Coordinates.Builder builderForValue) {
        copyOnWrite();
        instance.addParticles(index, builderForValue);
        return this;
      }
      /**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public Builder addAllParticles(
          java.lang.Iterable<? extends com.navatar.protobufs.CoordinatesProto.Coordinates> values) {
        copyOnWrite();
        instance.addAllParticles(values);
        return this;
      }
      /**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public Builder clearParticles() {
        copyOnWrite();
        instance.clearParticles();
        return this;
      }
      /**
       * <pre>
       * Particles used to define an accessible area close to the landmark. 
       * </pre>
       *
       * <code>repeated .com.navatar.protobufs.Coordinates particles = 4;</code>
       */
      public Builder removeParticles(int index) {
        copyOnWrite();
        instance.removeParticles(index);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.navatar.protobufs.Landmark)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.navatar.protobufs.LandmarkProto.Landmark();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          particles_.makeImmutable();
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.navatar.protobufs.LandmarkProto.Landmark other = (com.navatar.protobufs.LandmarkProto.Landmark) arg1;
          location_ = visitor.visitMessage(location_, other.location_);
          name_ = visitor.visitString(
              hasName(), name_,
              other.hasName(), other.name_);
          type_ = visitor.visitInt(hasType(), type_,
              other.hasType(), other.type_);
          particles_= visitor.visitList(particles_, other.particles_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  com.navatar.protobufs.CoordinatesProto.Coordinates.Builder subBuilder = null;
                  if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    subBuilder = location_.toBuilder();
                  }
                  location_ = input.readMessage(com.navatar.protobufs.CoordinatesProto.Coordinates.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(location_);
                    location_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x00000001;
                  break;
                }
                case 18: {
                  String s = input.readString();
                  bitField0_ |= 0x00000002;
                  name_ = s;
                  break;
                }
                case 24: {
                  int rawValue = input.readEnum();
                  com.navatar.protobufs.LandmarkProto.Landmark.LandmarkType value = com.navatar.protobufs.LandmarkProto.Landmark.LandmarkType.forNumber(rawValue);
                  if (value == null) {
                    super.mergeVarintField(3, rawValue);
                  } else {
                    bitField0_ |= 0x00000004;
                    type_ = rawValue;
                  }
                  break;
                }
                case 34: {
                  if (!particles_.isModifiable()) {
                    particles_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(particles_);
                  }
                  particles_.add(
                      input.readMessage(com.navatar.protobufs.CoordinatesProto.Coordinates.parser(), extensionRegistry));
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.navatar.protobufs.LandmarkProto.Landmark.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:com.navatar.protobufs.Landmark)
    private static final com.navatar.protobufs.LandmarkProto.Landmark DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Landmark();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.navatar.protobufs.LandmarkProto.Landmark getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Landmark> PARSER;

    public static com.google.protobuf.Parser<Landmark> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
