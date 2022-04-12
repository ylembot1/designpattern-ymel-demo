package com.example.ylem.designpattern.observer.classes;

import com.example.ylem.designpattern.observer.interfaces.Observer;
import com.example.ylem.designpattern.observer.interfaces.Subject;

import java.util.ArrayList;

public class ObjectFor3D implements Subject {
    // 保存所有的Observer
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    // 主题信息
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObject(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    /**
     * 更新主题信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
