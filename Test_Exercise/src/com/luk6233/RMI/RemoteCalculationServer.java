package Test_Exercise.src.com.luk_d.RMI;

import java.rmi.RemoteException;

public class RemoteCalculationServer implements Calculator {

    @Override
    public int multiply(int x, int y) throws RemoteException {
        return x * y;
    }

}
