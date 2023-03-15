package com.anjana.interviewprep.design_patterns.observer_pattern.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Audience implements Subscriber {
    private String name;

    @Override
    public void receive(String message) {
        System.out.println("Message received by "+name+" is: "+message);
    }
}
