package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController extends Application {

    // Stage(Window) setup
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Driving Quiz");
        Parent mainRoot = FXMLLoader.load(getClass().getResource("/resources/main.fxml"));
        Scene mainScene = new Scene(mainRoot);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

}
