import java.util.ArrayList;
import java.util.List;

public class AcademicScholarship extends Scholarship {

    private double requiredGWA;
    private int minYearLevel;
    private int maxYearLevel;
    private List<String> eligiblePrograms;

    public AcademicScholarship(
            String scholarshipName,
            double requiredGWA,
            int minYearLevel,
            int maxYearLevel,
            List<String> eligiblePrograms,
            List<String> requirements) {

        super(scholarshipName, requirements);

        setRequiredGWA(requiredGWA);
        setMinYearLevel(minYearLevel);
        setMaxYearLevel(maxYearLevel);

        validateYearLevelRange();

        this.eligiblePrograms = new ArrayList<>(eligiblePrograms);
    }

   // setters
    private void setRequiredGWA(double requiredGWA) {
        if(requiredGWA < 1.0 || requiredGWA > 5.0) {
            throw new IllegalArgumentException("Required GWA must be between 1.0 and 5.0.");
        }
        this.requiredGWA = requiredGWA;
    }

    private void setMinYearLevel(int minYearLevel) {
        if(minYearLevel < 1 || minYearLevel > 5) {
            throw new IllegalArgumentException("Minimum year level must be between 1 and 5.");
        }
        this.minYearLevel = minYearLevel;
    }

    private void setMaxYearLevel(int maxYearLevel) {
        if(maxYearLevel < 1 || maxYearLevel > 5) {
            throw new IllegalArgumentException("Maximum year level must be between 1 and 5.");
        }
        this.maxYearLevel = maxYearLevel;
    }

    private void validateYearLevelRange() {
        if(minYearLevel > maxYearLevel) {
            throw new IllegalArgumentException("Minimum year level cannot be greater than maximum year level.");
        }
    }

    public double getRequiredGWA() {
        return requiredGWA;
    }

    public int getMinYearLevel() {
        return minYearLevel;
    }

    public int getMaxYearLevel() {
        return maxYearLevel;
    }

    public List<String> getEligiblePrograms() {
        return new ArrayList<>(eligiblePrograms);
    }

    private boolean isEligibleProgram(String studentProgram) {
        for(String program : eligiblePrograms) {
            if(program.equalsIgnoreCase(studentProgram.trim())) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean evaluateEligibility(
            Student s) {

        return s.getStudentGWA()
                    <= requiredGWA
                && s.getYearLevel()
                    >= minYearLevel
                && s.getYearLevel()
                    <= maxYearLevel
                && s.getDisciplinaryRecord()
                    .equalsIgnoreCase("NONE")
                && isEligibleProgram(
                    s.getProgramOfStudy());
    }


    @Override
    public List<String> getQualifications(Student s) {
        List<String> qualifications = new ArrayList<>();

        if(s.getStudentGWA()<= requiredGWA) {
            qualifications.add("GWA requirement met.");
        }

        if(s.getYearLevel() >= minYearLevel && s.getYearLevel() <= maxYearLevel) {
            qualifications.add("Incoming year level requirement met.");
        }

        if(s.getDisciplinaryRecord().equalsIgnoreCase("NONE")) {
            qualifications.add("No disciplinary record.");
        }

        if(isEligibleProgram(s.getProgramOfStudy())) {
            qualifications.add("Program of study is eligible.");
        }
        return qualifications;
    }
}