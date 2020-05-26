package Dimitris.ToDoListFeatures;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

class ToDoListCompositionScreenController {

    @FXML // fx:id="EntriesTable"
    private TableView<?> EntriesTable; // Value injected by FXMLLoader

    @FXML // fx:id="SaveChangesButton"
    private Button SaveChangesButton; // Value injected by FXMLLoader

    @FXML // fx:id="CancelButton"
    private Button CancelButton; // Value injected by FXMLLoader

    @FXML
    void Cancel(MouseEvent event) {

    }

    private void handleSButtonAction()
    {
        SaveChangesButton.setOnMouseClicked(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Changes Saved");

            alert.showAndWait();
        });
    }

    private void handleCButtonAction()
    {
        CancelButton.setOnMouseClicked(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Back");

            alert.showAndWait();
        });
    }
}
