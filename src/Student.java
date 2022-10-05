public class Student {
    private String studentName;
    private int studentAge;
    private int studentSemester;
    private static double studentGpa;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        studentAge = studentAge;
    }

    public int getStudentSemester() {
        return studentSemester;
    }

    public void setStudentSemester(int studentSemester) {
        studentSemester = studentSemester;
    }

    public static double getStudentGpa() {
        return studentGpa;
    }

    public void setStudentGpa(double studentGpa) {
        studentGpa = studentGpa;
    }

    public Student(String name, int age, int semesterNo, double GPA) {
        studentName = name;
        studentAge = age;
        studentSemester = semesterNo;
        studentGpa = GPA;
    }
}