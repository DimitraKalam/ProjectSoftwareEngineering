package Alex.SearchResults;

import Alex.MainScreen.SidebarController;
import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import Alex.ProfileScreen.ProfileScreenController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SearchResultsController {
    private static Employee username;
    private static Profile profile;
    private static String query;

    private static Employee dummy ;
    private static Profile dummyProfile;

    @FXML
    private BorderPane borderPanee;

    @FXML
    private  Label User1chat;

    @FXML
    private  Label User2chat;

    @FXML
    private  Label User3chat;

    @FXML
    private  Label User4chat;

    @FXML
    private  Label User5chat;

    @FXML
    private  Label User6chat;

    public void initSearchResults(Employee username1, Profile profile1, Employee dummy1, Profile dummyProfile1) {
       username=username1;
       profile=profile1;
       dummy = dummy1;
       dummyProfile=dummyProfile1;

        showResults(dummy);

    }


    @FXML
    public void goToChat(MouseEvent event) {

    }

    @FXML
    public void goToProfile(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../ProfileScreen/ProfileScreen.fxml"));
            root = (Parent) fxmlLoader.load();
            ProfileScreenController profileScreenController = fxmlLoader.getController();
            profileScreenController.initEmployeeFromProfile(username,profile,dummy,dummyProfile);

        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        borderPanee.setCenter(root);
    }

    public void showResults(Employee hey){ User1chat.setText(hey.getName());
    }
    }




