package org.example.structuralDP.bridge.dbconector.normal;

public class MainApp {
    public static void main(String[] args) {
        DataBase mySqlDataBase = new MySqlDataBase();
        mySqlDataBase.connect("jdbc:mysql//localhost:3306/dbuser" , "mysql","1234");
        mySqlDataBase.executeQuery("select * from user");
        mySqlDataBase.disConnect();

        DataBase oracleDatabase = new OracleDataBase();
        oracleDatabase.connect("jdbc:oracle//localhost:5432/dbuser" , "mysql","1234");
        oracleDatabase.executeQuery("select * from user");
        oracleDatabase.disConnect();
    }
}
