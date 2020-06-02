package Dimitra.Calendar;


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
    private Label text201;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private GridPane calendarView;


    @FXML
    void changeAppearance(ActionEvent event) {


        Color selectedColor = colorPicker.getValue();
        calendarView.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY)));
    }

    @FXML
    private Label textfeb25;

    @FXML
    private Label textfeb26;

    @FXML
    private Label textfeb27;

    @FXML
    private Label textfeb28;

    @FXML
    private Label text1;

    @FXML
    private Label text2;

    @FXML
    private Label text3;

    @FXML
    private Label text4;
    @FXML
    private Label text5;
    @FXML
    private Label text6;
    @FXML
    private Label text7;
    @FXML
    private Label text8;
    @FXML
    private Label text9;
    @FXML
    private Label text10;
    @FXML
    private Label text11;

    @FXML
    private Label text12;

    @FXML
    private Label text13;

    @FXML
    private Label text14;

    @FXML
    private Label text15;

    @FXML
    private Label text16;

    @FXML
    private Label text17;

    @FXML
    private Label text18;

    @FXML
    private Label text19;

    @FXML
    private Label text20;

    @FXML
    private Label text21;

    @FXML
    private Label text22;

    @FXML
    private Label text23;

    @FXML
    private Label text24;

    @FXML
    private Label text25;

    @FXML
    private Label text26;

    @FXML
    private Label text27;

    @FXML
    private Label text28;

    @FXML
    private Label text29;

    @FXML
    private Label text30;

    @FXML
    private Label text31;

    @FXML
    void deletefeb25(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        textfeb25.setText(td.getEditor().getText());
    }

    @FXML
    void editfeb25(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        textfeb25.setText(td.getEditor().getText());
    }

    @FXML
    void deletefeb26(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        textfeb26.setText(td.getEditor().getText());
    }

    @FXML
    void editfeb26(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        textfeb26.setText(td.getEditor().getText());
    }

    @FXML
    void deletefeb27(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        textfeb27.setText(td.getEditor().getText());
    }

    @FXML
    void editfeb27(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        textfeb27.setText(td.getEditor().getText());
    }

    @FXML
    void deletefeb28(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        textfeb28.setText(td.getEditor().getText());
    }

    @FXML
    void editfeb28(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        textfeb28.setText(td.getEditor().getText());
    }

    @FXML
    void delete1(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text1.setText(td.getEditor().getText());
    }

    @FXML
    void edit1(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text1.setText(td.getEditor().getText());
    }

    @FXML
    void delete2(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text2.setText(td.getEditor().getText());
    }

    @FXML
    void edit2(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text2.setText(td.getEditor().getText());
    }

    @FXML
    void delete3(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text3.setText(td.getEditor().getText());
    }

    @FXML
    void edit3(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text3.setText(td.getEditor().getText());
    }

    @FXML
    void edit4(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text4.setText(td.getEditor().getText());
    }

    @FXML
    void delete4(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text4.setText(td.getEditor().getText());
    }

    @FXML
    void edit5(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text5.setText(td.getEditor().getText());
    }

    @FXML
    void delete5(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text5.setText(td.getEditor().getText());
    }

    @FXML
    void edit6(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text6.setText(td.getEditor().getText());
    }

    @FXML
    void delete6(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text6.setText(td.getEditor().getText());
    }

    @FXML
    void edit7(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text7.setText(td.getEditor().getText());
    }

    @FXML
    void delete7(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text7.setText(td.getEditor().getText());
    }

    @FXML
    void edit8(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text8.setText(td.getEditor().getText());
    }

    @FXML
    void delete8(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text8.setText(td.getEditor().getText());
    }

    @FXML
    void edit9(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text9.setText(td.getEditor().getText());
    }

    @FXML
    void delete9(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text9.setText(td.getEditor().getText());
    }

    @FXML
    void edit10(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text10.setText(td.getEditor().getText());
    }

    @FXML
    void delete10(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text10.setText(td.getEditor().getText());
    }
    @FXML
    void edit11(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text11.setText(td.getEditor().getText());
    }

    @FXML
    void delete11(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text11.setText(td.getEditor().getText());
    }

    @FXML
    void edit12(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text12.setText(td.getEditor().getText());
    }

    @FXML
    void delete12(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text12.setText(td.getEditor().getText());
    }

    @FXML
    void edit13(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text13.setText(td.getEditor().getText());
    }

    @FXML
    void delete13(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text13.setText(td.getEditor().getText());
    }

    @FXML
    void edit14(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text14.setText(td.getEditor().getText());
    }

    @FXML
    void delete14(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text14.setText(td.getEditor().getText());
    }

    @FXML
    void edit15(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text15.setText(td.getEditor().getText());
    }

    @FXML
    void delete15(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text15.setText(td.getEditor().getText());
    }

    @FXML
    void edit16(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text16.setText(td.getEditor().getText());
    }

    @FXML
    void delete16(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text16.setText(td.getEditor().getText());
    }

    @FXML
    void edit17(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text17.setText(td.getEditor().getText());
    }

    @FXML
    void delete17(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text17.setText(td.getEditor().getText());
    }

    @FXML
    void edit18(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text18.setText(td.getEditor().getText());
    }

    @FXML
    void delete18(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text18.setText(td.getEditor().getText());
    }

    @FXML
    void edit19(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text19.setText(td.getEditor().getText());
    }

    @FXML
    void delete19(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text19.setText(td.getEditor().getText());
    }

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
    void edit21(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text21.setText(td.getEditor().getText());

    }

    @FXML
    void delete21(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text21.setText(td.getEditor().getText());
    }

    @FXML
    void edit22(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text22.setText(td.getEditor().getText());

    }

    @FXML
    void delete22(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text22.setText(td.getEditor().getText());
    }

    @FXML
    void edit23(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text23.setText(td.getEditor().getText());

    }

    @FXML
    void delete23(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text23.setText(td.getEditor().getText());
    }

    @FXML
    void edit24(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text24.setText(td.getEditor().getText());

    }

    @FXML
    void delete24(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text24.setText(td.getEditor().getText());
    }

    @FXML
    void edit25(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text25.setText(td.getEditor().getText());

    }

    @FXML
    void delete25(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text25.setText(td.getEditor().getText());
    }

    @FXML
    void edit26(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text26.setText(td.getEditor().getText());

    }

    @FXML
    void delete26(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text26.setText(td.getEditor().getText());
    }

    @FXML
    void edit27(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text27.setText(td.getEditor().getText());

    }

    @FXML
    void delete27(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text27.setText(td.getEditor().getText());
    }

    @FXML
    void edit28(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text28.setText(td.getEditor().getText());

    }

    @FXML
    void delete28(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text28.setText(td.getEditor().getText());
    }

    @FXML
    void edit29(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text29.setText(td.getEditor().getText());

    }

    @FXML
    void delete29(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text29.setText(td.getEditor().getText());
    }

    @FXML
    void edit30(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text30.setText(td.getEditor().getText());

    }

    @FXML
    void delete30(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text30.setText(td.getEditor().getText());
    }

    @FXML
    void edit31(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.showAndWait();
        text31.setText(td.getEditor().getText());

    }

    @FXML
    void delete31(ActionEvent event) {
        TextInputDialog td = new TextInputDialog();
        td.setContentText("");
        text31.setText(td.getEditor().getText());
    }


}