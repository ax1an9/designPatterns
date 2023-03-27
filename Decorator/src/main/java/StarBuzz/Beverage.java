package StarBuzz;

/**
 * @author:ax1an9
 * @date: 23/3/2023
 * @time: 4:37 PM
 */
public abstract class Beverage {

    /**
     * 饮品的描述
     */
    String description;

    public int getSize() {
        return size;
    }

    /**
     * 饮品的大小
     */
    protected int size;
    public String getDescription() {
        return description;
    }
    /**
     * @return 饮品的价格
     */
    public abstract double cost();

}
