package com.code.design.patterns;

public class SingletonDP {
    private static SingletonDP instance;

    private SingletonDP() {

    }

    public static SingletonDP getInstance() {
        if (instance == null) {
            instance = new SingletonDP();
        }
        return instance;
    }

    public void print() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        SingletonDP.getInstance().print();
    }
}

