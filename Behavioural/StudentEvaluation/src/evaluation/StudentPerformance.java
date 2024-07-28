package evaluation;

import visitor.Student;
import visitor.Visitor;
import java.util.ArrayList;
import java.util.List;

public class StudentPerformance {
    private List<Student> performances = new ArrayList<>();

    public void addPerformance(Student performance) {
        performances.add(performance);
    }

    public void accept(Visitor visitor) {
        for (Student performance : performances) {
            performance.accept(visitor);
        }
    }
}
