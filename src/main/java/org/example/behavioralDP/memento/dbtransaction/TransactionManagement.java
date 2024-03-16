package org.example.behavioralDP.memento.dbtransaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionManagement {

    private List<Memento> mementos = new ArrayList<>();

    public void beginTransaction(DataBase dataBase){
        mementos.add(dataBase.save());
    }

    public void commit(){
        mementos.clear();
    }

    public void rollBack(DataBase dataBase){
        if (!mementos.isEmpty()) {
            dataBase.restore(mementos.get(0));
            mementos.clear();

        }

    }


}
