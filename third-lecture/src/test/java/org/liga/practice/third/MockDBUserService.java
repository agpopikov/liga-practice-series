package org.liga.practice.third;

import org.liga.practice.third.domain.User;
import org.liga.practice.third.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MockDBUserService implements UserService {

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }

    @Override
    public Optional<User> getById(Long id) {
        throw new RuntimeException("Not implemented yet!");
    }

    @Override
    public void deleteById(Long id) {
        throw new RuntimeException("Not implemented yet!");
    }
}
