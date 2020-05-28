package Alex.LogisticsDepartmentScreens;

import Alex.LogisticsEmployeeFeatures.Economics;
import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static Alex.LogisticsEmployeeFeatures.Economics.Type.Expenses;
import static Alex.LogisticsEmployeeFeatures.Economics.Type.Income;

public class EconomicsScreenController {

    @FXML
    private Button ProfitButton;

    @FXML
    private TableView<Economics> EconomicsTable;


    @FXML
    private TableColumn<Economics,String> NameColumn;

    @FXML
    private TableColumn<Economics,String> DateColumn;

    @FXML
    private TableColumn<Economics, Integer> AmountColumn;

    @FXML
    private TableColumn<Economics,String> CounterpartyColumn;
    @FXML
    private TableColumn<Economics, Boolean> RecurringColumn;
    @FXML
    private TableColumn<Economics, Economics.Source> SourceColumn;
    @FXML
    private TableColumn<Economics, Economics.Type> TypeColumn;
    @FXML
    private Label ProfitLabel;

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
    void showProfit(ActionEvent event) {
        int income=0;
        int expenses=0;
        for (Iterator<Economics> iter = list.iterator(); iter.hasNext(); ){
            Object x = iter.next();
            if (((Economics) x).getType() == Income) {
               income= income+ ((Economics) x).getAmount();
            }
            else if (((Economics) x).getType()== Expenses){
                expenses=expenses+ ((Economics) x).getAmount();
            }
    }
    int profit= income- expenses;
        ProfitLabel.setText(String.valueOf(profit));
        ProfitLabel.setVisible(true);
    }

    @FXML
    void sortAlphabetically(ActionEvent event) {

    }
    public void initEmployee(Employee x, Profile y) {
        profile=y;
        username=x;
        data = getInitialTableData();
        EconomicsTable.setItems(data);
        NameColumn.setCellValueFactory(new PropertyValueFactory("name"));
        DateColumn.setCellValueFactory(new PropertyValueFactory("date"));
        AmountColumn.setCellValueFactory(new PropertyValueFactory("amount"));
        TypeColumn.setCellValueFactory(new PropertyValueFactory("type"));
        SourceColumn.setCellValueFactory(new PropertyValueFactory("source"));
        CounterpartyColumn.setCellValueFactory(new PropertyValueFactory("counterParty"));
        RecurringColumn.setCellValueFactory(new PropertyValueFactory("recurring"));

        EconomicsTable.getColumns().setAll(NameColumn,DateColumn,AmountColumn,TypeColumn,SourceColumn,CounterpartyColumn,RecurringColumn);




    }
    private ObservableList getInitialTableData() {


        list.add(new Economics(Income, Economics.Source.Payments, 2000, "ComCop", "Microsoft", false, "12.03.2020"));
        list.add(new Economics(Economics.Type.Expenses, Economics.Source.Sales, 3000, "Office", "Microsoft",true,"11.03.2020"));

        ObservableList data = FXCollections.observableList(list);

        return data;
    }
}
