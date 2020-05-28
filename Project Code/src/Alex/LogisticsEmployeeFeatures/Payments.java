package Alex.LogisticsEmployeeFeatures;

public class Payments {



    public enum State{Done, Pending};
private State state;
private String date;
private String counterparty;
private int amount;
private String name;


    public Payments(State katastasi,  int ami, String dates, String counterparty, String Name) {
        this.state=katastasi;
        this.amount=ami;
        this.date=dates;
        this.counterparty=counterparty;
        this.name=Name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCounterparty() {
        return counterparty;
    }

    public void setCounterparty(String counterparty) {
        this.counterparty = counterparty;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public Payments returnPayment(){return null;}
public Payments searchPayment(){return null;}
public void savePayment(){}
}
