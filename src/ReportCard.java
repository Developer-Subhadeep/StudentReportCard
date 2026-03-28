public class ReportCard {
  public static void main(String[] args) {

        // static method - no object needed
        Student.showSchoolInfo();

        // student 1
        Student s1 = new Student();
        s1.rollNo       = 1;
        s1.name         = "Rahul";
        s1.mathMarks    = 85;
        s1.scienceMarks = 90;
        s1.englishMarks = 78;

        // student 2
        Student s2 = new Student();
        s2.rollNo       = 2;
        s2.name         = "Priya";
        s2.mathMarks    = 92;
        s2.scienceMarks = 88;
        s2.englishMarks = 95;

        // student 3 - put YOUR details here!
        Student s3 = new Student();
        s3.rollNo       = 3;
        s3.name         = "YOUR NAME";
        s3.mathMarks    = 80;
        s3.scienceMarks = 75;
        s3.englishMarks = 85;

        // display all reports
        System.out.println("\nStudent 1 Report");
        s1.displayReport();

        System.out.println("\nStudent 2 Report");
        s2.displayReport();

        System.out.println("\nStudent 3 Report");
        s3.displayReport();
    }
}
