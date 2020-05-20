package MainScreen; /**
 * Sample Skeleton for 'mainscreen.fxml' Controller Class
 */

import com.gluonhq.charm.glisten.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;

public class SideBarController {

    @FXML // fx:id="SearchButton"
    private Button SearchButton; // Value injected by FXMLLoader

    @FXML // fx:id="SearchBar"
    private TextField SearchBar; // Value injected by FXMLLoader

    @FXML
    void ShowSearch(ActionEvent event) {
        SearchButton.setVisible(true);

    }

}
