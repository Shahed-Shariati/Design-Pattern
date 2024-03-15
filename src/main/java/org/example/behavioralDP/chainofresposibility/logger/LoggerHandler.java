package org.example.behavioralDP.chainofresposibility.logger;

public abstract class LoggerHandler {
    protected LogLevel logLevel;
    protected LoggerHandler nextLogger;

    protected LoggerHandler(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setNextLogger(LoggerHandler nextLogger) {
        this.nextLogger = nextLogger;
    }


   public void log(LogLevel logLevel,String message){
       if(this.logLevel.ordinal() <= logLevel.ordinal()){
           writeMessage(message);
       }
       if(nextLogger != null){
           nextLogger.log(logLevel,message);
       }

   }
//    abstract public void log(LogLevel logLevel,String message);

    abstract public void writeMessage(String message);
}
