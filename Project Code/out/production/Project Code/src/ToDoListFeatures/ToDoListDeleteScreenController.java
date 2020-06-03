package ToDoListFeatures; /**
 * Sample Skeleton for 'ToDoListDeleteScreen.fxml' Controller Class
 */

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.Vector;

public class ToDoListDeleteScreenController {

    @FXML // fx:id="EntriesTable"
    private TableView<ToDoList> EntriesTable; // Value injected by FXMLLoader

    @FXML // fx:id="NameColumn"
    private TableColumn<?, ?> NameColumn; // Value injected by FXMLLoader

    @FXML // fx:id="DeleteButton"
    private Button DeleteButton; // Value injected by FXMLLoader

    @FXML
    void delete(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("To Do List was deleted successfully.");
        alert.showAndWait();
    }

    void InitializeData()
    {
        Vector<ToDoList> ToDoListsVector = new Vector<>();

        ToDoListsVector.add(new ToDoList( "List"));
        ToDoListsVector.add(new ToDoList("Λίστα για το Project"));

        EntriesTable.getItems().setAll(FXCollections.observableList(ToDoListsVector));
    }
}
