package com.anjana.interviewprep.design_patterns.observer_pattern.observable;

import com.anjana.interviewprep.design_patterns.observer_pattern.observer.Subscriber;

public interface Subject {
     void register(Subscriber subscriber);
     void unRegister(Subscriber subscriber);
     void notifySubscribers(String message);
     void publishNews(String message);
}
