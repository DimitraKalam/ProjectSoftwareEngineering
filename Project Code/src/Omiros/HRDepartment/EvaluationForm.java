package Omiros.HRDepartment;

public class EvaluationForm {
    public EmployAssessmentFeatures getEmployAssessmentFeatures() {
        return employAssessmentFeatures;
    }

    public void setEmployAssessmentFeatures(EmployAssessmentFeatures employAssessmentFeatures) {
        this.employAssessmentFeatures = employAssessmentFeatures;
    }

    public PunctualityMetrics getPunctualityMetrics() {
        return punctualityMetrics;
    }

    public void setPunctualityMetrics(PunctualityMetrics punctualityMetrics) {
        this.punctualityMetrics = punctualityMetrics;
    }

    public EvaluationForm(EmployAssessmentFeatures employAssessmentFeatures, PunctualityMetrics punctualityMetrics) {
        this.employAssessmentFeatures = employAssessmentFeatures;
        this.punctualityMetrics = punctualityMetrics;
    }

    private EmployAssessmentFeatures employAssessmentFeatures;
    private PunctualityMetrics punctualityMetrics;
}
