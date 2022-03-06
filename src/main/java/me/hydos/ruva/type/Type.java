package me.hydos.ruva.type;

public class Type {
    private static final int ARCH_SIZE = -1;

    public final Primitive primitive;
    public final int byteCount;

    public Type(Primitive primitive, int byteCount) {
        this.primitive = primitive;
        this.byteCount = byteCount;
    }

    public static Type from(String name) {
        assert name.length() == 3;
        int byteCount = Integer.parseInt(name.substring(1));
        Primitive primitive = switch (name.charAt(0)) {
            case 'f' -> Primitive.FLOAT;
            case 'i' -> Primitive.INT;
            case 'u' -> Primitive.UNSIGNED_INT;
            default -> throw new IllegalStateException("Unexpected value: " + name.charAt(0));
        };

        return new Type(primitive, byteCount);
    }

    @Override
    public String toString() {
        return "Type{" + "primitive=" + primitive + ", byteCount=" + byteCount + '}';
    }

    public enum Primitive {
        INT(8, 16, 32, 64, 128, ARCH_SIZE),
        UNSIGNED_INT(8, 16, 32, 64, 128, ARCH_SIZE),
        FLOAT(32, 64);

        public final int[] supportedByteCounts;

        Primitive(int... supportedByteCounts) {
            this.supportedByteCounts = supportedByteCounts;
        }
    }
}
