package Alex.ProfileFeatures;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Profile {
    private String fullname;
    private Employee.department position;
    private long salary;
    //private ArrayList< MonthlyReview> monthlyReviews = new ArrayList< MonthlyReview>();
    private Calendar startDate;
    private ImageIcon photo = new ImageIcon();
    private Employee user;
    private String contactInfo;

    public Profile returnInfo(Profile x){
        return x;
    }

    public void setUser(Employee x) {
        this.user=x;
        this.fullname=x.getName();
        this.position=x.getPosition();

    }

    public void setDate(Calendar y) {
        this.startDate=y;
    }

    public void setSalary(int i) {
        this.salary=i;
    }

    public String getName() {
        return fullname;
    }

    public String getContact() {
        return contactInfo;
    }

    public Employee.department getPosition() {
        return position;
    }

    /*public CharSequence getDate() {
        String strdate = null;

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        if (this.startDate != null) {
            strdate = sdf.format(startDate.getTime());

        }
        return strdate;
    }*/
}
