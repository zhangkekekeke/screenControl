module com.example.screencontrol {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires org.bytedeco.javacv;
    requires org.bytedeco.ffmpeg;


    opens com.example.screencontrol to javafx.fxml;
    exports com.example.screencontrol;
}