package Alex.MainScreen;

import Alex.ProfileFeatures.Employee;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import Alex.ProfileFeatures.Employee.department.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController implements Initializable {

    private String hrConnect = "HR";
    private String csConnect = "CR";
    private String logisticsConnect = "LG";
    private String itConnect = "IT";
    private String chooseDepartment;


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
    private ComboBox<String> comboBox;


    @FXML
    void exit(ActionEvent event) {

    }

    @FXML
    void loginAction(ActionEvent event) throws IOException {
        String dep = comboBox.getValue();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainScreen.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        MainScreenController mainScreenController = fxmlLoader.getController();
        MainScreenController.initEmployee(new Employee(username.getText(), Employee.department.valueOf(dep)));

        Stage stage = new Stage();
        stage.setTitle("Recruiter");
        stage.setScene(new Scene(root1));
        stage.show();
        Stage logInWindow = (Stage) login.getScene().getWindow();
        logInWindow.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBox.getItems().add("none");
        comboBox.getItems().add("HR");
        comboBox.getItems().add("Logistics");
        comboBox.getItems().add("TechnicalSupport");
        comboBox.getItems().add("CostumerSupport");
        comboBox.setValue("none");
    }
}
