package com.anjana.interviewprep.pubsubmodel.model;

import com.anjana.interviewprep.pubsubmodel.repository.PubSubService;

public class Subscriber extends ISubscriber {
    public  void addSubscriber(String topic, PubSubService pubSubService) {
        pubSubService.addSubscriber(topic, this);
    }

    public  void unSubscribe(String topic, PubSubService pubSubService) {
        pubSubService.removeSubscriber(topic, this);
    }

    public void getMessagesForSubscriberOfTopic(String topic, PubSubService pubSubService) {
        pubSubService.getMessagesForSubscriberOfTopic(topic, this);

    }

}
