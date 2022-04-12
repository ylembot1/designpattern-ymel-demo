package com.example.ylem.designpattern.observer.classes;

import com.example.ylem.designpattern.observer.interfaces.Observer;
import com.example.ylem.designpattern.observer.interfaces.Subject;

public class ObserverUser1 implements Observer {

    public ObserverUser1(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("ObserverUser1: " + msg);
    }
}
