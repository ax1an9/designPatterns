package com.ax.designpatterns.pizzaStore.pizzaFactory;

import com.ax.designpatterns.pizzaStore.Ingredients.Clam;
import com.ax.designpatterns.pizzaStore.Ingredients.Cheese;
import com.ax.designpatterns.pizzaStore.Ingredients.Dough;
import com.ax.designpatterns.pizzaStore.Ingredients.FreezeClam;
import com.ax.designpatterns.pizzaStore.Ingredients.MozzarellaCheese;
import com.ax.designpatterns.pizzaStore.Ingredients.PlumTomatoSauce;
import com.ax.designpatterns.pizzaStore.Ingredients.Sauce;
import com.ax.designpatterns.pizzaStore.Ingredients.ThickCrustDough;
import com.ax.designpatterns.pizzaStore.Ingredients.Veggie;

/**
 * @author:ax1an9
 * @date: 27/3/2023
 * @time: 4:52 PM
 */
public class CHIPizzaFactory implements PizzaFactory {
    /**
     * @return 对应的面团
     */
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    /**
     * @return 对应酱料
     */
    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    /**
     * @return 对应类型的芝士
     */
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    /**
     * @return 对应的蔬菜
     */
    @Override
    public Veggie createVeggie() {
        return null;
    }

    /**
     * @return 对应的蛤蜊
     */
    @Override
    public Clam createClam() {
        return new FreezeClam();
    }
}
