package by.brel.kafkastart.kafka;

import by.brel.kafkastart.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "topic", groupId = "myGroup")
    public void consume(User user) {
        log.info("Message received {}", user.toString());
    }
}
