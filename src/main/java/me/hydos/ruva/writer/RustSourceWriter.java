package me.hydos.ruva.writer;

import me.hydos.ruva.Function;
import me.hydos.ruva.MethodParameter;
import me.hydos.ruva.RuvaSourceFile;
import me.hydos.ruva.statements.Statement;
import me.hydos.ruva.statements.VariableDeclaration;

public class RustSourceWriter {

    public static String writeFile(RuvaSourceFile sourceFile) {
        StringBuilder builder = new StringBuilder();
        writeFileHeader(builder);
        for (Function function : sourceFile.functions) {
            writeFunction(builder, function);
        }

        return builder.toString();
    }

    private static void writeFileHeader(StringBuilder builder) {
        builder.append("// Ruva generated source file.\n");
    }

    private static void writeFunction(StringBuilder builder, Function function) {
        builder.append("\n");
        builder.append(switch (function.visibility()) {
            case NONE -> "";
            case PRIVATE -> "pub(crate) ";
            case PUBLIC -> "pub ";
        });
        builder.append("fn ").append(function.name());
        writeFunctionArguments(builder, function);
        builder.append(" {\n");
        writeFunctionStatements(builder, function);
        builder.append("}\n");
    }

    private static void writeFunctionStatements(StringBuilder builder, Function function) {
        for (Statement statement : function.statements()) {
            if (statement instanceof VariableDeclaration variableDeclaration) {
                builder.append("\tlet ");
                if (variableDeclaration.isMutable()) {
                    builder.append("mut ");
                }
                builder.append(variableDeclaration.type())
                        .append(": ")
                        .append(variableDeclaration.name())
                        .append(" = ")
                        .append(variableDeclaration.defaultValue())
                        .append(";\n");
            } else {
                throw new RuntimeException("Unable to handle " + statement.getClass().getName());
            }
        }
    }

    private static void writeFunctionArguments(StringBuilder builder, Function function) {
        builder.append("(");
        for (MethodParameter argument : function.parameters()) {
            builder.append(argument.name()).append(": ").append(argument.type());

            if (function.parameters().get(function.parameters().size() - 1) != argument) {
                builder.append(", ");
            }
        }
        builder.append(")");
    }
}
