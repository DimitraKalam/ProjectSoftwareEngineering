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

    private static EmployAssessmentFeatures employAssessmentFeatures1 = new EmployAssessmentFeatures(120,4,0,"Some Comments...", 3.0);
    private static EmployAssessmentFeatures employAssessmentFeatures2 = new EmployAssessmentFeatures(1443,300,10,"Some Comments...", 4.3);
    private static EmployAssessmentFeatures employAssessmentFeatures3 = new EmployAssessmentFeatures(120,4,0,"Some Comments...", 3.0);

    public static EmployAssessmentFeatures[] employAssessmentFeaturesArray = new EmployAssessmentFeatures[]{employAssessmentFeatures1, employAssessmentFeatures2,employAssessmentFeatures3};

}
