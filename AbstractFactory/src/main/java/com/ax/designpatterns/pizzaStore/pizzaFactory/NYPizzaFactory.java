package com.ax.designpatterns.pizzaStore.pizzaFactory;

import com.ax.designpatterns.pizzaStore.Ingredients.Cheese;
import com.ax.designpatterns.pizzaStore.Ingredients.Clam;
import com.ax.designpatterns.pizzaStore.Ingredients.Dough;
import com.ax.designpatterns.pizzaStore.Ingredients.FreshClam;
import com.ax.designpatterns.pizzaStore.Ingredients.MarinaraSauce;
import com.ax.designpatterns.pizzaStore.Ingredients.ReggianoCheese;
import com.ax.designpatterns.pizzaStore.Ingredients.Sauce;
import com.ax.designpatterns.pizzaStore.Ingredients.ThinCrustDough;
import com.ax.designpatterns.pizzaStore.Ingredients.Veggie;

/**
 * @author:ax1an9
 * @date: 27/3/2023
 * @time: 4:51 PM
 */
public class NYPizzaFactory implements PizzaFactory {
    /**
     * @return 对应的面团
     */
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    /**
     * @return 对应酱料
     */
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    /**
     * @return 对应类型的芝士
     */
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    /**
     * @return 对应的蛤蜊
     */
    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    /**
     * @return 对应的蔬菜
     */
    @Override
    public Veggie createVeggie() {
        return null;
    }
}
