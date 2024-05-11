module org.example.projectpart1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;
     requires annotations;

//    requires com.almasb.fxgl.all;

    opens org.example.projectpart1 to javafx.fxml;
    exports org.example.projectpart1;
    exports projectpart1;
    opens projectpart1 to javafx.fxml;
}