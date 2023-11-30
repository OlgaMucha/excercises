package Persistency;

import Model.Role;
import Model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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


            public void storeOne(User user) {
                String sql = "INSERT INTO 057_user_login.users (login, password, email, role) VALUES(?, ?, ?, ?);";

                try {
                    setupPreparedStatementWithKey(sql);
                    preparedStatement.setString(1, user.getUserName());
                    preparedStatement.setString(2, user.getPassword());
                    preparedStatement.setString(3, user.getEmail());
                    preparedStatement.setString(4, String.valueOf(user.getRole()));
                    preparedStatement.executeUpdate();
                } catch (SQLException sqlFout) {
                    System.out.println(sqlFout);
                }
            }

            protected void setupPreparedStatementWithKey(String sql) throws SQLException {
                preparedStatement = dBaccess.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            }
        }

