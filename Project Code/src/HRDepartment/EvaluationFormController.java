package HRDepartment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Random;

import static HRDepartment.Notes.notesRandom;
import static HRDepartment.Notes.randomNotesArray;

public class EvaluationFormController {


    private String name;

    public void initData(String name) {
        this.name=name;
    }

    @FXML
    private TextArea notesTextBox;

    @FXML
    private Button reviewNotesButton;

    @FXML
    private TextField gradeTextBox;

    @FXML
    private TextField commnetsTextBox;

    @FXML
    private TextField tipTextBox;

    @FXML
    private Button submitButton;

    @FXML
    void reviewNotesAction(ActionEvent event) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(4);

        notesTextBox.setText(randomNotesArray[rand_int1].getText());
    }

    @FXML
    void submiteAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Form Submitted: \nGrade: " + gradeTextBox.getText() + ".");
        alert.showAndWait();
    }

}






