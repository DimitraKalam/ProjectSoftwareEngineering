package Omiros.HRDepartment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.application.HostServices;
import java.io.File;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EvaluateRecruitmentController {

    private String application;
    String[] randomNames = new String[]{ "Geroge", "John", "Hover", "Jim", "Alex", "Juliet", "Clara", "Klarmani" };
    String[] randomLastmames = new String[]{ "Brown", "White", "Black", "Green", "Purple", "Drum", "Youvol", "Zalin" };

    @FXML
    private TextField searchApplicationTextBox;

    @FXML
    private Button searchApplicationButton;

    @FXML
    private ListView<String> applicationList;

    @FXML
    private Button evaluateApplicationButton;

    @FXML
    private Button reviewApplicationButton;

    @FXML
    private Button deleteApplicationButton;

    @FXML
    private TextField firstnameTextbox;

    @FXML
    private TextField lastnameTextbox;

    @FXML
    private TextArea notesTextArea;

    @FXML
    private Button commitNotesButton;

    @FXML
    void commitNotesActions(ActionEvent event) {

    }

    @FXML
    void deleteApplicationAction(ActionEvent event) {
        applicationList.getItems().clear();
    }

    @FXML
    void evaluateApplicationAction(ActionEvent event) {
    }

    @FXML
    void reviewApplicationAction(ActionEvent event) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(8);
        int rand_int2 = rand.nextInt(8);

        firstnameTextbox.setText(randomNames[rand_int1]);
        lastnameTextbox.setText(randomLastmames[rand_int2]);


    }


    @FXML
    void searchApplicationAction(ActionEvent event) {
        applicationList.getItems().add(searchApplicationTextBox.getText());
        //...Search Application...//
    }
}
