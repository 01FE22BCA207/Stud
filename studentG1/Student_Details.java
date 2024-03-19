package studentG1;


import java.time.LocalDate;
import java.time.Period;

public class Student_Details {

    public static void main(String[] args) {
        

        String student_name = "Vijay S Aralimatti";
        String input_dob = "2004-05-22";

        Student_Details student1 = new Student_Details();
        student1.display_student_name(student_name);
        student1.display_student_DOB(input_dob);

        StudentCourses student01 = new StudentCourses();

        student01.semester01(93, 82);
        student01.semester02(90, 85);
        student01.semester03(92,94);
    }

    public void display_student_name(String name) {
        System.out.println("Student name : " + name);

    }

    public void display_student_DOB(String date) {
        LocalDate dob = LocalDate.parse(date);
        System.out.println("Student age : " + calculateAge(dob));

    }

    public static int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        // calculates the amount of time between two dates and returns the years
        if ((dob != null) && (curDate != null)) {
            return Period.between(dob, curDate).getYears();
        } else {
            return 0;
        }
    }

}