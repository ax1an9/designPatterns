package com.ax.designpatterns.pizzaStore;

import com.ax.designpatterns.pizzaStore.pizzaFactory.PizzaFactory;

/**
 * @author:ax1an9
 * @date: 27/3/2023
 * @time: 1:12 AM
 */
public abstract class PizzaStore {
    protected PizzaFactory pizzaFactory;
    protected Pizza pizza;
    public abstract Pizza orderPizza(String name);
    public abstract Pizza preparePizza(Pizza toBePrepared);
}
