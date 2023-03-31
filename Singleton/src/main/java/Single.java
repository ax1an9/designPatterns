/**
 * @author:ax1an9
 * @date: 31/3/2023
 * @time: 4:23 PM
 */
public class Single {
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
}
