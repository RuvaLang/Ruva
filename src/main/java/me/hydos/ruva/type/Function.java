package me.hydos.ruva.type;

import me.hydos.ruva.statements.Statement;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public record Function(String name, List<MethodArg> arguments, String returnType, List<Statement> statements) {

    public void write(BufferedWriter writer) throws IOException {
        StringBuilder rsFunction = new StringBuilder("\nfn " + this.name + "(");

        // Method Arguments
        for (MethodArg argument : this.arguments) {
            argument.write(rsFunction);

            if (this.arguments.get(this.arguments.size() - 1) != argument) {
                rsFunction.append(", ");
            }
        }
        rsFunction.append(")");

        // Return Type (if present)
        if (this.returnType != null) {
            rsFunction.append(" -> ").append(this.returnType);
        }

        // Method Body (Statements)
        rsFunction.append(" {\n");

        for (Statement statement : this.statements) {
            rsFunction.append("\t");
            statement.write(rsFunction);
        }

        rsFunction.append("}\n");
        writer.write(rsFunction.toString());
    }
}
