package org.example.creationalDP.abstractfactory.password.interfaces;

public abstract class Encryption {
    protected static final String SECRET_KEY = "123456789";
    protected static final String SALTVALUE = "abcdefg";
    abstract public  String encryption(String plain);
}
