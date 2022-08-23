package com.example.hallobbw;
import java.sql.*;

public class DBConnector {
    private Connection conn;
    static final String URL = "jdbc:mysql://localhost:3306/bbw";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "";

    public void connect() {
        this.conn = null;
        try {
            this.conn = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
            System.out.println("Verbindung zur Datenbank hergestellt.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e)  {
            System.out.println(e.getMessage());
        }
        finally {
            this.close();
        }
    }

    public void close()  {
        try {
            this.conn.close();
            System.out.println("Verbindung zur Datenbank beendet.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet receiveAnimalDataFromTable(int id) {
        try {
            Statement stmt = this.conn.createStatement();

            // TODO: Das ist eine Sicherheitslücke! https://xkcd.com/327/
            ResultSet rs = stmt.executeQuery("SELECT * FROM animals WHERE id = " + id + ";");

            return rs;
        }
        catch(SQLException ex) {
            System.out.println(ex.getMessage());
            this.close();
        }

        // TODO: hierhin sollten wir nicht kommen
        return null;
    }
}
