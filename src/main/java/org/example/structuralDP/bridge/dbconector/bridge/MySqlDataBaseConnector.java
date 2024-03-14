package org.example.structuralDP.bridge.dbconector.bridge;

public class MySqlDataBaseConnector implements DataBaseConnector{
    @Override
    public void connect(String url, String userName, String password) {
        System.out.println("Connecting data base mysql .... " + url);
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("execute query mysql .... " + query);
    }

    @Override
    public void disConnect() {
        System.out.println("disconnecting mysql ...");

    }
}
