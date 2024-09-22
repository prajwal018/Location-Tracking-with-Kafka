package com.prajwal.customerguy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.prajwal.customerguy.config.AppConstants.GROUP_ID;
import static com.prajwal.customerguy.config.AppConstants.LOCATION_TOPIC;

@Configuration
public class KafkaConfig {


    @KafkaListener(topics = LOCATION_TOPIC,groupId = GROUP_ID)
    public void updatedLocation(String value){
        System.out.println(value);
    }
}
