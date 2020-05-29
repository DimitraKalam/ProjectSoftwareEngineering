package Alex.ChatScreen;

import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import com.gluonhq.charm.glisten.control.Avatar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChatScreenController {

        @FXML
        private Button NewGroupChatButton;

        @FXML
        private Label User1chat;

        @FXML
        private Avatar Avatar1;

        @FXML
        private Label User2chat;

        @FXML
        private Avatar Avatar2;

        @FXML
        private Label User3chat;

        @FXML
        private Avatar Avatar3;

        @FXML
        private Label User4chat;

        @FXML
        private Avatar Avatar4;

        @FXML
        private Label User5chat;

        @FXML
        private Avatar Avatar5;

        @FXML
        private Label User6chat;

        @FXML
        private Avatar Avatar6;

        private static Employee username;
        private static Profile profile;

        public void initEmployee(Employee x, Profile y) {
                profile=y;
                username=x;
               Profile dummyprofile1=createDummyProfiles("Dummy User 1","Project Code/src/Alex/ChatScreen/image8.jpg");
              //

               User1chat.setText(dummyprofile1.getName());
        }


        @FXML
        void GoToScreen(ActionEvent event) {

        }

        @FXML
        void goToChat(MouseEvent event) {

        }
       // createDummyProfiles("DummyUser1", "Project Code/src/Alex/ProfileScreen/image8.jpg");
        Profile createDummyProfiles(String name, String location){
                Employee dummy1 = new Employee (name, Employee.department.none);
                Profile dummyProfile1=new Profile();
                dummyProfile1.setUser(dummy1);
                Image icon = null;
                Image image = null;
                try {
                        image = new Image(new FileInputStream(location));
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }
                dummyProfile1.setPhoto(image);
                Avatar1.setImage(image);
                return dummyProfile1;

        }



}


