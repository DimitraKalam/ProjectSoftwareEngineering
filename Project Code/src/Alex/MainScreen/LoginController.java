package Alex.MainScreen;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoginController {

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton exitButton;

    @FXML
    private Label logInFail;

    @FXML
    void exit(ActionEvent event) {

    }

    @FXML
    void logInAction(ActionEvent event) {

    }

}
