package net.craftsupport.calculator;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    static Stage backup;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 420);
        stage.setTitle("Pythagores Læresætning");
        stage.setScene(scene);
        stage.show();
        backup = stage;
    }

    public static Stage getBackup() {
        return backup;
    }



    public static void main(String[] args) {
        launch();
    }
}