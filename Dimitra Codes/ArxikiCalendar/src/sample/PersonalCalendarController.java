package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class PersonalCalendarController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    void NotifButton(ActionEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Demo.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();

            //stage.setTitle("");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Label text20;

    @FXML
    void edit20(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text20.setText(td.getEditor().getText());

    }

    @FXML
    void delete20(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text20.setText(td.getEditor().getText());
    }

    @FXML
    private Label text201;

    @FXML
    void changeAppearance(ActionEvent event) {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ChangeApp.fxml"));
//            Parent root1 = (Parent) fxmlLoader.load();
//            Stage stage = new Stage();
//
//            //stage.setTitle("");
//            stage.setScene(new Scene(root1));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Color selectedColor = colorPicker.getValue();
        calendarView.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY)));
    }
    @FXML
    private ColorPicker colorPicker;

    @FXML
    private GridPane calendarView;
}
