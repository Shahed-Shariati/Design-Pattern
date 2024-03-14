package org.example.structuralDP.bridge.socialmedia.social;

public class Instagram implements SocialMediaPlatform{
    @Override
    public void login(String user, String pass) {
        System.out.println("Instagram Login.. " + user );
    }
}
