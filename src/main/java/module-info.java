module espol {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens espol to javafx.fxml;
    exports espol;
}
