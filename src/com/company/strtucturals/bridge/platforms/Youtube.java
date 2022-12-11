package com.company.strtucturals.bridge.platforms;

public class Youtube implements IPlatform{

    public Youtube(){
        configureRMTP();
        System.out.println(Youtube.class.getSimpleName() + " Starting transmission");
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
