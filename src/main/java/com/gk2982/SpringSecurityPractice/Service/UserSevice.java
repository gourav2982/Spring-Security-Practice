package com.gk2982.SpringSecurityPractice.Service;

import com.gk2982.SpringSecurityPractice.collections.User;
import com.gk2982.SpringSecurityPractice.model.UserModel;

public interface UserSevice {
    User registerUser(UserModel userModel);
}
