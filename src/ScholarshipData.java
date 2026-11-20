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
            "Certificate of True Copy Grades",
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

    // ==========================
    // DOST PROGRAMS
    // ==========================

    public static List<String> getDOSTPrograms() {

        return List.of(
            "Bachelor in Elementary Mathematics and Science Education",
            "Bachelor in Mathematics Education",
            "Bachelor in Science Education (with specialization in Biology, Chemistry, and Physics",
            "Bachelor in Technology and Livelihood Education with specialization in Information and Communications Technology",
            "Bachelor of Elementary Education in Mathematics",
            "Bachelor of Elementary Education in Science and Health",
            "Bachelor of Library and Information Science",
            "Bachelor of Sports Science",
            "BS Aeronautical Engineering",
            "BS Aerospace Engineering",
            "BS Agribusiness",
            "BS Agribusiness Economics",
            "BS Agribusiness Management",
            "BS Agribusiness Management and Entrepreneurship",
            "BS Agricultural and Applied Economics",
            "BS Agricultural and Biosystems Engineering",
            "BS Agricultural Biotechnology",
            "BS Agricultural Chemistry",
            "BS Agricultural Economics",
            "BS Agricultural Education",
            "BS Agricultural Engineering",
            "BS Agricultural Technology",
            "BS Agriculture",
            "BS Agroforestry",
            "BS Animal Husbandry",
            "BS Animal Science",
            "BS Applied Mathematics",
            "BS Applied Mathematics major in Mathematical Finance",
            "BS Applied Physics",
            "BS Applied Physics with Applied Computer System",
            "BS Applied Physics with Materials Science and Engineering",
            "BS Applied Statistics",
            "BS Architecture",
            "BS Artificial Intelligence",
            "BS Astronomy",
            "BS Basic Medical Sciences",
            "BS Biology",
            "BS Biology for Teachers",
            "BS Biomedical Engineering",
            "BS Biotechnology",
            "BS Ceramics Engineering",
            "BS Chemical Engineering",
            "BS Chemistry",
            "BS Chemistry for Teachers",
            "BS Chemistry with Applied Computer Systems",
            "BS Chemistry with Materials Science and Engineering",
            "BS Civil Engineering",
            "BS Clothing Technology",
            "BS Community Nutrition",
            "BS Computer Engineering",
            "BS Computer Science",
            "BS Cybersecurity",
            "BS Data Science",
            "BS Data Science and Analytics",
            "BS Development Communication major in Science Communication",
            "BS Electrical Engineering",
            "BS Electronics and Communications Engineering",
            "BS Electronics Engineering",
            "BS Energy Systems Management",
            "BS Environmental and Sanitary Engineering",
            "BS Environmental Engineering",
            "BS Environmental Science",
            "BS Fine Arts Major in Industrial Design",
            "BS Fisheries",
            "BS Fisheries and Aquatic Sciences",
            "BS Food Science and Technology", 
            "BS Food Technology",
            "BS Forestry",
            "BS Geodetic Engineering",
            "BS Geography",
            "BS Geology",
            "BS Geothermal Engineering ",
            "BS Health Sciences",
            "BS Human Biology",
            "BS Industrial Design", 
            "BS Industrial Engineering",
            "BS Industrial Management Engineering-Information Technology",
            "BS Industrial Pharmacy",
            "BS Information and Communications Technology",
            "BS Information System",
            "BS Information Technology",
            "BS Information Technology Systems",
            "BS Instrumentation and Control Engineering",
            "BS Life Sciences",
            "BS Management Information Systems",
            "BS Manufacturing Engineering",
            "BS Manufacturing Engineering-Management-Biomedical Engineering",
            "BS Manufacturing Engineering-Management-Mechatronics and Robotics",
            "BS Marine Biology",
            "BS Marine Science",
            "BS Materials Engineering",
            "BS Mathematics",
            "BS Mathematics and Science Teaching",
            "BS Mathematics for Teachers",
            "BS Mechanical Engineering",
            "BS Mechatronics Engineering",
            "BS Medical Laboratory Science",
            "BS Medical Technology",
            "BS Metallurgical Engineering",
            "BS Meteorology",
            "BS Microbiology",
            "BS Mining Engineering",
            "BS Molecular Biology and Biotechnology",
            "BS Naval Architecture and Marine Engineering",
            "BS Nutrition",
            "BS Nutrition and Dietetics",
            "BS Packaging Engineering",
            "BS Petroleum Engineering",
            "BS Pharmaceutical Sciences",
            "BS Pharmacy (4-year program)",
            "BS Pharmacy major in Clinical Pharmacy (5-year program)",
            "BS Physics",
            "BS Physics for Teachers",
            "BS Prosthetics and Orthotics",
            "BS Psychology",
            "BS Public Health",
            "BS Railway Engineering and Management",
            "BS Speech Pathology",
            "BS Statistics",
            "BS Transportation Engineering",
            "BSE Biological Sciences",
            "BSE Biology",
            "BSE Biology-Chemistry",
            "BSE Chemistry",
            "BSE General Sciences",
            "BSE Mathematics",
            "BSE Physical Sciences",
            "BSE Physics",
            "BSE Physics-Chemistry",
            "BSE Physics-Mathematics",
            "BSE Science", 
            "Doctor of Veterinary Medicine",
            "BS Software Engineering",
            "BS Biochemistry"
        );
    }

    // ==========================
    // TULONG DUNONG PROGRAMS
    // ==========================


    public static List<String> getTulongDunongPrograms() {

        return List.of(
            "BS Physics/Applied Physics",
            "BS Biochemistry",
            "BS Biology",
            "BS Botany",
            "BS Chemistry",
            "Meteorology",
            "Doctor of Dental Medicine",
            "BS Criminology",
            "BS Forensic Sciences",
            "BS Industrial Security Administration",
            "BS Geology",
            "BS Human Biology",
            "BS Molecular Biology and Biotechnology",
            "BS Marine Biology",
            "BS Marine Science",
            "BS Environmental Science",
            "Disaster Risk Management/Climate Change",
            "BS Zoology",
            "BS Civil Technology",
            "BS Mechatronics Engineering Technology",
            "BS Electronics Technology",
            "BS Mechanical Technology",
            "BS Electrical Technology",
            "BS Industrial Technology",
            "BS Engineering Technology",
            "Cyber Security",
            "BS Information Technology",
            "BS Computer Science",
            "BS Information System",
            "BS Library and Information Science",
            "BS Entertainment and Multimedia Computing",
            "BS Automotive Technology",
            "BS Aviation Technology",
            "BS Agricultural and Biosystems Engineering",
            "BS Architecture",
            "BS Ceramic Engineering",
            "BS Chemical Engineering",
            "BS Civil Engineering",
            "BS Computer Engineering",
            "BS Electrical Engineering",
            "BS Electronics Engineering",
            "BS Food Engineering",
            "BS Geodetic Engineering",
            "BS Industrial Engineering",
            "BS Manufacturing Engineering",
            "BS Marine Engineering",
            "BS Marine Transportation",
            "BS Materials Engineering",
            "BS Mechanical Engineering",
            "BS Mechatronics Engineering",
            "BS Metallurgical Engineering",
            "BS Mining Engineering",
            "BS Petroleum Engineering",
            "BS Robotics Engineering",
            "BS Sanitary Engineering",
            "BS Structural Engineering",
            "BS Agriculture Technology",
            "BS Agriculture and its hybrid programs",
            "BS Agro-Forestry",
            "BS Animal Husbandry",
            "BS Animal Science",
            "Doctor of Veterinary Medicine",
            "BS Fisheries",
            "BS Food Technology/Science",
            "BS Forestry",
            "BS Horticulture",
            "BS Statistics/Applied Statistics",
            "BS Math/Applied Math",
            "BS Business Administration with Specialization/Major/Track in Business Analytics",
            "BS Business Administration with Specialization/Major/Track in Business Processing Outsource",
            "BS Hospitality Management/Hotel and Restaurant Management",
            "BS Tourism/Travel Management"
        );
    }

    public static List<String> getGokongweiPrograms() {

        return List.of(
            "BS Accountancy",
            "BS Animal Science",
            "BS Avionics Technology",
            "BS Aircraft Maintenance Technology",
            "BS Chemical Engineering",
            "BS Chemistry",
            "BS Civil Engineering",
            "BS Computer Science",
            "BS Data Science",
            "BS Electrical Engineering",
            "BS Industrial Engineering",
            "BS Information Engineering",
            "BS Mechanical Engineering",
            "BS Pharmacy",
            "BS Radiologic Technology",
            "Doctor of Veterinary Medicine"
        );
    }

    public static List<String> getMercuryDrugPrograms() {

        return List.of(
            "BS Financial Management",
            "BS Architecture",
            "BS Business Administration",
            "BS Civil Engineering",
            "BS Computer Engineering",
            "BS Electrical Engineering",
            "BS Industrial Engineering",
            "BS Mechanical Engineering",
            "BS Information Technology",
            "BS Mathematics",
            "BS Pharmacy",
            "BS Psychology"
        );
    }

    public static List<String> getSMPrograms() {

        return List.of(
            "BS Accountancy",
            "BS Accounting Information Systems",
            "BS Accounting Technology",
            "BS Digital Marketing",
            "BS Internal Auditing",
            "BSBA Financial Management",
            "BSBA Management Accounting",
            "BS Civil Engineering",
            "BS Computer Engineering",
            "BS Electrical Engineering",
            "BS in Electronics and Communications Engineering/ BS In Electronics Engineering/BS Electronics Engineering",
            "BS Mechanical Engineering",
            "BS Computer Science",
            "BS Information Technology",
            "Bachelor of Elementary Education",
            "Bachelor of Secondary Education Major in Biology, Chemistry, General Sciences, Physics, Mathematics, English",
            "BS Architecture (NU Campuses only)"
        );
    }
}