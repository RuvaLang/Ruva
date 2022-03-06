package me.hydos.ruva;

public record Type(Primitive primitive, int byteCount, boolean isReference) {
    private static final int ARCH_SIZE = -1;

    public static Type from(String name) {
        int byteCount = 0;

        if (name.length() == 3) {
            boolean isNumericType = Character.isDigit(name.charAt(1));
            if (isNumericType) {
                byteCount = Integer.parseInt(name.substring(1));
            }

            return new Type(getPrimitive(name.charAt(0)), byteCount, false);
        } else if (name.length() == 4) {
            if (name.charAt(0) != '&' && name.charAt(0) != '*') {
                throw new RuntimeException(name + " is not a valid type.");
            }

            boolean isNumericType = Character.isDigit(name.charAt(2));
            if (isNumericType) {
                byteCount = Integer.parseInt(name.substring(2));
            }

            return new Type(getPrimitive(name.charAt(1)), byteCount, true);
        } else {
            throw new RuntimeException(name + " is not a valid type.");
        }
    }

    private static Primitive getPrimitive(char nameOffset) {
        return switch (nameOffset) {
            case 'f' -> Primitive.FLOAT;
            case 'i' -> Primitive.INT;
            case 'u' -> Primitive.UNSIGNED_INT;
            case 'b' -> Primitive.BOOL;
            case 's' -> Primitive.STR;
            default -> throw new IllegalStateException("Unexpected value: " + nameOffset);
        };
    }

    public enum Primitive {
        BOOL(),
        STR(),
        INT(8, 16, 32, 64, 128, ARCH_SIZE),
        UNSIGNED_INT(8, 16, 32, 64, 128, ARCH_SIZE),
        FLOAT(32, 64);

        public final int[] supportedByteCounts;

        Primitive(int... supportedByteCounts) {
            this.supportedByteCounts = supportedByteCounts;
        }
    }
}
