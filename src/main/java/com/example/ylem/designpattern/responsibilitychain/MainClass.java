package com.example.ylem.designpattern.responsibilitychain;

public class MainClass {


    public static AbstractLogger getLoggerChain() {
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        debugLogger.setNextLogger(infoLogger);
        errorLogger.setNextLogger(debugLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getLoggerChain();

        logger.logMessage(AbstractLogger.INFO, "a");

        System.out.println();

        logger.logMessage(AbstractLogger.DEBUG, "ab");

        System.out.println();

        logger.logMessage(AbstractLogger.ERROR, "abc");
    }
}
