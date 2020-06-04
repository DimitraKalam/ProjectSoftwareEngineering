package CustomerDepartment;

import Apothetirio.ApothetirioController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerSupportProductGuidesController implements Initializable {

    @FXML
    private TextField searchGuideTextBox;

    @FXML
    private Button sera;

    @FXML
    private CheckBox videoTick;

    @FXML
    private CheckBox documentTick;

    @FXML
    private TableView<TroubleshootingGuides> tableView;

    @FXML
    private TableColumn<TroubleshootingGuides, String> columnName;

    @FXML
    private TableColumn<TroubleshootingGuides, String> columnCategory;

    private final ObservableList<TroubleshootingGuides> data
            = FXCollections.observableArrayList(
            new TroubleshootingGuides("Guide Name", "Guide's Category"),
            new TroubleshootingGuides("Guide Name", "Guide's Category"),
            new TroubleshootingGuides("Guide Name", "Guide's Category"),
            new TroubleshootingGuides("Guide Name", "Guide's Category"

            ));

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        columnCategory.setCellFactory(TextFieldTableCell.forTableColumn());
        columnName.setCellFactory(TextFieldTableCell.forTableColumn());

        tableView.getItems().setAll(this.data);
    }


}
