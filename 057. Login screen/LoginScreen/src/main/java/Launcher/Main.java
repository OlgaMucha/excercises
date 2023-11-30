package Launcher;


import Model.Role;
import Model.User;
import Persistency.DBAccess;
import Persistency.UserDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        String userMySQL = "root";
        String password = "secret";
        DBAccess dbAccess = new DBAccess("057_user_login", userMySQL, password);
        dbAccess.openConnection();

        UserDAO userDAO = new UserDAO(dbAccess);

        User user1 = new User("annlas", "123456789", Role.STUDENT,"anna.las@mymail.com");
        userDAO.storeOne(user1);


        ArrayList<User> users = userDAO.getAll();
        for(User user: users){
            System.out.println(user.toString());
        }
        dbAccess.closeConnection();
    }
}