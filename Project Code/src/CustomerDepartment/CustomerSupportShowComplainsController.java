package CustomerDepartment;

import ToDoListFeatures.ToDoListCompositionScreenController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
;
import static CustomerDepartment.Complain.complain1;
import static CustomerDepartment.Complain.complain2;

public class CustomerSupportShowComplainsController implements Initializable {

    @FXML
    private ListView<String> list;

    @FXML
    private Button forwardToDepartmentButton;

    @FXML
    private Button viewGuidButton;

    @FXML
    private CheckBox hRDepartment;

    @FXML
    private CheckBox logistics;

    @FXML
    private CheckBox technicalSupport;

    @FXML
    private CheckBox customerSupport;

    @FXML
    void forwardToDepartmentAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Selected Complain Forwarded to Selected Departments." );
        alert.showAndWait();
    }

    @FXML
    void viewGuideAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Selected \"Product's Guides\"." );
        alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.getItems().add(complain1.getName() + ", " + complain1.getCategory()+ ", " + complain1.getUniqueCode());
        list.getItems().add(complain2.getName() + ", " + complain2.getCategory()+ ", " + complain2.getUniqueCode());

    }
}
