import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author:ax1an9
 * @date: 31/3/2023
 * @time: 4:23 PM
 */
public class Single implements Serializable {
    public  volatile static Single Instance;
    private Single() {
    }
    public static Single getInstance(){
        if(Instance==null){
            synchronized (Single.class){
                if(Instance==null){
                    Instance=new Single();
                }
            }
        }
        return Instance;
    }
    //反序列化定义该方法，则不需要创建新对象
    private Object readResolve() throws ObjectStreamException {
        return Instance;
    }
}
