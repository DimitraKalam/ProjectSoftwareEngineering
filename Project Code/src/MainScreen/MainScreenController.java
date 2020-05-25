package MainScreen;

import ChatScreen.ChatScreenController;
import ProfileFeatures.Employee;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainScreenController {

    @FXML
    private Button AnnouncementsButton;

    @FXML
    private Button CalendarButton;

    @FXML
    private Button ToDoListButton;

    @FXML
    private Button ChatButton;
    private Employee username;
    @FXML
    private BorderPane BorderPaneMainScreen;

    @FXML
    void goToChatScreen(ActionEvent event) {
        Parent root = null;
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../ChatScreen/ChatScreen.fxml"));
            root = (Parent) fxmlLoader.load();

            //ChatScreenController chatScreenController = fxmlLoader.getController();
            //chatScreenController.initData(username);

        } catch (IOException ex){
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BorderPaneMainScreen.setCenter(root);
    }

    /*public void initData(Employee x) {
        this.username=x;
    }*/
}


