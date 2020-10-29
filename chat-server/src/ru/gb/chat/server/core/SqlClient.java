package ru.gb.chat.server.core;

import java.sql.*;

public class SqlClient {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    synchronized static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:chat-server/chat.db");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized static void registration (String nickname, String login, String password)  {
        //почему просит добавить Exception?
        preparedStatement = connection.prepareStatement("insert into users (login, password, nickname) values (?, ?, ?);");
        try  {
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, nickname);
            preparedStatement.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    synchronized static String changeNickname (String login, String password, String newNickname) {
        String query = String.format("select nickname from users where login='%s' and password='%s'", login, password);
        String query1 = String.format("update users set nickname = '%s' where login='%s' and password='%s'", newNickname, login, password);

        try (ResultSet set = statement.executeQuery(query)) {
            if (set.next())
                preparedStatement = connection.prepareStatement(query1);
                preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    synchronized static String getNickname(String login, String password) {
        String query = String.format("select nickname from users where login='%s' and password='%s'", login, password);
        try (ResultSet set = statement.executeQuery(query)) {
            if (set.next())
                return set.getString(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


}
