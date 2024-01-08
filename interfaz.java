import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfaz extends Remote {
    String saludar(String nombre) throws RemoteException;
}
