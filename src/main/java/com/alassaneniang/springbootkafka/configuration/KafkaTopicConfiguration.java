package com.alassaneniang.springbootkafka.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic springbootKafkaTopic() {
        return TopicBuilder
                .name("springbootkafka")
                .build();
    }

        @Bean
    public NewTopic springbootKafkaJsonTopic() {
        return TopicBuilder
                .name("springbootkafka_json")
                .build();
    }


}
