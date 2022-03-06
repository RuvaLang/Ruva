package me.hydos.ruva.expressions;

import me.hydos.ruva.AntlrBaseVisitor;
import me.hydos.ruva.antlr.RuvaParser;

/**
 * A set of "instructions" which create a value. For example, `1 * 5 ^ 932` or `1 + 5` are valid math Expressions as they create an integer value. Or `"This is a String"` is a valid String expression.
 */
public interface Expression {
    static Expression get(RuvaParser.ExpressionContext expression) {
        return new BasicExpression(AntlrBaseVisitor.getName(expression));
    }
}
