package com.example.usermanager.service;

import com.example.usermanager.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    void insertUser(User user) throws SQLException;
    void insertUserSp(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUsers();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;
    List<User>  sortUserByName() throws SQLException;
    List<User> searchByCountry(String country) throws SQLException;
    User selectUserByIdSp(int id) throws SQLException;
    void addUserTransaction(User user, List<Integer> permissions) throws SQLException;
}
