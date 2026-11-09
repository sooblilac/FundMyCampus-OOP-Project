import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.List;

/* This is the main class for checking scholarship eligibility */

public class ScholarshipEligibility {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		// List<Scholarships> scholarships = new ArrayList<>();

		System.out.print("==== FUND MY CAMPUS ===");
		System.out.print("\nPlease enter the following information to check your scholarship eligibility!");
		System.out.print("\nMake sure that all the information you put is correct and valid.\n");

		System.out.print("\n\nEnter your name (Last, First, Middle Initial): ");
		String studentName = input.nextLine();

		System.out.print("Enter your GWA (General Weighted Average): ");
		double studentGWA = input.nextDouble();

		System.out.print("Enter your year level (1-5): ");
		int yearLevel = input.nextInt();
		input.nextLine(); // consume the newline character

		System.out.print("Enter your program of study: ");
		String programOfStudy = input.nextLine();

		System.out.print("Enter your annual family income: ");
		double annualFamilyIncome = input.nextDouble();

		System.out.print("Enter your disciplinary record (if any): ");
		input.nextLine(); // consume the newline character
		String disciplinaryRecord = input.nextLine();

		System.out.print("Enter your disability status (Y/N): ");
		char disabilityStatus = input.next().charAt(0);

		System.out.print("Enter your ethnic group (Y/N): ");
		char ethnicGroup = input.next().charAt(0);

		System.out.print("Is one of your parent an OFW? (Y/N): ");
		char parentStatus = input.next().charAt(0);

		Student s = new Student(studentName, studentGWA, yearLevel, programOfStudy, annualFamilyIncome, disciplinaryRecord, disabilityStatus, ethnicGroup, parentStatus);
		System.out.print(s.getStudentInformation());
		// This is for test run only!!

	}
}