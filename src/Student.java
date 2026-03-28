public class Student {

    // instance variables
    int rollNo;
    String name;
    int mathMarks;
    int scienceMarks;
    int englishMarks;

    // static variables
    static String schoolName = "KVK";
    static String principle  = "RajKumar";
    static int maxMarks      = 300;

    // static method - show school info
    static void showSchoolInfo() {
        System.out.println("================================");
        System.out.println("       SCHOOL REPORT CARD      ");
        System.out.println("================================");
        System.out.println("School    : " + schoolName);
        System.out.println("Principle : " + principle);
        System.out.println("================================");
    }

    // instance method - calculate total
    int calcTotal() {
        int total = mathMarks + scienceMarks + englishMarks;
        return total;
    }

    // instance method - calculate percentage
    double calcPercent() {
        double percent = (calcTotal() * 100.0) / maxMarks;
        return percent;
    }

    // instance method - get grade
    String getGrade() {
        double percent = calcPercent();

        if (percent >= 90) {
            return "A+";
        } else if (percent >= 80) {
            return "A";
        } else if (percent >= 70) {
            return "B";
        } else if (percent >= 60) {
            return "C";
        } else if (percent >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // instance method - display full report
    public void displayReport() {
        System.out.println("--------------------------");
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Math       : " + mathMarks);
        System.out.println("Science    : " + scienceMarks);
        System.out.println("English    : " + englishMarks);
        System.out.println("--------------------------");
        System.out.println("Total      : " + calcTotal());
        System.out.println("Percentage : " + calcPercent() + "%");
        System.out.println("Grade      : " + getGrade());
        System.out.println("--------------------------");
    }
}