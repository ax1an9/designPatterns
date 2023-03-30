import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @author:ax1an9
 * @date: 30/3/2023
 * @time: 9:38 PM
 */
public class MyRemoteImpl implements MyRemote , Serializable {
    public static void main(String[] args) {
        /*
         * 将实现的服务注册到rmiRegistry
         */
        try {
            MyRemote service=new MyRemoteImpl();
            Naming.rebind("RemoteHi3",service);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
    public MyRemoteImpl() throws RemoteException{
    }

    @Override
    public String sayHi() throws RemoteException {
        return "Hi,you";
    }
}
