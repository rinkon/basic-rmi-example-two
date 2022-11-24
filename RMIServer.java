import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class RMIServer {
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, AlreadyBoundException {
		AddClass add = new AddClass();
		Naming.bind("ADD", add);
		
		SubtractClass subtract = new SubtractClass();
		Naming.bind("SUBTRACT", subtract);
		
		MultiplyClass multiply = new MultiplyClass();
		Naming.bind("MULTIPLY", multiply);
		
		DivideClass divide = new DivideClass();
		Naming.bind("DIVIDE", divide);
		
		
		System.out.println("!!SERVER STARTED....");
	}

}
