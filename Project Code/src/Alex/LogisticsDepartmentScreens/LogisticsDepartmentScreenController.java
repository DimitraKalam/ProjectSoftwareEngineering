package Alex.LogisticsDepartmentScreens;
import MainScreen.SidebarController;
import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogisticsDepartmentScreenController {
        @FXML
        private BorderPane borderPane;

        @FXML
        private Button EconomicsButton;

        @FXML
        private Button PaymentsButton;
        private Employee username;
        private Profile profile;

        @FXML
        void goToEconomics(ActionEvent event) {
                Parent root = null;
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EconomicsScreen.fxml"));
                        root = (Parent) fxmlLoader.load();
                        EconomicsScreenController economicsScreenController = fxmlLoader.getController();
                        economicsScreenController.initEmployee(username,profile);

                } catch (IOException ex) {
                        Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
                }

                borderPane.setCenter(root);
        }

        @FXML
        void goToPayments(ActionEvent event) {
                Parent root = null;
                try{
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PaymentsScreen.fxml"));
                        root = (Parent) fxmlLoader.load();
                        PaymentsScreenController paymentsScreenController = fxmlLoader.getController();
                        paymentsScreenController.initEmployee(username, profile);

                } catch (IOException ex) {
                        Logger.getLogger(SidebarController.class.getName()).log(Level.SEVERE, null, ex);
                }

                borderPane.setCenter(root);

        }

        public void setVariables(Employee x, Profile y) {
                profile=y;
                username=x;
        }
}

