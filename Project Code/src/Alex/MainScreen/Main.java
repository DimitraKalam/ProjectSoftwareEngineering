package Alex.MainScreen;
import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Side;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Calendar;
import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Sidebar.fxml"));
            primaryStage.setTitle("COMCOP");
        primaryStage.setScene(new Scene(root, 850, 600));
        primaryStage.show();
        SidebarController.initEmployee(employeeLogistics());
        SidebarController.initProfile(logisticsProfile(employeeLogistics()));



    }
    public static Employee employeeLogistics(){
        //Logistics Employee initialization
        Employee logistics =new Employee();
        logistics.setName("Alex Jones");
        logistics.setPosition(Employee.department.Logistics);
       return logistics;
    }
    public static Profile logisticsProfile(Employee logistics){
        Profile logisticsProfile= new Profile();
        logisticsProfile.setUser(logistics);
        Calendar start = new Calendar() {
            protected void computeTime() {

            }

            protected void computeFields() {

            }

            public void add(int field, int amount) {

            }

            public void roll(int field, boolean up) {

            }

            public int getMinimum(int field) {
                return 0;
            }

            public int getMaximum(int field) {
                return 0;
            }

            public int getGreatestMinimum(int field) {
                return 0;
            }

            public int getLeastMaximum(int field) {
                return 0;
            }
        };
        start.set(2012,7,26);

        logisticsProfile.setDate(start);
        logisticsProfile.setSalary(2000);
        return logisticsProfile;
    }

    public static void main(String[] args) {
        launch(args);
}}
