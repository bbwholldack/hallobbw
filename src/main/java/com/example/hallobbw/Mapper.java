package com.example.hallobbw;

public class Mapper {
    private DBConnector dbConnector;

    public Mapper() {
        this.dbConnector = new DBConnector();
        this.dbConnector.connect();
    }

    public Animal getAnimalById(int id) {
        DBConnector dbConnector = new DBConnector();
        dbConnector.connect();

        String result = this.dbConnector.receiveDataFromTable("animals", id);
        String animalData[]  = result.split(";", 6);
        return new Animal(id, animalData[0], animalData[1]);
    }

}
