package ua.od.game.repository.dao;

import ua.od.game.model.UserEntity;

import java.sql.SQLException;

public interface UserDAO {

    String createNewUser(UserEntity user);
    String loginUser(UserEntity user);
    void logoutUser(String token);
    UserEntity getUser(String token);
}


class Error extends Exception {

    public Error(String s) {

        super(s);
    }
}