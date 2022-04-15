package com.example.ylem.designpattern.responsibilitychain;

public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        this.level = level;
    }


    @Override
    public void write(String msg) {
        System.out.println("debug logger ~~" + msg);
    }
}
