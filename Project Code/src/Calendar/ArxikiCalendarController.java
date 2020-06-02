package Calendar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class ArxikiCalendarController implements Initializable {

    @FXML
    private Pane arxikoPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    void loadPersonal(ActionEvent event) throws Exception  {

        Pane personal = FXMLLoader.load(getClass().getResource("PersonalCalendarSample.fxml"));

        arxikoPane.getChildren().setAll(personal);

    }

    @FXML
    void loadPublic(ActionEvent event) throws Exception{
        Pane publicCal = FXMLLoader.load(getClass().getResource("PublicCalendarSample.fxml"));

        arxikoPane.getChildren().setAll(publicCal);
    }

}
