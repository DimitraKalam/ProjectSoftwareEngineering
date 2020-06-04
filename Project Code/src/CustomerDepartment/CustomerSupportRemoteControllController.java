package CustomerDepartment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerSupportRemoteControllController implements Initializable {

    @FXML
    private ListView<String> clientList;

    @FXML
    private TextField idTextBox;

    @FXML
    private PasswordField passwardTextBox;


    @FXML
    private Label connectLabel;

    @FXML
    private Button connectToClientButton;

    @FXML
    private Button newClientButton;

    @FXML
    void connectToClientAction(ActionEvent event) {
        String clientID = clientList.getSelectionModel().getSelectedItem();
        int i = clientID.indexOf(':');
        clientID = clientID.substring(clientID.lastIndexOf(':') + 2);
        idTextBox.setText(clientID);
        passwardTextBox.setText("********");
        connectLabel.setVisible(true);
    }

    @FXML
    void newClientAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("New Client Created:\nID:" + " " + idTextBox.getText());
        alert.showAndWait();

        clientList.getItems().add("Client " + (clientList.getItems().size() + 1) + " - ID: " + idTextBox.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        clientList.getItems().add("Client 1 - ID: 48961");
        clientList.getItems().add("Client 2 - ID: 3454564");
        clientList.getItems().add("Client 3 - ID: 789243");
        clientList.getItems().add("Client 4 - ID: 4234");
        clientList.getItems().add("Client 5 - ID: 3123");
        clientList.getItems().add("Client 6 - ID: 8678546");
        clientList.getItems().add("Client 7 - ID: 34536");
        clientList.getItems().add("Client 8 - ID: 32423");
        clientList.getItems().add("Client 9 - ID: 234234");


    }
}
