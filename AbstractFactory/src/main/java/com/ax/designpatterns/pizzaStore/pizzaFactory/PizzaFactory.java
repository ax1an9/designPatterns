package com.ax.designpatterns.pizzaStore.pizzaFactory;

import com.ax.designpatterns.pizzaStore.Ingredients.Clam;
import com.ax.designpatterns.pizzaStore.Ingredients.Cheese;
import com.ax.designpatterns.pizzaStore.Ingredients.Dough;
import com.ax.designpatterns.pizzaStore.Ingredients.Sauce;
import com.ax.designpatterns.pizzaStore.Ingredients.Veggie;

/**
 * @author:ax1an9
 * @date: 27/3/2023
 * @time: 1:13 AM
 */
public interface PizzaFactory {
    /**
     * @return 对应的面团
     */
    public Dough createDough();

    /**
     * @return 对应酱料
     */
    public Sauce createSauce();

    /**
     * @return 对应类型的芝士
     */
    public Cheese createCheese();

    /**
     * @return 对应的蛤蜊
     */
    public Clam createClam();

    /**
     * @return 对应的蔬菜
     */
    public Veggie createVeggie();
}
