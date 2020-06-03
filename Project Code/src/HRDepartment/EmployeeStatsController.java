
package HRDepartment;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.fxml.Initializable;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Alert;
        import javafx.scene.control.Button;
        import javafx.scene.control.ListView;
        import javafx.scene.control.TextArea;
        import javafx.stage.Stage;

        import java.io.IOException;
        import java.net.URL;
        import java.util.Random;
        import java.util.ResourceBundle;

        import static HRDepartment.EmployAssessmentFeatures.employAssessmentFeaturesArray;
        import static HRDepartment.EvaluateRecruitmentController.randomLastmames;
        import static HRDepartment.EvaluateRecruitmentController.randomNames;
        import static HRDepartment.PunctualityMetrics.pucntualityArray;

public class EmployeeStatsController implements Initializable {

    private String name;

    @FXML
    private ListView<String> punctualityList;

    @FXML
    private ListView<String> EmployeeAssessmentList;


    @FXML
    private ListView<String> employeeList;

    @FXML
    private Button chooseEmployeeButton;

    @FXML
    private Button submitNotesButton;

    @FXML
    private TextArea notesTextBox;

    @FXML
    private Button fillFromButton;

    @FXML
    void chooseEmployeeAction(ActionEvent event)  {
        Random rand;

            String punctualityMetricsString;
            String employAssessmentFeaturesString;
            rand = new Random();
            int rand_int1 = rand.nextInt(3);
            int rand_int2 = rand.nextInt(3);
            EmployAssessmentFeatures employAssessmentFeatures = employAssessmentFeaturesArray[rand_int1];
            PunctualityMetrics punctualityMetrics = pucntualityArray[rand_int2];

            punctualityMetricsString = "Days Work: " + punctualityMetrics.getDaysOfWork() + ", Missed: " + punctualityMetrics.getMissedDaysOfWork() + ", Unreasonable: " + punctualityMetrics.getUnreasonableMissedDaysOfWork();
            employAssessmentFeaturesString = "Project Done: " + employAssessmentFeatures.getCompleteProjects() + ", failed: " + employAssessmentFeatures.getFailedProjects() + ", comments: " + employAssessmentFeatures.getGeneralComments() + ", ProjectGrade: " + employAssessmentFeatures.getProjectAssessmentGrade();
            punctualityList.getItems().add(punctualityMetricsString);
            EmployeeAssessmentList.getItems().add(employAssessmentFeaturesString);



    }

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
    @FXML
    void submitNotesAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Notes Submitted.");
        alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Random rand;

        for(int i=0; i<8; i++){
            rand = new Random();
            int rand_int1 = rand.nextInt(8);
            int rand_int2 = rand.nextInt(8);
            name = randomNames[rand_int1] + " " + randomLastmames[rand_int2];
            employeeList.getItems().add(name);
        }
    }
}
