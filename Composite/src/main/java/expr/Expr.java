package expr;

import java.util.List;

/**
 * @author:ax1an9
 * @date: 30/3/2023
 * @time: 1:13 PM
 */
public abstract class Expr {
    protected List<Expr>subExpr;

    public abstract void addExpr(Expr expr);
    public abstract double calc();
    public abstract String toString();
}
