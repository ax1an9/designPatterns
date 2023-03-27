package com.ax.designpatterns.pizzaStore;

import com.ax.designpatterns.pizzaStore.pizzaFactory.PizzaFactory;

/**
 * @author:ax1an9
 * @date: 27/3/2023
 * @time: 5:32 PM
 */
public class ClamPizza extends Pizza {
    PizzaFactory pizzaFactory;

    public ClamPizza(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    /**
     * 根据工厂提供的原料来构建pizza
     */
    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        this.dough= pizzaFactory.createDough();
        this.sauce= pizzaFactory.createSauce();
        this.cheese= pizzaFactory.createCheese();
        this.clam=pizzaFactory.createClam();
    }
}
