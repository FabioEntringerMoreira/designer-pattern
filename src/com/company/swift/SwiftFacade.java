package com.company.swift;

public class SwiftFacade {

    private SwiftService swiftService;

    public void receive(){
        SwiftService swiftService = new SwiftService();

        swiftService.receive();
    }

    public void send(){
        swiftService.send();
    }
}
