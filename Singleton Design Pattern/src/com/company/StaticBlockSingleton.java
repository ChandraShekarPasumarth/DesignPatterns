package com.company;

public class StaticBlockSingleton{
    private static final StaticBlockSingleton obj;
    private StaticBlockSingleton() {}
    static {
        try {
            obj = new StaticBlockSingleton();}
        catch (Exception e) {
            throw new RuntimeException("Error Static block loading!!", e);
        }
    }
    public static StaticBlockSingleton getInstance() {
        return obj;
    }

    public static void main(String[] args) {

        System.out.println(getInstance());
    }
}