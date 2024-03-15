package org.example.behavioralDP.logger;

public class DataBaseLogger extends LoggerHandler{
    protected DataBaseLogger(LogLevel logLevel) {
        super(logLevel);
    }
/*    @Override
    public void log(LogLevel logLevel, String message) {
        if(super.logLevel.ordinal() <= logLevel.ordinal()){
            writeMessage(message);
        }
        if(nextLogger != null){
            nextLogger.log(logLevel,message);
        }
    }*/
    @Override
    public void writeMessage(String message) {
        System.out.println("Log save in data Base....");
    }
}
