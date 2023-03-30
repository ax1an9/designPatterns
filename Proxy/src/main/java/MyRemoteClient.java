import java.rmi.Naming;

/**
 * @author:ax1an9
 * @date: 30/3/2023
 * @time: 9:41 PM
 * 使用rmi的远程调用客户端，会去rmiRegistry找对应的服务实现
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go(){
        try{
            MyRemote service=(MyRemote) Naming.lookup("rmi://localhost/RemoteHi3");
            String s=service.sayHi();
            System.out.println(s);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

}
