package Alex.ChatScreen;

import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ChatScreenController {

        @FXML
        private Button NewGroupChatButton;

        @FXML
        private Label User1chat;

        @FXML
        private Label User2chat;

        @FXML
        private Label User3chat;

        @FXML
        private Label User4chat;

        @FXML
        private Label User5chat;

        @FXML
        private Label User6chat;

        private static Employee username;
        private static Profile profile;

        public static void initEmployee(Employee x, Profile y) {
                profile=y;
                username=x;
        }


        @FXML
        void GoToScreen(ActionEvent event) {

        }

        @FXML
        void goToChat(MouseEvent event) {

        }




}


