package expr;

import expr.ExprImpl.Addition;
import expr.ExprImpl.Multiplication;
import expr.ExprImpl.Number;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author:ax1an9
 * @date: 30/3/2023
 * @time: 1:42 PM
 */
class ExprTest {
    @Test
    void simpleAddCase() {
        final Addition addition = new Addition();
        addition.addExpr(new Number(3.9));
        addition.addExpr(new Number(2.11));
        System.out.println(addition.calc());
        Assertions.assertEquals(6.01,addition.calc());
        System.out.println(addition);
        Assertions.assertEquals("3.9+2.11",addition.toString());
    }
    @Test
    void simpleMulCase() {

        final Multiplication mul = new Multiplication();
        mul.addExpr(new Number(3));
        mul.addExpr(new Number(4.2));
        System.out.println(mul.calc());
        //浮点的计算并不精准
        Assertions.assertEquals(3.0*4.2,mul.calc());
        System.out.println(mul);
        Assertions.assertEquals("3.0*4.2",mul.toString());
    }
    @Test
    void composeCase() {

        final Multiplication mul = new Multiplication();
        final Addition addition1 = new Addition();
        addition1.addExpr(new Number(3.9));
        addition1.addExpr(new Number(2.11));
        mul.addExpr(addition1);
        final Addition addition2 = new Addition();
        addition2.addExpr(new Number(1));
        addition2.addExpr(new Number(1));
        mul.addExpr(addition2);
        System.out.println(mul.calc());
        //浮点的计算并不精准
        Assertions.assertEquals(12.02,mul.calc());
        System.out.println(mul);
        //表达式展示并不代表实际的计算顺序
        Assertions.assertEquals("3.9+2.11*1.0+1.0",mul.toString());
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Start Test!");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("End Test!");
    }

    @org.junit.jupiter.api.Test
    void addExpr() {
    }

    @org.junit.jupiter.api.Test
    void calc() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}