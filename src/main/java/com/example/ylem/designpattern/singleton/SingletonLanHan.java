package com.example.ylem.designpattern.singleton;

/**
 * 因为在类加载的时候，不会像饿汉式那样直接创建实例，
 * 而是在运行期间，调用getInstance方法时，才创建，
 * 所以可能出现多线程竞争问题
 *
 * 所以单例模式的懒汉式主要需要保证两个方面：
 * 1. 延迟加载：区别于饿汉式
 * 2. 线程安全
 */


/**
 * 单例模式：懒汉式
 * 线程不安全，不可用
 */
public class SingletonLanHan {
    // 1. 私有化构造函数
    private SingletonLanHan() {}

    // 2. 创建一个静态空实例
    private static SingletonLanHan singletonLanHan;

    // 3. public方法，获取静态实例
    public static SingletonLanHan getInstance() {
        if (singletonLanHan == null) {  // 线程不安全，两个线程都可能进去if语句，然后创建多个instance
            singletonLanHan = new SingletonLanHan();
        }
        return singletonLanHan;
    }
}

/**
 * 单例模式：懒汉式
 * 线程安全，但是效率低
 */
class SingletonLanHan1 {
    private SingletonLanHan1() {}

    private static SingletonLanHan1 singletonLanHan1;

    // 线程安全，但是效率太低
    // 每次调用getInstance时，都会锁住，
    // 但是其实只需要第一次new的时候锁住就行，后面直接返回instance就可以了
    private static synchronized SingletonLanHan1 getInstance() {
        if (singletonLanHan1 == null ) {  // 这里线程是不安全的,可能得到两个不同的实例
            singletonLanHan1 = new SingletonLanHan1();
        }
        return singletonLanHan1;
    }
}

/**
 * 单例模式：懒汉式
 * 线程不安全
 * 第一个线程执行完，singletonLanHan2 = new SingletonLanHan2()之后，
 * 进入到if语句的第二个线程，也会new一个instance
 */
class SingletonLanHan2 {
    private SingletonLanHan2() {}

    private static SingletonLanHan2 singletonLanHan2;

    public static SingletonLanHan2 getInstance() {
        if (singletonLanHan2 == null) {
            synchronized(SingletonLanHan2.class) {  // 线程不安全
                singletonLanHan2 = new SingletonLanHan2();
            }
        }
        return singletonLanHan2;
    }
}

/**
 * 单例模式懒汉式双重校验锁【推荐用】
 * 1. 延迟加载
 * 2. 线程安全
 */
class SingletonLanHan3 {
    private SingletonLanHan3() {}

    private static volatile SingletonLanHan3 singletonLanHan3;

    public static SingletonLanHan3 getInstance() {
        if (singletonLanHan3 == null) {
            synchronized(SingletonLanHan3.class) {
                if (singletonLanHan3 == null) {
                    singletonLanHan3 = new SingletonLanHan3();
                }
            }
        }
        return singletonLanHan3;
    }
}


