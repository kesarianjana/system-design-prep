package com.anjana.interviewprep.design_patterns.chain_of_responsibility;

public class Driver {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Handler handler = new UserNameCheckHandler(dataBase)
                              .setNextHandler(new RoleCheckHandler());

        AuthService authService = new AuthService(handler);
        authService.logIn("admin_user","admin.user@gmail.com");

    }
}
