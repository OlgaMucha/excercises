package Persistency;

import Model.Role;
import Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO extends AbstractDAO{
    public UserDAO(DBAccess dBaccess) {
        super(dBaccess);
    }

    public ArrayList<User> getAll() throws SQLException {
        String sql = "SELECT * FROM users;";
        ArrayList<User> users = new ArrayList<>();
        try {
            setupPreparedStatement(sql);
            ResultSet resultSet = executeSelectStatement();
            while (resultSet.next()) {
                String userName = resultSet.getString("LOGIN");
                String password = resultSet.getString("PASSWORD");
                String email = resultSet.getString("EMAIL");
                Role role = Role.valueOf(resultSet.getString("ROLE"));
                User user = new User(userName, password, role, email);
                users.add(user);
            }
        } catch (SQLException sqlError) {
            System.out.println(sqlError);
        }
            return users;
        }

    }
