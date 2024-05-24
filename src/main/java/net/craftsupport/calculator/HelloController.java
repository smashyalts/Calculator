package net.craftsupport.calculator;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField hypotenuse;
    @FXML
    private TextField adjacent;
    @FXML
    private TextField opposite;
    @FXML
    private Label Result;

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
private void onPageButtonClick2() throws IOException {
Stage stage = HelloApplication.getBackup();
    HelloApplication.PageNavigation.showPage(HelloApplication.class, "hello-view2.fxml", stage, 480, 420);
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
}