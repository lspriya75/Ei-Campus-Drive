import java.util.List;

public class StudentProfile {
    private final String name;
    private final int age;
    private final String grade;
    private final String major;
    private final double GPA;
    private final Address address;
    private final List<Course> courses;

    StudentProfile(StudentProfileBuilder builder) {  // Changed to package-private
        this.name = builder.name;
        this.age = builder.age;
        this.grade = builder.grade;
        this.major = builder.major;
        this.GPA = builder.GPA;
        this.address = builder.address;
        this.courses = builder.courses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }

    public double getGPA() {
        return GPA;
    }

    public Address getAddress() {
        return address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "StudentProfile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                ", GPA=" + GPA +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }
}
