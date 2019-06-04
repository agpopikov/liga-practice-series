package org.liga.practice.third.service;

import org.liga.practice.third.dao.UsersDao;
import org.liga.practice.third.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Primary
@Profile("local-db")
public class DBUserService implements UserService {

    private static final Logger log = LoggerFactory.getLogger(DBUserService.class);

    private final UsersDao dao;

    public DBUserService(UsersDao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> getAllUsers() {
        log.info("Getting all users.");
        return dao.getAllUsers();
    }

    @Override
    public Optional<User> getById(Long id) {
        log.info("Getting user by id={}.", id);
        return dao.getAllUsers().stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }

    @Override
    public void deleteById(Long id) {
        dao.delete(id);
    }
}
