package com.example.taskservice.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "task-events";

    public void sendTaskEvent(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}
