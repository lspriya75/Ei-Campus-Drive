package visitor;

public class GradeVisitor implements Visitor {

    @Override
    public void visit(ExamPerformance examPerformance) {
        System.out.println("Exam: " + examPerformance.getExamName() + " - Grade: " + examPerformance.getGrade());
    }

    @Override
    public void visit(AssignmentPerformance assignmentPerformance) {
        System.out.println("Assignment: " + assignmentPerformance.getAssignmentName() + " - Grade: " + assignmentPerformance.getGrade());
    }
}
