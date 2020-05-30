package Dimitris.ToDoListFeatures;

/**
 * Sample Skeleton for 'ToDoListEditScreen.fxml' Controller Class
 */

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.util.Vector;

public class ToDoListEditScreenController {

    @FXML // fx:id="EntriesTable"
    private TableView<ToDoList> EntriesTable; // Value injected by FXMLLoader

    void InitializeData()
    {
        Vector<ToDoList> ToDoListsVector = new Vector<>();

        ToDoListsVector.add(new ToDoList( "List"));
        ToDoListsVector.add(new ToDoList("Λίστα για το Project"));

        EntriesTable.setItems(FXCollections.observableList(ToDoListsVector));
    }
}
