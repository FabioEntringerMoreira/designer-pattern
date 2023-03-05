package com.company.strtucturals.bridgeImportante.transmissions;

import com.company.strtucturals.bridgeImportante.platforms.IPlatform;

public class AdvancedLive extends Live{

    protected IPlatform platform;

    public AdvancedLive(){

    }

    public AdvancedLive(IPlatform platform){
        super.platform = platform;
    }

    public void subtitles(){
        System.out.println("Stream Subtitles enabled");
    }

    public void comments(){
        System.out.println("Live comments available");
    }
}
