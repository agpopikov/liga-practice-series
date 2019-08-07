package org.liga.practice.third.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDate;

//@Data
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class User {

    private Long id;
    private String firstName;
    @JsonProperty("surname")
    private String lastName;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private LocalDate birthday;
    private Boolean active;

    public User() {
        // stub
    }

    public User(Long id, String firstName, String lastName, LocalDate birthday) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.active = true;
    }
}
