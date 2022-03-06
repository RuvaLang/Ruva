package me.hydos.ruva.expressions;

import me.hydos.antlr.JustParser;

public class DefaultExpression implements Expression{

    public DefaultExpression(JustParser.ExpressionContext ctx) {
        System.out.println("hm...");
    }

    @Override
    public String write() {
        return "";
    }
}
