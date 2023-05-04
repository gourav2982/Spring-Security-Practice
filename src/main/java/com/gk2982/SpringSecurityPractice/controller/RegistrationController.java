package com.gk2982.SpringSecurityPractice.controller;

import com.gk2982.SpringSecurityPractice.Service.UserSevice;
import com.gk2982.SpringSecurityPractice.collections.User;
import com.gk2982.SpringSecurityPractice.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private UserSevice userSevice;

    @PostMapping("/register")
    public String userRegister(@RequestBody  UserModel userModel){
        if(userModel.getPassword()!=userModel.getMatchingPassword())
            return "Not Matching Password";
        User user = userSevice.registerUser(userModel);
        return "Success";
    }
}
