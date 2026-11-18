import java.util.List;

public class ScholarshipData {

    // ==========================
    // DOST - JLSS
    // ==========================
    public static List<String> getJLSSRequirements() {
        return List.of(
            "Certificate of Good Moral Character",
            "Certificate of Good Health",
            "Certificate of Program of Study and Year Level",
            "Certificate of Residency",
            "Commitment to Return Service Form",
            "Signed Declaration Form",
            "Certified True Copy of Grades/TOR/TCG",
            "Recent Passport-size Photo",
            "Birth Certificate",
            "Proof of Parent/Guardian Income"
        );
    }

    // ==========================
    // DOST - SEI
    // ==========================
    public static List<String> getDOSTSEIRequirements() {
        return List.of(
            "Form A - Personal Information",
            "Form B - Household Information",
            "Form C - Certificate of Good Moral Character",
            "Form D - Certificate of Good Health",
            "Form E1/E2 - Academic Certification",
            "Form F - Certificate of Residency",
            "Form G - Parent Certification",
            "Form H - Scholarship Examination Award",
            "Form I - No Post-Secondary Units Certification",
            "Form J - Signed Declaration"
        );
    }

    // ==========================
    // EDSP 
    // ==========================
    public static List<String> getEDSP1Requirements() {
        return List.of(
            "Copy of Valid OFW Passport Bio/Info Page",
            "Valid School ID or Any Available Valid ID",
            "Birth Certificate or Baptismal Certificate",
            "Grade 12 Report Card (Form 138)",
            "Proof of DOST-SEI Qualifying Examination",
            "2x2 ID Picture with White Background",
            "Applicant Name Tag and Signature"
        );
    }

    public static List<String> getEDSP2Requirements() {
        return List.of(
            "Copy of Valid OFW Passport Bio/Info Page",
            "Valid School ID or Any Available Valid ID",
            "Birth Certificate or Baptismal Certificate",
            "Proof of Grades from Previous Academic Year",
            "Certificate of Grades (COG)",
            "Transcript of Records (TOR), if applicable",
            "Certification of Enrollment",
            "Proof of No Failing Grades",
            "2x2 ID Picture with White Background",
            "Applicant Name Tag and Signature"
        );
    }


    // ==========================
    // ODSP
    // ==========================
    public static List<String> getODSP1Requirements() {

        return getEDSP1Requirements();
    }

    public static List<String> getODSP2Requirements() {

        return getEDSP2Requirements();
    }

    // ==========================
    // CMWSP
    // ==========================
    public static List<String> getCMWSPRequirements() {

        return getEDSP1Requirements();
    }

    // ==========================
    // CHED
    // ==========================
    public static List<String> getCHEDRequirements() {

        return List.of(
            "Accomplished Online Application Form",
            "PSA Birth Certificate",
            "Certified True Copy of Form 138",
            "Income Tax Return or Proof of Income",
            "Certificate of Indigency (if applicable)",
            "PWD/Indigenous People Certification (if applicable)",
            "Certificate of Guardianship (if applicable)"
        );
    }

    // ==========================
    // TULONG DUNONG
    // ==========================
    public static List<String> getTulongDunongRequirements() {
        return List.of(
            "TDP-TES Application Form",
            "Certificate of Enrollment",
            "Certificate of Registration",
            "Certificate of Indigency"
        );
    }

    // ==========================
    // TES
    // ==========================
    public static List<String> getTESRequirements() {
        return List.of(
            "Certificate of Registration/Enrollment",
            "Certificate of Residency",
            "PWD ID (if applicable)"
        );
    }

    // ==========================
    // SM FOUNDATION
    // ==========================
    public static List<String> getSMRequirements() {
        return List.of(
            "Online Application Form",
            "Latest Income Tax Return",
            "Certificate of Indigency",
            "Grade 12 Report Card",
            "PSA Birth Certificate",
            "Recent 2x2 ID Picture",
            "Sketch of Residence to Nearest SM Mall"
        );
    }

    // ==========================
    // AYALA FOUNDATION
    // ==========================
    public static List<String> getAyalaRequirements() {

        return List.of(
            "Completed Scholarship Application Form",
            "Certificate of Enrollment",
            "Latest Copy of Grades",
            "Proof of Admission (for freshmen)",
            "Income Tax Return or Certificate of Indigency",
            "Recommendation Letter"
        );
    }

    // ==========================
    // MERCURY DRUG FOUNDATION
    // ==========================
    public static List<String> getMercuryRequirements() {

        return List.of(
            "BPMSP Application Form",
            "PSA Birth Certificate",
            "Certificate of Honors or Ranking",
            "Proof of Household Income"
        );
    }

    // ==========================
    // ABOITIZ FOUNDATION
    // ==========================
    public static List<String> getAboitizRequirements() {

        return List.of(
            "Student ID",
            "Certificate of Good Moral",
            "Transcript of Records",
            "Certificate of Enrollment",
            "Certificates of Leadership and Awards"
        );
    }

    // ==========================
    // GOKONGWEI SCHOLARSHIP
    // ==========================
    public static List<String> getGokongweiRequirements() {

        return List.of(
            "Report Card or Form 137",
            "University Admission Proof",
            "Certified True Copy of Grades",
            "Proof of Annual Family Income",
            "Certificate of Employment or ITR"
        );
    }

    // ==========================
    // MEGAWORLD
    // ==========================
    public static List<String> getMegaworldRequirements() {

        return List.of(
            "One-Month Payslip",
            "Barangay Certificate of Indigency",
            "Utility Bills",
            "Complete Copy of Grades",
            "Certificate of Enrollment",
            "Family Photograph"
        );
    }

    // ==========================
    // ELAP
    // ==========================
    public static List<String> getELAPRequirements() {

        return List.of(
            "Application Form",
            "2x2 ID Pictures",
            "Death Certificate",
            "Proof of Relationship to OFW",
            "Certificate of Enrollment",
            "OWWA Membership Proof",
            "Health Certificate",
            "Certificate of Good Moral Character"
        );
    }

    public static List<String> getDOSTPrograms() {

    return List.of(
        "BS Computer Science",
        "BS Information Technology",
        "BS Information Systems",
        "BS Software Engineering",
        "BS Civil Engineering",
        "BS Mechanical Engineering",
        "BS Electrical Engineering",
        "BS Electronics Engineering",
        "BS Biology",
        "BS Chemistry",
        "BS Biochemistry",
        "BS Physics",
        "BS Mathematics",
        "BS Statistics",
        "D Veterinary Medicine",
        "BS Pharmacy"
    );
}
}