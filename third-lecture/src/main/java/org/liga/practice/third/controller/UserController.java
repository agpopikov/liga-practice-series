package org.liga.practice.third.controller;

import org.liga.practice.third.domain.User;
import org.liga.practice.third.service.DummyUserService;
import org.liga.practice.third.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@ResponseBody
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final UserService service;
    private String message;

    public UserController(@Qualifier("DBUserService") UserService service, @Value("${user.message}") String message) {
        this.service = service;
        this.message = message;
    }

    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    public String test() {
        return message;
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
