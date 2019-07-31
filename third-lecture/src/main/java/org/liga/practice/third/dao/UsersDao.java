//package org.liga.practice.third.dao;
//
//import org.liga.practice.third.domain.User;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class UsersDao {
//
//    private final JdbcTemplate jdbc;
//
//    public UsersDao(JdbcTemplate jdbc) {
//        this.jdbc = jdbc;
//    }
//
//    public List<User> getAllUsers() {
//        return jdbc.query("select * from users", (rs, rowNum) -> {
//            User user = new User();
//            user.setId(rs.getLong("id"));
//            user.setFirstName(rs.getString("first_name"));
//            user.setLastName(rs.getString("last_name"));
//            user.setBirthday(rs.getDate("birthday").toLocalDate());
//            user.setActive(rs.getBoolean("active"));
//            return user;
//        });
//    }
//}
