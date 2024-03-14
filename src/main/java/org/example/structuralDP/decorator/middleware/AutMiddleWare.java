package org.example.structuralDP.decorator.middleware;

public class AutMiddleWare extends MiddleWareDecorator{
    protected AutMiddleWare(RequestHandler requestHandler) {
        super(requestHandler);
    }


    @Override
    public void filterRequest(String request) {
        authenticationUser();
        super.filterRequest(request);
    }

    private void authenticationUser() {
        System.out.println("authentication user...... ");
    }
}
