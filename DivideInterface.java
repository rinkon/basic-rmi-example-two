import java.rmi.Remote;

public interface DivideInterface extends Remote {
	public int divide(int x, int y) throws Exception;
}
