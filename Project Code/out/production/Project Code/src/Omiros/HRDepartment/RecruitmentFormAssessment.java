package Omiros.HRDepartment;

public class RecruitmentFormAssessment {
    public RecruitmentFormAssessment(double grade, String comments) {
        this.grade = grade;
        this.comments = comments;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    private double grade;
    private String comments;
}
