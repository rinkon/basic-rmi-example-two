import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SubtractClass extends UnicastRemoteObject implements SubtractInterface {
	
	protected SubtractClass() throws RemoteException {
		super();
	}

	@Override
	public int subtract(int x, int y) throws Exception {
		return x - y;
	}

}
