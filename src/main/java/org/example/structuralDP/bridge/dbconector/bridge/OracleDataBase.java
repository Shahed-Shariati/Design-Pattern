package org.example.structuralDP.bridge.dbconector.bridge;

public class OracleDataBase implements DataBase {
    private final OracleConnector oracleConnector;

    public OracleDataBase(OracleConnector oracleConnector) {
        this.oracleConnector = oracleConnector;
    }

    @Override
    public void connect(String url, String userName, String password) {
       oracleConnector.connect(url,userName,password);
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Do some things ");
        oracleConnector.executeQuery(query);
    }

    @Override
    public void disConnect() {
       oracleConnector.disConnect();

    }
}
