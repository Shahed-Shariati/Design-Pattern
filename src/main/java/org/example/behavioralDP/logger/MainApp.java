package org.example.behavioralDP.logger;

public class MainApp {
    public static void main(String[] args) {
        LoggerHandler loggerHandler = getLogger();
//        loggerHandler.log(LogLevel.INFO,"Console Info ");
        loggerHandler.log(LogLevel.WARNING,"file warning ");
//        loggerHandler.log(LogLevel.ERROR,"Data base  error ");
    }

    private static LoggerHandler getLogger() {
        LoggerHandler infoLogger = new ConsoleLogger(LogLevel.INFO);
        LoggerHandler warningLogger = new FileLogger(LogLevel.WARNING);
        LoggerHandler errorLogger = new DataBaseLogger(LogLevel.ERROR);
        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);
        return errorLogger;
    }
}
