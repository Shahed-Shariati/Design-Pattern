package org.example.structuralDP.bridge.dbconector.bridge;

public class MainApp {
    public static void main(String[] args) {
        DataBase dataBase = new MySqlDataBase(new MySqlDataBaseConnector());
        dataBase.executeQuery("select * from user");

    }
}
