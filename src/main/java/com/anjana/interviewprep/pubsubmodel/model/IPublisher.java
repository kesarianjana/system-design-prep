package com.anjana.interviewprep.pubsubmodel.model;

import com.anjana.interviewprep.pubsubmodel.repository.PubSubService;

public interface IPublisher {

    public void publish(Message message, PubSubService pubSubService);
}
