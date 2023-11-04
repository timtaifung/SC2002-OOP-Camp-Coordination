package Roles;

public class User {
    private String name;
    private String email;
    private String userID;
    private String faculty;
    private String password;

    public User(String name,String email, String faculty){
        this.name=name;
        this.email=email;
        String[] parts =this.email.split("@");
        this.userID=parts[0];
        this.faculty=faculty;
        this.password = "password";
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
}
