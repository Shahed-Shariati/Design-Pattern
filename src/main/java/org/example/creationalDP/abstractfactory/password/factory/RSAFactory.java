package org.example.creationalDP.abstractfactory.password.factory;

import org.example.creationalDP.abstractfactory.password.interfaces.Decryption;
import org.example.creationalDP.abstractfactory.password.interfaces.Encryption;
import org.example.creationalDP.abstractfactory.password.rsa.RSADecryption;
import org.example.creationalDP.abstractfactory.password.rsa.RSAEncryption;

public class RSAFactory implements FactoryHash{
    @Override
    public Encryption createEncryption() {
        return new RSAEncryption();
    }

    @Override
    public Decryption createDecryption() {
        return new RSADecryption();
    }
}
