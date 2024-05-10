package com.alassaneniang.springbootkafka.kafka;

import com.alassaneniang.springbootkafka.payload.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class JsonKafkaConsumer {

    @KafkaListener(topics = "springbootkafka_json", groupId = "myGroup")
    public void consume(User user) {
        log.info("Json message received -> {}", user);
    }

}
