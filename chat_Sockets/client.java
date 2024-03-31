
import java.io.*;
import java.net.*;

public class client {
    private static final String SERVER_ADDRESS = "localhost"; // Adresse du serveur
    private static final int PORT = 1234; // Port sur lequel le serveur écoute les connexions des clients

    public static void main(String[] args) {
        try (
            // Création du socket du client et des flux de lecture/écriture pour communiquer avec le serveur
            Socket socket = new Socket(SERVER_ADDRESS, PORT);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            System.out.println("Connecté au serveur de chat. Pour quitter, tapez \"exit\".");

            // Démarrage d'un thread pour recevoir les messages du serveur
            Thread receiverThread = new Thread(() -> {
                String message;
                try {
                    while ((message = reader.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    System.out.println("La connexion avec le serveur a été interrompue.");
                }
            });
            receiverThread.start();

            // Lecture des messages de l'utilisateur depuis la console et envoi au serveur
            String userInput;
            while ((userInput = consoleReader.readLine()) != null) {
                if ("exit".equalsIgnoreCase(userInput)) {
                    break;
                }
                writer.println(userInput);
            }
        } catch (IOException e) {
            System.out.println("Impossible de se connecter au serveur de chat: " + e.getMessage());
        }
    }
}
