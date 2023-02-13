package com.alejandromo;

import java.sql.Connection;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args ) {
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.getConnection()) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
