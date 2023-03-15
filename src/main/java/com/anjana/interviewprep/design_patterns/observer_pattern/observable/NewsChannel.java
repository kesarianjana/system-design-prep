package com.anjana.interviewprep.design_patterns.observer_pattern.observable;

import com.anjana.interviewprep.design_patterns.observer_pattern.observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Subject {

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unRegister(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String message) {
        for(Subscriber s : subscribers) {
            s.receive(message);
        }
    }

    @Override
    public void publishNews(String news) {
        System.out.println("News Publisher is publishing...."+news);
        notifySubscribers(news);
    }
}
