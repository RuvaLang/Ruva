package me.hydos.ruva.type;

public record MethodArg(String name, String type) {

    public void write(StringBuilder writer) {
        writer.append(this.name).append(": ").append(this.type);
    }
}
