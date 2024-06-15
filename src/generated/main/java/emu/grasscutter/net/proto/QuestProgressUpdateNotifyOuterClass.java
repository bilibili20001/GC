// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestProgressUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class QuestProgressUpdateNotifyOuterClass {
  private QuestProgressUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestProgressUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestProgressUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 quest_id = 2;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>repeated uint32 fail_progress_list = 3;</code>
     * @return A list containing the failProgressList.
     */
    java.util.List<java.lang.Integer> getFailProgressListList();
    /**
     * <code>repeated uint32 fail_progress_list = 3;</code>
     * @return The count of failProgressList.
     */
    int getFailProgressListCount();
    /**
     * <code>repeated uint32 fail_progress_list = 3;</code>
     * @param index The index of the element to return.
     * @return The failProgressList at the given index.
     */
    int getFailProgressList(int index);

    /**
     * <code>repeated uint32 finish_progress_list = 5;</code>
     * @return A list containing the finishProgressList.
     */
    java.util.List<java.lang.Integer> getFinishProgressListList();
    /**
     * <code>repeated uint32 finish_progress_list = 5;</code>
     * @return The count of finishProgressList.
     */
    int getFinishProgressListCount();
    /**
     * <code>repeated uint32 finish_progress_list = 5;</code>
     * @param index The index of the element to return.
     * @return The finishProgressList at the given index.
     */
    int getFinishProgressList(int index);
  }
  /**
   * <pre>
   * CmdId: 7905
   * </pre>
   *
   * Protobuf type {@code QuestProgressUpdateNotify}
   */
  public static final class QuestProgressUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestProgressUpdateNotify)
      QuestProgressUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestProgressUpdateNotify.newBuilder() to construct.
    private QuestProgressUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestProgressUpdateNotify() {
      failProgressList_ = emptyIntList();
      finishProgressList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestProgressUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private QuestProgressUpdateNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16: {

              questId_ = input.readUInt32();
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                failProgressList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              failProgressList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                failProgressList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                failProgressList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                finishProgressList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              finishProgressList_.addInt(input.readUInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                finishProgressList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                finishProgressList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          failProgressList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          finishProgressList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.internal_static_QuestProgressUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.internal_static_QuestProgressUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify.class, emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify.Builder.class);
    }

    public static final int QUEST_ID_FIELD_NUMBER = 2;
    private int questId_;
    /**
     * <code>uint32 quest_id = 2;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }

    public static final int FAIL_PROGRESS_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList failProgressList_;
    /**
     * <code>repeated uint32 fail_progress_list = 3;</code>
     * @return A list containing the failProgressList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFailProgressListList() {
      return failProgressList_;
    }
    /**
     * <code>repeated uint32 fail_progress_list = 3;</code>
     * @return The count of failProgressList.
     */
    public int getFailProgressListCount() {
      return failProgressList_.size();
    }
    /**
     * <code>repeated uint32 fail_progress_list = 3;</code>
     * @param index The index of the element to return.
     * @return The failProgressList at the given index.
     */
    public int getFailProgressList(int index) {
      return failProgressList_.getInt(index);
    }
    private int failProgressListMemoizedSerializedSize = -1;

    public static final int FINISH_PROGRESS_LIST_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList finishProgressList_;
    /**
     * <code>repeated uint32 finish_progress_list = 5;</code>
     * @return A list containing the finishProgressList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFinishProgressListList() {
      return finishProgressList_;
    }
    /**
     * <code>repeated uint32 finish_progress_list = 5;</code>
     * @return The count of finishProgressList.
     */
    public int getFinishProgressListCount() {
      return finishProgressList_.size();
    }
    /**
     * <code>repeated uint32 finish_progress_list = 5;</code>
     * @param index The index of the element to return.
     * @return The finishProgressList at the given index.
     */
    public int getFinishProgressList(int index) {
      return finishProgressList_.getInt(index);
    }
    private int finishProgressListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (questId_ != 0) {
        output.writeUInt32(2, questId_);
      }
      if (getFailProgressListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(failProgressListMemoizedSerializedSize);
      }
      for (int i = 0; i < failProgressList_.size(); i++) {
        output.writeUInt32NoTag(failProgressList_.getInt(i));
      }
      if (getFinishProgressListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(finishProgressListMemoizedSerializedSize);
      }
      for (int i = 0; i < finishProgressList_.size(); i++) {
        output.writeUInt32NoTag(finishProgressList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, questId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < failProgressList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(failProgressList_.getInt(i));
        }
        size += dataSize;
        if (!getFailProgressListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        failProgressListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < finishProgressList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(finishProgressList_.getInt(i));
        }
        size += dataSize;
        if (!getFinishProgressListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        finishProgressListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify other = (emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify) obj;

      if (getQuestId()
          != other.getQuestId()) return false;
      if (!getFailProgressListList()
          .equals(other.getFailProgressListList())) return false;
      if (!getFinishProgressListList()
          .equals(other.getFinishProgressListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      if (getFailProgressListCount() > 0) {
        hash = (37 * hash) + FAIL_PROGRESS_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFailProgressListList().hashCode();
      }
      if (getFinishProgressListCount() > 0) {
        hash = (37 * hash) + FINISH_PROGRESS_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFinishProgressListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 7905
     * </pre>
     *
     * Protobuf type {@code QuestProgressUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestProgressUpdateNotify)
        emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.internal_static_QuestProgressUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.internal_static_QuestProgressUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify.class, emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        questId_ = 0;

        failProgressList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        finishProgressList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.internal_static_QuestProgressUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify build() {
        emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify result = new emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        result.questId_ = questId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          failProgressList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.failProgressList_ = failProgressList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          finishProgressList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.finishProgressList_ = finishProgressList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify.getDefaultInstance()) return this;
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
        }
        if (!other.failProgressList_.isEmpty()) {
          if (failProgressList_.isEmpty()) {
            failProgressList_ = other.failProgressList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFailProgressListIsMutable();
            failProgressList_.addAll(other.failProgressList_);
          }
          onChanged();
        }
        if (!other.finishProgressList_.isEmpty()) {
          if (finishProgressList_.isEmpty()) {
            finishProgressList_ = other.finishProgressList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFinishProgressListIsMutable();
            finishProgressList_.addAll(other.finishProgressList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 2;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 2;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        
        questId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList failProgressList_ = emptyIntList();
      private void ensureFailProgressListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          failProgressList_ = mutableCopy(failProgressList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fail_progress_list = 3;</code>
       * @return A list containing the failProgressList.
       */
      public java.util.List<java.lang.Integer>
          getFailProgressListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(failProgressList_) : failProgressList_;
      }
      /**
       * <code>repeated uint32 fail_progress_list = 3;</code>
       * @return The count of failProgressList.
       */
      public int getFailProgressListCount() {
        return failProgressList_.size();
      }
      /**
       * <code>repeated uint32 fail_progress_list = 3;</code>
       * @param index The index of the element to return.
       * @return The failProgressList at the given index.
       */
      public int getFailProgressList(int index) {
        return failProgressList_.getInt(index);
      }
      /**
       * <code>repeated uint32 fail_progress_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The failProgressList to set.
       * @return This builder for chaining.
       */
      public Builder setFailProgressList(
          int index, int value) {
        ensureFailProgressListIsMutable();
        failProgressList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fail_progress_list = 3;</code>
       * @param value The failProgressList to add.
       * @return This builder for chaining.
       */
      public Builder addFailProgressList(int value) {
        ensureFailProgressListIsMutable();
        failProgressList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fail_progress_list = 3;</code>
       * @param values The failProgressList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFailProgressList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFailProgressListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, failProgressList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fail_progress_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFailProgressList() {
        failProgressList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList finishProgressList_ = emptyIntList();
      private void ensureFinishProgressListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          finishProgressList_ = mutableCopy(finishProgressList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 finish_progress_list = 5;</code>
       * @return A list containing the finishProgressList.
       */
      public java.util.List<java.lang.Integer>
          getFinishProgressListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(finishProgressList_) : finishProgressList_;
      }
      /**
       * <code>repeated uint32 finish_progress_list = 5;</code>
       * @return The count of finishProgressList.
       */
      public int getFinishProgressListCount() {
        return finishProgressList_.size();
      }
      /**
       * <code>repeated uint32 finish_progress_list = 5;</code>
       * @param index The index of the element to return.
       * @return The finishProgressList at the given index.
       */
      public int getFinishProgressList(int index) {
        return finishProgressList_.getInt(index);
      }
      /**
       * <code>repeated uint32 finish_progress_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The finishProgressList to set.
       * @return This builder for chaining.
       */
      public Builder setFinishProgressList(
          int index, int value) {
        ensureFinishProgressListIsMutable();
        finishProgressList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finish_progress_list = 5;</code>
       * @param value The finishProgressList to add.
       * @return This builder for chaining.
       */
      public Builder addFinishProgressList(int value) {
        ensureFinishProgressListIsMutable();
        finishProgressList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finish_progress_list = 5;</code>
       * @param values The finishProgressList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFinishProgressList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFinishProgressListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, finishProgressList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finish_progress_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishProgressList() {
        finishProgressList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:QuestProgressUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:QuestProgressUpdateNotify)
    private static final emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify();
    }

    public static emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestProgressUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<QuestProgressUpdateNotify>() {
      @java.lang.Override
      public QuestProgressUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QuestProgressUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<QuestProgressUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestProgressUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestProgressUpdateNotifyOuterClass.QuestProgressUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestProgressUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestProgressUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037QuestProgressUpdateNotify.proto\"g\n\031Que" +
      "stProgressUpdateNotify\022\020\n\010quest_id\030\002 \001(\r" +
      "\022\032\n\022fail_progress_list\030\003 \003(\r\022\034\n\024finish_p" +
      "rogress_list\030\005 \003(\rB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestProgressUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestProgressUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestProgressUpdateNotify_descriptor,
        new java.lang.String[] { "QuestId", "FailProgressList", "FinishProgressList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
