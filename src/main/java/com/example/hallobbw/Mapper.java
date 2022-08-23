package com.example.hallobbw;

public class Mapper {
    private DBConnector dbConnector;

    public Mapper() {
        this.dbConnector = new DBConnector();
        // TODO: ...
    }

    public Animal getAnimalById(int id) {
        // TODO: Mit dem DBConnector ein Tier mit der ID = id aus der Datenbank besorgen.
        return new Animal(1, "Kuh", "abcdefghij");
    }

}
