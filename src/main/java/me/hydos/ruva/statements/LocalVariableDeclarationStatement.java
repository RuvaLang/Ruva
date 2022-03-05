package me.hydos.ruva.statements;

public record LocalVariableDeclarationStatement(String type, String name, String defaultValue) implements Statement {

    @Override
    public void write(StringBuilder writer) {
        writer.append("let ").append(name);
        if (type != null) {
            writer.append(": ").append(type);
        }
        writer.append(" = ").append(defaultValue).append(";\n");
    }
}
