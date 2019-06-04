package org.liga.practice.third.service;

import org.liga.practice.third.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    Optional<User> getById(Long id);

    void deleteById(Long id);
}
