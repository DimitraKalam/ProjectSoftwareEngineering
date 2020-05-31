package Alex.ChatScreen;

import Alex.ProfileFeatures.ChatFeature;
import Alex.ProfileFeatures.ChatMessage;
import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class MessageScreenController {

       @FXML
        private ListView<String> MessagesList;

        @FXML
        private TextField MessageText;

        @FXML
        private Button SendButton;

        @FXML
        private ImageView PhotoField;

        @FXML
        private Label NameLabel;

        private static Employee username;
        private static Profile profile;
        private ChatFeature chat;
        private boolean group=false;
        private ObservableList<String> items = FXCollections.observableArrayList();

    @FXML
    private Button CallButton;

    @FXML
    void beginCall(ActionEvent event) {

    }

        @FXML
        void sendMessage(ActionEvent event) {
        ChatMessage kainourio = new ChatMessage(MessageText.getText(),username);
        MessageText.clear();
        chat.newMessage(kainourio);
        String temp= new StringBuilder().append(kainourio.getSender().getName()).append(" said: ").append(kainourio.getText()).toString();
        items.add(temp);
        MessagesList.setItems(items);

        }
        public void initData(Employee me, Profile mine, ChatFeature chats){
            username=me;
            profile=mine;
            chat=chats;

            int count=0;
            List<Profile> all= chats.getUsers();
           for(Profile x: all ) {
               if(!x.getName().equals(username.getName())){
                   count++;
               }
           }
            if(count>1){
                group=true;
            }
            if(!group){
                for(Profile x: all ) {
                    if(!x.getName().equals(username.getName())) {
                        PhotoField.setImage(((Profile)x).getPhoto());
                        NameLabel.setText(((Profile)x).getName());
                    }
                }
                }
            else{
                Image image = null;
                try {
                    image = new Image(new FileInputStream("Project Code/src/Alex/ChatScreen/groupchat.png"));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                StringBuilder groupchatname= null;
                for(Profile x: all ) {
                    if(!x.getName().equals(username.getName())) {

                      groupchatname.append(x.getName()).append("\n");
                    }
                }
            }

            List<ChatMessage> allMessages= chat.returnChats();
            for(ChatMessage x: allMessages){
                String temporary = new StringBuilder().append(x.getSender().getName()).append(" said ").append(x.getText()).toString();
                items.add(temporary);
            }
            MessagesList.setItems(items);
        }


    }


