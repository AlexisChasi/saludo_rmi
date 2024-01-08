import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplementacionInterfaz extends UnicastRemoteObject implements interfaz {

    protected ImplementacionInterfaz() throws RemoteException {
        super();
    }

    @Override
    public String saludar(String nombre) throws RemoteException {
        return "¡Hola, " + nombre + "! Bienvenido al servicio RMI.";
    }
}
