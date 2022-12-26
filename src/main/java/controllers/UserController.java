package controllers;

import models.UserNova;
import services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserNova>> getUsers(){
        return ResponseEntity.ok(userService.getUsers());
    }

    @GetMapping("/getUsersById")
    public ResponseEntity<UserNova> getUsersById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(userService.getUserById(id));
    }
}
