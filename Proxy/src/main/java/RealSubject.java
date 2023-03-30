/**
 * @author:ax1an9
 * @date: 30/3/2023
 * @time: 2:49 PM
 */
public class RealSubject implements Subject {
    @Override
    public int sellBooks() {
        System.out.println("卖书");
        return 1;
    }

    @Override
    public String speak() {
        System.out.println("说话");
        return "John";
    }
}
