import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RMIClient {
	public static void main(String[] args) throws Exception {
		
		AddInterface addObject = (AddInterface) Naming.lookup("ADD");
		SubtractInterface subtractObject = (SubtractInterface) Naming.lookup("SUBTRACT");
		MultiplyInterface multiplyObject = (MultiplyInterface) Naming.lookup("MULTIPLY");
		DivideInterface divideObject = (DivideInterface) Naming.lookup("DIVIDE");
		
		int first, second;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER FIRST NUMBER: ");
		first = sc.nextInt();
		
		System.out.print("ENTER SECOND NUMBER: ");
		second = sc.nextInt();
		
		
		System.out.println("ADDITION RESULT: " + addObject.add(first, second));
		System.out.println("SUBTACTION RESULT: " + subtractObject.subtract(first, second));
		System.out.println("MUTIPLICATION RESULT: " + multiplyObject.multiply(first, second));
		System.out.println("DIVISION RESULT: " + divideObject.divide(first, second));
		
	}
}
