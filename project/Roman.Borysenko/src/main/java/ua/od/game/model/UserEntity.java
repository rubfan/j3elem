package ua.od.game.model;

public class UserEntity {

    private String name;
    private String password;
    private String token;

    public String getName() {

        return name;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void setToken(String token) {

        this.token = token;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPassword() {

        return password;
    }

    public String getToken() {

        return token;
    }
}
