package CustomerDepartment;

import TechnicalSupportDepartmentEmployeeFeatures.TechnicalSupportEmployeeFeaturesScreenController;
import ToDoListFeatures.ToDoListCompositionScreenController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerSupportSideBarController {

    @FXML
    private Button showComplaintsButton;


    @FXML
    private BorderPane bordrpane;


    @FXML
    private Button remoteControlButton;

    @FXML
    private Button productGuidesButton;



    @FXML
    void productGuidesAction(ActionEvent event) {
        Parent root =null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomerSupportProductGuides.fxml"));
            root = fxmlLoader.load();
            CustomerSupportProductGuidesController customerSupportProductGuidesController = fxmlLoader.getController();

        } catch (IOException ex) {
            Logger.getLogger(ToDoListCompositionScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        bordrpane.setCenter(root);
    }

    @FXML
    void remoteControlAction(ActionEvent event) {
        Parent root =null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomerSupportRemoteController.fxml"));
            root = fxmlLoader.load();
            CustomerSupportRemoteControllController customerSupportRemoteControllController = fxmlLoader.getController();

        } catch (IOException ex) {
            Logger.getLogger(ToDoListCompositionScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        bordrpane.setCenter(root);
    }



    @FXML
    void showComplaintsAction(ActionEvent event) {
        Parent root =null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomerSupportShowComplaints.fxml"));
            root = fxmlLoader.load();
            CustomerSupportShowComplainsController customerSupportShowComplainsController = fxmlLoader.getController();

        } catch (IOException ex) {
            Logger.getLogger(ToDoListCompositionScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        bordrpane.setCenter(root);
    }

}
