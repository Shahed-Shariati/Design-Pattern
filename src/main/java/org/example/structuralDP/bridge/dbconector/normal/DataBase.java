package org.example.structuralDP.bridge.dbconector.normal;

public interface DataBase {

    void connect(String url,String userName,String password);
    void executeQuery(String query);
    void disConnect();
}
