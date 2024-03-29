package com.example.ylem.designpattern.singleton;

/**
 * 单例模式：枚举方法
 *  * 这里SingletonEnum.instance
 *  * 这里的instance即为SingletonEnum类型的引用所以得到它就可以调用枚举中的方法了。
 *  借助JDK1.5中添加的枚举来实现单例模式。
 *  不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 */

public enum SingletonEnum {

    instance;

    public void method1() {
    }

    public void method2() {
    }

    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.instance;

        instance.method1();
        instance.method2();
    }
}
