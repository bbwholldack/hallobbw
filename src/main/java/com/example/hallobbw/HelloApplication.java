package com.example.hallobbw;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Hier ist unsere GUI beschrieben:
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        // Jetzt ist alles eingerichtet.

        // Letzter Schritt: Sage dem Computer, dass wir die grafische Oberfläche sehen wollen.
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}