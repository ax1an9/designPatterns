import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author:ax1an9
 * @date: 30/3/2023
 * @time: 9:32 PM
 * 使用rmi的远程调用接口
 */
public interface MyRemote extends Remote {
    String sayHi() throws RemoteException;
}
