import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.IllegalArgumentException;
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

		Student s = null;

		// Loop to ensure information is correctly captured
		while (s == null) {
			// Try-catch to handle runtime and exception errors
			try {
				System.out.print("\n\nEnter your name (Last, First, Middle Initial): ");
				String studentName = input.nextLine();

				System.out.print("Enter your year level (1-5): ");
				int yearLevel = input.nextInt();
				input.nextLine(); // consume the newline character

				//GWA Conversion for incoming 1st Year College Students
				if (yearLevel == 1) {
                    System.out.println("\n----------------------------------------");
                    System.out.println("        GWA GRADE CONVERSION GUIDE");
                    System.out.println("----------------------------------------");
                    System.out.println("   1.00  |   98  -  100[cite: 1]");
                    System.out.println("   1.25  |   94  -   97[cite: 1]");
                    System.out.println("   1.50  |   90  -   93[cite: 1]");
                    System.out.println("   1.75  |   88  -   89[cite: 1]");
                    System.out.println("   2.00  |   85  -   87[cite: 1]");
                    System.out.println("   2.25  |   83  -   84[cite: 1]");
                    System.out.println("   2.50  |   80  -   82[cite: 1]");
                    System.out.println("   2.75  |   78  -   79[cite: 1]");
                    System.out.println("   3.00  |   75  -   77[cite: 1]");
                    System.out.println("   5.00  |   Below 70 [cite: 1]");
                    System.out.println("----------------------------------------\n");
                }

                System.out.print("Enter your GWA (General Weighted Average): ");
                double studentGWA = input.nextDouble();
                input.nextLine(); // consume newline character

                System.out.print("Enter your program of study: ");
                String programOfStudy = input.nextLine();

                System.out.print("Enter your annual family income: ");
                double annualFamilyIncome = input.nextDouble();
                input.nextLine(); // consume newline character

                System.out.print("Enter your disciplinary record (if any): ");
                String disciplinaryRecord = input.nextLine();

                System.out.print("Enter your disability status (Y/N): ");
                char disabilityStatus = input.next().charAt(0);

                System.out.print("Enter your ethnic group (Y/N): ");
                char ethnicGroup = input.next().charAt(0);

                System.out.print("Is one of your parents an OFW? (Y/N): ");
                char parentStatus = input.next().charAt(0);
                input.nextLine(); // consume trailing newline

                // Instantiate Student object with complete parameters
                s = new Student(studentName, studentGWA, yearLevel, programOfStudy, annualFamilyIncome, 
                                disciplinaryRecord, disabilityStatus, ethnicGroup, parentStatus);

            } catch (InputMismatchException e) {
                System.out.println("\n[Error] Invalid input type. Please try again with proper formats.\n");
                input.nextLine(); // clear invalid scanner token
            } catch (IllegalArgumentException e) {
                System.out.println("\n[Validation Error] " + e.getMessage() + "\nPlease try again.\n");
            }
        }

	}
		
}