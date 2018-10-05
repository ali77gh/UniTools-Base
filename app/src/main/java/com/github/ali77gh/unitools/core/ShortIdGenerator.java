package com.github.ali77gh.unitools.core;

import java.util.Random;

/**
 * Created by ali on 10/4/18.
 */

public class ShortIdGenerator {

    public static String Generate(int count) {
        String Id = "";
        for (int i = 0; i < count; i++) {
            Id = Id + getChar();
        }
        return Id;
    }

    private static char getChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }
}