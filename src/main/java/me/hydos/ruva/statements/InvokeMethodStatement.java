package me.hydos.ruva.statements;

import me.hydos.ruva.expressions.MethodCallExpression;

public record InvokeMethodStatement(MethodCallExpression expression) implements Statement {

    @Override
    public void write(StringBuilder writer) {
        writer.append(expression.write());
    }
}
