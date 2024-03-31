import java.io.*;
import java.net.*;
import java.util.*;

public class serveur {
    private static final int PORT = 1234; // Port sur lequel le serveur écoute les connexions des clients
    private static Set<PrintWriter> writers = new HashSet<>(); // Ensemble de PrintWriter pour les clients connectés

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) { // Création d'un ServerSocket pour le serveur
            System.out.println("Serveur de chat démarré sur le port " + PORT);

            while (true) {
                new ClientHandler(serverSocket.accept()).start(); // Accepte une nouvelle connexion client et démarre un thread de gestion pour ce client
            }
        } catch (IOException e) {
            System.out.println("Erreur lors du démarrage du serveur: " + e.getMessage());
        }
    }

    // Classe interne pour gérer les clients individuels
    private static class ClientHandler extends Thread {
        private Socket clientSocket; // Socket du client
        private PrintWriter writer; // PrintWriter pour écrire les messages au client

        // Constructeur prenant le socket du client
        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        // Méthode exécutée lors du démarrage du thread
        public void run() {
            try {
                // Création de BufferedReader pour lire les messages du client
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                // Création de PrintWriter pour écrire les messages vers le client
                writer = new PrintWriter(clientSocket.getOutputStream(), true);

                // Ajout du PrintWriter du client à l'ensemble des writers
                writers.add(writer);

                String message;
                // Boucle pour lire les messages du client
                while ((message = reader.readLine()) != null) {
                    System.out.println("Message reçu: " + message);
                    // Diffusion du message à tous les clients connectés
                    broadcast(message);
                }
            } catch (IOException e) {
                System.out.println("Erreur de communication avec un client: " + e.getMessage());
            } finally {
                // Retrait du PrintWriter du client de l'ensemble des writers
                if (writer != null) {
                    writers.remove(writer);
                }
                try {
                    // Fermeture du socket du client
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // Méthode pour diffuser un message à tous les clients connectés
        private void broadcast(String message) {
            for (PrintWriter writer : writers) {
                writer.println(message);
                writer.flush();
            }
        }
    }
}
