package com.bamboo.kafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final ProducerService producerService;

    @GetMapping("/hello")
    public String hello(@RequestParam String firstName,
                        @RequestParam String lastName,
                        @RequestParam Integer age) {
        Info info = Info.builder()
                .firstName(firstName)
                .lastName(lastName)
                .age(age)
                .build();
        System.out.println("info = " + info);

        producerService.publish(info);

        return "hello";
    }
}
