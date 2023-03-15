package com.anjana.interviewprep.design_patterns.chain_of_responsibility;


public class UserNameCheckHandler extends Handler {
    private DataBase dataBase;

    public UserNameCheckHandler(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    public boolean handle(String name, String email) {
        if(!dataBase.isValidUser(name)) {
            System.out.println("Invalid User Name!");
            return false;
        }
        return handleNext(name, email);
    }

}
