package org.example.creationalDP.factory.APP;

public class main {
    public static void main(String[] args) {
//       AppFactory factory = new AppFactory();
       MobileApp IOSapp =  AppFactory.getApp("ios","MyIOSApp",1);
       IOSapp.buildApp();

       MobileApp androidApp = AppFactory.getApp("android","MyAndroidApp",2);
       androidApp.buildApp();

    }
}
