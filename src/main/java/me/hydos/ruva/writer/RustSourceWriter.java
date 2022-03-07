package me.hydos.ruva.writer;

import me.hydos.ruva.Function;
import me.hydos.ruva.MethodParameter;
import me.hydos.ruva.RuvaSourceFile;

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
        builder.append("// Ruva generated source file.\n\n");
    }

    private static void writeFunction(StringBuilder builder, Function function) {
        builder.append("\n");
        builder.append(switch (function.visibility()) {
            case NONE -> " ";
            case PRIVATE -> "pub(crate) ";
            case PUBLIC -> "pub ";
        });
        builder.append("fn ").append(function.name());
        writeFunctionArguments(builder, function);
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
