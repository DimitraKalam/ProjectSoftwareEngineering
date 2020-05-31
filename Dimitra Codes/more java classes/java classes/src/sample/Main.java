//package sample;
//
////import javafx.application.Application;
////import javafx.fxml.FXMLLoader;
////import javafx.scene.Parent;
////import javafx.scene.Scene;
////import javafx.stage.Stage;
////
////public class Main extends Application {
////
////    @Override
////    public void start(Stage primaryStage) throws Exception{
////        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
////        primaryStage.setTitle("Hello World");
////        primaryStage.setScene(new Scene(root, 300, 275));
////        primaryStage.show();
////    }
////
////
////    public static void main(String[] args) {
////        launch(args);
////    }
////}
//
//
//
//// Java Program to create  color picker and add listener to it
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.collections.*;
//import javafx.stage.Stage;
//import javafx.scene.text.Text.*;
//import javafx.scene.paint.*;
//import javafx.scene.text.*;
//public class Main extends Application {
//    // labels
//    Label l;
//
//    // launch the application
//    public void start(Stage s)
//    {
//        // set title for the stage
//        s.setTitle("creating color picker");
//
//        // create a tile pane
//        TilePane r = new TilePane();
//
//        // create a label
//        l = new Label("This is a color picker example ");
//        Label l1 = new Label("no selected color ");
//
//        // create a color picker
//        ColorPicker cp = new ColorPicker();
//
//        // create a event handler
//        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent e)
//            {
//                // color
//                Color c = cp.getValue();
//
//                // set text of the label to RGB value of color
//                l1.setText("Red = " + c.getRed() + ", Green = " + c.getGreen()
//                        + ", Blue = " + c.getBlue());
//            }
//        };
//
//        // set listener
//        cp.setOnAction(event);
//
//        // add label
//        r.getChildren().add(l);
//        r.getChildren().add(cp);
//        r.getChildren().add(l1);
//
//        // create a scene
//        Scene sc = new Scene(r, 500, 200);
//
//        // set the scene
//        s.setScene(sc);
//
//        s.show();
//    }
//
//    public static void main(String args[])
//    {
//        // launch the application
//        launch(args);
//    }
//}
package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

    }

}