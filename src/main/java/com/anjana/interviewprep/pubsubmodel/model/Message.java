package com.anjana.interviewprep.pubsubmodel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Message {
    private String topic;
    private String payload;
}
