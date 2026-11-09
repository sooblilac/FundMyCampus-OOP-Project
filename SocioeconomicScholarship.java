import java.util.List;

public class SocioeconomicScholarship extends Scholarship{
	public static final int PersonWithDisability = 1;
	public static final int EthnicGroup = 2;
	public static final int OFWDependent = 3;

	private int [] acceptedCategories;

	public SocioeconomicScholarship(String scholarshipName, double minGWA, double maxIncome, List<String>requirements, int[] acceptedCategories){
        super(scholarshipName, minGWA, maxIncome, requirements);
        this.acceptedCategories = acceptedCategories;
    }

}