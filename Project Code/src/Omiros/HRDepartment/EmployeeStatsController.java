package Omiros.HRDepartment;

import Alex.MainScreen.SidebarController;
import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeStatsController {

    private String name;
    @FXML
    private Button fillFromButton;

    @FXML
    void fillFormAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EvaluationForm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        EvaluationFormController evaluationFormController = fxmlLoader.getController();
        evaluationFormController.initData(name);

        Stage stage = new Stage();
        stage.setTitle("Evaluation Form");
        stage.setScene(new Scene(root1, 600,400));
        stage.show();
    }

}
