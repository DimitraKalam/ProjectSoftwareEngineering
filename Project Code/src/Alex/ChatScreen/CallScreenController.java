package Alex.ChatScreen;

import Alex.ProfileFeatures.ChatFeature;
import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
public class CallScreenController {

        private static Employee username;
        private static Profile profile;
        private ChatFeature chat;
        @FXML
        private ImageView MyPhoto;

        @FXML
        private ImageView OtherPhoto;

        @FXML
        private Button EndCallButton;

    public static void initData() {
    }

    @FXML
        void endCall(ActionEvent event) {

        }
        void initData(Employee x, Profile y, ChatFeature z){
               username=x;
               profile=y;
               chat=z;
              // chat.isGroup
        }
    }



