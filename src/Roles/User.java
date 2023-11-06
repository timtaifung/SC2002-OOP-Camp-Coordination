package Roles;
import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String email;
    private String userID;
    private String faculty;
    private String password;
    private String role;

    public User(String name,String email, String faculty, String role   ){
        this.name=name;
        this.email=email;
        String[] parts =this.email.split("@");
        this.userID=parts[0];
        this.faculty=faculty;
        this.password = "password";
        this.role=role;
    }

    public String getUserID(){
        return this.userID;
    }
    public String getEmail(){
        return this.email;
    }
    public String userID(){
        return this.userID;
    }
    public String getFaculty(){
        return this.faculty;
    }
    public String getPassword(){
        return this.password;
    }
    public String getRole(){return this.role;}

    public void setPassword(String x) {
    	this.password = x;
    	System.out.println("Password has been reset!");
    }
    //if 0 is a student, if 1 is a camp committee member
    public void setRole (String x) {
    	this.role = x;
    }
}
