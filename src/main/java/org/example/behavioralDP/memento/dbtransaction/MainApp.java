package org.example.behavioralDP.memento.dbtransaction;

public class MainApp {
    public static void main(String[] args) {
        DataBase db = DataBase.getInstance();
        TransactionManagement transactionManagement = new TransactionManagement();


        try {
            transactionManagement.beginTransaction(db);
            db.setData("Data 1");
            System.out.println("Data in database " + db.getData());
            if( 1 == 1){
                throw new RuntimeException("Custom exception");
            }
            transactionManagement.commit();
            System.out.println("Data is commit " + db.getData());
        } catch (Exception e) {
            transactionManagement.rollBack(db);
            System.out.println("Data in database " + db.getData());
        }
    }
}
