package expr.ExprImpl;

import expr.Expr;
/**
 * @author:ax1an9
 * @date: 30/3/2023
 * @time: 1:21 PM
 */
public class Number extends Expr {

    private double number;

    public Number(double number) {
        this.number = number;
    }
    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public void addExpr(Expr expr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double calc() {
        return getNumber();
    }

    @Override
    public String toString() {
        return ""+getNumber();
    }
}
