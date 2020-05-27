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

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class ProfileScreenController {

    @FXML
    private AnchorPane AnchorPaneProfileScreen;

    @FXML
    private ImageView ProfilePicture;

    @FXML
    private  TextField NameTextField;

    @FXML
    private  TextArea ContactInfoTextArea;

    @FXML
    private  TextField PositionTextField;

    @FXML
    private Button EditProfileButton;

    @FXML
    private  DatePicker DateStartedPicker;

    @FXML
    private Button SaveProfileButton;
    @FXML
    private TextField SalaryTextField;

    private static Employee username;
    private static Profile profile;

    public static void initEmployee(Employee x) {
        username=x;
    }

    public static void initProfile(Profile y) {
        profile=y;
    }



    @FXML
    void EditProfile(ActionEvent event) {

        NameTextField.setEditable(true);
        ContactInfoTextArea.setEditable(true);
        PositionTextField.setEditable(true);
        SalaryTextField.setEditable(true);
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
        SalaryTextField.setEditable(false);
        DateStartedPicker.setEditable(false);
        SaveProfileButton.setDisable(true);
        //SaveProfileButton.setVisible(false);
        EditProfileButton.setDisable(false);
        username.setName(NameTextField.getText());
        profile.setUser(username);
        profile.setDate(DateStartedPicker.getValue());
        profile.setPosition(PositionTextField.getText());
        profile.setContactInfo(ContactInfoTextArea.getText());
        profile.setSalary(parseInt(SalaryTextField.getText()));

    }


    public void setVariables(Employee x, Profile y) {
        profile=y;
        username=x;
        NameTextField.setText(profile.getName());
        ContactInfoTextArea.setText(profile.getContact());
        PositionTextField.setText(profile.getPosition());
        SalaryTextField.setText(String.valueOf(profile.getSalary()));
        DateStartedPicker.setValue(profile.getDate());
        ProfilePicture.setImage(profile.getPhoto());

    }
}
