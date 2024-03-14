package org.example.structuralDP.bridge.socialmedia.social;

public class Twitter implements SocialMediaPlatform{
    @Override
    public void login(String user, String pass) {
        System.out.println("Twitter login.. " + user);
    }
}
