package Dimitris.ToDoListFeatures;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainTo extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("ToDoListDeleteScreen.fxml"));
        primaryStage.setTitle("CompositionScreen");
        primaryStage.setScene(new Scene(root, 850, 600));
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
