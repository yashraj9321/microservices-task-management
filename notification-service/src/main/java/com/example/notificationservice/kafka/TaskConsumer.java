package com.example.notificationservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TaskConsumer {

    @KafkaListener(topics = "task-events", groupId = "notification-group")
    public void consume(String message) {
        System.out.println("Received Task Event: " + message);
    }
}
