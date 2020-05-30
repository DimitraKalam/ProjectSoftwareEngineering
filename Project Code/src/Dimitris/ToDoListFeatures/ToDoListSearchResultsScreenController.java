/**
 * Sample Skeleton for 'ToDoListSearchResultsScreen.fxml' Controller Class
 */

package Dimitris.ToDoListFeatures;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ToDoListSearchResultsScreenController {

    @FXML // fx:id="AnchorPane"
    private javafx.scene.layout.AnchorPane AnchorPane; // Value injected by FXMLLoader

    @FXML // fx:id="EconomicsTable"
    private TableView<?> EconomicsTable; // Value injected by FXMLLoader

    @FXML // fx:id="AmountColumn"
    private TableColumn<?, ?> AmountColumn; // Value injected by FXMLLoader

    void goToCompositionPage(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ToDoListCompositionScreen.fxml"));
            root = fxmlLoader.load();
            ToDoListCompositionScreenController compositionScreenController = fxmlLoader.getController();
            compositionScreenController.InitializeData();

        } catch (IOException ex) {
            Logger.getLogger(ToDoListCompositionScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void goToEditPage(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ToDoListEditScreen.fxml"));
            root = fxmlLoader.load();
            ToDoListEditScreenController editScreenController = fxmlLoader.getController();
            editScreenController.InitializeData();

        } catch (IOException ex) {
            Logger.getLogger(ToDoListCompositionScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void goToPreviewPage(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ToDoListPreviewScreen.fxml"));
            root = fxmlLoader.load();
            ToDoListPreviewScreenController previewScreenController = fxmlLoader.getController();
            previewScreenController.InitializeData();

        } catch (IOException ex) {
            Logger.getLogger(ToDoListCompositionScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void goToDeletePage(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ToDoListDeleteScreen.fxml"));
            root = fxmlLoader.load();
            ToDoListPreviewScreenController previewScreenController = fxmlLoader.getController();
            previewScreenController.InitializeData();

        } catch (IOException ex) {
            Logger.getLogger(ToDoListCompositionScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
