package StarBuzz;

import StarBuzz.BeverageDecoratorImpl.Milk;
import StarBuzz.BeverageDecoratorImpl.Mocha;
import StarBuzz.BeverageImpl.Decaf;
import StarBuzz.BeverageImpl.Espresso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author:ax1an9
 * @date: 23/3/2023
 * @time: 5:05 PM
 */
class BeverageTest {
    @Test
    void createBeverage() {
        //an espresso
        Beverage beverage1 = new Espresso(3);
        // add 1x milk
        beverage1=new Milk(beverage1);
        // add 1x Mocha
        beverage1=new Mocha(beverage1);
        System.out.println("beverage1.cost(): "+beverage1.cost());
        System.out.println("beverage1.getDescription(): "+beverage1.getDescription());
        // add 1x Mocha
        beverage1=new Mocha(beverage1);
        System.out.println("beverage1.cost(): "+beverage1.cost());
        System.out.println("beverage1.getDescription(): "+beverage1.getDescription());
    }
    @Test
    void createAnotherBeverage() {
        //a Decaf
        Beverage beverage1 = new Decaf(2);
        // add 1x milk
        beverage1=new Milk(beverage1);
        // add 1x Mocha
        beverage1=new Mocha(beverage1);
        System.out.println("beverage1.cost(): "+beverage1.cost());
        System.out.println("beverage1.getDescription(): "+beverage1.getDescription());
        // add 1x Mocha
        beverage1=new Mocha(beverage1);
        System.out.println("beverage1.cost(): "+beverage1.cost());
        System.out.println("beverage1.getDescription(): "+beverage1.getDescription());
    }
}