package org.example.creationalDP.abstractfactory.password.rsa;

import org.example.creationalDP.abstractfactory.password.interfaces.Encryption;

public class RSAEncryption extends Encryption {
    @Override
    public String encryption(String plain) {
        return "RSA Encryption " + plain;
    }
}
