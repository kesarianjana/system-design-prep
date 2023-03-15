package com.anjana.interviewprep.design_patterns.chain_of_responsibility;

public class AuthService {
    Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String name, String email) {
        if(handler.handle(name, email)) {
            System.out.println("Authentication was successful!");
            return true;
        }
        return false;
    }
}
