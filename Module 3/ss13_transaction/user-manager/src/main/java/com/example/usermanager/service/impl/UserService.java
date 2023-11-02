package com.example.usermanager.service.impl;

import com.example.usermanager.model.User;
import com.example.usermanager.repository.IUserRepository;
import com.example.usermanager.repository.impl.UserRepository;
import com.example.usermanager.service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    private static final IUserRepository userRepository = new UserRepository();

    @Override
    public void insertUser(User user) throws SQLException {
        userRepository.insertUser(user);
    }

    @Override
    public void insertUserSp(User user) throws SQLException {
        userRepository.insertUserSp(user);
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
    public boolean deleteUser(int id) throws SQLException {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userRepository.updateUser(user);
    }

    @Override
    public List<User> sortUserByName() throws SQLException {
        return userRepository.sortUserByName();
    }

    @Override
    public List<User> searchByCountry(String country) throws SQLException {
        return userRepository.searchByCountry(country);
    }

    @Override
    public User selectUserByIdSp(int id) throws SQLException {
        return userRepository.selectUserByIdSp(id);
    }

    @Override
    public void addUserTransaction(User user, List<Integer> permissions) throws SQLException {
        userRepository.addUserTransaction(user, permissions);
    }
}
