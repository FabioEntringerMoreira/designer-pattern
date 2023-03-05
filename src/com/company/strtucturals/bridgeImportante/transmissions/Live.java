package com.company.strtucturals.bridgeImportante.transmissions;

import com.company.strtucturals.bridgeImportante.platforms.IPlatform;

public class Live implements ITransmission{

    protected IPlatform platform;

    public Live() {
    }

    public Live(IPlatform platform){
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Starting the transmission");
    }

    @Override
    public void result() {
        System.out.println("*** Live ***");
    }
}
