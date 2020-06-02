
package HRDepartment;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.ListView;
        import javafx.scene.control.TextArea;
        import javafx.stage.Stage;

        import java.io.IOException;

public class EmployeeStatsController {

    private String name;

    @FXML
    private ListView<?> employeeList;

    @FXML
    private Button chooseEmployeeButton;

    @FXML
    private Button submitNotesButton;

    @FXML
    private TextArea notesTextBox;

    @FXML
    private Button fillFromButton;

    @FXML
    void chooseEmployeeAction(ActionEvent event) {

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

    }

}
