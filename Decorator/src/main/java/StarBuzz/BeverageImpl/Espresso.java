package StarBuzz.BeverageImpl;

import StarBuzz.Beverage;

/**
 * @author:ax1an9
 * @date: 23/3/2023
 * @time: 4:42 PM
 */
public class Espresso extends Beverage {
    public Espresso(int size) {
        this.size=size;
    }

    @Override
    public String getDescription() {
        return "Espresso"+"("+"size:"+getSize()+")";
    }

    /**
     * @return 饮品的价格
     */
    public double cost() {
        if(size==1){
            return 3.0;
        }else if(size==2){
            return 3.8;
        } else if (size==3) {
            return 4.3;
        }else{
            throw new Error("size Error！");
        }
    }
}
