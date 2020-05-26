package Alex.MainScreen;

import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import Alex.ProfileScreen.ProfileScreenController;
import com.gluonhq.charm.glisten.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SidebarController {
    @FXML
    private  BorderPane borderPanee;
    @FXML
    private TextField SearchBar;

    @FXML
    private Button BeginSearchButton;

    @FXML
    private Button MainPageButton;

    @FXML
    private Button RepositoryButton;

    @FXML
    private Button MyProfileButton;

    @FXML
    private Button DepartmentButton;

    private  static Employee username;
    private static Profile profile;

    public static void initEmployee(Employee x) {
        username=x;
    }

    public static void initProfile(Profile y) {
        profile=y;
    }

    @FXML
    void Search(ActionEvent event) {

    }

    @FXML
    void goToMainPage(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainScreen.fxml"));
            root = (Parent) fxmlLoader.load();
           MainScreenController mainScreenController = fxmlLoader.getController();
           MainScreenController.initEmployee(username);

        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        borderPanee.setCenter(root);
    }



    @FXML
    void goToMyDepartment(ActionEvent event) {

    }

    @FXML
    void goToMyProfile(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../ProfileScreen/ProfileScreen.fxml"));
            root = (Parent) fxmlLoader.load();
            ProfileScreenController profileScreenController = fxmlLoader.getController();
            ProfileScreenController.initEmployee(username);
            ProfileScreenController.initProfile(profile);
            //ProfileScreenController.setData(this.profile);

        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        borderPanee.setCenter(root);
    }

}


