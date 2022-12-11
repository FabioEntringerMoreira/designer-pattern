package com.company.criationals.singleton;

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;
    private String data;

    private ThreadSafeSingleton(String data){
        this.data = data;
    }

    public static ThreadSafeSingleton getInstance(String data){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new ThreadSafeSingleton(data);
                }
            }
        }
        return instance;
    }
}
