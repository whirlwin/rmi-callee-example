
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class Greeter extends UnicastRemoteObject implements Greetable {

    public Greeter() throws RemoteException { super(); }

    @Override
    public String greet() throws RemoteException { return "Hi"; }

    public static void main(String[] args) throws Exception {

        // Bind to rmiregistry
        Naming.bind("rmi://localhost/Greeter", new Greeter());
    }
}
