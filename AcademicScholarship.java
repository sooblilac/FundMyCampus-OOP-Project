import java.util.List;

public class AcademicScholarship extends Scholarship{
	private int maxYearLevel;

	public AcademicScholarship(String studentName, double minGWA, double maxIncome, int maxYearLevel, List<String>requirements){
		super(studentName, minGWA, maxIncome, requirements);
		this.maxYearLevel = maxYearLevel;
	}

	@Override

	public boolean evaluateEligibility(Student s){
		return super.evaluateEligibility(s) && 
		s.getYearLevel() <= maxYearLevel && 
		s.getDisciplinaryRecord().equalsIgnoreCase("None");
	}

	@Override

	public List<String> getQualifications(Student s){
		List<String> qualifications = super.getQualifications(s);
		qualifications.add("Year level " + s.getYearLevel() + " is within the allowed year " + maxYearLevel);
		qualifications.add("No disciplinary record.");
		return qualifications;
	}

	/* @Override
	public void displayRequirements(){
		System.out.print("[Academic Scholarship]");
		super.displayRequirements();
	} */
}