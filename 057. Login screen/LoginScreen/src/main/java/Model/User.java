package Model;

import Model.Role;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String userName;
    private String password;
    private String email;
    private Role role;

    public User() {
    }

    public User(String userName, String password, Role role, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    //At least 8 characters, min 1 Uppercase 1 Lowercase 1 Number 1 special character

    public boolean checkRegexPassword(){
        String pattern = "(?=[A-Za-z0-9@#$%^&+!=]+$)^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+!=])(?=.{8,}).*$";
        return Pattern.matches(pattern,this.password);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
