package com.ax.designpatterns.pizzaStore;

import com.ax.designpatterns.pizzaStore.pizzaFactory.PizzaFactory;

/**
 * @author:ax1an9
 * @date: 27/3/2023
 * @time: 2:32 PM
 */
public class NewFranchiseInNY extends PizzaStore{

    public NewFranchiseInNY(PizzaFactory pizzaFactory) {
        this.pizzaFactory=pizzaFactory;
    }

    @Override
    public Pizza orderPizza(String name) {
        if(name.equals("cheese")){
            pizza=new CheesePizza(pizzaFactory);
            pizza.setName("NY Cheese Pizza");
        } else if (name.equals("clam")) {
            pizza=new ClamPizza(pizzaFactory);
            pizza.setName("NY Clam Pizza");
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
