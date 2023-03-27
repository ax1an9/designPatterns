package com.ax.designpatterns.pizzaStore;

import com.ax.designpatterns.pizzaStore.Ingredients.Cheese;
import com.ax.designpatterns.pizzaStore.Ingredients.Clam;
import com.ax.designpatterns.pizzaStore.Ingredients.Dough;
import com.ax.designpatterns.pizzaStore.Ingredients.Sauce;
import com.ax.designpatterns.pizzaStore.Ingredients.Veggie;

/**
 * @author:ax1an9
 * @date: 27/3/2023
 * @time: 1:15 AM
 */
public abstract class Pizza {

    String name;
    protected Dough dough;
    protected Cheese cheese;
    protected Sauce sauce;
    protected Veggie veggie;
    protected Clam clam;

    /**
     * 根据工厂提供的原料来构建pizza
     */
    abstract void prepare();
    void bake(){
        System.out.println("Bake for 25 minutes at 350.");
    }
    void cut(){
        System.out.println("Cut pizza into pieces.");
    }
    void box(){
        System.out.println("Place Pizza into box.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", cheese=" + cheese +
                ", sauce=" + sauce +
                ", veggie=" + veggie +
                ", clam=" + clam +
                '}';
    }
}
