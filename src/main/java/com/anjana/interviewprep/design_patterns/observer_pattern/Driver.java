package com.anjana.interviewprep.design_patterns.observer_pattern;

import com.anjana.interviewprep.design_patterns.observer_pattern.observable.NewsChannel;
import com.anjana.interviewprep.design_patterns.observer_pattern.observable.Subject;
import com.anjana.interviewprep.design_patterns.observer_pattern.observer.Audience;
import com.anjana.interviewprep.design_patterns.observer_pattern.observer.Subscriber;
import com.anjana.interviewprep.pubsubmodel.model.Publisher;

import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Calendar;

public class Driver {

    public static void main(String[] args) {
        // Create Subjects and register Subscribers
        Subject subject = new NewsChannel();
        Subscriber person1 = new Audience("Anjana");
        Subscriber person2 = new Audience("Aravind");
        subject.register(person1);
        subject.register(person2);

        // publish news
        subject.publishNews("Tax slab reduced by 5%");
    }
}
