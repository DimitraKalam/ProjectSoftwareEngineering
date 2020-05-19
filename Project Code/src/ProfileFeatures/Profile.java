package ProfileFeatures;

import javax.swing.*;
import java.util.Date;

public class Profile {
    private String name;
    private String surname;
    private String position;
    private long salary;
    //private ArrayList< MonthlyReview> monthlyReviews = new ArrayList< MonthlyReview>();
    private Date startDate;
    private ImageIcon photo = new ImageIcon();
    private Employee user;

    public Profile returnInfo(Profile x){
        return x;
    }
}
