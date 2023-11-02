package com.example.usermanager.repository.impl;

import com.example.usermanager.model.User;
import com.example.usermanager.repository.BaseRepository;
import com.example.usermanager.repository.IUserRepository;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    private static final String INSERT = "insert into users (name, email, country) values (?, ?, ?);";
    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?;";
    private static final String SELECT = "select * from users order by name";
    private static final String DELETE = "delete from users where id = ?;";
    private static final String EDIT = "update users set name = ?,email= ?, country =? where id = ?;";
    private static final String FIND_BY_COUNTRY = "select name, email, country from users where country like ?;";
    private static final String FIND_BY_ID = "select id, name, email, country from users where id = ?;";

    private static final String QUERY = "{CALL get_user_by_id(?)}";

    private static final String OTHER_QUERY = "{CALL insert_user(?, ?, ?)}";

    private static final String DISPLAY_PROCEDURE = "{CALL display_user()}";

    private static final String EDIT_PROCEDURE = "{CALL edit_user(?,?,?,?)}";

    private static final String DELETE_PROCEDURE = "{CALL delete_user(?)}";


    private static final String INSERT_TRAN = "INSERT INTO Employee (`name`, salary, created_date)\n" +
            "VALUES (?,?,?)";

    private static final String UPDATE_TRAN = "UPDATE Employee SET salary=? WHERE `name`=?";

    private static final String TABLE_CREATE = "CREATE TABLE Employee";

    private static final String TABLE_DROP = "DROP TABLE IF EXISTS Employee";

    private static final String sqlPivot = "INSERT INTO user_permission(user_id, permission_id)\n"
            + "VALUES(?,?)";

    @Override
    public List<User> displayUserList() {
        Connection connection = BaseRepository.getConnection();
        List<User> userList = new ArrayList<>();
        User user;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id, name, email, country);
                userList.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return userList;
    }

    public List<User> displayUserProcedure() {
        Connection connection = BaseRepository.getConnection();
        List<User> userList = new ArrayList<>();
        User user;
        try {
            CallableStatement callableStatement = connection.prepareCall(DISPLAY_PROCEDURE);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id, name, email, country);
                userList.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return userList;
    }

    @Override
    public void createUser(User user) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insertUserStore(User user) {
        Connection connection = BaseRepository.getConnection();
        try {
            CallableStatement callableStatement = connection.prepareCall(OTHER_QUERY);
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void editUser(int id, User user) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(EDIT);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.setInt(4, user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editUserProcedure(int id, User user) {
        Connection connection = BaseRepository.getConnection();
        try {
            CallableStatement callableStatement = connection.prepareCall(EDIT_PROCEDURE);
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.setInt(4, user.getId());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User findById(int id) {
        Connection connection = BaseRepository.getConnection();
        User user = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public void deleteUser(int id) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteUserProcedure(int id) {
        Connection connection = BaseRepository.getConnection();
        try {
            CallableStatement callableStatement = connection.prepareCall(DELETE_PROCEDURE);
            callableStatement.setInt(1, id);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> findByCountry(String country) {
        List<User> userList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_COUNTRY);
            String findCountry = "%" + country + "%";
            preparedStatement.setString(1, findCountry);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country1 = resultSet.getString("country");
                User user = new User(name, email, country1);
                userList.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return userList;

    }

    @Override
    public User getUserById(int id) {
        Connection connection = BaseRepository.getConnection();
        User user = null;
        try {
            CallableStatement callableStatement = connection.prepareCall(QUERY);
            callableStatement.setInt(1, id);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }


    @Override
    public void addUserTransaction(User user, List<Integer> permissions) {
        Connection connection = BaseRepository.getConnection();
        PreparedStatement preparedStatement = null;
        PreparedStatement prAssignment = null;
        ResultSet resultSet = null;
        try {
            connection.setAutoCommit(false);

            preparedStatement = connection.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            int rowAffected = preparedStatement.executeUpdate();

            resultSet = preparedStatement.getGeneratedKeys();

            int userId = 0;
            if (resultSet.next()) {
                userId = resultSet.getInt(1);
            }

            if (rowAffected == 1) {
                prAssignment = connection.prepareStatement(sqlPivot);

                for (int permissionId : permissions) {
                    prAssignment.setInt(1, userId);
                    prAssignment.setInt(1, permissionId);
                    prAssignment.executeUpdate();
                }
                connection.commit();
            } else {
                connection.rollback();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());;
            }
            System.out.println(e.getMessage());
        }  finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (prAssignment != null) prAssignment.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public void insertUpdateUseTransaction() {
        Connection connection = BaseRepository.getConnection();
        try {
            Statement statement = connection.createStatement();
            PreparedStatement prInsert = connection.prepareStatement(INSERT_TRAN);
            PreparedStatement prUpdate = connection.prepareStatement(UPDATE_TRAN);
            statement.execute(TABLE_DROP);
            statement.execute(TABLE_CREATE);

            connection.setAutoCommit(false);
            prInsert.setString(1, "loan");
            prInsert.setBigDecimal(2, new BigDecimal(10));
            prInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            prInsert.execute();

            prUpdate.setBigDecimal(2, new BigDecimal(999.99));
            prUpdate.setString(2, "Lona");
            prUpdate.execute();

            connection.commit();
            connection.setAutoCommit(true);

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
