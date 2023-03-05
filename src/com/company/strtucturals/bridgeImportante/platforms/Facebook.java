package com.company.strtucturals.bridgeImportante.platforms;

public class Facebook implements IPlatform{

    public Facebook(){
        configureRMTP();
        System.out.println(Facebook.class.getSimpleName() + " Starting transmission");
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
