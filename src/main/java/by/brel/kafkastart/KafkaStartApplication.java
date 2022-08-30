package by.brel.kafkastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KafkaStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaStartApplication.class, args);
    }

}
