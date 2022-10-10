package com.bamboo.kafka.consumer;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Info {

    private String firstName;
    private String lastName;
    private Integer age;
}

