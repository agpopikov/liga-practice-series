package org.liga.practice.third.dao;

import lombok.RequiredArgsConstructor;
import org.liga.practice.third.domain.User;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Repository
//@Profile("local-db")
@RequiredArgsConstructor
//@AllArgsConstructor
public class UsersDao {

    private final NamedParameterJdbcTemplate jdbc;

    public List<User> getAllUsers() {
        return jdbc.query("SELECT * FROM users " +
                "WHERE deleted = FALSE", (rs, rowNum) -> {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setFirstName(rs.getString("first_name"));
            user.setLastName(rs.getString("last_name"));
            user.setBirthday(rs.getDate("birthday").toLocalDate());
            user.setActive(rs.getBoolean("active"));
            return user;
        });
    }

    public void delete(Long id) {
        Map<String, Object> params = Collections.singletonMap("name", id);
        jdbc.update("UPDATE users SET deleted = TRUE WHERE id = :name", params);
    }
}
