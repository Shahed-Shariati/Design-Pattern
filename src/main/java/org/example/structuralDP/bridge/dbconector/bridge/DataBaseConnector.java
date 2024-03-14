package org.example.structuralDP.bridge.dbconector.bridge;

public interface DataBaseConnector {
    void connect(String url,String userName,String password);
    void executeQuery(String query);
    void disConnect();
}
