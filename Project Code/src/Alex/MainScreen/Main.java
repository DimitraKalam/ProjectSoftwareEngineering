package Alex.MainScreen;
import Alex.ProfileFeatures.Employee;
import Alex.ProfileFeatures.Profile;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static Alex.ProfileFeatures.Employee.department.Logistics;

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
        Employee logistics =new Employee("Alex Jones", Logistics);

       return logistics;
    }
    public Profile logisticsProfile(Employee logistics){
        Profile logisticsProfile= new Profile();
        logisticsProfile.setUser(logistics);
       // LocalDate date= LocalDate.parse("Mon Feb 05 2017");
        //logisticsProfile.setDate(date);
        logisticsProfile.setSalary(2000);
        logisticsProfile.setPosition("Logistics Intern");
        Image icon = null;
        Image image = null;
        try {
            image = new Image(new FileInputStream("Project Code/src/Alex/ProfileScreen/image2.jpg"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        logisticsProfile.setPhoto(image);
        return logisticsProfile;
    }


    public static void main(String[] args) {
        launch(args);
}}
