package org.example.structuralDP.bridge.socialmedia;

import org.example.structuralDP.bridge.socialmedia.social.Instagram;
import org.example.structuralDP.bridge.socialmedia.social.SocialMediaPlatform;
import org.example.structuralDP.bridge.socialmedia.social.Twitter;
import org.example.structuralDP.bridge.socialmedia.users.RegularUser;
import org.example.structuralDP.bridge.socialmedia.users.User;

public class MainApp {
    public static void main(String[] args) {
        SocialMediaPlatform instagram = new Instagram();
        SocialMediaPlatform twitter = new Twitter();
        User user = new RegularUser(twitter);
        user.post("Context");
    }
}
