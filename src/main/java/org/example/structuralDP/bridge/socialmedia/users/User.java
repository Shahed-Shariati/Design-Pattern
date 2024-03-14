package org.example.structuralDP.bridge.socialmedia.users;

import org.example.structuralDP.bridge.socialmedia.social.SocialMediaPlatform;

public abstract class User {
    protected final SocialMediaPlatform socialMediaPlatform;

    public User(SocialMediaPlatform socialMediaPlatform) {
        this.socialMediaPlatform = socialMediaPlatform;
    }

    public abstract void post(String context);
}
