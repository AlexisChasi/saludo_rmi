import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Registry registro = LocateRegistry.getRegistry("localhost", 1234);
            interfaz objetoRemoto = (interfaz) registro.lookup("ServicioSaludo");

            System.out.println("Ingrese su nombre:");
            String nombre = scanner.nextLine();

            String respuesta = objetoRemoto.saludar(nombre);
            System.out.println(respuesta);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
