package com.example.ylem.designpattern.responsibilitychain;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String msg) {
        System.out.println("error Logger~~~" + msg);
    }
}
