package org.liga.practice.third.dao;

import org.liga.practice.third.domain.User;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("local-db")
public class UsersDao {

    private final JdbcTemplate jdbc;

    public UsersDao(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

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
        jdbc.update("UPDATE users SET deleted = TRUE WHERE id = ?", id);
    }
}
