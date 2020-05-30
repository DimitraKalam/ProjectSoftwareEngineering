package Dimitris.ToDoListFeatures;

/**
 * Sample Skeleton for 'ToDoListEditScreen.fxml' Controller Class
 */

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.Vector;

public class ToDoListEditScreenController {

    @FXML // fx:id="EntriesTable"
    private TableView<ToDoList> EntriesTable; // Value injected by FXMLLoader

    @FXML
    private TableColumn<?, ?> NameColumn;

    @FXML
    private Button SaveChangesButton;

    @FXML
    void SaveChanges(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Changes Saved");
        alert.showAndWait();
    }

    void InitializeData()
    {
        Vector<ToDoList> ToDoListsVector = new Vector<>();

        ToDoListsVector.add(new ToDoList( "List"));
        ToDoListsVector.add(new ToDoList("Λίστα για το Project"));

        EntriesTable.setItems(FXCollections.observableList(ToDoListsVector));
    }
}
