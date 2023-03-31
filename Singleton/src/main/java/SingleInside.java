/**
 * @author:ax1an9
 * @date: 31/3/2023
 * @time: 4:29 PM
 */
public class SingleInside {
    private static class SingletonHolder{
        private final static SingleInside Instance=new SingleInside();
    }
    private SingleInside(){}
    public static final SingleInside getInstance(){
        return SingletonHolder.Instance;
    }


}
