package Dimitris.AnnouncementFeatures;

import Dimitris.ToDoListFeatures.ToDoListCompositionScreenController;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnnouncementSearchResultsScreenController {

    @FXML
    private TableView<Announcement> EntriesTable;

    @FXML
    private TableColumn<?, ?> InfoColumn;

    @FXML
    private TableColumn<?, ?> DeleteColumn;

    @FXML // fx:id="SearchButton"
    private Button SearchButton; // Value injected by FXMLLoader

    @FXML // fx:id="PublishButton"
    private Button PublishButton; // Value injected by FXMLLoader

    @FXML // fx:id="EditCreationButton"
    private Button EditCreationButton; // Value injected by FXMLLoader

    @FXML
    void Search(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Announcement Found.");
        alert.showAndWait();

        Vector<Announcement> AnnouncementVector = new Vector<>();

        AnnouncementVector.add(new Announcement( "Announcement", "Something"));
        AnnouncementVector.add(new Announcement("Ανακοίνωση για το Project", "Κείμενο"));

        EntriesTable.setItems(FXCollections.observableList(AnnouncementVector));
    }

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

    void goToPublicationPage(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AnnouncementPublicationScreen.fxml"));
            root = fxmlLoader.load();
            AnnouncementPublicationScreenController publicationScreenController = fxmlLoader.getController();
            publicationScreenController.InitializeData();

        } catch (IOException ex) {
            Logger.getLogger(ToDoListCompositionScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}