package com.company.criationals.singleton;

public class SimpleSingleton {

    private static SimpleSingleton instance;
    private String data;

    private SimpleSingleton(String data){
        this.data = data;
    }

    public static SimpleSingleton getInstance(String data){
        if (instance == null){
            instance = new SimpleSingleton(data);
        }
        return instance;
    }
}
