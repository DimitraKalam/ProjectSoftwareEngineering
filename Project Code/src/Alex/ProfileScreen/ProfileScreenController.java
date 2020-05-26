package Alex.ProfileScreen;

import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class ProfileScreenController {

    @FXML
    private AnchorPane AnchorPaneProfileScreen;

    @FXML
    private ImageView ProfilePicture;

    @FXML
    private static TextField NameTextField;

    @FXML
    private static TextArea ContactInfoTextArea;

    @FXML
    private static TextField PositionTextField;

    @FXML
    private Button EditProfileButton;

    @FXML
    private static DatePicker DateStartedPicker;

    @FXML
    private Button SaveProfileButton;

    private static Employee username;
    private static Profile profile;

    public static void initEmployee(Employee x) {
        username=x;
    }

    public static void initProfile(Profile y) {
        profile=y;
    }

    public static void setData(Profile profile) {
        NameTextField.setText(profile.getName());
        ContactInfoTextArea.setText(profile.getContact());
        PositionTextField.setText(profile.getPosition().name());
        //LocalDate localDate = LocalDate.parse(profile.getDate());
       // DateStartedPicker.setValue(localDate);
    }

    @FXML
    void EditProfile(ActionEvent event) {

        NameTextField.setEditable(true);
        ContactInfoTextArea.setEditable(true);
        PositionTextField.setEditable(true);
        DateStartedPicker.setEditable(true);
        SaveProfileButton.setDisable(false);
        EditProfileButton.setDisable(true);
        //SaveProfileButton.setVisible(true);
    }

    @FXML
    void SaveChanges(ActionEvent event) {
        NameTextField.setEditable(false);
        ContactInfoTextArea.setEditable(false);
        PositionTextField.setEditable(false);
        DateStartedPicker.setEditable(false);
        SaveProfileButton.setDisable(true);
        //SaveProfileButton.setVisible(false);
        EditProfileButton.setDisable(false);
    }


}
