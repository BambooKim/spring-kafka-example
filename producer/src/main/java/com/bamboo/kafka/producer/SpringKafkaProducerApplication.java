package com.bamboo.kafka.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.RecordMessageConverter;

@SpringBootApplication
public class SpringKafkaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaProducerApplication.class, args);
    }

}
