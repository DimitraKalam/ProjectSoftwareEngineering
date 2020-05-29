package Alex.MainScreen;

import Alex.LogisticsDepartmentScreens.LogisticsDepartmentScreenController;
import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import Alex.ProfileScreen.ProfileScreenController;
import Alex.SearchResults.SearchResultsController;
import com.gluonhq.charm.glisten.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
    private static Button DepartmentButton;

    private  static Employee username;
    private static Profile profile;
    private static Employee dummy;

    public static void initEmployee(Employee x) {
        username=x;
        if(x.belongsToDepartment(Employee.department.none))
            DepartmentButton.setVisible(false);
    }


    public static void initProfile(Profile y) {
        profile=y;
    }

    @FXML
    void Search(ActionEvent event) {
        String  query=SearchBar.getText();
        //Δημιουργουμε ενα dummy user με ονομα το search query για τις αναγκες της εργασιας και της επιδειξης της βασικης λειτουργικοτητας
        Employee dummy = new Employee (query, Employee.department.none);
        Profile dummyProfile=new Profile();
        dummyProfile.setUser(dummy);
        dummyProfile.setPosition("Cleaning Staff");
        dummyProfile.setSalary(2000);
        dummyProfile.setContactInfo("Πρόκειται για dummy προφίλ \nπου δημιουργείται με όνομα το query \nτης αναζήτησης για τις ανάγκες της εργασίας \nκαι της επίδειξης της βασικής λειτουργικότητας.");

        Image image = null;
        try {
            image = new Image(new FileInputStream("Project Code/src/Alex/ProfileScreen/image7.jpg"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dummyProfile.setPhoto(image);
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../SearchResults/SearchResultsScreen.fxml"));
            root = (Parent) fxmlLoader.load();
            SearchResultsController searchResultsController = fxmlLoader.getController();
            searchResultsController.initSearchResults(username,profile,dummy,dummyProfile);


        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        borderPanee.setCenter(root);


    }

    @FXML
    void goToMainPage(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainScreen.fxml"));
            root = (Parent) fxmlLoader.load();
           MainScreenController mainScreenController = fxmlLoader.getController();
           mainScreenController.initEmployee(username);

        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        borderPanee.setCenter(root);
    }


    @FXML
    void goToMyProfile(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../ProfileScreen/ProfileScreen.fxml"));
            root = (Parent) fxmlLoader.load();
            ProfileScreenController profileScreenController = fxmlLoader.getController();
            profileScreenController.initEmployeeFromMyProfile(username,profile);

        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }

        borderPanee.setCenter(root);
    }
    @FXML
    void goToMyDepartment(ActionEvent event) {
        switch(username.getDepartment()){
            case Logistics:
                Parent root = null;
                try{
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../LogisticsDepartmentScreens/LogisticsScreen.fxml"));
                    root = (Parent) fxmlLoader.load();
                    LogisticsDepartmentScreenController logisticsDepartmentScreenController = fxmlLoader.getController();
                    logisticsDepartmentScreenController.setVariables(username,profile);}
                catch (IOException ex) {
                    Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);

                }
                borderPanee.setCenter(root);
                break;
            case HR:
                break;
            case CostumerSupport:
                break;
            case TechnicalSupport:
                break;




        }}
}


