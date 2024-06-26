package messaging;

public final class MessagingServiceOuterClass {
  private MessagingServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageRequestOrBuilder extends
      
      com.google.protobuf.MessageOrBuilder {

    java.lang.String getSenderId();

    com.google.protobuf.ByteString
        getSenderIdBytes();

    java.lang.String getRecipientId();
  
    com.google.protobuf.ByteString
        getRecipientIdBytes();

    java.lang.String getText();

    com.google.protobuf.ByteString
        getTextBytes();
  }

  public  static final class MessageRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      MessageRequestOrBuilder {
  private static final long serialVersionUID = 0L;

    private MessageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MessageRequest() {
      senderId_ = "";
      recipientId_ = "";
      text_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MessageRequest(
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

              senderId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              recipientId_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              text_ = s;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return messaging.MessagingServiceOuterClass.internal_static_messaging_MessageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return messaging.MessagingServiceOuterClass.internal_static_messaging_MessageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              messaging.MessagingServiceOuterClass.MessageRequest.class, messaging.MessagingServiceOuterClass.MessageRequest.Builder.class);
    }

    public static final int SENDER_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object senderId_;

    public java.lang.String getSenderId() {
      java.lang.Object ref = senderId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senderId_ = s;
        return s;
      }
    }
    public com.google.protobuf.ByteString
        getSenderIdBytes() {
      java.lang.Object ref = senderId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECIPIENT_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object recipientId_;

    public java.lang.String getRecipientId() {
      java.lang.Object ref = recipientId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recipientId_ = s;
        return s;
      }
    }

    public com.google.protobuf.ByteString
        getRecipientIdBytes() {
      java.lang.Object ref = recipientId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recipientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TEXT_FIELD_NUMBER = 3;
    private volatile java.lang.Object text_;

    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      }
    }

    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getSenderIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, senderId_);
      }
      if (!getRecipientIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, recipientId_);
      }
      if (!getTextBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, text_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getSenderIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, senderId_);
      }
      if (!getRecipientIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, recipientId_);
      }
      if (!getTextBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, text_);
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
      if (!(obj instanceof messaging.MessagingServiceOuterClass.MessageRequest)) {
        return super.equals(obj);
      }
      messaging.MessagingServiceOuterClass.MessageRequest other = (messaging.MessagingServiceOuterClass.MessageRequest) obj;

      boolean result = true;
      result = result && getSenderId()
          .equals(other.getSenderId());
      result = result && getRecipientId()
          .equals(other.getRecipientId());
      result = result && getText()
          .equals(other.getText());
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
      hash = (37 * hash) + SENDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSenderId().hashCode();
      hash = (37 * hash) + RECIPIENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRecipientId().hashCode();
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static messaging.MessagingServiceOuterClass.MessageRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.MessageRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessageRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.MessageRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessageRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.MessageRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessageRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.MessageRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessageRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.MessageRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessageRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.MessageRequest parseFrom(
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
    public static Builder newBuilder(messaging.MessagingServiceOuterClass.MessageRequest prototype) {
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
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        messaging.MessagingServiceOuterClass.MessageRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_MessageRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_MessageRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                messaging.MessagingServiceOuterClass.MessageRequest.class, messaging.MessagingServiceOuterClass.MessageRequest.Builder.class);
      }
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
        senderId_ = "";

        recipientId_ = "";

        text_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_MessageRequest_descriptor;
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.MessageRequest getDefaultInstanceForType() {
        return messaging.MessagingServiceOuterClass.MessageRequest.getDefaultInstance();
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.MessageRequest build() {
        messaging.MessagingServiceOuterClass.MessageRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.MessageRequest buildPartial() {
        messaging.MessagingServiceOuterClass.MessageRequest result = new messaging.MessagingServiceOuterClass.MessageRequest(this);
        result.senderId_ = senderId_;
        result.recipientId_ = recipientId_;
        result.text_ = text_;
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
        if (other instanceof messaging.MessagingServiceOuterClass.MessageRequest) {
          return mergeFrom((messaging.MessagingServiceOuterClass.MessageRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(messaging.MessagingServiceOuterClass.MessageRequest other) {
        if (other == messaging.MessagingServiceOuterClass.MessageRequest.getDefaultInstance()) return this;
        if (!other.getSenderId().isEmpty()) {
          senderId_ = other.senderId_;
          onChanged();
        }
        if (!other.getRecipientId().isEmpty()) {
          recipientId_ = other.recipientId_;
          onChanged();
        }
        if (!other.getText().isEmpty()) {
          text_ = other.text_;
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
        messaging.MessagingServiceOuterClass.MessageRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (messaging.MessagingServiceOuterClass.MessageRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object senderId_ = "";

      public java.lang.String getSenderId() {
        java.lang.Object ref = senderId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          senderId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      public com.google.protobuf.ByteString
          getSenderIdBytes() {
        java.lang.Object ref = senderId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          senderId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public Builder setSenderId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        senderId_ = value;
        onChanged();
        return this;
      }

      public Builder clearSenderId() {
        
        senderId_ = getDefaultInstance().getSenderId();
        onChanged();
        return this;
      }

      public Builder setSenderIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        senderId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object recipientId_ = "";

      public java.lang.String getRecipientId() {
        java.lang.Object ref = recipientId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          recipientId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      public com.google.protobuf.ByteString
          getRecipientIdBytes() {
        java.lang.Object ref = recipientId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          recipientId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public Builder setRecipientId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        recipientId_ = value;
        onChanged();
        return this;
      }

      public Builder clearRecipientId() {
        
        recipientId_ = getDefaultInstance().getRecipientId();
        onChanged();
        return this;
      }

      public Builder setRecipientIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        recipientId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object text_ = "";

      public java.lang.String getText() {
        java.lang.Object ref = text_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          text_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      public com.google.protobuf.ByteString
          getTextBytes() {
        java.lang.Object ref = text_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          text_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
 
      public Builder setText(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        text_ = value;
        onChanged();
        return this;
      }

      public Builder clearText() {
        
        text_ = getDefaultInstance().getText();
        onChanged();
        return this;
      }
 
      public Builder setTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        text_ = value;
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


      // @@protoc_insertion_point(builder_scope:messaging.MessageRequest)
    }

    // @@protoc_insertion_point(class_scope:messaging.MessageRequest)
    private static final messaging.MessagingServiceOuterClass.MessageRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new messaging.MessagingServiceOuterClass.MessageRequest();
    }

    public static messaging.MessagingServiceOuterClass.MessageRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MessageRequest>
        PARSER = new com.google.protobuf.AbstractParser<MessageRequest>() {
      @java.lang.Override
      public MessageRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MessageRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MessageRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MessageRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public messaging.MessagingServiceOuterClass.MessageRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UserRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:messaging.UserRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string user_id = 1;</code>
     */
    java.lang.String getUserId();
    /**
     * <code>string user_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getUserIdBytes();
  }
  /**
   * Protobuf type {@code messaging.UserRequest}
   */
  public  static final class UserRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:messaging.UserRequest)
      UserRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserRequest.newBuilder() to construct.
    private UserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserRequest() {
      userId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserRequest(
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

              userId_ = s;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return messaging.MessagingServiceOuterClass.internal_static_messaging_UserRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return messaging.MessagingServiceOuterClass.internal_static_messaging_UserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              messaging.MessagingServiceOuterClass.UserRequest.class, messaging.MessagingServiceOuterClass.UserRequest.Builder.class);
    }

    public static final int USER_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object userId_;
    /**
     * <code>string user_id = 1;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getUserIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getUserIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
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
      if (!(obj instanceof messaging.MessagingServiceOuterClass.UserRequest)) {
        return super.equals(obj);
      }
      messaging.MessagingServiceOuterClass.UserRequest other = (messaging.MessagingServiceOuterClass.UserRequest) obj;

      boolean result = true;
      result = result && getUserId()
          .equals(other.getUserId());
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
      hash = (37 * hash) + USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static messaging.MessagingServiceOuterClass.UserRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.UserRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.UserRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.UserRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.UserRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.UserRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.UserRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.UserRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.UserRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.UserRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.UserRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.UserRequest parseFrom(
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
    public static Builder newBuilder(messaging.MessagingServiceOuterClass.UserRequest prototype) {
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
     * Protobuf type {@code messaging.UserRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:messaging.UserRequest)
        messaging.MessagingServiceOuterClass.UserRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_UserRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_UserRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                messaging.MessagingServiceOuterClass.UserRequest.class, messaging.MessagingServiceOuterClass.UserRequest.Builder.class);
      }

      // Construct using messaging.MessagingServiceOuterClass.UserRequest.newBuilder()
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
        userId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_UserRequest_descriptor;
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.UserRequest getDefaultInstanceForType() {
        return messaging.MessagingServiceOuterClass.UserRequest.getDefaultInstance();
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.UserRequest build() {
        messaging.MessagingServiceOuterClass.UserRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.UserRequest buildPartial() {
        messaging.MessagingServiceOuterClass.UserRequest result = new messaging.MessagingServiceOuterClass.UserRequest(this);
        result.userId_ = userId_;
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
        if (other instanceof messaging.MessagingServiceOuterClass.UserRequest) {
          return mergeFrom((messaging.MessagingServiceOuterClass.UserRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(messaging.MessagingServiceOuterClass.UserRequest other) {
        if (other == messaging.MessagingServiceOuterClass.UserRequest.getDefaultInstance()) return this;
        if (!other.getUserId().isEmpty()) {
          userId_ = other.userId_;
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
        messaging.MessagingServiceOuterClass.UserRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (messaging.MessagingServiceOuterClass.UserRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object userId_ = "";
      /**
       * <code>string user_id = 1;</code>
       */
      public java.lang.String getUserId() {
        java.lang.Object ref = userId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          userId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string user_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUserIdBytes() {
        java.lang.Object ref = userId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string user_id = 1;</code>
       */
      public Builder setUserId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string user_id = 1;</code>
       */
      public Builder clearUserId() {
        
        userId_ = getDefaultInstance().getUserId();
        onChanged();
        return this;
      }
      /**
       * <code>string user_id = 1;</code>
       */
      public Builder setUserIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        userId_ = value;
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


      // @@protoc_insertion_point(builder_scope:messaging.UserRequest)
    }

    // @@protoc_insertion_point(class_scope:messaging.UserRequest)
    private static final messaging.MessagingServiceOuterClass.UserRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new messaging.MessagingServiceOuterClass.UserRequest();
    }

    public static messaging.MessagingServiceOuterClass.UserRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserRequest>
        PARSER = new com.google.protobuf.AbstractParser<UserRequest>() {
      @java.lang.Override
      public UserRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public messaging.MessagingServiceOuterClass.UserRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MessageResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:messaging.MessageResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string message_id = 1;</code>
     */
    java.lang.String getMessageId();
    /**
     * <code>string message_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessageIdBytes();

    /**
     * <pre>
     * Success or error message
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    java.lang.String getStatus();
    /**
     * <pre>
     * Success or error message
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    com.google.protobuf.ByteString
        getStatusBytes();
  }
  /**
   * Protobuf type {@code messaging.MessageResponse}
   */
  public  static final class MessageResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:messaging.MessageResponse)
      MessageResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MessageResponse.newBuilder() to construct.
    private MessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MessageResponse() {
      messageId_ = "";
      status_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MessageResponse(
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

              messageId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              status_ = s;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return messaging.MessagingServiceOuterClass.internal_static_messaging_MessageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return messaging.MessagingServiceOuterClass.internal_static_messaging_MessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              messaging.MessagingServiceOuterClass.MessageResponse.class, messaging.MessagingServiceOuterClass.MessageResponse.Builder.class);
    }

    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object messageId_;
    /**
     * <code>string message_id = 1;</code>
     */
    public java.lang.String getMessageId() {
      java.lang.Object ref = messageId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageId_ = s;
        return s;
      }
    }
    /**
     * <code>string message_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageIdBytes() {
      java.lang.Object ref = messageId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATUS_FIELD_NUMBER = 2;
    private volatile java.lang.Object status_;
    /**
     * <pre>
     * Success or error message
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Success or error message
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getMessageIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messageId_);
      }
      if (!getStatusBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMessageIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, messageId_);
      }
      if (!getStatusBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
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
      if (!(obj instanceof messaging.MessagingServiceOuterClass.MessageResponse)) {
        return super.equals(obj);
      }
      messaging.MessagingServiceOuterClass.MessageResponse other = (messaging.MessagingServiceOuterClass.MessageResponse) obj;

      boolean result = true;
      result = result && getMessageId()
          .equals(other.getMessageId());
      result = result && getStatus()
          .equals(other.getStatus());
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
      hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMessageId().hashCode();
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static messaging.MessagingServiceOuterClass.MessageResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.MessageResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessageResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.MessageResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessageResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.MessageResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessageResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.MessageResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessageResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.MessageResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessageResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.MessageResponse parseFrom(
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
    public static Builder newBuilder(messaging.MessagingServiceOuterClass.MessageResponse prototype) {
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
     * Protobuf type {@code messaging.MessageResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:messaging.MessageResponse)
        messaging.MessagingServiceOuterClass.MessageResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_MessageResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_MessageResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                messaging.MessagingServiceOuterClass.MessageResponse.class, messaging.MessagingServiceOuterClass.MessageResponse.Builder.class);
      }

      // Construct using messaging.MessagingServiceOuterClass.MessageResponse.newBuilder()
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
        messageId_ = "";

        status_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_MessageResponse_descriptor;
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.MessageResponse getDefaultInstanceForType() {
        return messaging.MessagingServiceOuterClass.MessageResponse.getDefaultInstance();
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.MessageResponse build() {
        messaging.MessagingServiceOuterClass.MessageResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.MessageResponse buildPartial() {
        messaging.MessagingServiceOuterClass.MessageResponse result = new messaging.MessagingServiceOuterClass.MessageResponse(this);
        result.messageId_ = messageId_;
        result.status_ = status_;
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
        if (other instanceof messaging.MessagingServiceOuterClass.MessageResponse) {
          return mergeFrom((messaging.MessagingServiceOuterClass.MessageResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(messaging.MessagingServiceOuterClass.MessageResponse other) {
        if (other == messaging.MessagingServiceOuterClass.MessageResponse.getDefaultInstance()) return this;
        if (!other.getMessageId().isEmpty()) {
          messageId_ = other.messageId_;
          onChanged();
        }
        if (!other.getStatus().isEmpty()) {
          status_ = other.status_;
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
        messaging.MessagingServiceOuterClass.MessageResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (messaging.MessagingServiceOuterClass.MessageResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object messageId_ = "";
      /**
       * <code>string message_id = 1;</code>
       */
      public java.lang.String getMessageId() {
        java.lang.Object ref = messageId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          messageId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessageIdBytes() {
        java.lang.Object ref = messageId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          messageId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message_id = 1;</code>
       */
      public Builder setMessageId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        messageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message_id = 1;</code>
       */
      public Builder clearMessageId() {
        
        messageId_ = getDefaultInstance().getMessageId();
        onChanged();
        return this;
      }
      /**
       * <code>string message_id = 1;</code>
       */
      public Builder setMessageIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        messageId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object status_ = "";
      /**
       * <pre>
       * Success or error message
       * </pre>
       *
       * <code>string status = 2;</code>
       */
      public java.lang.String getStatus() {
        java.lang.Object ref = status_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          status_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Success or error message
       * </pre>
       *
       * <code>string status = 2;</code>
       */
      public com.google.protobuf.ByteString
          getStatusBytes() {
        java.lang.Object ref = status_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          status_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Success or error message
       * </pre>
       *
       * <code>string status = 2;</code>
       */
      public Builder setStatus(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Success or error message
       * </pre>
       *
       * <code>string status = 2;</code>
       */
      public Builder clearStatus() {
        
        status_ = getDefaultInstance().getStatus();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Success or error message
       * </pre>
       *
       * <code>string status = 2;</code>
       */
      public Builder setStatusBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        status_ = value;
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


      // @@protoc_insertion_point(builder_scope:messaging.MessageResponse)
    }

    // @@protoc_insertion_point(class_scope:messaging.MessageResponse)
    private static final messaging.MessagingServiceOuterClass.MessageResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new messaging.MessagingServiceOuterClass.MessageResponse();
    }

    public static messaging.MessagingServiceOuterClass.MessageResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MessageResponse>
        PARSER = new com.google.protobuf.AbstractParser<MessageResponse>() {
      @java.lang.Override
      public MessageResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MessageResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MessageResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MessageResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public messaging.MessagingServiceOuterClass.MessageResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MessagesResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:messaging.MessagesResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .messaging.Message message = 1;</code>
     */
    java.util.List<messaging.MessagingServiceOuterClass.Message> 
        getMessageList();
    /**
     * <code>repeated .messaging.Message message = 1;</code>
     */
    messaging.MessagingServiceOuterClass.Message getMessage(int index);
    /**
     * <code>repeated .messaging.Message message = 1;</code>
     */
    int getMessageCount();
    /**
     * <code>repeated .messaging.Message message = 1;</code>
     */
    java.util.List<? extends messaging.MessagingServiceOuterClass.MessageOrBuilder> 
        getMessageOrBuilderList();
    /**
     * <code>repeated .messaging.Message message = 1;</code>
     */
    messaging.MessagingServiceOuterClass.MessageOrBuilder getMessageOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code messaging.MessagesResponse}
   */
  public  static final class MessagesResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:messaging.MessagesResponse)
      MessagesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MessagesResponse.newBuilder() to construct.
    private MessagesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MessagesResponse() {
      message_ = java.util.Collections.emptyList();
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                message_ = new java.util.ArrayList<messaging.MessagingServiceOuterClass.Message>();
                mutable_bitField0_ |= 0x00000001;
              }
              message_.add(
                  input.readMessage(messaging.MessagingServiceOuterClass.Message.parser(), extensionRegistry));
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
          message_ = java.util.Collections.unmodifiableList(message_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return messaging.MessagingServiceOuterClass.internal_static_messaging_MessagesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return messaging.MessagingServiceOuterClass.internal_static_messaging_MessagesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              messaging.MessagingServiceOuterClass.MessagesResponse.class, messaging.MessagingServiceOuterClass.MessagesResponse.Builder.class);
    }

    public static final int MESSAGE_FIELD_NUMBER = 1;
    private java.util.List<messaging.MessagingServiceOuterClass.Message> message_;
    /**
     * <code>repeated .messaging.Message message = 1;</code>
     */
    public java.util.List<messaging.MessagingServiceOuterClass.Message> getMessageList() {
      return message_;
    }
    /**
     * <code>repeated .messaging.Message message = 1;</code>
     */
    public java.util.List<? extends messaging.MessagingServiceOuterClass.MessageOrBuilder> 
        getMessageOrBuilderList() {
      return message_;
    }
    /**
     * <code>repeated .messaging.Message message = 1;</code>
     */
    public int getMessageCount() {
      return message_.size();
    }
    /**
     * <code>repeated .messaging.Message message = 1;</code>
     */
    public messaging.MessagingServiceOuterClass.Message getMessage(int index) {
      return message_.get(index);
    }
    /**
     * <code>repeated .messaging.Message message = 1;</code>
     */
    public messaging.MessagingServiceOuterClass.MessageOrBuilder getMessageOrBuilder(
        int index) {
      return message_.get(index);
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
      for (int i = 0; i < message_.size(); i++) {
        output.writeMessage(1, message_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < message_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, message_.get(i));
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
      if (!(obj instanceof messaging.MessagingServiceOuterClass.MessagesResponse)) {
        return super.equals(obj);
      }
      messaging.MessagingServiceOuterClass.MessagesResponse other = (messaging.MessagingServiceOuterClass.MessagesResponse) obj;

      boolean result = true;
      result = result && getMessageList()
          .equals(other.getMessageList());
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
      if (getMessageCount() > 0) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessageList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static messaging.MessagingServiceOuterClass.MessagesResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.MessagesResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessagesResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.MessagesResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessagesResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.MessagesResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessagesResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.MessagesResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessagesResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.MessagesResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.MessagesResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.MessagesResponse parseFrom(
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
    public static Builder newBuilder(messaging.MessagingServiceOuterClass.MessagesResponse prototype) {
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
     * Protobuf type {@code messaging.MessagesResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:messaging.MessagesResponse)
        messaging.MessagingServiceOuterClass.MessagesResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_MessagesResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_MessagesResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                messaging.MessagingServiceOuterClass.MessagesResponse.class, messaging.MessagingServiceOuterClass.MessagesResponse.Builder.class);
      }

      // Construct using messaging.MessagingServiceOuterClass.MessagesResponse.newBuilder()
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
          getMessageFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (messageBuilder_ == null) {
          message_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          messageBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_MessagesResponse_descriptor;
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.MessagesResponse getDefaultInstanceForType() {
        return messaging.MessagingServiceOuterClass.MessagesResponse.getDefaultInstance();
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.MessagesResponse build() {
        messaging.MessagingServiceOuterClass.MessagesResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.MessagesResponse buildPartial() {
        messaging.MessagingServiceOuterClass.MessagesResponse result = new messaging.MessagingServiceOuterClass.MessagesResponse(this);
        int from_bitField0_ = bitField0_;
        if (messageBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            message_ = java.util.Collections.unmodifiableList(message_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.message_ = message_;
        } else {
          result.message_ = messageBuilder_.build();
        }
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
        if (other instanceof messaging.MessagingServiceOuterClass.MessagesResponse) {
          return mergeFrom((messaging.MessagingServiceOuterClass.MessagesResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(messaging.MessagingServiceOuterClass.MessagesResponse other) {
        if (other == messaging.MessagingServiceOuterClass.MessagesResponse.getDefaultInstance()) return this;
        if (messageBuilder_ == null) {
          if (!other.message_.isEmpty()) {
            if (message_.isEmpty()) {
              message_ = other.message_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMessageIsMutable();
              message_.addAll(other.message_);
            }
            onChanged();
          }
        } else {
          if (!other.message_.isEmpty()) {
            if (messageBuilder_.isEmpty()) {
              messageBuilder_.dispose();
              messageBuilder_ = null;
              message_ = other.message_;
              bitField0_ = (bitField0_ & ~0x00000001);
              messageBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMessageFieldBuilder() : null;
            } else {
              messageBuilder_.addAllMessages(other.message_);
            }
          }
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
        messaging.MessagingServiceOuterClass.MessagesResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (messaging.MessagingServiceOuterClass.MessagesResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<messaging.MessagingServiceOuterClass.Message> message_ =
        java.util.Collections.emptyList();
      private void ensureMessageIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          message_ = new java.util.ArrayList<messaging.MessagingServiceOuterClass.Message>(message_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          messaging.MessagingServiceOuterClass.Message, messaging.MessagingServiceOuterClass.Message.Builder, messaging.MessagingServiceOuterClass.MessageOrBuilder> messageBuilder_;

      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public java.util.List<messaging.MessagingServiceOuterClass.Message> getMessageList() {
        if (messageBuilder_ == null) {
          return java.util.Collections.unmodifiableList(message_);
        } else {
          return messageBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public int getMessageCount() {
        if (messageBuilder_ == null) {
          return message_.size();
        } else {
          return messageBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public messaging.MessagingServiceOuterClass.Message getMessage(int index) {
        if (messageBuilder_ == null) {
          return message_.get(index);
        } else {
          return messageBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public Builder setMessage(
          int index, messaging.MessagingServiceOuterClass.Message value) {
        if (messageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMessageIsMutable();
          message_.set(index, value);
          onChanged();
        } else {
          messageBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public Builder setMessage(
          int index, messaging.MessagingServiceOuterClass.Message.Builder builderForValue) {
        if (messageBuilder_ == null) {
          ensureMessageIsMutable();
          message_.set(index, builderForValue.build());
          onChanged();
        } else {
          messageBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public Builder addMessage(messaging.MessagingServiceOuterClass.Message value) {
        if (messageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMessageIsMutable();
          message_.add(value);
          onChanged();
        } else {
          messageBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public Builder addMessage(
          int index, messaging.MessagingServiceOuterClass.Message value) {
        if (messageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMessageIsMutable();
          message_.add(index, value);
          onChanged();
        } else {
          messageBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public Builder addMessage(
          messaging.MessagingServiceOuterClass.Message.Builder builderForValue) {
        if (messageBuilder_ == null) {
          ensureMessageIsMutable();
          message_.add(builderForValue.build());
          onChanged();
        } else {
          messageBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public Builder addMessage(
          int index, messaging.MessagingServiceOuterClass.Message.Builder builderForValue) {
        if (messageBuilder_ == null) {
          ensureMessageIsMutable();
          message_.add(index, builderForValue.build());
          onChanged();
        } else {
          messageBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public Builder addAllMessage(
          java.lang.Iterable<? extends messaging.MessagingServiceOuterClass.Message> values) {
        if (messageBuilder_ == null) {
          ensureMessageIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, message_);
          onChanged();
        } else {
          messageBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public Builder clearMessage() {
        if (messageBuilder_ == null) {
          message_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          messageBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public Builder removeMessage(int index) {
        if (messageBuilder_ == null) {
          ensureMessageIsMutable();
          message_.remove(index);
          onChanged();
        } else {
          messageBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public messaging.MessagingServiceOuterClass.Message.Builder getMessageBuilder(
          int index) {
        return getMessageFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public messaging.MessagingServiceOuterClass.MessageOrBuilder getMessageOrBuilder(
          int index) {
        if (messageBuilder_ == null) {
          return message_.get(index);  } else {
          return messageBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public java.util.List<? extends messaging.MessagingServiceOuterClass.MessageOrBuilder> 
           getMessageOrBuilderList() {
        if (messageBuilder_ != null) {
          return messageBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(message_);
        }
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public messaging.MessagingServiceOuterClass.Message.Builder addMessageBuilder() {
        return getMessageFieldBuilder().addBuilder(
            messaging.MessagingServiceOuterClass.Message.getDefaultInstance());
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public messaging.MessagingServiceOuterClass.Message.Builder addMessageBuilder(
          int index) {
        return getMessageFieldBuilder().addBuilder(
            index, messaging.MessagingServiceOuterClass.Message.getDefaultInstance());
      }
      /**
       * <code>repeated .messaging.Message message = 1;</code>
       */
      public java.util.List<messaging.MessagingServiceOuterClass.Message.Builder> 
           getMessageBuilderList() {
        return getMessageFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          messaging.MessagingServiceOuterClass.Message, messaging.MessagingServiceOuterClass.Message.Builder, messaging.MessagingServiceOuterClass.MessageOrBuilder> 
          getMessageFieldBuilder() {
        if (messageBuilder_ == null) {
          messageBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              messaging.MessagingServiceOuterClass.Message, messaging.MessagingServiceOuterClass.Message.Builder, messaging.MessagingServiceOuterClass.MessageOrBuilder>(
                  message_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          message_ = null;
        }
        return messageBuilder_;
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


      // @@protoc_insertion_point(builder_scope:messaging.MessagesResponse)
    }

    // @@protoc_insertion_point(class_scope:messaging.MessagesResponse)
    private static final messaging.MessagingServiceOuterClass.MessagesResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new messaging.MessagingServiceOuterClass.MessagesResponse();
    }

    public static messaging.MessagingServiceOuterClass.MessagesResponse getDefaultInstance() {
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
    public messaging.MessagingServiceOuterClass.MessagesResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:messaging.Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string message_id = 1;</code>
     */
    java.lang.String getMessageId();
    /**
     * <code>string message_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessageIdBytes();

    /**
     * <code>string sender_id = 2;</code>
     */
    java.lang.String getSenderId();
    /**
     * <code>string sender_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getSenderIdBytes();

    /**
     * <code>string text = 3;</code>
     */
    java.lang.String getText();
    /**
     * <code>string text = 3;</code>
     */
    com.google.protobuf.ByteString
        getTextBytes();
  }
  /**
   * Protobuf type {@code messaging.Message}
   */
  public  static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:messaging.Message)
      MessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      messageId_ = "";
      senderId_ = "";
      text_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Message(
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

              messageId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              senderId_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              text_ = s;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return messaging.MessagingServiceOuterClass.internal_static_messaging_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return messaging.MessagingServiceOuterClass.internal_static_messaging_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              messaging.MessagingServiceOuterClass.Message.class, messaging.MessagingServiceOuterClass.Message.Builder.class);
    }

    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object messageId_;
    /**
     * <code>string message_id = 1;</code>
     */
    public java.lang.String getMessageId() {
      java.lang.Object ref = messageId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageId_ = s;
        return s;
      }
    }
    /**
     * <code>string message_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageIdBytes() {
      java.lang.Object ref = messageId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENDER_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object senderId_;
    /**
     * <code>string sender_id = 2;</code>
     */
    public java.lang.String getSenderId() {
      java.lang.Object ref = senderId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senderId_ = s;
        return s;
      }
    }
    /**
     * <code>string sender_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSenderIdBytes() {
      java.lang.Object ref = senderId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TEXT_FIELD_NUMBER = 3;
    private volatile java.lang.Object text_;
    /**
     * <code>string text = 3;</code>
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      }
    }
    /**
     * <code>string text = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getMessageIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messageId_);
      }
      if (!getSenderIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, senderId_);
      }
      if (!getTextBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, text_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMessageIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, messageId_);
      }
      if (!getSenderIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, senderId_);
      }
      if (!getTextBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, text_);
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
      if (!(obj instanceof messaging.MessagingServiceOuterClass.Message)) {
        return super.equals(obj);
      }
      messaging.MessagingServiceOuterClass.Message other = (messaging.MessagingServiceOuterClass.Message) obj;

      boolean result = true;
      result = result && getMessageId()
          .equals(other.getMessageId());
      result = result && getSenderId()
          .equals(other.getSenderId());
      result = result && getText()
          .equals(other.getText());
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
      hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMessageId().hashCode();
      hash = (37 * hash) + SENDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSenderId().hashCode();
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static messaging.MessagingServiceOuterClass.Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messaging.MessagingServiceOuterClass.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static messaging.MessagingServiceOuterClass.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messaging.MessagingServiceOuterClass.Message parseFrom(
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
    public static Builder newBuilder(messaging.MessagingServiceOuterClass.Message prototype) {
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
     * Protobuf type {@code messaging.Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:messaging.Message)
        messaging.MessagingServiceOuterClass.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_Message_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                messaging.MessagingServiceOuterClass.Message.class, messaging.MessagingServiceOuterClass.Message.Builder.class);
      }

      // Construct using messaging.MessagingServiceOuterClass.Message.newBuilder()
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
        messageId_ = "";

        senderId_ = "";

        text_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return messaging.MessagingServiceOuterClass.internal_static_messaging_Message_descriptor;
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.Message getDefaultInstanceForType() {
        return messaging.MessagingServiceOuterClass.Message.getDefaultInstance();
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.Message build() {
        messaging.MessagingServiceOuterClass.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public messaging.MessagingServiceOuterClass.Message buildPartial() {
        messaging.MessagingServiceOuterClass.Message result = new messaging.MessagingServiceOuterClass.Message(this);
        result.messageId_ = messageId_;
        result.senderId_ = senderId_;
        result.text_ = text_;
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
        if (other instanceof messaging.MessagingServiceOuterClass.Message) {
          return mergeFrom((messaging.MessagingServiceOuterClass.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(messaging.MessagingServiceOuterClass.Message other) {
        if (other == messaging.MessagingServiceOuterClass.Message.getDefaultInstance()) return this;
        if (!other.getMessageId().isEmpty()) {
          messageId_ = other.messageId_;
          onChanged();
        }
        if (!other.getSenderId().isEmpty()) {
          senderId_ = other.senderId_;
          onChanged();
        }
        if (!other.getText().isEmpty()) {
          text_ = other.text_;
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
        messaging.MessagingServiceOuterClass.Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (messaging.MessagingServiceOuterClass.Message) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object messageId_ = "";
      /**
       * <code>string message_id = 1;</code>
       */
      public java.lang.String getMessageId() {
        java.lang.Object ref = messageId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          messageId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessageIdBytes() {
        java.lang.Object ref = messageId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          messageId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message_id = 1;</code>
       */
      public Builder setMessageId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        messageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message_id = 1;</code>
       */
      public Builder clearMessageId() {
        
        messageId_ = getDefaultInstance().getMessageId();
        onChanged();
        return this;
      }
      /**
       * <code>string message_id = 1;</code>
       */
      public Builder setMessageIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        messageId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object senderId_ = "";
      /**
       * <code>string sender_id = 2;</code>
       */
      public java.lang.String getSenderId() {
        java.lang.Object ref = senderId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          senderId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string sender_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getSenderIdBytes() {
        java.lang.Object ref = senderId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          senderId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string sender_id = 2;</code>
       */
      public Builder setSenderId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        senderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string sender_id = 2;</code>
       */
      public Builder clearSenderId() {
        
        senderId_ = getDefaultInstance().getSenderId();
        onChanged();
        return this;
      }
      /**
       * <code>string sender_id = 2;</code>
       */
      public Builder setSenderIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        senderId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object text_ = "";
      /**
       * <code>string text = 3;</code>
       */
      public java.lang.String getText() {
        java.lang.Object ref = text_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          text_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string text = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTextBytes() {
        java.lang.Object ref = text_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          text_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string text = 3;</code>
       */
      public Builder setText(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        text_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string text = 3;</code>
       */
      public Builder clearText() {
        
        text_ = getDefaultInstance().getText();
        onChanged();
        return this;
      }
      /**
       * <code>string text = 3;</code>
       */
      public Builder setTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        text_ = value;
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


      // @@protoc_insertion_point(builder_scope:messaging.Message)
    }

    // @@protoc_insertion_point(class_scope:messaging.Message)
    private static final messaging.MessagingServiceOuterClass.Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new messaging.MessagingServiceOuterClass.Message();
    }

    public static messaging.MessagingServiceOuterClass.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      @java.lang.Override
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Message(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public messaging.MessagingServiceOuterClass.Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messaging_MessageRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messaging_MessageRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messaging_UserRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messaging_UserRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messaging_MessageResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messaging_MessageResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messaging_MessagesResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messaging_MessagesResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messaging_Message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messaging_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MessagingService.proto\022\tmessaging\"G\n\016M" +
      "essageRequest\022\021\n\tsender_id\030\001 \001(\t\022\024\n\014reci" +
      "pient_id\030\002 \001(\t\022\014\n\004text\030\003 \001(\t\"\036\n\013UserRequ" +
      "est\022\017\n\007user_id\030\001 \001(\t\"5\n\017MessageResponse\022" +
      "\022\n\nmessage_id\030\001 \001(\t\022\016\n\006status\030\002 \001(\t\"7\n\020M" +
      "essagesResponse\022#\n\007message\030\001 \003(\0132\022.messa" +
      "ging.Message\">\n\007Message\022\022\n\nmessage_id\030\001 " +
      "\001(\t\022\021\n\tsender_id\030\002 \001(\t\022\014\n\004text\030\003 \001(\t2\243\001\n" +
      "\020MessagingService\022D\n\013SendMessage\022\031.messa" +
      "ging.MessageRequest\032\032.messaging.MessageR" +
      "esponse\022I\n\022GetMessagesForUser\022\026.messagin" +
      "g.UserRequest\032\033.messaging.MessagesRespon" +
      "seb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_messaging_MessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_messaging_MessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messaging_MessageRequest_descriptor,
        new java.lang.String[] { "SenderId", "RecipientId", "Text", });
    internal_static_messaging_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_messaging_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messaging_UserRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_messaging_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_messaging_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messaging_MessageResponse_descriptor,
        new java.lang.String[] { "MessageId", "Status", });
    internal_static_messaging_MessagesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_messaging_MessagesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messaging_MessagesResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_messaging_Message_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_messaging_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messaging_Message_descriptor,
        new java.lang.String[] { "MessageId", "SenderId", "Text", });
  }
}
