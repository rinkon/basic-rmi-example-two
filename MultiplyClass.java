import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MultiplyClass extends UnicastRemoteObject implements MultiplyInterface {

	protected MultiplyClass() throws RemoteException {
		super();
	}

	@Override
	public int multiply(int x, int y) throws Exception {
		return x*y;
	}

}
