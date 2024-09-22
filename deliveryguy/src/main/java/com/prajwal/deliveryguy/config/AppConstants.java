package com.prajwal.deliveryguy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

public class AppConstants {

    public static final String LOCATION_TOPIC_NAME = "location-topic";
}
