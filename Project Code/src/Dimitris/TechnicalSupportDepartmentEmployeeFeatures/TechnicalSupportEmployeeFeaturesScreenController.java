/**
 * Sample Skeleton for 'TechnicalSupportEmployeeFeaturesScreen.fxml' Controller Class
 */

package Dimitris.TechnicalSupportDepartmentEmployeeFeatures;

import Dimitris.ToDoListFeatures.ToDoListCompositionScreenController;
import Dimitris.ToDoListFeatures.ToDoListDeleteScreenController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TechnicalSupportEmployeeFeaturesScreenController {

    @FXML // fx:id="BorderPane"
    private BorderPane BorderPane; // Value injected by FXMLLoader

    @FXML // fx:id="RemoteControlButton"
    private Button RemoteControlButton; // Value injected by FXMLLoader

    @FXML // fx:id="MeasurementsButton"
    private Button MeasurementsButton; // Value injected by FXMLLoader

    @FXML
    void goToMeasurementsScreen(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MeasurementsMetricsScreen.fxml"));
            root = fxmlLoader.load();
            MeasurementsMetricsScreenController measurementScreenController = fxmlLoader.getController();

        } catch (IOException ex) {
            Logger.getLogger(ToDoListCompositionScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BorderPane.setCenter(root);
    }

    @FXML
    void goToRemoteControlScreen(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RemoteControlScreen.fxml"));
            root = fxmlLoader.load();
            RemoteControlScreenController remoteScreenController = fxmlLoader.getController();

        } catch (IOException ex) {
            Logger.getLogger(ToDoListCompositionScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BorderPane.setCenter(root);
    }

}
