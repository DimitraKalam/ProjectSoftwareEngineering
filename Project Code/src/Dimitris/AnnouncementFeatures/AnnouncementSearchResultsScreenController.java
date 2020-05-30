package Dimitris.AnnouncementFeatures;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.util.Vector;

public class AnnouncementSearchResultsScreenController {

    @FXML
    private TableView<Announcement> EntriesTable;

    @FXML
    private TableColumn<?, ?> InfoColumn;

    @FXML
    private TableColumn<?, ?> DeleteColumn;

    @FXML // fx:id="SearchButton"
    private Button SearchButton; // Value injected by FXMLLoader

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
}