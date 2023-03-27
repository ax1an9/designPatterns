package com.ax.designpatterns.pizzaStore;

import com.ax.designpatterns.pizzaStore.pizzaFactory.CHIPizzaFactory;
import com.ax.designpatterns.pizzaStore.pizzaFactory.NYPizzaFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author:ax1an9
 * @date: 27/3/2023
 * @time: 5:54 PM
 */
class PizzaStoreTest {

    @Test
    void orderCheesePizzaInDiverseStore(){
        NYPizzaFactory nyPizzaFactory=new NYPizzaFactory();
        PizzaStore inNY=new NewFranchiseInNY(nyPizzaFactory);
        CHIPizzaFactory chiPizzaFactory=new CHIPizzaFactory();
        PizzaStore inCHI=new NewFranchiseInCHI(chiPizzaFactory);
        final Pizza cheesePizzaInNY = inNY.preparePizza(inNY.orderPizza("cheese"));
        System.out.println(cheesePizzaInNY);
        final Pizza cheesePizzaInCHI = inCHI.preparePizza(inCHI.orderPizza("cheese"));
        System.out.println(cheesePizzaInCHI);
        final Pizza clamPizzaInNY = inNY.preparePizza(inNY.orderPizza("clam"));
        System.out.println(clamPizzaInNY);
        final Pizza clamPizzaInCHI = inCHI.preparePizza(inCHI.orderPizza("clam"));
        System.out.println(clamPizzaInCHI);

    }

}