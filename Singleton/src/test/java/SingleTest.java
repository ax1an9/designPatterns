import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author:ax1an9
 * @date: 31/3/2023
 * @time: 4:36 PM
 */
class SingleTest {
    @Test
    void test() {
        final Single instance1 = Single.getInstance();
        final Single instance2 = Single.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        Assertions.assertEquals(instance1.hashCode(), instance2.hashCode());
    }

}