package org.example.structuralDP.decorator.middleware;

public class MainApp {
    public static void main(String[] args) {
        RequestHandler requestHandler =new LoggingMiddleWare(new AutMiddleWare( new LoggingMiddleWare(new WebServer())));
        requestHandler.filterRequest("Http//localhost:8080");
    }
}
