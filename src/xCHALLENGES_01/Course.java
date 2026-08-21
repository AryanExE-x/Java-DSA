package xCHALLENGES_01;

public class Course {

    static int maxCapacity;

    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];

    }

    static{
        maxCapacity=100;
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudents(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudents(String studentName){
        System.out.println("Student Removed");
        enrolledStudents[enrollments] = studentName;
        enrollments--;
    }

}
