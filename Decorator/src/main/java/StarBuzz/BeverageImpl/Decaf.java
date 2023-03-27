package StarBuzz.BeverageImpl;

import StarBuzz.Beverage;

/**
 * @author:ax1an9
 * @date: 23/3/2023
 * @time: 5:17 PM
 */
public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        return "Decaf"+"("+"size:"+getSize()+")";
    }

    public Decaf(int size) {
        this.size=size;
    }

    /**
     * @return 饮品的价格
     */
    public double cost() {
        if(size==1){
            return 3.8;
        }else if(size==2){
            return 4.5;
        } else if (size==3) {
            return 5.0;
        }else{
            throw new Error("size Error！");
        }
    }
}
