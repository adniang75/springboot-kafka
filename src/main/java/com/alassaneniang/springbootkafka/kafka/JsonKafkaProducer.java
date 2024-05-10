package com.alassaneniang.springbootkafka.kafka;

import com.alassaneniang.springbootkafka.payload.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class JsonKafkaProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User data) {

        log.info("Message sent -> {}", data);

        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "springbootkafka")
                .build();
        kafkaTemplate.send(message);

    }

}
