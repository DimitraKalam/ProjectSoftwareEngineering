package Dimitris.AnnouncementFeatures;

import Dimitris.ToDoListFeatures.ToDoListCompositionScreenController;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sample Skeleton for 'AnnouncementEditCreationScreen.fxml' Controller Class
 */

public class AnnouncementEditCreationScreenController {

    @FXML // fx:id="EntriesTable"
    private TableView<Announcement> EntriesTable; // Value injected by FXMLLoader

    @FXML // fx:id="Column"
    private TableColumn<?, ?> Column; // Value injected by FXMLLoader

    void goToEditCompositionPage(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AnnouncementEditCreationScreen.fxml"));
            root = fxmlLoader.load();
            AnnouncementEditCreationScreenController editCreationScreenController = fxmlLoader.getController();
            editCreationScreenController.InitializeData();

        } catch (IOException ex) {
            Logger.getLogger(ToDoListCompositionScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void InitializeData()
    {
        Vector<Announcement> AnnouncementVector = new Vector<>();

        AnnouncementVector.add(new Announcement( "Announcement", "Something"));
        AnnouncementVector.add(new Announcement("Ανακοίνωση για το Project", "Κείμενο"));

        EntriesTable.setItems(FXCollections.observableList(AnnouncementVector));
    }
}
