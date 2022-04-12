package com.example.ylem.designpattern.observer.interfaces;

/**
 * 所有的主题必须实现此接口
 */
public interface Subject {
    /**
     * 注册一个观察者
     */
    public void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     */
    public void removeObject(Observer observer);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();

}
