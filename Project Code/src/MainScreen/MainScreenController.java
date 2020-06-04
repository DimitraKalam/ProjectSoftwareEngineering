package MainScreen;

import ChatScreen.ChatScreenController;
import ProfileFeatures.Employee;
import ProfileFeatures.Profile;
import Calendar.ArxikiCalendarController;
import AnnouncementFeatures.AnnouncementSearchResultsScreenController;
import ToDoListFeatures.ToDoListSearchResultsScreenController;
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

    @FXML
    private BorderPane BorderPaneMainScreen;

    private static Employee username;
    private static Profile profile;

    public static void initEmployee(Employee x, Profile y) {
        username = x;
        profile = y;
    }

    @FXML
    void goToAnouncements(ActionEvent event) {
        Parent root = null;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/AnnouncementFeatures/AnnouncementSearchResults.fxml"));
            root = (Parent) fxmlLoader.load();

            AnnouncementSearchResultsScreenController announcementSearchResultsScreenController = fxmlLoader.getController();
            announcementSearchResultsScreenController.InitialiseData();

        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BorderPaneMainScreen.setCenter(root);
    }


    @FXML
    void goToToDoList(ActionEvent event) {
        Parent root = null;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ToDoListFeatures/ToDoListSearchResultsScreen.fxml"));
            root = (Parent) fxmlLoader.load();

            ToDoListSearchResultsScreenController toDoListSearchResultsScreenController = fxmlLoader.getController();
            //chatScreenController.initEmployee(username, profile);


        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BorderPaneMainScreen.setCenter(root);
    }


    @FXML
    void goToChatScreen(ActionEvent event) {
        Parent root = null;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ChatScreen/ChatScreen.fxml"));
            root = (Parent) fxmlLoader.load();

            ChatScreenController chatScreenController = fxmlLoader.getController();
            chatScreenController.initEmployee(username, profile);


        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BorderPaneMainScreen.setCenter(root);
    }


    @FXML
    void openCalendar(ActionEvent event) {
        Parent root = null;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Calendar/ArxikiCalendarSample.fxml"));
            root = (Parent) fxmlLoader.load();

            ArxikiCalendarController arxikiCalendarController = fxmlLoader.getController();

        } catch (IOException ex) {
            Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BorderPaneMainScreen.setCenter(root);
    }




    public void changeScene(Parent x){
        BorderPaneMainScreen.setCenter(x);
    }
}


