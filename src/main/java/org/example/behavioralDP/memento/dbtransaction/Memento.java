package org.example.behavioralDP.memento.dbtransaction;

public class Memento {

    private String data;

    public Memento(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
