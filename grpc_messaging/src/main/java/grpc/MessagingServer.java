package grpc ;
import messaging.*;
import messaging.MessagingServiceOuterClass.Message;
import messaging.MessagingServiceOuterClass.MessageRequest;
import messaging.MessagingServiceOuterClass.MessageResponse;
import messaging.MessagingServiceOuterClass.MessagesResponse;
import messaging.MessagingServiceOuterClass.UserRequest;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class MessagingServer {

    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9000)
                .addService(new MessagingServiceImpl())
                .build();

        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }

    static class MessagingServiceImpl extends MessagingServiceGrpc.MessagingServiceImplBase {

        @Override
        public void sendMessage(MessageRequest request, StreamObserver<MessageResponse> responseObserver) {
            // Implement your logic to handle sending a message
            String messageId = "89"; // Example message id
            MessageResponse response = MessageResponse.newBuilder()
                    .setMessageId(messageId)
                    .setStatus("Message sent successfully")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void getMessagesForUser(UserRequest request, StreamObserver<MessagesResponse> responseObserver) {
            // Implement your logic to retrieve messages for a user
            Message message1 = Message.newBuilder()
                    .setMessageId("11")
                    .setSenderId("sender11")
                    .setText("Message 11")
                    .build();
            Message message2 = Message.newBuilder()
                    .setMessageId("23")
                    .setSenderId("sender23")
                    .setText("Message 23")
                    .build();
            MessagesResponse response = MessagesResponse.newBuilder()
                    .addMessage(message1)
                    .addMessage(message2)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
