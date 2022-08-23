package com.example.hallobbw;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Mapper {
    private DBConnector dbConnector;

    public Mapper() {
        this.dbConnector = new DBConnector();
        this.dbConnector.connect();
    }

    public Animal getAnimalById(int id) {
        ResultSet result = this.dbConnector.receiveAnimalDataFromTable(id);

        try {
            result.next();
            String name = result.getString("name");
            String picture = result.getString("picture");
            return new Animal(1, name, picture);
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }

        // TODO: hierhin sollten wir nie kommen
        return null;
    }

}
