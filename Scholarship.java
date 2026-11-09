import java.util.ArrayList;
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

    public List<String> getQualifications(Student s){
        List<String> qualifications = new ArrayList<>();

        qualifications.add(String.format("GWA of %.2f meets the required %.2f or better", s.getStudentGWA(), minGWA));
        qualifications.add(String.format("Household income of PHP %,.2f is within the PHP %,.2f limit",
                s.getAnnualFamilyIncome(), maxIncome));
        return qualifications;
    }

    public boolean evaluateEligibility(Student s) {
        return s.getStudentGWA() <= minGWA && s.getAnnualFamilyIncome() <= maxIncome;
    }

}