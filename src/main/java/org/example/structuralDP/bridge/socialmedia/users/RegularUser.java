package org.example.structuralDP.bridge.socialmedia.users;

import org.example.structuralDP.bridge.socialmedia.social.SocialMediaPlatform;

public class RegularUser extends User{
    public RegularUser(SocialMediaPlatform socialMediaPlatform) {
        super(socialMediaPlatform);
    }

    @Override
    public void post(String context) {
       super.socialMediaPlatform.login("11","12");
        System.out.println(context);
    }
}
