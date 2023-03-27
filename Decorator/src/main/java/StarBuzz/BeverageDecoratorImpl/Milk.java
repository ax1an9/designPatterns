package StarBuzz.BeverageDecoratorImpl;

import StarBuzz.Beverage;
import StarBuzz.BeverageDecorator;

/**
 * @author:ax1an9
 * @date: 23/3/2023
 * @time: 5:01 PM
 */
public class Milk extends BeverageDecorator {
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    public Milk(Beverage beverage) {
        this.beverage=beverage;
    }

    /**
     * @return 饮品的价格
     */
    public double cost() {
        int size=beverage.getSize();
        if(size==1){
            return 0.05+beverage.cost();
        }else if(size==2){
            return 0.10+beverage.cost();
        } else if (size==3) {
            return 0.15+beverage.cost();
        }else{
            throw new Error("size Error！");
        }
    }
}
