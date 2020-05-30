package Dimitris.ToDoListFeatures;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.util.Vector;

public class ToDoListCompositionScreenController {


    @FXML // fx:id="EntriesTable"
    private TableView<ToDoList> EntriesTable; // Value injected by FXMLLoader

    @FXML // fx:id="SaveChangesButton"
    private Button SaveChangesButton; // Value injected by FXMLLoader

    @FXML // fx:id="CancelButton"
    private Button CancelButton; // Value injected by FXMLLoader

    @FXML
    private TableColumn<ToDoList, String> NameColumn;

    @FXML
    void Cancel(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Back");
        alert.showAndWait();
    }

    @FXML
    void ToDoListSaveChanges(MouseEvent event)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Changes Saved");
        alert.showAndWait();

        InitializeData();
    }

    public void InitializeData()
    {
        Vector<ToDoList> ToDoListsVector = new Vector<>();

        ToDoListsVector.add(new ToDoList( "List"));
        ToDoListsVector.add(new ToDoList("Λίστα για το Project"));

        EntriesTable.setItems(FXCollections.observableList(ToDoListsVector));
    }
}
