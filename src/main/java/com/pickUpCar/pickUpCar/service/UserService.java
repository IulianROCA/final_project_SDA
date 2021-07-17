package com.pickUpCar.pickUpCar.service;

import com.pickUpCar.pickUpCar.entity.User;
import java.util.List;

public interface UserService {
        List<User> getAllUsers();
        void saveUser(User user);
        void deleteUserById(long id);
        User getUserById(long id);
}
