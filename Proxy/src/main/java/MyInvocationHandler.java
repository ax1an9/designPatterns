import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author:ax1an9
 * @date: 30/3/2023
 * @time: 2:50 PM
 */
public class MyInvocationHandler implements InvocationHandler {


    /**
     * 因为需要处理真实角色，所以要把真实角色传进来
     */
    Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        //设置代理的对象
        this.realSubject = realSubject;
    }

    /**
     * @param proxy  代理类（真实的对象）
     * @param method 正在调用的方法（所要调用真实对象的某个方法的 Method 对象）
     * @param args   方法的参数（所要调用真实对象某个方法时接受的参数）
     * @return 调用方法的返回值
     * @throws Throwable 可能的异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("调用代理类:");
//        if(method.getName().equals("sellBooks")){
//            int invoke = (int)method.invoke(realSubject, args);
//            System.out.println("调用的是卖书的方法");
//            return invoke ;
//        }else {
//            String string = (String) method.invoke(realSubject,args) ;
//            System.out.println("调用的是说话的方法");
//            return  string ;
//        }
        // 在代理真实对象前我们可以添加一些自己的操作(AOP)
        System.out.println("Before method");
        System.out.println("Call Method: " + method);
        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object obj = method.invoke(realSubject, args);
        // 在代理真实对象后我们也可以添加一些自己的操作(AOP)
        System.out.println("After method");
        System.out.println();
        //如果需要调整返回值，可能需要根据Method的实际情况来操作
        return obj;
    }
}