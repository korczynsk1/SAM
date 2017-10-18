package com.mateuszkorczynski.raq.service;

import com.mateuszkorczynski.raq.model.User;
import com.mateuszkorczynski.raq.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MAKORCZY on 2017-10-17.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getById(String userId) {
        return userRepository.findOne(userId);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

}
