package com.example.ylem.designpattern.responsibilitychain;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String msg) {
        System.out.println("info logger: ~" + msg);
    }
}
