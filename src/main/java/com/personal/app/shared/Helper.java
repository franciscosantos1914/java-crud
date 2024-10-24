package com.personal.app.shared;

public class Helper {

    public static Boolean isStringOk(String str) {
        return str instanceof String && str.trim().isEmpty() == false;
    }

    public static Boolean isFloatOk(Float num) {
        return num instanceof Float && num > 0;
    }

    public static Boolean isByteOk(Byte num) {
        return num instanceof Byte && num > 0;
    }
}
