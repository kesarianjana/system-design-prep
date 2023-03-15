package com.anjana.interviewprep.design_patterns.logging_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subject {

    private Map<Integer, List<Observer>> observers;

    public Subject() {
       observers = new HashMap<>();
    }

    public void addObserver(int level, Observer observer) {
        List<Observer> observerList = observers.getOrDefault(level, new ArrayList<>());
        observerList.add(observer);
        observers.put(level, observerList);
    }

    public void notifyObserver(int level, String msg) {
        for(Map.Entry<Integer, List<Observer>> observersMap : observers.entrySet()) {

            if(observersMap.getKey() == level)
            observersMap.getValue().forEach(observer -> observer.log(msg));
        }
    }

}
