/**
 * @author:ax1an9
 * @date: 5/4/2023
 * @time: 9:29 PM
 */
public class Context {
    /*
    * 运行时的配置/上下文
    * */
    OpStrategy strategy;//当前的指定计算策略
    Context(OpStrategy strategy){
        this.strategy=strategy;
    }
    public int execStrategy(int n1,int n2){
        return strategy.operation(n1,n2);
    }
}
