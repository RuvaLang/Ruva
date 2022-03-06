package me.hydos.ruva.expressions;

public record JointExpression(Expression expr1, Expression expr2) implements Expression {

    @Override
    public String write() {
        return this.expr1.write() + this.expr2.write();
    }
}
