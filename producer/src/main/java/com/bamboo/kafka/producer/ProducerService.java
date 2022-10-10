package com.bamboo.kafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate<Object, Object> template;

    public void publish(Info info) {

//      1. Default Topic 또는 다른 Topic에 보낼 때
//        template.send("topic-bamboo-1", info);
//      2. Default Topic에 보낼 때
        template.sendDefault(info);
    }
}
