import java.util.ArrayList;
import java.util.List;

public class SocioeconomicScholarship
        extends Scholarship {

    private double maxIncome;

    public SocioeconomicScholarship(
            String scholarshipName,
            double maxIncome,
            List<String> requirements) {

        super(scholarshipName, requirements);
        this.maxIncome = maxIncome;
    }

    @Override
    public boolean evaluateEligibility(Student s) {

        return s.getAnnualFamilyIncome() <= maxIncome;
    }

    @Override
    public List<String> getQualifications(Student s) {

        List<String> qualifications = new ArrayList<>();

        if(s.getAnnualFamilyIncome() <= maxIncome) {
            qualifications.add("Household income falls within the scholarship limit.");
        }

        if(s.getDisabilityStatus() == 'Y') {
            qualifications.add("Applicant is a Person with Disability (PWD).");
        }

        if(s.getEthnicGroup() == 'Y') {
            qualifications.add("Applicant belongs to an Indigenous People (IP) group.");
        }
        return qualifications;
    }
}