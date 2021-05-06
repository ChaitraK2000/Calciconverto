package demopack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.TabPane;

import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("mathSupport.fxml"));
        TabPane tabPane=loader.load();
        Scene scene=new Scene(tabPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CalciConverto");
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
