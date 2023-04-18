public class GradesApp {

    public static void main(String[] args) {

    Grades grades = new Grades();

    grades.add(6);
    grades.add(4);
    grades.add(2);
    grades.add(3);

    System.out.println(grades.getLastGrade());
    System.out.println(grades.getAverageGrades());
    }
}
