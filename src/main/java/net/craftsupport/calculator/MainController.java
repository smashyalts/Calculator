package net.craftsupport.calculator;

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
private TextField cosinuspage2;
@FXML
private TextField sinuspage2;
@FXML
private Label Resultpage2;

    @FXML
    protected void onCalculateButtonClick() {
        if (MainApp.getPage() == 1) {
            if (hypotenuse.getText().isEmpty() && !adjacent.getText().isEmpty() && !opposite.getText().isEmpty()) {
                calculateHypotenuse();
            } else if (!hypotenuse.getText().isEmpty() && adjacent.getText().isEmpty() && !opposite.getText().isEmpty()) {
                calculateAdjacent();
            } else if (!hypotenuse.getText().isEmpty() && !adjacent.getText().isEmpty() && opposite.getText().isEmpty()) {
                calculateOpposite();
            }
        } else if (MainApp.getPage() == 2) {
if (!hypotenusepage2.getText().isEmpty() && cosinuspage2.getText().isEmpty() && !sinuspage2.getText().isEmpty()) {
                calculateAdjacent();
            } else if (!hypotenusepage2.getText().isEmpty() && !cosinuspage2.getText().isEmpty() && sinuspage2.getText().isEmpty()) {
                calculateOpposite();
            }
        } else-if (MainApp.getPage() == 3) {
            calculateHypotenuse();
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
    private void onPagebuttonclick() throws IOException {
        if (MainApp.getPage() == 1) {
        MainApp.setPage(2);
        Stage stage = MainApp.getStage();
        stage.setTitle("Calculation of Cosinus and sinus");
        PageNavigation.showPage(MainApp.class, "hello-view2.fxml", stage, 480, 420);
    } else if (MainApp.getPage() == 2) {
            MainApp.setPage(3);
            Stage stage = MainApp.getStage();
            stage.setTitle("Calculation of Hypotenuse using the adjacent/opposite katete and cosinus/sinus");
            PageNavigation.showPage(MainApp.class, "hello-view3.fxml", stage, 480, 420);
        } else if (MainApp.getPage() == 3) {
            MainApp.setPage(1);
            Stage stage = MainApp.getStage();
            stage.setTitle("Pythagores Læresætning");
            PageNavigation.showPage(MainApp.class, "hello-view.fxml", stage, 480, 420);
        }

    }
// ToDo lav kateteberegning resultatside 2

    private void calculateOpposite() {
        if (MainApp.getPage() == 1) {
            double a = Double.parseDouble(adjacent.getText());
            double h = Double.parseDouble(hypotenuse.getText());
            double o = Math.sqrt(h * h - a * a);
            Result.setText("Opposite side is: " + o);
        } else if (MainApp.getPage() == 2) {
            double a = Double.parseDouble(sinuspage2.getText());
            double f = Math.sin(a)
            double h = Double.parseDouble(hypotenusepage2.getText());
            double o = h * f;
            Resultpage2.setText("Opposite katete is: " + o);
        }
    }
    private void calculateAdjacent() {
        if (MainApp.getPage() == 1) {
            double o = Double.parseDouble(opposite.getText());
            double h = Double.parseDouble(hypotenuse.getText());
            double a = Math.sqrt(h * h - o * o);
            Result.setText("Adjacent side is: " + a);
        } else if (MainApp.getPage() == 2){
            double o = Double.parseDouble(cosinuspage2.getText());
            double f = Math.cos(o)
            double h = Double.parseDouble(hypotenusepage2.getText());
            double a = h * f;
            Resultpage2.setText("Adjacent katete is: " + a);
        }
    }
    private void calculateHypotenuse() {
        if (MainApp.getPage() == 1) {
            double a = Double.parseDouble(adjacent.getText());
            double o = Double.parseDouble(opposite.getText());
            double h = Math.sqrt(a * a + o * o);
            Result.setText("Hypotenuse is: " + h);
        } else if (MainApp.getPage() == 3) {
            double a = Double.parseDouble(cosinuspage2.getText());
            double o = Double.parseDouble(sinuspage2.getText());
            double h;
            Resultpage2.setText("Hypotenuse is: " + "h");
        }
    }
}