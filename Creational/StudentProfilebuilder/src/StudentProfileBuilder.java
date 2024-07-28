import java.util.ArrayList;
import java.util.List;

public class StudentProfileBuilder {
    protected String name;
    protected int age;
    protected String grade;
    protected String major;
    protected double GPA;
    protected Address address;
    protected List<Course> courses = new ArrayList<>();

    public StudentProfileBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentProfileBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentProfileBuilder setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public StudentProfileBuilder setMajor(String major) {
        this.major = major;
        return this;
    }

    public StudentProfileBuilder setGPA(double GPA) {
        this.GPA = GPA;
        return this;
    }

    public StudentProfileBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public StudentProfileBuilder addCourse(Course course) {
        this.courses.add(course);
        return this;
    }

    public StudentProfile build() {
        return new StudentProfile(this);
    }
}
