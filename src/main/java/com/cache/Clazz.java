package com.cache;

public class Clazz {
    public int method(int x) {
        if (x == 1) {
            throw new RuntimeException();
        } else {
            return x;
        }
    }
}
