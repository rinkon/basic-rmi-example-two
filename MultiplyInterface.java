import java.rmi.Remote;

public interface MultiplyInterface extends Remote {
	public int multiply(int x, int y) throws Exception;
}
