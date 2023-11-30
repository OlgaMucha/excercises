package Model;

import Model.Role;

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
