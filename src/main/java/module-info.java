module com.app.dinnertime {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.app.dinnertime to javafx.fxml;
    exports com.app.dinnertime;
    exports com.app.dinnertime.controllers;

}