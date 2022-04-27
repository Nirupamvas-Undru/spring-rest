package testdb;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
        String user = "hbstudent";
        String pass = "Nirupam@967"; // mod

        try {
            System.out.println("Connecting to database: " + jdbcUrl);

            Connection mycon = DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection Successfully");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
