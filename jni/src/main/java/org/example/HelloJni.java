package org.example;

public class HelloJni {
    public native int add(int a, int b);

    static {
        System.loadLibrary("hello");
    }
}