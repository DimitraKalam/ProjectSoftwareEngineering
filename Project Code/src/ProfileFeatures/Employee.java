package ProfileFeatures;

public class Employee {
    private String name;
    private String surname;
    private enum department {
        none,
        HR,
        Logistics,
        TechnicalSupport,
        CostumerSupport
    }
    private department position;

public boolean belongsToDepartment(department isthismyposition){
        if(this.position==isthismyposition)
        { return true;}
        return false;

}

    public String getName() {
        return name;
    }
}
