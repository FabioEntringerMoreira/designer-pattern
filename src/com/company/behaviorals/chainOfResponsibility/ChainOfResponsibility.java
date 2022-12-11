package com.company.behaviorals.chainOfResponsibility;

import com.company.behaviorals.chainOfResponsibility.middlewares.CheckPermission;
import com.company.behaviorals.chainOfResponsibility.middlewares.CheckUserMiddleware;
import com.company.behaviorals.chainOfResponsibility.middlewares.Middleware;
import com.company.behaviorals.chainOfResponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** In object-oriented design, the chain-of-responsibility pattern is a behavioral design pattern consisting
 * of a source of command objects and a series of processing objects.
 * Each processing object contains logic that defines the types of command objects that it can handle;
 * the rest are passed to the next processing object in the chain. A mechanism also exists for
 * adding new processing objects to the end of this chain. */
public class ChainOfResponsibility {


    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init(){
        server = new Server();
        server.registerUser("adc@something.com", "goodPassword");
        server.registerUser("notAdm@something.com", "badPassword=)");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermission());

        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do{
            System.out.println("Please, your email: ");
            String email = reader.readLine();
            System.out.println("Please, your password: ");
            String password = reader.readLine();
            done = server.logIn(email, password);
        }while(!done);

    }

}
