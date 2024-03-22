module com.joeun {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.joeun to javafx.fxml;
    exports com.joeun;
}
