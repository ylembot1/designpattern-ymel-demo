package com.example.ylem.designpattern.observer;

import com.example.ylem.designpattern.observer.classes.ObjectFor3D;
import com.example.ylem.designpattern.observer.classes.ObserverUser1;
import com.example.ylem.designpattern.observer.classes.ObserverUser2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // 实例化一个主题
        ObjectFor3D objectFor3DSubject = new ObjectFor3D();

        // 实例化两个观察者，并将他们注册在主题上：观察主题
        ObserverUser1 observerUser1 = new ObserverUser1(objectFor3DSubject);
        ObserverUser2 observerUser2 = new ObserverUser2(objectFor3DSubject);

        // 模拟主题变化
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String msg = scanner.nextLine();
            objectFor3DSubject.setMsg(msg);
        }
    }
}
