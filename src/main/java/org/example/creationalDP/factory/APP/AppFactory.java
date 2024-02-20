package org.example.creationalDP.factory.APP;

public class AppFactory {

    public static MobileApp getApp(String type, String name, Integer version){
        if(type.equalsIgnoreCase("android")){
           return new AndroidMobileApp(name,version);
        } else if (type.equalsIgnoreCase("ios")) {
            return new IOSMobileApp(name,version);
        }else {
            throw new IllegalArgumentException("");
        }
    }
}
