import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddClass extends UnicastRemoteObject implements AddInterface {
	
	public AddClass() throws RemoteException {
		super();
	}
	
	@Override
	public int add(int x, int y) throws Exception{
		return x + y;
	}
	
}
