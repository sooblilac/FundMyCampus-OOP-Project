import java.util.ArrayList;
import java.util.List;

// parent class of academic, socioeconomic, and ofw scholarships

public abstract class Scholarship {

    private String scholarshipName;
    private List<String> scholarshipRequirements;

    // Constructor
    public Scholarship(String scholarshipName, List<String> scholarshipRequirements) {
        setScholarshipName(scholarshipName);
        setScholarshipRequirements(scholarshipRequirements);
    }

    //setters

    public void setScholarshipName(String scholarshipName) {
        if (scholarshipName == null || scholarshipName.isBlank()) {
            throw new IllegalArgumentException("Scholarship name cannot be blank.");
        }
        this.scholarshipName = scholarshipName.trim();
    }

    public void setScholarshipRequirements(
            List<String> scholarshipRequirements) {

        if (scholarshipRequirements == null || scholarshipRequirements.isEmpty()) {
            throw new IllegalArgumentException("Requirements list cannot be empty.");
        }
        this.scholarshipRequirements =
                new ArrayList<>(scholarshipRequirements);
    }

    //getters

    public String getScholarshipName() {
        return scholarshipName;
    }

    public List<String> getScholarshipRequirements() {
        return new ArrayList<>(scholarshipRequirements);
    }


    public void displayRequirements() {

        System.out.println("\nRequirements for " + scholarshipName + ":");
        for(int i = 0; i < scholarshipRequirements.size(); i++) {
            System.out.println((i + 1) + ". " + scholarshipRequirements.get(i));
        }
    }

    public abstract boolean evaluateEligibility(
            Student s);

    public abstract List<String>
        getQualifications(Student s);

    @Override
    public String toString() {
        return scholarshipName;
    }
}