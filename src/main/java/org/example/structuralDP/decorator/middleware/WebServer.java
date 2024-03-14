package org.example.structuralDP.decorator.middleware;

public class WebServer implements RequestHandler {
    @Override
    public void filterRequest(String request) {
        System.out.println("Request processing.. " + request);
    }
}
