package com.company;

public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck instance = null;
    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }}}
        return instance; }
    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}