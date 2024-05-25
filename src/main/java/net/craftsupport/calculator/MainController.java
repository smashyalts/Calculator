package net.craftsupport.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private TextField hypotenuse;
    @FXML
    private TextField adjacent;
    @FXML
    private TextField opposite;
    @FXML
    private Label Result;
@FXML
private TextField hypotenusepage2;
@FXML
private TextField adjacentpage2;
@FXML
private TextField oppositepage2;
@FXML
private Label Resultpage2;
    @FXML
    protected void onPageButtonClick() throws IOException {
        Stage stage = MainApp.getBackup();
        PageNavigation.showPage(MainApp.class, "hello-view.fxml", stage, 480, 420);
    }
    @FXML
    protected void onCalculateButtonClick() {
        if (hypotenuse.getText().isEmpty() && !adjacent.getText().isEmpty() && !opposite.getText().isEmpty()) {
            calculateHypotenuse();
        } else if (!hypotenuse.getText().isEmpty() && adjacent.getText().isEmpty() && !opposite.getText().isEmpty()) {
            calculateAdjacent();
        } else if (!hypotenuse.getText().isEmpty() && !adjacent.getText().isEmpty() && opposite.getText().isEmpty()) {
            calculateOpposite();
        }
    }
    @FXML
    protected void onCalculateButtonClick2() {
        if (hypotenusepage2.getText().isEmpty() && !adjacentpage2.getText().isEmpty() && !oppositepage2.getText().isEmpty()) {
            calculateHypotenusepage2();
        } else if (!hypotenusepage2.getText().isEmpty() && adjacentpage2.getText().isEmpty() && !oppositepage2.getText().isEmpty()) {
            calculateAdjacentpage2();
        } else if (!hypotenusepage2.getText().isEmpty() && !adjacentpage2.getText().isEmpty() && oppositepage2.getText().isEmpty()) {
            calculateOppositepage2();
        }
    }


    public class PageNavigation {
        public static void showPage(Class<?> appClass, String fxmlPath, Stage stage, double width, double height) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(appClass.getResource(fxmlPath));
            Scene scene = new Scene(fxmlLoader.load(), width, height);
            stage.setScene(scene);
            stage.show();
        }
    }
    @FXML
    private void onPage1buttonclick() throws IOException {
        Stage stage = MainApp.getBackup();
        PageNavigation.showPage(MainApp.class, "hello-view.fxml", stage, 480, 420);
    }
@FXML
private void onPageButtonClick2() throws IOException {
Stage stage = MainApp.getBackup();
    PageNavigation.showPage(MainApp.class, "hello-view2.fxml", stage, 480, 420);
}
    private void calculateOpposite() {
        double a = Double.parseDouble(adjacent.getText());
        double h = Double.parseDouble(hypotenuse.getText());
        double o = Math.sqrt(h * h - a * a);
        Result.setText("Opposite side is: " + o);
    }
    private void calculateAdjacent() {
        double o = Double.parseDouble(opposite.getText());
        double h = Double.parseDouble(hypotenuse.getText());
        double a = Math.sqrt(h * h - o * o);
        Result.setText("Adjacent side is: " + a);
    }
    private void calculateHypotenuse() {
        double a = Double.parseDouble(adjacent.getText());
        double o = Double.parseDouble(opposite.getText());
        double h = Math.sqrt(a * a + o * o);
        Result.setText("Hypotenuse is: " + h);
    }
    private void calculateOppositepage2() {
        double a = Double.parseDouble(adjacentpage2.getText());
        double h = Double.parseDouble(hypotenusepage2.getText());
        double o;
        Result.setText("Opposite katete is: " + "o");
    }
    private void calculateAdjacentpage2() {
        double o = Double.parseDouble(oppositepage2.getText());
        double h = Double.parseDouble(hypotenusepage2.getText());
        double a;
        Result.setText("Adjacent katete is: " + "a");
    }
    private void calculateHypotenusepage2() {
        double a = Double.parseDouble(adjacentpage2.getText());
        double o = Double.parseDouble(oppositepage2.getText());
        double h;
        Result.setText("Hypotenuse is: " + "h");
    }
}