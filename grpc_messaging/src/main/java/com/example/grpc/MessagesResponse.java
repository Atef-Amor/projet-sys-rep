// Generated by the protocol buffer compiler. 
package com.example.grpc;

/**
 * Protobuf type {@code MessagesResponse}
 */
public  final class MessagesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MessagesResponse)
    MessagesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MessagesResponse.newBuilder() to construct.
  private MessagesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessagesResponse() {
    messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MessagesResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              messages_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            messages_.add(s);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        messages_ = messages_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.MessagingProto.internal_static_MessagesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.MessagingProto.internal_static_MessagesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.MessagesResponse.class, com.example.grpc.MessagesResponse.Builder.class);
  }

  public static final int MESSAGES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList messages_;
  /**
   * <code>repeated string messages = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMessagesList() {
    return messages_;
  }
  /**
   * <code>repeated string messages = 1;</code>
   */
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   * <code>repeated string messages = 1;</code>
   */
  public java.lang.String getMessages(int index) {
    return messages_.get(index);
  }
  /**
   * <code>repeated string messages = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessagesBytes(int index) {
    return messages_.getByteString(index);
  }

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
    for (int i = 0; i < messages_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messages_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < messages_.size(); i++) {
        dataSize += computeStringSizeNoTag(messages_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMessagesList().size();
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
    if (!(obj instanceof com.example.grpc.MessagesResponse)) {
      return super.equals(obj);
    }
    com.example.grpc.MessagesResponse other = (com.example.grpc.MessagesResponse) obj;

    boolean result = true;
    result = result && getMessagesList()
        .equals(other.getMessagesList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.MessagesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.MessagesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.MessagesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.MessagesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.MessagesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.MessagesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.MessagesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.MessagesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.MessagesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.MessagesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.MessagesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.MessagesResponse parseFrom(
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
  public static Builder newBuilder(com.example.grpc.MessagesResponse prototype) {
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
   * Protobuf type {@code MessagesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MessagesResponse)
      com.example.grpc.MessagesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.MessagingProto.internal_static_MessagesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.MessagingProto.internal_static_MessagesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.MessagesResponse.class, com.example.grpc.MessagesResponse.Builder.class);
    }

    // Construct using com.example.grpc.MessagesResponse.newBuilder()
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
      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.MessagingProto.internal_static_MessagesResponse_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.MessagesResponse getDefaultInstanceForType() {
      return com.example.grpc.MessagesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.MessagesResponse build() {
      com.example.grpc.MessagesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.MessagesResponse buildPartial() {
      com.example.grpc.MessagesResponse result = new com.example.grpc.MessagesResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        messages_ = messages_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.messages_ = messages_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.MessagesResponse) {
        return mergeFrom((com.example.grpc.MessagesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.MessagesResponse other) {
      if (other == com.example.grpc.MessagesResponse.getDefaultInstance()) return this;
      if (!other.messages_.isEmpty()) {
        if (messages_.isEmpty()) {
          messages_ = other.messages_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMessagesIsMutable();
          messages_.addAll(other.messages_);
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
      com.example.grpc.MessagesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.MessagesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        messages_ = new com.google.protobuf.LazyStringArrayList(messages_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMessagesList() {
      return messages_.getUnmodifiableView();
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public int getMessagesCount() {
      return messages_.size();
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public java.lang.String getMessages(int index) {
      return messages_.get(index);
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessagesBytes(int index) {
      return messages_.getByteString(index);
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public Builder setMessages(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessagesIsMutable();
      messages_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public Builder addMessages(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessagesIsMutable();
      messages_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public Builder addAllMessages(
        java.lang.Iterable<java.lang.String> values) {
      ensureMessagesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, messages_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public Builder clearMessages() {
      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 1;</code>
     */
    public Builder addMessagesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMessagesIsMutable();
      messages_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:MessagesResponse)
  }

  // @@protoc_insertion_point(class_scope:MessagesResponse)
  private static final com.example.grpc.MessagesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.MessagesResponse();
  }

  public static com.example.grpc.MessagesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessagesResponse>
      PARSER = new com.google.protobuf.AbstractParser<MessagesResponse>() {
    @java.lang.Override
    public MessagesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MessagesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MessagesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessagesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.MessagesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

