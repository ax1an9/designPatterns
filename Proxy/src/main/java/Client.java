import java.lang.reflect.Proxy;

/**
 * @author:ax1an9
 * @date: 30/3/2023
 * @time: 2:52 PM
 */
public class Client {
    public static void main(String[] args) {
        useDynamicProxy();//而动态代理的对象是在运行时创建出来的
        useStaticProxy();//static类在编译的时候已经创建

    }

    static void useStaticProxy() {
        System.out.println("USE static proxy!");
        //真实对象
        Subject realSubject = new RealSubject();
        final StaticProxy staticProxy = new StaticProxy(realSubject);
        System.out.println(realSubject.hashCode());
        staticProxy.sellBooks();
        staticProxy.speak();
        System.out.println(Proxy.isProxyClass(staticProxy.getClass()));//false
        System.out.println(staticProxy.hashCode());
    }

    static void useDynamicProxy() {
        /*
         * 在运行状态中，需要代理的地方
         * 根据 Subject 和 RealSubject，动态地创建一个 Proxy
         * 用完之后，就会销毁，这样就可以避免了 Proxy 角色的 class 在系统中冗杂的问题了。
         */
        Subject realSubject = new RealSubject();//真实对象

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);

        System.out.println(realSubject.hashCode());

        //another choice:ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler
        Subject subject = (Subject) Proxy.newProxyInstance(
                myInvocationHandler.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                myInvocationHandler);

        subject.sellBooks();

        subject.speak();
        System.out.println(Proxy.isProxyClass(subject.getClass()));//true
        System.out.println(subject.hashCode());
    }
}
