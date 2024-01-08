import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class servidor {
    public static void main(String[] args) {
        try {
            interfaz objetoRemoto = new ImplementacionInterfaz();
            Registry registro = LocateRegistry.createRegistry(1234);
            registro.rebind("ServicioSaludo", objetoRemoto);
            System.out.println("Servidor RMI está listo.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
