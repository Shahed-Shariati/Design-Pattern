package org.example.behavioralDP.chainofresposibility.logger;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends LoggerHandler{
    protected FileLogger(LogLevel logLevel) {
        super(logLevel);
    }


/*
    @Override
    public void log(LogLevel logLevel, String message) {
        if(super.logLevel.ordinal() <= logLevel.ordinal()){
            writeMessage(message);
        }
        if(nextLogger != null){
            nextLogger.log(logLevel,message);
        }
    }
*/

    @Override
    public void writeMessage(String message) {
       try(FileWriter fileWriter = new FileWriter("Log.txt",true)) {
           fileWriter.write(message + "\n");
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
