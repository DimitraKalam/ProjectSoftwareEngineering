package sample;

import java.net.URL;
import java.nio.file.Files;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ApothetirioController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TableView<Files> table;// = new TableView<Files>();

    @FXML private TableColumn fileNameCol ;
    @FXML private TableColumn descriptionCol ;
    @FXML private TableColumn dateCol ;

      private final ObservableList<Files> data
            = FXCollections.observableArrayList(
            new Files("Project A", "Software engineering", "31-05-20"),
            new Files("Project B", "Data mining", "20-03-20"),
            new Files("Project C", "Data bases", "8-01-20"),
            new Files("Project D", "Debugging", "7-08-19"),
            new Files("Project E", "Information retrieval", "25-02-19")
    );


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        fileNameCol.setMinWidth(100);
        descriptionCol.setMinWidth(100);
        dateCol.setMinWidth(100);
        table.getItems().setAll(this.data);
    }

    public static class Files {

        private final SimpleStringProperty fileName;
        private final SimpleStringProperty descript;
        private final SimpleStringProperty date;

        private Files(String fName, String perigrafi, String date) {
            this.fileName = new SimpleStringProperty(fName);
            this.descript = new SimpleStringProperty(perigrafi);
            this.date = new SimpleStringProperty(date);
        }

        public String getFileName() {
            return fileName.get();
        }

        public void setFileName(String fName) {
            fileName.set(fName);
        }

        public String getDescript() {
            return descript.get();
        }

        public void setDescript(String fName) {
            descript.set(fName);
        }

        public String getDate() {
            return date.get();
        }

        public void setDate(String fName) {
            date.set(fName);
        }
    }

    @FXML
    private AnchorPane anchor;

    @FXML
    void uploadFile(ActionEvent event) {
        FileChooser filechooser =  new FileChooser();
        filechooser.setTitle("Open File Dialog");
        Stage stageFiles = (Stage)anchor.getScene().getWindow();

        filechooser.showOpenDialog(stageFiles);

       // File file = chooser.showOpenDialog(stage);
    }

    @FXML
    void deleteFile(ActionEvent event) {
        table.getItems().removeAll(table.getSelectionModel().getSelectedItem());
    }

    @FXML
    private TextField searchField;

    FilteredList filter = new FilteredList(data, e->true);

    @FXML
    void search(KeyEvent event) {
//        searchField.textProperty().addListener((observable, oldValue, newValue) -> {
//            filter.setPredicate((Predicate<? super Files>) (Files std)->{
//
//            if(newValue.isEmpty() || newValue==null ){
//                return true;
//            }
//            else if(std.getFileName().contains(newValue)){
//                return true;
//            }
//        return false;
//            });
//
//        });
//
//        SortedList sort = new SortedList(filter);
//        sort.comparatorProperty().bind(table.comparatorProperty());
//        table.setItems(sort);
    }

}