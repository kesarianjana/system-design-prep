package com.anjana.interviewprep.design_patterns.chain_of_responsibility;

public class RoleCheckHandler extends Handler {

    public boolean handle(String name, String email) {
        if(!"admin_user".equalsIgnoreCase(name)) {
            System.out.println("User not an admin!");
            return false;
        }
        return handleNext(name, email);
    }

}
