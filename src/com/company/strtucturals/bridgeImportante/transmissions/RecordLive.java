package com.company.strtucturals.bridgeImportante.transmissions;

import com.company.strtucturals.bridgeImportante.platforms.IPlatform;

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
