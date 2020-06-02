package ProfileScreen;

import ProfileFeatures.Employee;
import ProfileFeatures.Profile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import static java.lang.Integer.parseInt;

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

    private static Employee myUsername,username;
    private static Profile myProfile,profile;

    public void initEmployeeFromMyProfile(Employee x, Profile y) {

        myUsername=x;
        username=myUsername;
        myProfile=y;
        profile=myProfile;
        setVariables(username,profile);
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


    public  void setVariables(Employee x, Profile y) {

        NameTextField.setText(y.getName());
        ContactInfoTextArea.setText(y.getContact());
        PositionTextField.setText(y.getPosition());
        SalaryTextField.setText(String.valueOf(y.getSalary()));
        DateStartedPicker.setValue(y.getDate());
        ProfilePicture.setImage(y.getPhoto());

    }

    public void initEmployeeFromProfile(Employee username1, Profile profile1, Employee dummy1, Profile dummyProfile1) {
    myUsername=username1;
    myProfile=profile1;
    username=dummy1;
    profile=dummyProfile1;
    setVariables(username,profile);

    }
}
