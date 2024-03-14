package org.example.structuralDP.decorator.middleware;

public class LoggingMiddleWare extends MiddleWareDecorator{
    protected LoggingMiddleWare(RequestHandler requestHandler) {
        super(requestHandler);
    }


    @Override
    public void filterRequest(String request) {
        loggingDataBase();
        super.filterRequest(request);
    }

    private void loggingDataBase() {
        System.out.println("Log in data base.....");
    }

}
