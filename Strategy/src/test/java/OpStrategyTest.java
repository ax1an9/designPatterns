import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author:ax1an9
 * @date: 5/4/2023
 * @time: 9:31 PM
 */
class OpStrategyTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void simpleTest() {
        int n1=5;
        int n2=10;
        Context context=new Context(new Add());
        Assertions.assertEquals(15,context.execStrategy(n1,n2));
        Context context1=new Context(new Subtract());
        Assertions.assertEquals(-5,context1.execStrategy(n1,n2));
        Context context2=new Context(new Multiply());
        Assertions.assertEquals(50,context2.execStrategy(n1,n2));
    }
}