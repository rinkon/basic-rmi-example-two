import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DivideClass extends UnicastRemoteObject implements DivideInterface{

	protected DivideClass() throws RemoteException {
		super();
	}

	@Override
	public int divide(int x, int y) throws Exception {
		return x/y;
	}

}
