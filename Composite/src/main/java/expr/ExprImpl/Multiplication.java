package expr.ExprImpl;

import expr.Expr;

import java.util.LinkedList;

/**
 * @author:ax1an9
 * @date: 30/3/2023
 * @time: 1:56 PM
 */
public class Multiplication extends Expr {
    public Multiplication() {
        this.subExpr=new LinkedList<>();
    }

    @Override
    public void addExpr(Expr expr) {
        subExpr.add(expr);
    }

    @Override
    public double calc() {
        double ans=1;
        for (Expr expr:subExpr
        ) {
            ans*=expr.calc();
        }
        return ans;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (Expr expr:subExpr
        ) {
            sb.append(expr.toString()).append("*");
        }
        return sb.substring(0,sb.length()-1);
    }
}
