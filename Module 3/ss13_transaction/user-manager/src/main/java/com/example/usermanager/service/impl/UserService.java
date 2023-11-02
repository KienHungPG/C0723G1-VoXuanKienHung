package com.example.usermanager.service.impl;

import com.example.usermanager.model.User;
import com.example.usermanager.repository.IUserRepository;
import com.example.usermanager.repository.impl.UserRepository;
import com.example.usermanager.service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    private final IUserRepository userRepository = new UserRepository();

    @Override
    public List<User> displayUserList() {
        return userRepository.displayUserList();
    }

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public void editUser(int id, User user) {
        userRepository.editUser(id, user);
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }

    @Override
    public List<User> findByCountry(String country) {
        return userRepository.findByCountry(country);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) {
        userRepository.insertUserStore(user);
    }

    @Override
    public List<User> displayUserProcedure() {
        return userRepository.displayUserProcedure();
    }

    @Override
    public void editUserProcedure(int id, User user) {
        userRepository.editUserProcedure(id, user);
    }

    @Override
    public void deleteUserProcedure(int id) {
        userRepository.deleteUserProcedure(id);
    }

    @Override
    public void addUserTransaction(User user, List<Integer> permissions) {
        userRepository.addUserTransaction(user, permissions);
    }

    @Override
    public void insertUpdateUseTransaction() {
        userRepository.insertUpdateUseTransaction();
    }
}
