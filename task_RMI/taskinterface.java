import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface taskinterface extends Remote {
    void addTask(task task) throws RemoteException;
    void removeTask(int taskId) throws RemoteException;
    List<task> getAllTasks() throws RemoteException;
}
