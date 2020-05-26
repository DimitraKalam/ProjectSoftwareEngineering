package Alex.ProfileFeatures;

public class Employee {
    private String  fullname;

    public department getPosition() {
        return position;
    }


    public enum department {
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
    public void setPosition(department x){
        this.position=x;
    }
    public String getName() {
        return fullname;
    }

    public void setName(String name) {
        this.fullname=name;
    }
}