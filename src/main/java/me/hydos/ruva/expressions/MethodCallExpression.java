package me.hydos.ruva.expressions;

import me.hydos.antlr.JustParser;
import me.hydos.ruva.RuvaVisitor;

import java.util.ArrayList;
import java.util.List;

public class MethodCallExpression implements Expression {

    private final String result;

    public MethodCallExpression(JustParser.ExpressionContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (JustParser.ExpressionContext expression : ctx.expression()) {
            JustParser.MethodCallContext methodCallContext = expression.methodCall();
            if(methodCallContext != null) {
                String invokingMethod = RuvaVisitor.get(methodCallContext.identifier());
                boolean isMacro = methodCallContext.BANG() != null && RuvaVisitor.get(methodCallContext.BANG()).equals("!");

                List<String> arguments = new ArrayList<>();
                for (JustParser.ExpressionContext expressionContext : methodCallContext.expressionList().expression()) {
                    arguments.add(RuvaVisitor.get(expressionContext));
                }

                writeSingle(builder, invokingMethod, isMacro, arguments);
            }
        }

        this.result = builder.toString();
    }

    public void writeSingle(StringBuilder builder, String functionName, boolean isMacro, List<String> arguments) {
        builder.append(functionName);
        if (isMacro) {
            builder.append("!");
        }

        // Arguments
        builder.append("(");
        for (String argument : arguments) {
            builder.append(argument);

            if (!arguments.get(arguments.size() - 1).equals(argument)) {
                builder.append(", ");
            }
        }
        builder.append(");\n");
    }

    @Override
    public String write() {
        return this.result;
    }
}
