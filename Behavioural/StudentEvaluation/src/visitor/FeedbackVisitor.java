package visitor;

public class FeedbackVisitor implements Visitor {

    @Override
    public void visit(ExamPerformance examPerformance) {
        if (examPerformance.getGrade() > 90) {
            System.out.println("Excellent performance in " + examPerformance.getExamName() + "!");
        } else {
            System.out.println("Needs improvement in " + examPerformance.getExamName() + ".");
        }
    }

    @Override
    public void visit(AssignmentPerformance assignmentPerformance) {
        if (assignmentPerformance.getGrade() > 90) {
            System.out.println("Excellent work on " + assignmentPerformance.getAssignmentName() + "!");
        } else {
            System.out.println("Consider reviewing " + assignmentPerformance.getAssignmentName() + " for better understanding.");
        }
    }
}
