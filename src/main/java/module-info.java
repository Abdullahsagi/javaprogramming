module com.example.javaprogramming {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaprogramming to javafx.fxml;
    exports com.example.javaprogramming;
}