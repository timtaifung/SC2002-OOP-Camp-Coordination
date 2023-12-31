package Assets.Roles;

import java.io.Serializable;


public class User implements Serializable {
    private String name;
    private String email;
    private String userID;
    private String faculty;
    private String password;
    private String role;

    public User(String name, String email, String faculty, String role) {
        this.name = name;
        this.email = email;
        String[] parts = this.email.split("@");
        this.userID = parts[0];
        this.faculty = faculty;
        this.password = "password";
        this.role = role;
    }

    public String getUserID() {
        return this.userID;
    }

    public String getEmail() {
        return this.email;
    }

    public String userID() {
        return this.userID;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String r) {
        this.role = r;
    }
}
