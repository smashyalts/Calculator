package net.craftsupport.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    static Stage stage;
    static int page = 1;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 420);
        stage.setTitle("Pythagores Læresætning");
        stage.setScene(scene);
        stage.show();
        MainApp.stage = stage;
    }
    public static Stage getStage() {
        return stage;
    }
    public static int getPage() {
        return page;
    }
    public static int setPage(int page) {
        return MainApp.page = page;
    }



    public static void main(String[] args) {
        launch();
    }
}