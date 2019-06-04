package org.liga.practice.third.controller;

import org.liga.practice.third.domain.User;
import org.liga.practice.third.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public List<User> all() {
        return service.getAllUsers();
    }

    @GetMapping("/api/user/")
    public ResponseEntity byId(@RequestParam("user_id") Long id) {
        final Optional<User> user = service.getById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            Map<String, String> result = new HashMap<>();
            result.put("message", "User not found with passed id.");
            return ResponseEntity.status(404).body(result);
        }
    }

    @DeleteMapping("/api/user/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
}
