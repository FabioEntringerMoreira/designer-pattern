package com.company.behaviorals.chainOfResponsibility.middlewares;

public class CheckPermission extends Middleware{

    @Override
    public boolean check(String email, String password) {
        if(email.equals("adm@something.com")){
            System.out.println("Welcome adm !");
            return true;
        }
        System.out.println("Welcome!");
        return checkNext(email, password);
    }

}
