package patients;

public class Arms {
    private int numberOfArms;
    private String sideWithProblem;
    private String diagnosis;

    public Arms(int numberOfArms, String sideWithProblem, String diagnosis) {
        this.numberOfArms = numberOfArms;
        this.sideWithProblem = sideWithProblem;
        this.diagnosis = diagnosis;
    }

    public int getNumberOfArms() {
        return numberOfArms;
    }

    public void setNumberOfArms(int numberOfArms) {
        this.numberOfArms = numberOfArms;
    }

    public String getSideWithProblem() {
        return sideWithProblem;
    }

    public void setSideWithProblem(String sideWithProblem) {
        this.sideWithProblem = sideWithProblem;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
