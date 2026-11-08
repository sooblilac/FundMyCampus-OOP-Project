import java.util.List;

public class Scholarship {
    private String scholarshipName;
    private double minGWA;
    private double maxIncome;
    private List<String> scholarshipRequirements;

    public Scholarship(String scholarshipName, double minGWA, double maxIncome, List<String> scholarshipRequirements) {
        this.scholarshipName = scholarshipName;
        this.minGWA = minGWA;
        this.maxIncome = maxIncome;
        this.scholarshipRequirements = scholarshipRequirements;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public List<String>getScholarshipRequirements(){
        return List.copyOf(scholarshipRequirements);
    }

    public boolean isEligible(Student student) {
        return student.getStudentGWA() <= minGWA && student.getAnnualFamilyIncome() <= maxIncome;
    }

}