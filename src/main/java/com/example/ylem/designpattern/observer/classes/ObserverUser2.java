package com.example.ylem.designpattern.observer.classes;

import com.example.ylem.designpattern.observer.interfaces.Observer;
import com.example.ylem.designpattern.observer.interfaces.Subject;

public class ObserverUser2 implements Observer {

    public ObserverUser2(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("ObserverUser2: " + msg);
    }
}
