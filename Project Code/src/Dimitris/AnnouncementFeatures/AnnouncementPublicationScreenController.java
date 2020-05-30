/**
 * Sample Skeleton for 'AnnouncementPublicationScreen.fxml' Controller Class
 */

package Dimitris.AnnouncementFeatures;

import Alex.ProfileFeatures.Employee;
import Dimitris.ToDoListFeatures.ToDoList;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.Vector;

import static Alex.ProfileFeatures.Employee.department.TechnicalSupport;
import static Alex.ProfileFeatures.Employee.department.none;

public class AnnouncementPublicationScreenController {

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

    void InitializeData()
    {
        Vector<Employee> EmployeeVector = new Vector<>();

        EmployeeVector.add(new Employee( "George Papadopoulos", TechnicalSupport));
        EmployeeVector.add(new Employee("Me", none));

        EntriesTable.setItems(FXCollections.observableList(EmployeeVector));
    }
}
