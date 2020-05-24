package MainScreen;

import ProfileFeatures.Employee;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;

public class MainScreenController {

    @FXML
    private Button AnnouncementsButton;

    @FXML
    private Button CalendarButton;

    @FXML
    private Button ToDoListButton;

    @FXML
    private Button ChatButton;
    private Employee username;


    @FXML
    void goToScreen(ActionEvent event) {

    }

    public void initData(Employee x) {
        this.username=x;
    }
}
