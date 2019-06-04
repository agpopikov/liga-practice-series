package org.liga.practice.third.service;

import org.liga.practice.third.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    private List<User> users;

    public UserService() {
        List<User> result = new ArrayList<>();
        result.add(new User(1L, "Robert", "Koch", LocalDate.of(1889, 2, 1)));
        result.add(new User(2L, "Max", "Planck", LocalDate.of(1889, 2, 1)));
        result.add(new User(3L, "Albert", "Einstein", LocalDate.of(1889, 2, 1)));
        result.add(new User(4L, "Thomas", " Mann", LocalDate.of(1889, 2, 1)));
        this.users = result;
    }

    public List<User> getAllUsers() {
        log.info("Getting all users.");
        return users;
    }

    public Optional<User> getById(Long id) {
        log.info("Getting user by id={}.", id);
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }
}
