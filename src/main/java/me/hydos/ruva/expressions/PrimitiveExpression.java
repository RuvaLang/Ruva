package me.hydos.ruva.expressions;

import me.hydos.antlr.JustParser;
import me.hydos.ruva.RuvaVisitor;

public class PrimitiveExpression implements Expression {

    private final String value;

    public PrimitiveExpression(JustParser.PrimaryContext ctx) {
        this.value = RuvaVisitor.get(ctx.literal());
    }

    @Override
    public String write() {
        return this.value;
    }
}
