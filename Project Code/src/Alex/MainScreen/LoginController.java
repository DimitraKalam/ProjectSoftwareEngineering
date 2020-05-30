package Alex.MainScreen;

import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
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
import javafx.scene.image.Image;
import javafx.stage.Stage;

import Alex.ProfileFeatures.Employee.department.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

    public Profile createProfile (Employee employee){
        Profile randomProfile = new Profile();
        randomProfile.setUser(employee);
        // LocalDate date= LocalDate.parse("Mon Feb 05 2017");
        //logisticsProfile.setDate(date);
        randomProfile.setSalary(2000);
        randomProfile.setPosition(employee.getDepartment().toString());
        Image image = null;
        try {
            image = new Image(new FileInputStream("Project Code/src/Alex/ProfileScreen/image2.jpg"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        randomProfile.setPhoto(image);
        return randomProfile;
    }



    @FXML
    void loginAction(ActionEvent event) throws IOException {
        String dep = comboBox.getValue();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Sidebar.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Employee emp = new Employee(username.getText(), Employee.department.valueOf(dep));

        SidebarController sidebarController = fxmlLoader.getController();
        SidebarController.initEmployee(emp);

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
