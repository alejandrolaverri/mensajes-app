package com.alejandromo.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageDAO {

    public static void createMessageDB(Message message) {
        Conexion dbConnect = new Conexion();
        try(Connection connection = dbConnect.getConnection()) {
            PreparedStatement ps;
            try {
                String query = "INSERT INTO mensajes_app.mensajes(mensaje, autor_mensaje) VALUES (?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getAuthorMessage());
                ps.executeUpdate();
                System.out.println("Mensaje creado.");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void listMessagesDB() {

    }

    public static void deleteMessageDB(int idMessage) {

    }

    public static void updateMessageDB(Message message) {

    }
}
