package org.example.creationalDP.abstractfactory.password.factory;

import org.example.creationalDP.abstractfactory.password.aes.AESDecryption;
import org.example.creationalDP.abstractfactory.password.aes.AESEncryption;
import org.example.creationalDP.abstractfactory.password.interfaces.Decryption;
import org.example.creationalDP.abstractfactory.password.interfaces.Encryption;

public class AESFactory implements FactoryHash{
    @Override
    public Encryption createEncryption() {
        return new AESEncryption();
    }

    @Override
    public Decryption createDecryption() {
        return new AESDecryption();
    }
}
