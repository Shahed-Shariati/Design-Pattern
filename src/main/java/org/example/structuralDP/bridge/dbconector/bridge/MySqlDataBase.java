package org.example.structuralDP.bridge.dbconector.bridge;

public class MySqlDataBase implements DataBase {

    private final MySqlDataBaseConnector mySqlDataBaseConnector;

    public MySqlDataBase(MySqlDataBaseConnector dataBaseConnector) {
        this.mySqlDataBaseConnector = dataBaseConnector;
    }

    @Override
    public void connect(String url, String userName, String password) {
        //do some things
        // log
        mySqlDataBaseConnector.connect(url, userName, password);
    }

    @Override
    public void executeQuery(String query) {
        //service call
        // log in db
        System.out.println("Do some things ");
        mySqlDataBaseConnector.executeQuery(query);

    }

    @Override
    public void disConnect() {
        mySqlDataBaseConnector.disConnect();
    }
}
