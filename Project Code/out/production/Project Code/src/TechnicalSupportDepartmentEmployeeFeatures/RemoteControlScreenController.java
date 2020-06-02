/**
 * Sample Skeleton for 'RemoteControlScreen.fxml' Controller Class
 */

package TechnicalSupportDepartmentEmployeeFeatures;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class RemoteControlScreenController {

    @FXML // fx:id="BorderPane"
    private javafx.scene.layout.BorderPane BorderPane; // Value injected by FXMLLoader

    @FXML // fx:id="ConnectButton"
    private Button ConnectButton; // Value injected by FXMLLoader

    @FXML // fx:id="CallButton"
    private Button CallButton; // Value injected by FXMLLoader

    @FXML // fx:id="FileTransferButton"
    private Button FileTransferButton; // Value injected by FXMLLoader

    @FXML
    void CallFeature(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Call feature enabled.");
        alert.showAndWait();
    }

    @FXML
    void Connect(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Remote connection was successful.");
        alert.showAndWait();
    }

    @FXML
    void FileTransferFeature(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("File transfer feature enabled.");
        alert.showAndWait();
    }

}
