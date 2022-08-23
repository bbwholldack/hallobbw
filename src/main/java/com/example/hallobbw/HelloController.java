package com.example.hallobbw;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onWorldButtonClick() {
        welcomeText.setText("");
    }

    @FXML
    protected void onGetAnimalButtonClick() {
        Mapper mapper = new Mapper();

        // Fange ein Tier
        int myAnimalId = 1; // TODO: diese ID möchten wir später in der GUI eingeben können
        Animal myAnimal = mapper.getAnimalById(myAnimalId);

        // Schreibe das Ascii-Bild in die GUI
        welcomeText.setStyle("-fx-font-family: 'monospaced'");
        welcomeText.setText(myAnimal.getAsciiPic());
    }
}