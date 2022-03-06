package me.hydos.ruva.statements;

import me.hydos.ruva.Type;
import me.hydos.ruva.expressions.Expression;

public record VariableDeclaration(String name, Type type, boolean isMutable, Expression defaultValue) implements Statement {
}
