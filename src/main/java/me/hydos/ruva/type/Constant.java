package me.hydos.ruva.type;

import me.hydos.ruva.Visibility;

import java.io.BufferedWriter;
import java.io.IOException;

public record Constant(Visibility visibility, String type, String name, String value) {

    public void write(BufferedWriter writer) throws IOException {
        String builder = "\nconst " + switch (this.visibility) {
            case PUB -> "pub ";
            case PUB_CRATE -> "pub(crate) ";
            case NONE -> "";
        } + this.name + ": " + this.type + " = " + this.value + ";\n";
        writer.write(builder);
    }
}
