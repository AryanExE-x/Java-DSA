package xCHALLENGES_02;

public class Courses {

    static int maxCapacity;

    String courseName;
    int enrollments;
    String[] enrolledStudents;
    boolean enrolled;

    static {
        maxCapacity = 50;
    }

    Courses(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    void enrollStudents(String studentName) {
        if (enrollments >= maxCapacity) {
            System.out.println("Course" + this.courseName + " is full");
        }
        else{
        enrolledStudents[enrollments] = studentName;

        System.out.printf("Student (%s) enrolled in the course %s\n",studentName,this.courseName);
        enrollments++;
        }
    }

    void unenrollStudents(String studentName) {
        System.out.printf("Student (%s) removed\n",studentName);
        enrollments--;
    }

    static void setMaxCapacity(int maxCapacity) {
        Courses.maxCapacity = maxCapacity;
    }

    public static void main(String[] args) {

        Courses CS = new Courses("Object Oriented Programming");

        CS.enrollStudents("Aryan");
        setMaxCapacity(1);
        CS.enrollStudents("Abhinav");
        System.out.println("Enrollments: " + CS.enrollments);
        System.out.println("New capacity: " + maxCapacity);
        CS.unenrollStudents("Abhinav");
        System.out.println("Enrollments: " + CS.enrollments);
    }
}