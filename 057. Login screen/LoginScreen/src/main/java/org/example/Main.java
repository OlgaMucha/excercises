package org.example;


import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String user = "root";
        String password = "secret";
        //String url = "jdbc:mysql://localhost:3306/057_user_login?autoReconnect=True&useSSL=false";
        String url = "jdbc:mysql://localhost:3306/057_user_login?user=user&password=password&serverTimezone=UTC";

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStat = myConn.createStatement();
            String sql = "select * from 057_user_login.users";
            ResultSet rs = myStat.executeQuery(sql);

            while(rs.next()){
                System.out.print(rs.getString("login") + " ");
                System.out.print(rs.getString("password") + " ");
                System.out.print(rs.getString("email") + " ");
                System.out.print(rs.getString("role"));
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}