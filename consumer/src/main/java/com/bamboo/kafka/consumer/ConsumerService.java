package com.bamboo.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = { "bamboo-topic-1" }, groupId = "group-1")
    public void listen(Info info) {
        System.out.println("Received... " + info);
    }
}
