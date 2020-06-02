package HRDepartment;

import MainScreen.SidebarController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HRDepartmentSidebarController {
    @FXML
    private ImageView certificatesAction;

    @FXML
    private ImageView skillsAction;


    @FXML
    private BorderPane borderPanee;

    @FXML
    private Button evaluateApplication;

    @FXML
    private Button manageApplications;

    @FXML
    private Button employeesStatistics;



    @FXML
    void employeesStatisticsAction(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EmployeeStats.fxml"));
            root = (Parent) fxmlLoader.load();
            EmployeeStatsController employeeStatsController = fxmlLoader.getController();
            //logisticsDepartmentScreenController.setVariables(username,profile);
        }
        catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);

        }
        borderPanee.setCenter(root);
    }

    @FXML
    void evaluateApplicationAction(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EvaluateRecruitement.fxml"));
            root = (Parent) fxmlLoader.load();
            EvaluateRecruitmentController evaluateRecruitmentController = fxmlLoader.getController();
        }
        catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);

        }
        borderPanee.setCenter(root);


    }

    @FXML
    void manageApplicationsAction(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ManageApplications.fxml"));
            root = (Parent) fxmlLoader.load();
            ManageApplicationsController manageApplicationsController = fxmlLoader.getController();
        }
        catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);

        }
        borderPanee.setCenter(root);
    }


}