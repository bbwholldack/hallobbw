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
        Animal myAnimal = mapper.getAnimalById(1); // TODO: get ID from GUI input
        String asciiPic = myAnimal.getAsciiPic();
        welcomeText.setText(asciiPic);}
}