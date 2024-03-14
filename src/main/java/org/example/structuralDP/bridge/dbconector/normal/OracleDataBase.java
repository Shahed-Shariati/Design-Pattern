package org.example.structuralDP.bridge.dbconector.normal;

public class OracleDataBase implements DataBase{
    @Override
    public void connect(String url, String userName, String password) {
        System.out.println("Connecting data base oracle.... " + url);
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("execute query oracle.... " + query);
    }

    @Override
    public void disConnect() {
        System.out.println("disconnecting oracle...");

    }
}
