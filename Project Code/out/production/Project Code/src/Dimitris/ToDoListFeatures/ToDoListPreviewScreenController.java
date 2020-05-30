package Dimitris.ToDoListFeatures;

/**
 * Sample Skeleton for 'ToDoListPreviewScreen.fxml' Controller Class
 */

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.Vector;

public class ToDoListPreviewScreenController
{

    @FXML // fx:id="EntriesTable"
    private TableView<ToDoList> EntriesTable; // Value injected by FXMLLoader

    @FXML // fx:id="NameColumn"
    private TableColumn<?, ?> NameColumn; // Value injected by FXMLLoader

    @FXML // fx:id="PreviewButton"
    private Button PreviewButton; // Value injected by FXMLLoader

    @FXML
    void preview(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Preview Feature.");
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
