package com.example.ylem.designpattern.singleton;

/**
 * 单例模式：饿汉式
 */
public class SingletonEHan {
    private SingletonEHan() {}

    // 单例模式的饿汉式
    private static SingletonEHan singletonEHan = new SingletonEHan();

    public static SingletonEHan getInstance() {
        return singletonEHan;
    }
}

/**
 * 单例模式：饿汉式
 */
class SingletonEHan1 {

    private SingletonEHan1() {}

    private static SingletonEHan1 singletonEHan1 = null;

    static {
        singletonEHan1 = new SingletonEHan1();
    }

    public static SingletonEHan1 getInstance() {
        if (singletonEHan1 == null) {
            singletonEHan1 = new SingletonEHan1();
        }
        return singletonEHan1;
    }

    public static void main(String[] args) {
        SingletonEHan1 instance = SingletonEHan1.getInstance();
    }
}
