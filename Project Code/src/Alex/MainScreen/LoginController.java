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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

    private Employee user;

    private Profile profile;
    @FXML
    void exit(ActionEvent event) {

    }



    @FXML
    void loginAction(ActionEvent event) throws IOException {
        String dep = comboBox.getValue();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Sidebar.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Employee user= employeeCreator();
        Profile profile=createProfile(user);
        user.setDepartment(Employee.department.valueOf(dep));
        if ((user.getDepartment() != Employee.department.none)) {
            profile.setPosition(user.getDepartment().name() + " Employee");
        } else {
            profile.setPosition("Insert your position here");
        }
        SidebarController sidebarController = fxmlLoader.getController();
        SidebarController.initData(user,profile);

        Stage stage = new Stage();
        stage.setTitle("ComCop");
        stage.setScene(new Scene(root1, 850,600));
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
    public static Employee employeeCreator(){
        //Logistics Employee initialization
        Employee logistics =new Employee("Alex Jones", null);

        return logistics;
    }
    public Profile createProfile(Employee logistics){
        Profile logisticsProfile= new Profile();
        logisticsProfile.setUser(logistics);
        // LocalDate date= LocalDate.parse("Mon Feb 05 2017");
        //logisticsProfile.setDate(date);
        logisticsProfile.setSalary(2000);
        //logisticsProfile.setPosition( logistics.getDepartment().name() + " Intern");
        Image image = null;
        try {
            image = new Image(new FileInputStream("Project Code\\src\\Alex\\ProfileScreen\\image2.jpg"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        logisticsProfile.setPhoto(image);
        return logisticsProfile;
    }
}
