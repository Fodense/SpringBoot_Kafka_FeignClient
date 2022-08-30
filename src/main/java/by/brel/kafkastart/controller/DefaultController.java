package by.brel.kafkastart.controller;

import by.brel.kafkastart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DefaultController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<String> getAllUsers() {
        userService.sendAllUsers();

        return ResponseEntity.ok("Users list sent to the topic");
    }

    @GetMapping("/users/{idUser}")
    public ResponseEntity<String> getUserByID(@PathVariable Long idUser) {
        userService.sendUserByID(idUser);
        return ResponseEntity.ok("User sent to topic");
    }
}
