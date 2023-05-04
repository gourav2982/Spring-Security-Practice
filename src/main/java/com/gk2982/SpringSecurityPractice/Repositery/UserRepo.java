package com.gk2982.SpringSecurityPractice.Repositery;

import com.gk2982.SpringSecurityPractice.collections.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,Long> {
}
