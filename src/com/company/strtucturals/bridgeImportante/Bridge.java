package com.company.strtucturals.bridgeImportante;

import com.company.strtucturals.bridgeImportante.platforms.*;
import com.company.strtucturals.bridgeImportante.transmissions.RecordLive;

/** The bridge pattern is a design pattern used in software engineering that is meant to
 * "decouple an abstraction from its implementation so that the two can vary independently" */

/** For this scenario:
 * Live = abstraction
 * IPlatform = bridge
 * IPlatform derived classes = implementation*/

public class Bridge {

    public static void main(String[] args) {

        /*startLive(new Facebook());
        startLive(new TwitchTV());
        startLive(new Youtube());*/
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatform platform){
        /*Live live = new Live(platform);
        live.broadcasting();
        live.result();*/

        RecordLive recordLive = new RecordLive(platform);
        recordLive.broadcasting();
        recordLive.comments();
        recordLive.subtitles();
        recordLive.result();
        recordLive.recordLive();
    }
}
