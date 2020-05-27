package Alex.LogisticsDepartmentScreens;
import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.fxml.FXML;
public class PaymentsScreenController {



        @FXML
        private TableView<?> EconomicsTable;

        @FXML
        private TableColumn<?, ?> NameColumn;

        @FXML
        private TableColumn<?, ?> DateColumn;

        @FXML
        private TableColumn<?, ?> AmountColumn;

        @FXML
        private TableColumn<?, ?> CounterpartyColumn;

        private static Employee username;
        private static Profile profile;

        @FXML
        void MakeEditable(ActionEvent event) {

        }

        @FXML
        void MakeUneditable(ActionEvent event) {

        }

        @FXML
        void SaveData(ActionEvent event) {

        }

        @FXML
        void sortAlphabetically(ActionEvent event) {

        }

    public void initEmployee(Employee x, Profile y) {
            profile=y;
            username=x;
    }
}


