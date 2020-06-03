/**
 * Sample Skeleton for 'AnnouncementPublicationScreen.fxml' Controller Class
 */

package AnnouncementFeatures;

import ProfileFeatures.Employee;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.Vector;

import static ProfileFeatures.Employee.department.TechnicalSupport;
import static ProfileFeatures.Employee.department.none;

public class AnnouncementPublicationScreenController {

    @FXML // fx:id="BorderPane"
    private javafx.scene.layout.BorderPane BorderPane; // Value injected by FXMLLoader

    @FXML // fx:id="EntriesTable"
    private TableView<Employee> EntriesTable; // Value injected by FXMLLoader

    @FXML // fx:id="NameColumn"
    private TableColumn<?, ?> NameColumn; // Value injected by FXMLLoader

    @FXML // fx:id="DepartmentColumn"
    private TableColumn<?, ?> DepartmentColumn; // Value injected by FXMLLoader

    @FXML // fx:id="TextArea"
    private javafx.scene.control.TextArea TextArea; // Value injected by FXMLLoader

    @FXML // fx:id="PublishButton"
    private Button PublishButton; // Value injected by FXMLLoader

    @FXML
    void publish(ActionEvent event)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Announcement was published successfully.");
        alert.showAndWait();
    }

    void InitializeData()
    {
        Vector<Employee> EmployeeVector = new Vector<>();

        EmployeeVector.add(new Employee( "George Papadopoulos", TechnicalSupport));
        EmployeeVector.add(new Employee("Me", none));

        EntriesTable.getItems().setAll(FXCollections.observableList(EmployeeVector));
    }
}
