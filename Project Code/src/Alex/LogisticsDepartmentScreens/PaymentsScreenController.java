package Alex.LogisticsDepartmentScreens;
import Alex.LogisticsEmployeeFeatures.Payments;
import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

import static Alex.LogisticsEmployeeFeatures.Payments.State.Done;
import static Alex.LogisticsEmployeeFeatures.Payments.State.Pending;

public class PaymentsScreenController {

        @FXML
        private TableView<Payments> PaymentsTable;

        @FXML
        private TableColumn<Payments, String> NameColumn;

        @FXML
        private TableColumn<Payments, String> DateColumn;

        @FXML
        private TableColumn<Payments, Integer> AmountColumn;

        @FXML
        private TableColumn<Payments, String> CounterpartyColumn;
        @FXML
        private TableColumn<Payments, Payments.State> StateColumn;

        private static Employee username;
        private static Profile profile;
        private ObservableList data;
        private List list = new ArrayList();
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
            data = getInitialTableData();
            PaymentsTable.setItems(data);
            NameColumn.setCellValueFactory(new PropertyValueFactory("name"));
            DateColumn.setCellValueFactory(new PropertyValueFactory("date"));
            AmountColumn.setCellValueFactory(new PropertyValueFactory("amount"));
            StateColumn.setCellValueFactory(new PropertyValueFactory("state"));
            CounterpartyColumn.setCellValueFactory(new PropertyValueFactory("counterparty"));


            PaymentsTable.getColumns().setAll(NameColumn,DateColumn,AmountColumn,StateColumn,CounterpartyColumn);

    }
        private ObservableList getInitialTableData() {


                list.add(new Payments( Done, 2000, "1.01.2020", "LeCouli", "Bribes"));
                list.add(new Payments(Pending, 10000, "1.07.2020", "Eurovank", "Loan"));

                ObservableList data = FXCollections.observableList(list);

                return data;
        }
}


