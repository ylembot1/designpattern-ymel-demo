package com.example.ylem.designpattern.responsibilitychain;

public abstract class AbstractLogger {
    public static final int INFO = 0;
    public static final int DEBUG = 1;
    public static final int ERROR = 2;

    protected int level;

    protected AbstractLogger logger = null;

    /**
     * 设置下一个节点，组成链表
     * @param logger
     */
    protected void setNextLogger(AbstractLogger logger) {
        this.logger = logger;
    }

    protected void setLevel(int level) {
        this.level = level;
    }

    /**
     * 链表遍历函数，提供一个入口点，让链表能够执行起来: 客户端入口点
     * @param level
     * @param msg
     */
    public void logMessage(int level, String msg) {
        // 1. 先执行本节点逻辑
        if (this.level <= level) {
            this.write(msg);
        }

        // 2. 在执行后续节点逻辑: 链表遍历
        if (logger != null) {
            logger.logMessage(level, msg);
        }
    }

    /**
     * 抽象方法：节点的具体逻辑实现，也是链表进入一个节点的入口点
     * 如果没有责任链，那么此方法直接被客户端调用，那么一个客户端就会依赖多个具体实现。
     * 有了责任链之后，客户端依赖于责任链（如logMessage），而不依赖节点的具体实现（如此地的write方法）
     * @param msg
     */
    protected abstract void write(String msg);
}
