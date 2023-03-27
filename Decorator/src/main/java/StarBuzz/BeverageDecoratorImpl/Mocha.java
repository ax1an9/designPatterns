package StarBuzz.BeverageDecoratorImpl;

import StarBuzz.Beverage;
import StarBuzz.BeverageDecorator;

/**
 * @author:ax1an9
 * @date: 23/3/2023
 * @time: 4:55 PM
 */
public class Mocha extends BeverageDecorator {
    public Mocha(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    /**
     * @return 饮品的价格
     */
    public double cost() {
        int size=beverage.getSize();
        if(size==1){
            return 0.15+beverage.cost();
        }else if(size==2){
            return 0.20+beverage.cost();
        } else if (size==3) {
            return 0.25+beverage.cost();
        }else{
            throw new Error("size Error！");
        }
    }
}
