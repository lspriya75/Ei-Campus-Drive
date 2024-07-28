import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield", "IL", "62701");

        Course course1 = new Course("CS101", "Introduction to Computer Science", 4);
        Course course2 = new Course("MATH101", "Calculus I", 3);

        StudentProfile profile = new StudentProfileBuilder()
            .setName("John Doe")
            .setAge(20)
            .setGrade("Junior")
            .setMajor("Computer Science")
            .setGPA(3.8)
            .setAddress(address)
            .addCourse(course1)
            .addCourse(course2)
            .build();

        System.out.println(profile);
    }
}
