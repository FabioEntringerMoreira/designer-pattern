package com.company.strtucturals.bridge.transmissions;

import com.company.strtucturals.bridge.platforms.IPlatform;

public class RecordLive extends AdvancedLive{

    public RecordLive(){
        super();
    }

    public RecordLive(IPlatform platform){
        super(platform);
    }

    public void recordLive(){
        System.out.println("Record live enabled!");
    }
}
