package com.gk2982.SpringSecurityPractice.Service;

import com.gk2982.SpringSecurityPractice.Repositery.UserRepo;
import com.gk2982.SpringSecurityPractice.collections.User;
import com.gk2982.SpringSecurityPractice.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserSevice{
    @Autowired
    private UserRepo repo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User registerUser(UserModel userModel) {
        User user = new User();
        user.setId(userModel.getUserName());
        user.setName(userModel.getName());
        user.setEmail(userModel.getEmail());
        user.setRole("USER");
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
        repo.save(user);
        return user;
    }
}
