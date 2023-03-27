package com.ax.designpatterns.pizzaStore;

import com.ax.designpatterns.pizzaStore.pizzaFactory.PizzaFactory;

/**
 * @author:ax1an9
 * @date: 27/3/2023
 * @time: 5:52 PM
 */
public class NewFranchiseInCHI extends PizzaStore {
    public NewFranchiseInCHI(PizzaFactory pizzaFactory) {
        this.pizzaFactory=pizzaFactory;
    }

    @Override
    public Pizza orderPizza(String name) {
        if(name.equals("cheese")){
            pizza=new CheesePizza(pizzaFactory);
            pizza.setName("CHI Cheese Pizza");
        } else if (name.equals("clam")) {
            pizza=new ClamPizza(pizzaFactory);
            pizza.setName("CHI Clam Pizza");
        } else{
            pizza=null;
        }
        return pizza;
    }

    @Override
    public Pizza preparePizza(Pizza toBePrepared) {
        toBePrepared.prepare();
        toBePrepared.bake();
        toBePrepared.cut();
        toBePrepared.box();
        return toBePrepared;
    }
}
