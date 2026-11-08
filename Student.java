
public class Student {
        private String studentName;
        private double studentGWA;
        private double annualFamilyIncome;
        private int yearLevel;
        private String disciplinaryRecord;
        private char disabilityStatus;
        private char ethnicGroup;
        private String programOfStudy;

        public Student(String studentName, double studentGWA, int yearLevel, String programOfStudy, double annualFamilyIncome, 
            String disciplinaryRecord, char disabilityStatus, char ethnicGroup) {
            setStudentName(studentName);
            setStudentGWA(studentGWA);
            setYearLevel(yearLevel);
            setProgramOfStudy(programOfStudy);
            setAnnualFamilyIncome(annualFamilyIncome);
            setDisciplinaryRecord(disciplinaryRecord);
            setDisabilityStatus(disabilityStatus);
            setEthnicGroup(ethnicGroup);
        }

        // setters w/ validators
        public void setStudentName(String studentName){
            if (studentName == null || studentName.isBlank())
                throw new IllegalArgumentException("Name cannot be blank.");
            this.studentName = studentName.trim();

        }

        public void setStudentGWA(double studentGWA){
            if(studentGWA < 1.0 || studentGWA > 5.0)
                throw new IllegalArgumentException("GWA should be between 1.0 and 5.0.");
            this.studentGWA = studentGWA;
            
        }

        public void setYearLevel(int yearLevel){
            if(yearLevel < 1 || yearLevel > 5)
                throw new IllegalArgumentException("Year level must be between 1 and 5.");
            this.yearLevel = yearLevel;
            
        }

        public void setProgramOfStudy(String programOfStudy){
            if(programOfStudy == null || programOfStudy.isBlank())
                throw new IllegalArgumentException("Program cannot be blank.");
            this.programOfStudy = programOfStudy;
        }

        public void setAnnualFamilyIncome(double annualFamilyIncome){
            if(annualFamilyIncome <= 0)
                throw new IllegalArgumentException("Annual family income cannot be negative.");
            this.annualFamilyIncome = annualFamilyIncome;

        }

        public void setDisciplinaryRecord(String disciplinaryRecord){
            if(disciplinaryRecord == null || disciplinaryRecord.isBlank())
                throw new IllegalArgumentException("Disciplinary record cannot be blank.");
            this.disciplinaryRecord = disciplinaryRecord.trim();
        }

        public void setDisabilityStatus(char disabilityStatus){
            char status = Character.toUpperCase(disabilityStatus);
            if(status != 'Y' && status != 'N')
                throw new IllegalArgumentException("Disability status must be 'Y' or 'N'.");
            this.disabilityStatus = status;
        }

        public void setEthnicGroup(char ethnicGroup){
            char group = Character.toUpperCase(ethnicGroup);
            if(group != 'Y' && group != 'N')
                throw new IllegalArgumentException("Ethnic group must be 'Y' or 'N'.");
            this.ethnicGroup = group;
        }

        public String getStudentInformation() {
            return "Student Name: " + studentName + "\n" +
                    "GWA: " + studentGWA + "\n" +
                    "Year Level: " + yearLevel + "\n" +
                    "Program of Study: " + programOfStudy + "\n" +
                    "Annual Family Income: Php " + annualFamilyIncome + "\n" +
                    "Disciplinary Record: " + disciplinaryRecord + "\n" +
                    "Socioeconomic Status:\nDisability Status: " + disabilityStatus + "\n" +
                    "Ethnic Group: " + ethnicGroup;
        }

        // getters
        public String getStudentName() {
            return studentName;
        }

        public double getStudentGWA() {
            return studentGWA;
        }

        public double getAnnualFamilyIncome() {
            return annualFamilyIncome;
        }

        public int getYearLevel() {
            return yearLevel;
        }

        public String getProgramOfStudy() {
            return programOfStudy;
        }

        public String getDisciplinaryRecord() {
            return disciplinaryRecord;
        }

        public char getDisabilityStatus() {
            return disabilityStatus;
        }

        public char getEthnicGroup() {
            return ethnicGroup;
        }

    
}