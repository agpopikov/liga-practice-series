package org.liga.practice.third.service;

import org.liga.practice.third.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class DummyUserService implements UserService {

    private static final Logger log = LoggerFactory.getLogger(DummyUserService.class);

    private volatile List<User> users;

    public DummyUserService() {
        List<User> result = new ArrayList<>();
        result.add(new User(1L, "Robert", "Koch", LocalDate.of(1889, 2, 1)));
        result.add(new User(2L, "Max", "Planck", LocalDate.of(1889, 2, 1)));
        result.add(new User(3L, "Albert", "Einstein", LocalDate.of(1889, 2, 1)));
        result.add(new User(4L, "Thomas", " Mann", LocalDate.of(1889, 2, 1)));
        this.users = result;
        log.warn("DummyUserService is created!");
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

    public void deleteById(Long id) {
        log.info("Deleting user by id={}.", id);
        users = users.stream().filter(u -> !Objects.equals(u.getId(), id))
                .collect(Collectors.toList());
    }
}
