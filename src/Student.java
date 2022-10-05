public class Student {
    private String StudentName;
    private int StudentAge;
    private int StudentSemester;
    private static double StudentGpa;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        StudentAge = studentAge;
    }

    public int getStudentSemester() {
        return StudentSemester;
    }

    public void setStudentSemester(int studentSemester) {
        StudentSemester = studentSemester;
    }

    public static double getStudentGpa() {
        return StudentGpa;
    }

    public void setStudentGpa(double studentGpa) {
        StudentGpa = studentGpa;
    }

    public Student(String name, int age, int semesterNo, double GPA) {
        StudentName = name;
        StudentAge = age;
        StudentSemester = semesterNo;
        StudentGpa = GPA;
    }
}