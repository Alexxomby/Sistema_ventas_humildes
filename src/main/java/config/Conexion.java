package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
        Connection con;
    /**
     * Valores para la Base de datos
     * Si lo van a correr en su compu
     * cambien estos valores
     */

        String url  = "jdbc:mysql://localhost:3306/bd_ventas";
        String user = "root";
        String password = "Batiz2023";
        public Connection Conexion() {


            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

            } catch (Exception sql) {


            }return con;
        }

}
