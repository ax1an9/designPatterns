import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

/**
 * @author:ax1an9
 * @date: 31/3/2023
 * @time: 5:19 PM
 */
public class BreakSingleton{

    public static void main(String[] args) throws Exception{

        //先根据单例模式创建对象(单例模式所以s1,s2是一样的)
        Single s1=Single.getInstance();
        Single s2=Single.getInstance();
//        String str= System.getProperty("user.dir");
//        System.out.println(str);
//将s1写入本地某个路径
        FileOutputStream fos=new FileOutputStream("./Singleton/outputOBJ");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

//从本地某个路径读取写入的对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("./Singleton/outputOBJ"));
        Single s3=(Single) ois.readObject();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);//s3是一个新对象
    }

}