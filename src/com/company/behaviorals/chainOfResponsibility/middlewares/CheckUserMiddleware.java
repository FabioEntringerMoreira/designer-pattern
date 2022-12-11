package com.company.behaviorals.chainOfResponsibility.middlewares;

import com.company.behaviorals.chainOfResponsibility.server.Server;

public class CheckUserMiddleware extends Middleware{

    private Server server;

    public CheckUserMiddleware(Server server){
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)){
            System.out.println("Invalid email !");
            return false;
        }

        if (!server.isValidPassword(email, password)){
            System.out.println("invalid email/password !");
        }

        return checkNext(email, password);
    }
}
