package com.example.hallobbw;
import java.sql.*;

public class DBConnector {
    Connection conn;
    public void connect() {
        _connect();
    }

    private void _connect() {
        this.conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:animals.db";
            // create a connection to the database
            this.conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (this.conn != null) {
                    this.conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public String receiveDataFromTable(String tableName, int id) {
        // TODO
        return "secretAnimal;^__^\n(oo)\\_______\n(__)\\       )\\/\\\n    ||----w |\n    ||     ||";
    }
}
