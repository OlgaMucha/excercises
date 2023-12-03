package Launcher;


import Model.Role;
import Model.User;
import Persistency.DBAccess;
import Persistency.UserDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.ldap.StartTlsResponse;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static <ServletRequestAttributes> void main(String[] args) throws SQLException, IOException, InterruptedException {
        String userMySQL = "root";
        String password = "secret";
        DBAccess dbAccess = new DBAccess("057_user_login", userMySQL, password);
        dbAccess.openConnection();

        UserDAO userDAO = new UserDAO(dbAccess);

//        ArrayList<User> users = userDAO.getAll();
//        for(User user: users){
//            System.out.println(user.toString());
//            String output;
//            if(user.checkRegexPassword()){
//                output = " correct";
//            }else{
//                output = " incorrect";
//            }
//            System.out.println("Password " + user.getPassword() + " is" + output);
//        }

        String url = "D:/Olga Git/Olga excersises/057. Login screen/LoginScreen/src/main/resources/Login/index.html";
        File htmlFile = new File(url);
        Desktop.getDesktop().browse(htmlFile.toURI());


    }
}