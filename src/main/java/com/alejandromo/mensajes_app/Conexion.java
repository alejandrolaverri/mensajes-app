package com.alejandromo.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "Huguito1@");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}
