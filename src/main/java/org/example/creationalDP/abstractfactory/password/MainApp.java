package org.example.creationalDP.abstractfactory.password;

import org.example.creationalDP.abstractfactory.password.factory.AESFactory;
import org.example.creationalDP.abstractfactory.password.factory.FactoryHash;
import org.example.creationalDP.abstractfactory.password.factory.RSAFactory;
import org.example.creationalDP.abstractfactory.password.interfaces.Decryption;
import org.example.creationalDP.abstractfactory.password.interfaces.Encryption;

public class MainApp {
    public static void main(String[] args) {
        FactoryHash factoryHash = new AESFactory();
        Encryption encryption = factoryHash.createEncryption();
        String encry =  encryption.encryption("Shahed");
        Decryption decryption = factoryHash.createDecryption();
        String dec = decryption.decryption(encry);
        System.out.println("Encryption: " + encry);
        System.out.println("Decryption: " + dec);
    }
}
