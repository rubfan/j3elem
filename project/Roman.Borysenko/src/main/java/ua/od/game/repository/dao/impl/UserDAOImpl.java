package ua.od.game.repository.dao.impl;

import ua.od.game.model.UserEntity;
import ua.od.game.repository.dao.UserDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.UUID;

public class UserDAOImpl implements UserDAO {

        public String createNewUser(UserEntity user) {

        Connection con;
        String name;
        PreparedStatement stmt = null;
        int countUser = 0;
        String token = null;
        ResultSet rs = null;

        con = getConnection();
        if (con != null) {
            try {
                name = user.getName();
                stmt = con.prepareStatement("SELECT Count(*) FROM USER WHERE NAME = ?");
                stmt.setString(1, name);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    countUser = rs.getInt(1);
                }
                if (countUser == 0) {
                    token = insertNewRecord(con, stmt, user);
                } else {
                    throw new Error("This user already exists!!!!");
                }
            } catch (SQLException e) {
                System.out.println(e);
            } finally {
                closeConnection(stmt, con);
            }
        }

        return token;
    }

    public String loginUser(UserEntity user) {

        Connection con;
        PreparedStatement stmt = null;
        String name;
        String password;
        int countUser = 0;
        String token = null;
        ResultSet rs = null;

        con = getConnection();
        if (con != null) {
            try {
                name = user.getName();
                password = user.getPassword();
                stmt = con.prepareStatement("SELECT Count(*) FROM USER WHERE NAME = ? and PASSWORD = ?");
                stmt.setString(1, name);
                stmt.setString(2, password);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    countUser = rs.getInt(1);
                }
                if (countUser == 1) {
                    token = changeToken(con,stmt,"change", name);
                } else {
                    throw new Error("Wrong username or password!!!!");
                }
            } catch (SQLException e) {
                System.out.println(e);
            } finally {
                closeConnection(stmt, con);
            }
        }

        return token;
    }

    public void logoutUser(String token) {

        Connection con;
        PreparedStatement stmt = null;
        String name = null;
        int countUser = 0;
        ResultSet rs = null;

        con = getConnection();
        if (con != null) {
            try {
                stmt = con.prepareStatement("SELECT name FROM USER WHERE TOKEN = ?");
                stmt.setString(1, token);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    name = rs.getString(1);
                }
                if(name == null) {
                    throw new Error("Wrong token!!!!!");
                }
                changeToken(con,stmt,"del", name);
            } catch (SQLException e) {
                System.out.println(e);
            } finally {
                closeConnection(stmt, con);
            }
        }
    }

    public UserEntity getUser(String token) {

        UserEntity user = new UserEntity();
        Connection con;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String name = null;
        int count = 0;

        con = getConnection();
        if (con != null) {
            try {
                stmt = con.prepareStatement("SELECT name, password, token FROM USER WHERE TOKEN = ?");
                stmt.setString(1, token);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    user.setName(rs.getString(1));
                    user.setPassword(rs.getString(2));
                    user.setToken(rs.getString(3));
                    count ++;
                }
                if(count == 0) {
                    throw new Error("Wrong token!!!!!");
                }
                changeToken(con,stmt,"del", name);
            } catch (SQLException e) {
                System.out.println(e);
            } finally {
                closeConnection(stmt, con);
            }
        }

        return user;
    }

    private Connection getConnection() {

        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/game";
        String user = "kuper";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        return con;
    }

    private void closeConnection(PreparedStatement stmt, Connection con) {

        try {
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    private String insertNewRecord(Connection con, PreparedStatement stmt, UserEntity user) {

        String token = setToken();
        try {
            stmt = con.prepareStatement("INSERT INTO USER(NAME,PASSWORD,TOKEN) VALUES(?,?,?)");
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, token);
            stmt.execute();
            stmt = con.prepareStatement("INSERT INTO ACCOUNT(USER_ID) VALUES((SELECT ID FROM USER WHERE NAME = ?))");
            stmt.setString(1, user.getName());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }

        return token;
    }

    private String changeToken(Connection con, PreparedStatement stmt, String operation, String name) {

        String value = "";

        if(operation.equals("change")) {
            value = setToken();
        }
        try {
            stmt = con.prepareStatement("UPDATE USER SET token = ? where name = ?");
            stmt.setString(1, value);
            stmt.setString(2, name);
            stmt.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }

        return value;
    }

    private String setToken() {

        String value;
        UUID id = UUID.randomUUID();
        value = String.valueOf(id);

        return value;
    }

}


