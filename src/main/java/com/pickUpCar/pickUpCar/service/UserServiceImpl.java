package com.pickUpCar.pickUpCar.service;

import com.pickUpCar.pickUpCar.entity.User;
import com.pickUpCar.pickUpCar.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() { return userRepository.findAll(); }

    @Override
    public void saveUser(User user) { this.userRepository.save(user); }

    @Override
    public void deleteUserById(long id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public User getUserById(long id) {
        Optional<User> optional = userRepository.findById(id);
        User user = null;
        if(optional.isPresent()){
            user = optional.get();
        }else{
            throw new RuntimeException("User not found for id ::" + id);
        }
        return user;
    }
}