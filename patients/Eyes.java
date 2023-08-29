package patients;

public class Eyes {
    private String eyeColor;
    private String diagnosis;

    public Eyes(String eyeColor, String diagnosis) {
        this.eyeColor = eyeColor;
        this.diagnosis = diagnosis;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
