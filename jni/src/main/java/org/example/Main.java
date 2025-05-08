package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        HelloJni jni = new HelloJni();
        System.out.println(jni.add(1,10));
    }
}