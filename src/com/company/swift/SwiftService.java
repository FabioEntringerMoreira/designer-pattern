package com.company.swift;

public class SwiftService {

    private static final String M001 = "M001";

    private Swift swift;

    public void receive(){
        Swift swift = null;

        if (!M001.equals("0")){
            swift = new M001();
        }

        swift.receive();
    }

    public void send(){
        swift.send();
    }
}
