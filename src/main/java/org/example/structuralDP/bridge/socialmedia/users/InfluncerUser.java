package org.example.structuralDP.bridge.socialmedia.users;

import org.example.structuralDP.bridge.socialmedia.social.SocialMediaPlatform;

public class InfluncerUser extends User{
    public InfluncerUser(SocialMediaPlatform socialMediaPlatform) {
        super(socialMediaPlatform);
    }

    @Override
    public void post(String context) {

        System.out.println(context);
    }
}
