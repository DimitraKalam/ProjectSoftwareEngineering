package HRDepartment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import static HRDepartment.EvaluateRecruitmentController.randomLastmames;
import static HRDepartment.EvaluateRecruitmentController.randomNames;

public class ManageApplicationsController implements Initializable {

    private String name;


    @FXML
    private ListView<String> applicationList;

    @FXML
    private Button reviewApplicationButton;

    @FXML
    private TextArea reviewApplicationNotes;

    @FXML
    private TextField firstnameTextbox;

    @FXML
    private TextField lastnameTextbox;

    @FXML
    private ImageView approveApplication;

    @FXML
    private ImageView declineApplication;

    @FXML
    private ImageView applicationInfo;

    @FXML
    void reviewApplicationAction(ActionEvent event) {
        name = applicationList.getSelectionModel().getSelectedItem();
        int i = name.indexOf(' ');
        firstnameTextbox.setText(name.substring(0, i));
        lastnameTextbox.setText(name.substring(i));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        Random rand;

        for(int i=0; i<8; i++){
            rand = new Random();
            int rand_int1 = rand.nextInt(8);
            int rand_int2 = rand.nextInt(8);
            name = randomNames[rand_int1] + " " + randomLastmames[rand_int2];
            applicationList.getItems().add(name);
        }

        reviewApplicationNotes.setText("Some Dummy Notes...");
    }
}
