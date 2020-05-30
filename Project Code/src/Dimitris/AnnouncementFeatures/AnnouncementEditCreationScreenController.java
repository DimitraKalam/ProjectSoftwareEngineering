package Dimitris.AnnouncementFeatures;

import Dimitris.ToDoListFeatures.ToDoListCompositionScreenController;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sample Skeleton for 'AnnouncementEditCreationScreen.fxml' Controller Class
 */

public class AnnouncementEditCreationScreenController {
    @FXML // fx:id="BorderPane"
    private javafx.scene.layout.BorderPane BorderPane; // Value injected by FXMLLoader

    @FXML // fx:id="EntriesTable"
    private TableView<Announcement> EntriesTable; // Value injected by FXMLLoader

    @FXML // fx:id="TemplateColumn"
    private TableColumn<?, ?> TemplateColumn; // Value injected by FXMLLoader

    @FXML // fx:id="TextArea"
    private javafx.scene.control.TextArea TextArea; // Value injected by FXMLLoader

    @FXML // fx:id="CreateButton"
    private Button CreateButton; // Value injected by FXMLLoader

    @FXML // fx:id="EditButton"
    private Button EditButton; // Value injected by FXMLLoader

    @FXML
    void CreateAnnouncement(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Announcement was created successfully.");
        alert.showAndWait();
    }

    @FXML
    void EditAnnouncement(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Edit the current announcement.");
        alert.showAndWait();
    }

    void InitializeData()
    {
        Vector<Announcement> AnnouncementVector = new Vector<>();

        AnnouncementVector.add(new Announcement( "Announcement", "Something"));
        AnnouncementVector.add(new Announcement("Ανακοίνωση για το Project", "Κείμενο"));

        EntriesTable.setItems(FXCollections.observableList(AnnouncementVector));
    }
}
