import java.rmi.registry.*;
import java.util.List;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            // Obtention du registre RMI sur le localhost et le port 1099
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Recherche du service distant par son nom
            taskinterface stub = (taskinterface) registry.lookup("taskinterface");
            Scanner scanner = new Scanner(System.in);
            // Ajout de tâches
            System.out.println("Entrez le nombre de tâches à ajouter :");
            int numTasksToAdd = scanner.nextInt();
            scanner.nextLine(); // Pour consommer le saut de ligne
    
            for (int i = 0; i < numTasksToAdd; i++) {
                System.out.println("Entrez la description de la tâche " + (i + 1) + ":");
                String description = scanner.nextLine();
                stub.addTask(new task(i + 1, description));
            }

            // Récupération de la liste des tâches
            List<task> tasks = stub.getAllTasks();
            System.out.println("Liste des tâches :");
            for (task task : tasks) {
                System.out.println(task);
            }

             // Suppression de tâches
             System.out.println("Entrez le nombre de tâches à supprimer :");
             int numTasksToRemove = scanner.nextInt();
             for (int i = 0; i < numTasksToRemove; i++) {
                 System.out.println("Entrez l'ID de la tâche à supprimer " + (i + 1) + ":");
                 int taskId = scanner.nextInt();
                 stub.removeTask(taskId);
             }

            // Récupération de la liste des tâches mise à jour
            tasks = stub.getAllTasks();
            System.out.println("Liste des tâches mise à jour :");
            for (task task : tasks) {
                System.out.println(task);
            }

        } catch (Exception e) {
            System.err.println("Erreur du client : " + e.toString());
            e.printStackTrace();
        }
    }
}
