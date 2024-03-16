package org.example.behavioralDP.memento.dbtransaction;

public class DataBase {

    private static DataBase dataBase;

    private String data;
    private DataBase() {
    }


    public static DataBase getInstance(){
        if (dataBase == null) {
            dataBase = new DataBase();
        }
        return dataBase;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Memento save (){
        return new Memento(data);
    }

    public void restore(Memento memento){
        data = memento.getData();

    }

}
