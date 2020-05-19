package ProfileFeatures;
import Imaage;
import MonthlyReview;
import User;

import java.util.Date;

public class Profile {
    private String name;
    private String surname;
    private String position;
    private long salary;
    private ArrayList< MonthlyReview> monthlyReviews = new ArrayList< MonthlyReview>();
    private Date startDate;
    private Image photo = new ImageIcon;
    private User user;

    public Profile returnInfo(Profile x){
        return x;
    }
}
