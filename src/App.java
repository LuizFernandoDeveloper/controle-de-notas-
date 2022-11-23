import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Student name: ");
        student.setStudentName(sc.nextLine());
        System.out.print("Frist note: ");
        student.setStudentGradeOne(sc.nextDouble());
        System.out.print("Second nota: ");
        student.setStudentGradeTwo(sc.nextDouble());
        System.out.print("Trid note: ");
        student.setStudentGradeThree(sc.nextDouble());
        System.out.println(student.finalGrade());
        System.out.println(student.result());
        sc.close();
    }
}
