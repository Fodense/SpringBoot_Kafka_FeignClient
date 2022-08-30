package by.brel.kafkastart.service;

import by.brel.kafkastart.repository.UserRepository;
import by.brel.kafkastart.kafka.KafkaProducer;
import by.brel.kafkastart.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {

    private KafkaProducer kafkaProducer;
    private UserRepository userRepository;

    public UserService(KafkaProducer kafkaProducer, UserRepository userRepository) {
        this.kafkaProducer = kafkaProducer;
        this.userRepository = userRepository;
    }

    public void sendAllUsers() {
        List<User> users = userRepository.getAllUsers();

        for (User user: users) {
            kafkaProducer.send(user);
        }
    }

    public void sendUserByID(Long idUsers) {
        User user = userRepository.getUserByID(idUsers);

        kafkaProducer.send(user);
    }
}
