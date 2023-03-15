package com.anjana.interviewprep.design_patterns.chain_of_responsibility;

import java.util.HashMap;

public class DataBase {
    HashMap<String, String> users; // Maps user name to email

    public DataBase() {
        users = new HashMap<>();
        users.put("Anjana", "kesarianjana96@gmail.com");
        users.put("Abc", "Def");
        users.put("admin_user","admin.user@gmail.com");
    }

    public boolean isValidUser(String name) {
        return users.containsKey(name);
    }
}
