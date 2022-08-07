package com.example.ylem.designpattern.singleton;

/**
 * 单例模式：内部类
 * <p>
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。
 * 两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同的地方:
 * 在饿汉式方式是只要Singleton类被装载就会实例化,
 * 内部类是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类
 * </p>
 *
 * <p>
 * 静态内部类的加载是在程序中调用静态内部类的时候加载的，和外部类的加载没有必然关系，
 * 但是在加载静态内部类的时候 发现外部类还没有加载，那么就会先加载外部类，
 * 加载完外部类之后，再加载静态内部类（初始化静态变量和静态代码块etc）
 * 如果在程序中单纯的使用 外部类，并不会触发静态内部类的加载
 * </p>
 *
 * 优点：避免了线程不安全，延迟加载，效率高。
 */

public class SingletonIn {

    private SingletonIn() {}

    public static class SingletonHolder {
        private static SingletonIn singletonIn = new SingletonIn();
    }

    public static SingletonIn getInstance() {
        return SingletonHolder.singletonIn;
    }

    public static void main(String[] args) {
        SingletonIn instance = SingletonIn.getInstance();
    }
}
