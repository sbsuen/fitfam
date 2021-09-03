package com.sbsuen.fitfam.user;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private Gender gender;

    public User(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
}
