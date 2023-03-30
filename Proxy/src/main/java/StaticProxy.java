/**
 * @author:ax1an9
 * @date: 30/3/2023
 * @time: 4:12 PM
 */
public class StaticProxy implements Subject {
    public StaticProxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    Subject realSubject;

    @Override
    public int sellBooks() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        return realSubject.sellBooks();
    }

    @Override
    public String speak() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        return realSubject.speak();
    }
}
