package me.hydos.ruva.statements;

import java.util.List;

public record InvokeMethodStatement(boolean isMacro, String functionName, List<String> arguments) implements Statement {

    @Override
    public void write(StringBuilder writer) {
        writer.append(this.functionName);
        if (this.isMacro) {
            writer.append("!");
        }

        // Arguments
        writer.append("(");
        for (String argument : this.arguments) {
            writer.append(argument);

            if (!this.arguments.get(this.arguments.size() - 1).equals(argument)) {
                writer.append(", ");
            }
        }
        writer.append(");\n");
    }
}
