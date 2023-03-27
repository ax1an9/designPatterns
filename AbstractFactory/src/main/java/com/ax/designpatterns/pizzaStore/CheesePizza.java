package com.ax.designpatterns.pizzaStore;

import com.ax.designpatterns.pizzaStore.pizzaFactory.PizzaFactory;

/**
 * @author:ax1an9
 * @date: 27/3/2023
 * @time: 5:27 PM
 */
public class CheesePizza extends Pizza {

    PizzaFactory pizzaFactory;

    public CheesePizza(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }
    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        this.dough= pizzaFactory.createDough();
        this.sauce= pizzaFactory.createSauce();
        this.cheese= pizzaFactory.createCheese();
    }
}
