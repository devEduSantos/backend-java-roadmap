package entities;

public class loginUser {
    private String username;
    private String password;

    public loginUser(){

    }
    public loginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
