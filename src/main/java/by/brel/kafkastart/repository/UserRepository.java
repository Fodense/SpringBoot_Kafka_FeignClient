package by.brel.kafkastart.repository;

import by.brel.kafkastart.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "kafkaDB", url = "http://localhost:8081/api/v1")
public interface UserRepository {

    @GetMapping("/users")
    List<User> getAllUsers();

    @GetMapping(value = "/users/{idUser}")
    User getUserByID(@PathVariable Long idUser);
}
