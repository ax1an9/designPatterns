import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author:ax1an9
 * @date: 31/3/2023
 * @time: 4:35 PM
 */
class SingleInsideTest {

    @org.junit.jupiter.api.Test
    void getInstance() {
        final SingleInside instance1 = SingleInside.getInstance();
        final SingleInside instance2 = SingleInside.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        Assertions.assertEquals(instance1.hashCode(),instance2.hashCode());
    }

    /**
     * 通过反射违背单例模式的机制，创建多个不同的Instance
     */
    @Test
    void reflect() throws Exception {
        final Class<?> single = Class.forName("Single");
        // use null is also OK
        final Constructor<?> singleConstructor = single.getDeclaredConstructor(new Class[]{});
        singleConstructor.setAccessible(true);
        final Single instance1= (Single)singleConstructor.newInstance();
        final Single instance2= (Single)singleConstructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);

    }
}