import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ScholarshipEligibility {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("         FUND MY CAMPUS");
        System.out.println("====================================");
        System.out.println("Check your scholarship eligibility! ヾ(≧▽≦*)o");
        System.out.println();

        Student s = null;

        while (s == null) {

            try {

                System.out.print("Enter your name: ");
                String studentName = input.nextLine();

                System.out.print("Enter your GWA: ");
                double studentGWA = input.nextDouble();

                System.out.print("Your year level next school year: ");
                int yearLevel = input.nextInt();
                input.nextLine();

                System.out.print("Enter your Program: ");
                String programOfStudy = input.nextLine();

                System.out.print("Enter your Annual Household Income: ");
                double annualFamilyIncome = input.nextDouble();
                input.nextLine();

                System.out.print("Enter your Disciplinary Record (NONE if none): ");
                String disciplinaryRecord = input.nextLine();

                System.out.print("Are you disabled? (Y/N): ");
                char disabilityStatus = Character.toUpperCase(input.next().charAt(0));

                System.out.print("Are you part of an Indigenous Group? (Y/N): ");
                char ethnicGroup = Character.toUpperCase(input.next().charAt(0));

                System.out.print("Is one of your parents an OFW? (Y/N): ");
                char parentStatus = Character.toUpperCase(input.next().charAt(0));

                input.nextLine();

                s = new Student(
                        studentName,
                        studentGWA,
                        yearLevel,
                        programOfStudy,
                        annualFamilyIncome,
                        disciplinaryRecord,
                        disabilityStatus,
                        ethnicGroup,
                        parentStatus
                );

            } catch (InputMismatchException e) {

                System.out.println("\nInvalid input. Please try again.\n");
                input.nextLine();

            } catch (IllegalArgumentException e) {

                System.out.println("\n" + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

       List<Scholarship> scholarships = new ArrayList<>();

       // Academic Scholarships
    
       scholarships.add(
        new AcademicScholarship(
                "DOST-SEI",
                2.50,
                1,
                1,
                ScholarshipData.getDOSTPrograms(),
                ScholarshipData.getDOSTSEIRequirements()
            )
        );

       scholarships.add(
           new AcademicScholarship(
               "DOST-JLSS",
               2.50,
               3,
               4,
               ScholarshipData.getDOSTPrograms(),
               ScholarshipData.getJLSSRequirements()
           )
       );


       scholarships.add(
            new AcademicScholarship(
                "SM Foundation",
                1.50,
                1,
                1,
                ScholarshipData.getSMPrograms(),
                ScholarshipData.getSMRequirements()
            )
        );
       // OFW Scholarships

       scholarships.add(
            new OFWScholarship(
                "EDSP Category 1",
                2.50,
                1,
                1,
                ScholarshipData.getEDSP1Requirements()
            )
        );

       scholarships.add(
            new OFWScholarship(
                "EDSP Category 2",
                2.50,
                2,
                5,
                ScholarshipData.getEDSP2Requirements()
            )
        );

       scholarships.add(
            new OFWScholarship(
                "ODSP Category 1",
                2.75,
                1,
                1,
                ScholarshipData.getODSP1Requirements()
            )
        );

        scholarships.add(
            new OFWScholarship(
                "ODSP Category 2",
                3.00,
                2,
                5,
                ScholarshipData.getODSP2Requirements()
            )
        );

       scholarships.add(
           new OFWScholarship(
               "CMWSP",
               2.50,
               1,
               1,
               ScholarshipData.getCMWSPRequirements()
           )
       );

       // Socioeconomic Scholarships

       scholarships.add(
           new SocioeconomicScholarship(
               "CHED Scholarship",
               1.50,
               1,
               1,
               400000,
               ScholarshipData.getCHEDRequirements()
           )
       );

       scholarships.add(
           new SocioeconomicScholarship(
               "Tulong Dunong",
               3.00,
               1,
               4,
               400000,
               ScholarshipData.getTulongDunongRequirements()
           )
       );

       scholarships.add(
           new SocioeconomicScholarship(
               "TES",
               3.00,
               1, 
               4,
               300000,
               ScholarshipData.getTESRequirements()
           )
       );

       scholarships.add(
           new SocioeconomicScholarship(
               "Ayala Foundation",
               2.25,
               1,
               3,
               350000,
               ScholarshipData.getAyalaRequirements()
           )
       );

       scholarships.add(
           new SocioeconomicScholarship(
               "Megaworld Scholarship",
               2.25,
               1,
               3,
               350000,
               ScholarshipData.getMegaworldRequirements()
           )
       );

        /*
         * EVALUATE ELIGIBILITY
         */

        List<Scholarship> eligibleScholarships = new ArrayList<>();

        for (Scholarship scholarship : scholarships) {
            if (scholarship.evaluateEligibility(s)) {
                eligibleScholarships.add(scholarship);
            }
        }


        System.out.println("\n====================================");
        System.out.println("Hello, " + s.getStudentName() + "!");

        if (eligibleScholarships.isEmpty()) {
            System.out.println("\nSorry, no scholarships matched your profile.");
            input.close();
            return;
        }

        System.out.println("\nYou are eligible for the following scholarship programs:");
        for (int i = 0;i < eligibleScholarships.size();i++) {
            System.out.println((i + 1) + ". "+ eligibleScholarships.get(i).getScholarshipName());
        }


        int choice;
        while (true) {
            try {
                System.out.print("\nChoose which scholarship requirements you want to check (1-"+ eligibleScholarships.size() + "). Enter 0 to exit: ");
                choice = input.nextInt();
                input.nextLine();

                 if (choice == 0) {
                    System.out.println("\nExiting program. Thank you for using FundMyCampus! Good luck!");
                    break;
                }

                if (choice < 1 || choice > eligibleScholarships.size()) {
                    System.out.println("Invalid choice.");
                    continue;
                }

                Scholarship selected = eligibleScholarships.get(choice - 1);


                System.out.println("\n====================================");
                System.out.println("You chose: " + selected.getScholarshipName());
                System.out.println("\nRequirements:");

                List<String> requirements = selected.getScholarshipRequirements();

                for (int i = 0; i < requirements.size(); i++) {
                    System.out.println((i + 1) + ". " + requirements.get(i));
                }


            } 
            catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                input.nextLine();
            }
        }


        input.close();
    }
}