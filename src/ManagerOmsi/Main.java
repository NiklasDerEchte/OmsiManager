package ManagerOmsi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("frame.fxml"));
        primaryStage.setTitle("Omsi Manager");
        primaryStage.setScene(new Scene(root, 1000, 750));
        primaryStage.show();
        Connection conn = Verbindung.getConnection();
        if(conn == null) {
            throw new NullPointerException();
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
