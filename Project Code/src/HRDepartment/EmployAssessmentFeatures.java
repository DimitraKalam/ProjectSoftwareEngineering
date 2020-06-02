package HRDepartment;

public class EmployAssessmentFeatures {
    private int daysOfWork;
    private int completeProjects;
    private int failedProjects;

    public int getDaysOfWork() {
        return daysOfWork;
    }

    public void setDaysOfWork(int daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    public int getCompleteProjects() {
        return completeProjects;
    }

    public void setCompleteProjects(int completeProjects) {
        this.completeProjects = completeProjects;
    }

    public int getFailedProjects() {
        return failedProjects;
    }

    public void setFailedProjects(int failedProjects) {
        this.failedProjects = failedProjects;
    }

    public String getGeneralComments() {
        return generalComments;
    }

    public void setGeneralComments(String generalComments) {
        this.generalComments = generalComments;
    }

    public double getProjectAssessmentGrade() {
        return projectAssessmentGrade;
    }

    public void setProjectAssessmentGrade(double projectAssessmentGrade) {
        this.projectAssessmentGrade = projectAssessmentGrade;
    }

    private String generalComments;
    private double projectAssessmentGrade;

    public EmployAssessmentFeatures(int daysOfWork, int completeProjects, int failedProjects, String generalComments, double projectAssessmentGrade) {
        this.daysOfWork = daysOfWork;
        this.completeProjects = completeProjects;
        this.failedProjects = failedProjects;
        this.generalComments = generalComments;
        this.projectAssessmentGrade = projectAssessmentGrade;
    }
}
