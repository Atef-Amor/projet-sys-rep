import java.rmi.*;
import java.rmi.registry.*;
import java.util.*;
import java.rmi.server.UnicastRemoteObject;


public class serveur implements taskinterface {
    private List<task> taskList;

    public serveur() {
        // Initialisation de la liste des tâches
        taskList = new ArrayList<>();
    }

    @Override
    public synchronized void addTask(task task) throws RemoteException {
        taskList.add(task);
        System.out.println("Nouvelle tâche ajoutée : " + task);
    }

    @Override
    public synchronized void removeTask(int taskId) throws RemoteException {
        for (task task : taskList) {
            if (task.getId() == taskId) {
                taskList.remove(task);
                System.out.println("Tâche supprimée : " + task);
                return;
            }
        }
        System.out.println("Aucune tâche trouvée avec l'ID : " + taskId);
    }

    @Override
    public synchronized List<task> getAllTasks() throws RemoteException {
        return new ArrayList<>(taskList);
    }

    public static void main(String[] args) {
        try {
            // Création d'une instance du serveur
            serveur server = new serveur();
            
            // Export du serveur pour qu'il puisse être accessible via RMI
            taskinterface stub = (taskinterface) UnicastRemoteObject.exportObject(server, 0);

            // Création du registre RMI sur le port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Liaison du serveur avec le nom "taskinterface"
            registry.rebind("taskinterface", stub);

            System.out.println("Serveur RMI prêt.");

        } catch (Exception e) {
            System.err.println("Erreur du serveur : " + e.toString());
            e.printStackTrace();
        }
    }
}

