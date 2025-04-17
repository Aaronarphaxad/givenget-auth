package com.packt.givenget_auth.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("users") // MongoDB collection name
public class User {

    @Id
    private String id;

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;

    private String role = "USER";
}
