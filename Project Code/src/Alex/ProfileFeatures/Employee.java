package Alex.ProfileFeatures;

public class Employee {
    private String  fullname;

    public department getDepartment() {
        return dpt;
    }


    public enum department {
        none,
        HR,
        Logistics,
        TechnicalSupport,
        CostumerSupport
    }
    private department dpt;

    public boolean belongsToDepartment(department isthismyposition){
        if(this.dpt==isthismyposition)
        { return true;}
        return false;

}
    public void setDepartment(department x){
        this.dpt=x;
    }
    public String getName() {
        return fullname;
    }

    public void setName(String name) {
        this.fullname=name;
    }
}