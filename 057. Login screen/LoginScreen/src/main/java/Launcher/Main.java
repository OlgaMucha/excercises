package Launcher;


import Model.User;
import Persistency.DBAccess;
import Persistency.UserDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        String user = "root";
        String password = "secret";
        DBAccess dbAccess = new DBAccess("057_user_login", user, password);
        dbAccess.openConnection();

        UserDAO userDAO = new UserDAO(dbAccess);
        ArrayList<User> users = userDAO.getAll();
        for(User user1: users){
            System.out.println(user1.toString());
        }

        dbAccess.closeConnection();
    }
}