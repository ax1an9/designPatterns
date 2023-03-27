package com.ax.designpatterns.pizzaStore.Ingredients;

/**
 * @author:ax1an9
 * @date: 27/3/2023
 * @time: 1:14 AM
 */
public abstract class Ingredient {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String name;
}
