package CustomerDepartment;

import javafx.scene.control.ComboBox;

public class Complain {

    private String name;
    private String category;
    private String uniqueCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public Complain(String name, String category, String uniqueCode) {
        this.name = name;
        this.category = category;
        this.uniqueCode = uniqueCode;
    }

    public static Complain complain1 = new Complain("Complain Name ", "Category", "fa342-3423ed");
    public static Complain complain2 = new Complain("Not enough space on 342-dccs components ", "Dummy Category", "fa342-3423ed");

}
