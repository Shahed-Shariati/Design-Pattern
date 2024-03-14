package org.example.structuralDP.decorator.middleware;

public abstract class MiddleWareDecorator implements RequestHandler {
    private final RequestHandler requestHandler;

    protected MiddleWareDecorator(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public void filterRequest(String request) {
        requestHandler.filterRequest(request);
    }
}
