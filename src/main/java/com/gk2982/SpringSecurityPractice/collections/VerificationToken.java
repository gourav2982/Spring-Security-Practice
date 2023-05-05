package com.gk2982.SpringSecurityPractice.collections;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class VerificationToken {
    private long id;
    private String token;
    private Date expirationTime;
}
