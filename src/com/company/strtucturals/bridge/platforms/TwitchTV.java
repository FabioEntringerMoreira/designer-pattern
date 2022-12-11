package com.company.strtucturals.bridge.platforms;

public class TwitchTV implements IPlatform{

    public TwitchTV(){
        configureRMTP();
        System.out.println(TwitchTV.class.getSimpleName() + " Starting transmission");
    }

    @Override
    public void configureRMTP() {
        oauthToken();
        System.out.println("Authorized");
    }

    @Override
    public void oauthToken() {
        System.out.println("Validating the platform");
    }
}
