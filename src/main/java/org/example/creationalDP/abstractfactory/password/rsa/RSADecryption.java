package org.example.creationalDP.abstractfactory.password.rsa;

import org.example.creationalDP.abstractfactory.password.interfaces.Decryption;

public class RSADecryption extends Decryption {
    @Override
    public String decryption(String hash) {
        return "RSADecryption " + hash;
    }
}
