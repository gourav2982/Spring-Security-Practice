package com.gk2982.SpringSecurityPractice.collections;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.processing.Generated;

@Document("/User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @UniqueElements
    private String id;
    private String name;
    @NotBlank(message="Enter email")
    @Email(message = "Enter valid email")
    private String email;
    private String password;
    private String role;
    private boolean enabled =false;
}
