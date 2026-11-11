import java.util.List;
/* i have no idea pa on how i will work with these three conditions,
    if u have, pls do! #nababaliwNaMe */
public class SocioeconomicScholarship extends Scholarship{
	public static final int PersonWithDisability = 1;
	public static final int EthnicGroup = 2;
	public static final int OFWDependent = 3;

	private int [] acceptedCategories;

	public SocioeconomicScholarship(String scholarshipName, double minGWA, double maxIncome, List<String>requirements, int[] acceptedCategories) {
        super(scholarshipName, minGWA, maxIncome, requirements);
        this.acceptedCategories = new int[acceptedCategories.length];

        for (int i = 0; i < acceptedCategories.length; i++) {
        	this.acceptedCategories[i] = acceptedCategories[i];
        }
    }

    public boolean checkCategory(Student s) {
    	for (int category : acceptedCategories) {
    		if (category == PersonWithDisability && s.getDisabilityStatus() == 'Y') {
    			return true;
    		}

    		else if (category == EthnicGroup && s.getEthnicGroup() == 'Y') {
    			return true;
    		}

    		else if (category == OFWDependent && s.getParentStatus() == 'Y') {
    			return true;
    		}
    	}

    	return false;
    }

    @Override
    public boolean evaluateEligibility(Student s) {

        return super.evaluateEligibility(s) && checkCategory(s);
    }
}