
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Greetable extends Remote {

    String greet() throws RemoteException;
}
