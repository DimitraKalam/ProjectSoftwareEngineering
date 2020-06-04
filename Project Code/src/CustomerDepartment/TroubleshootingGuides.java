package CustomerDepartment;

import javafx.beans.property.SimpleStringProperty;

public class TroubleshootingGuides {
    private SimpleStringProperty name;
    private SimpleStringProperty category;

    public TroubleshootingGuides(String name, String category) {
        this.name = new SimpleStringProperty(name);
        this.category = new SimpleStringProperty(category);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getCategory() {
        return category.get();
    }

    public SimpleStringProperty categoryProperty() {
        return category;
    }

    public void setCategory(String category) {
        this.category.set(category);
    }
}
