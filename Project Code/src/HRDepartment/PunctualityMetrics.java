package HRDepartment;

import java.util.ArrayList;

public class PunctualityMetrics {
    public PunctualityMetrics(int daysOfWork, int missedDaysOfWork, int unreasonableMissedDaysOfWork) {
        this.daysOfWork = daysOfWork;
        this.missedDaysOfWork = missedDaysOfWork;
        this.unreasonableMissedDaysOfWork = unreasonableMissedDaysOfWork;
    }

    private int daysOfWork;

    public int getDaysOfWork() {
        return daysOfWork;
    }

    public void setDaysOfWork(int daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    public int getMissedDaysOfWork() {
        return missedDaysOfWork;
    }

    public void setMissedDaysOfWork(int missedDaysOfWork) {
        this.missedDaysOfWork = missedDaysOfWork;
    }

    public int getUnreasonableMissedDaysOfWork() {
        return unreasonableMissedDaysOfWork;
    }

    public void setUnreasonableMissedDaysOfWork(int unreasonableMissedDaysOfWork) {
        this.unreasonableMissedDaysOfWork = unreasonableMissedDaysOfWork;
    }

    private int missedDaysOfWork;
    private int unreasonableMissedDaysOfWork;

    private static PunctualityMetrics punctualityMetrics1 = new PunctualityMetrics(122, 39, 3);
    private static PunctualityMetrics punctualityMetrics2 = new PunctualityMetrics(122, 233, 3);
    private static PunctualityMetrics punctualityMetrics3 = new PunctualityMetrics(1434, 423, 100);

    public static PunctualityMetrics[] pucntualityArray = new PunctualityMetrics[]{punctualityMetrics1, punctualityMetrics2, punctualityMetrics3};


}
