package by.brel.kafkastart.controller;

import by.brel.kafkastart.kafka.KafkaProducer;
import by.brel.kafkastart.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class DefaultController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        kafkaProducer.send(user);

        return ResponseEntity.ok("Json sent to the topic");
    }
}
