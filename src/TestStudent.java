public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Sanja", 24, 8, 1.0);
        students[1] = new Student("Marko", 22, 4, 3.8);
        students[2] = new Student("Relja", 23, 7, 2.5);

        for (Student s : students) {
            System.out.println("Data of each student is " + s.getStudentName() + " " + s.getStudentAge() + " " + s.getStudentSemester() + " " + s.getStudentGpa());
        }

        double gpaAverage = ((students[0].getStudentGpa() + students[1].getStudentGpa() + students[2].getStudentGpa()) / students.length);
        System.out.println("Average is: " + gpaAverage);
    }
}
