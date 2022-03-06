package me.hydos.ruva.statements;

import me.hydos.ruva.expressions.Expression;

public record LocalVariableDeclarationStatement(String type, String name, Expression defaultValue) implements Statement {

    @Override
    public void write(StringBuilder writer) {
        writer.append("let ").append(name);
        if (type != null) {
            writer.append(": ").append(type);
        }
        writer.append(" = ").append(defaultValue.write()).append(";\n");
    }
}
