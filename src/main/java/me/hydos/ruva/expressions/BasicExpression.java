package me.hydos.ruva.expressions;

/**
 * Lazy, bad, and horrible temporary expression.
 */
@Deprecated
public record BasicExpression(String expr) implements Expression{

    @Override
    public String toString() {
        return this.expr;
    }
}
