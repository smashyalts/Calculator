module net.craftsupport.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens net.craftsupport.calculator to javafx.fxml;
    exports net.craftsupport.calculator;
}