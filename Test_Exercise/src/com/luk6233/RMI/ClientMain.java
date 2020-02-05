package RMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {
    public static final String UNIQUE_BINDING_NAME = "server.calculator";

    public static void main(String[] args) throws RemoteException, NotBoundException {
        final Registry registry = LocateRegistry.getRegistry(1500);

        Calculator calculator = (Calculator) registry.lookup(UNIQUE_BINDING_NAME);

        int multiplyResult = calculator.multiply(3, 8);

        System.out.println(multiplyResult);
    }
}
