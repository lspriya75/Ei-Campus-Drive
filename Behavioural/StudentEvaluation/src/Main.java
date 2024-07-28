import evaluation.StudentPerformance;
import visitor.GradeVisitor;
import visitor.FeedbackVisitor;
import visitor.ExamPerformance;
import visitor.AssignmentPerformance;

public class Main {
    public static void main(String[] args) {
        StudentPerformance studentPerformance = new StudentPerformance();
        studentPerformance.addPerformance(new ExamPerformance("Midterm", 85));
        studentPerformance.addPerformance(new AssignmentPerformance("Math Assignment", 90));

        GradeVisitor gradeVisitor = new GradeVisitor();
        FeedbackVisitor feedbackVisitor = new FeedbackVisitor();

        studentPerformance.accept(gradeVisitor);
        studentPerformance.accept(feedbackVisitor);
    }
}
