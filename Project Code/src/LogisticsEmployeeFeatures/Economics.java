package LogisticsEmployeeFeatures;

public class Economics {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCounterParty() {
        return counterParty;
    }

    public void setCounterParty(String counterParty) {
        this.counterParty = counterParty;
    }

    public boolean isRecurring() {
        return recurring;
    }

    public void setRecurring(boolean recurring) {
        this.recurring = recurring;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type{
        Income,
        Expenses
    }
    private Type type;
    public enum Source {
        Subscriptions,
                Sales,
                Salaries,
        Payments
    }
    private Source source;
    private int amount;
    private String name;
    private String counterParty;
    private boolean recurring;
    private String date;

    public Economics(Type typex ,Source source1, int poso, String onoma, String antisimvallomenos , boolean rec, String dates){
        this.type=typex;
        this.source=source1;
        this.amount=poso;
        this.name=onoma;
        this.counterParty=antisimvallomenos;
        this.recurring=rec;
        this.date=dates;
    }
public Economics returnRegistration(){return null;}
public void saveRegistration(){}
public void deleteRegistration(){}
public int returnProfit(){return 0;}
}
