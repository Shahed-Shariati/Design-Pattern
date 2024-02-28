package org.example.creationalDP.abstractfactory.password.factory;

import org.example.creationalDP.abstractfactory.password.interfaces.Decryption;
import org.example.creationalDP.abstractfactory.password.interfaces.Encryption;

public interface FactoryHash {

    Encryption createEncryption();
    Decryption createDecryption();
}
