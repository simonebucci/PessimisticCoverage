module it.simonebucci.pessimisticcoverage {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.simonebucci.pessimisticcoverage to javafx.fxml;
    exports it.simonebucci.pessimisticcoverage;
}