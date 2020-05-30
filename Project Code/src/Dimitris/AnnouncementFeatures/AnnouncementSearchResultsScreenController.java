package Dimitris.AnnouncementFeatures;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.Vector;

public class AnnouncementSearchResultsScreenController {

    @FXML
    private TableView<Announcement> EntriesTable;

    @FXML
    private TableColumn<?, ?> InfoColumn;

    @FXML
    private TableColumn<?, ?> DeleteColumn;

    void InitializeData()
    {
        Vector<Announcement> AnnouncementVector = new Vector<>();

        AnnouncementVector.add(new Announcement( "Announcement", "Something"));
        AnnouncementVector.add(new Announcement("Ανακοίνωση για το Project", "Κείμενο"));

        EntriesTable.setItems(FXCollections.observableList(AnnouncementVector));
    }

}