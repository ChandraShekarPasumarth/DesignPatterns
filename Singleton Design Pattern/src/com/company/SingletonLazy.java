package com.company;

public class SingletonLazy {
    private static SingletonLazy obj;
    private SingletonLazy() {}
    public static SingletonLazy getInstance()
    {
        if (obj==null)
            obj = new SingletonLazy();
        return obj;
    }
    public static void main(String[] args) {

        System.out.println(getInstance());
    }
}