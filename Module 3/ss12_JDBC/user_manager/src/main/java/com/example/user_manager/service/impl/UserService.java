package com.example.user_manager.service.impl;

import com.example.user_manager.model.User;
import com.example.user_manager.repository.IUserRepository;
import com.example.user_manager.repository.impl.UserRepository;

import java.util.List;

public class UserService implements IUserService{
    private final IUserRepository userRepository = new UserRepository();
    @Override
    public void insertUser(User user) {
        userRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepository.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public List<User> findByCountry(String country) {
        return userRepository.findByCountry(country);
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }
}
