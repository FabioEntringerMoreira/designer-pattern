package com.company.strtucturals.bridgeImportante.platforms;

public class DisneyPlus implements IPlatform{

    public DisneyPlus(){
        configureRMTP();
        System.out.println(DisneyPlus.class.getSimpleName() + " Starting transmission");
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
