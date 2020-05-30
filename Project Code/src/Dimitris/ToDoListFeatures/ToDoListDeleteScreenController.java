package Dimitris.ToDoListFeatures; /**
 * Sample Skeleton for 'ToDoListDeleteScreen.fxml' Controller Class
 */

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.util.Vector;

public class ToDoListDeleteScreenController {

    @FXML // fx:id="Table"
    private TableView<ToDoList> Table; // Value injected by FXMLLoader

    void InitializeData()
    {
        Vector<ToDoList> ToDoListsVector = new Vector<>();

        ToDoListsVector.add(new ToDoList( "List"));
        ToDoListsVector.add(new ToDoList("Λίστα για το Project"));

        Table.setItems(FXCollections.observableList(ToDoListsVector));
    }
}
