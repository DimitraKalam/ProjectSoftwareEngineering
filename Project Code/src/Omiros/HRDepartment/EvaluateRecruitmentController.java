package Omiros.HRDepartment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.application.HostServices;
import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class EvaluateRecruitmentController implements Initializable {

    private String application;
    private String name;

    static String[] randomNames = new String[]{ "Geroge", "John", "Hover", "Jim", "Alex", "Juliet", "Clara", "Klarmani" };
    static String[] randomLastmames = new String[]{ "Brown", "White", "Black", "Green", "Purple", "Drum", "Youvol", "Zalin" };

    @FXML
    private TextField searchApplicationTextBox;

    @FXML
    private ComboBox<String> searchApplicationComboBox;

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
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Notes Commited.");
        alert.showAndWait();
    }

    @FXML
    void deleteApplicationAction(ActionEvent event) {
        applicationList.getItems().clear();
    }
    @FXML
    void evaluateApplicationAction(ActionEvent event) {
        name = String.valueOf(applicationList.getSelectionModel().getSelectedItems());
        int i = name.indexOf(':');
        name = name.substring(1,i);
        i = name.indexOf(' ');
        firstnameTextbox.setText(name.substring(0, i));
        lastnameTextbox.setText(name.substring(i));

    }


    @FXML
    void reviewApplicationAction(ActionEvent event) {
        applicationList.getItems().add(searchApplicationComboBox.getSelectionModel().getSelectedItem() + ": Dummy Position");

    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Random rand;
        for(int i=0; i<8; i++){
            rand = new Random();
            int rand_int1 = rand.nextInt(8);
            int rand_int2 = rand.nextInt(8);
            name = randomNames[rand_int1] + " " + randomLastmames[rand_int2];
            searchApplicationComboBox.getItems().add(name);
        }
        searchApplicationComboBox.getSelectionModel().selectFirst();
    }
}
