package evaluation;

import visitor.ExamPerformance;
import visitor.AssignmentPerformance;
import visitor.Visitor;

public class PerformanceVisitor implements Visitor {
    @Override
    public void visit(ExamPerformance examPerformance) {
        System.out.println("Visiting exam performance: " + examPerformance.getExamName() + " with grade " + examPerformance.getGrade());
    }

    @Override
    public void visit(AssignmentPerformance assignmentPerformance) {
        System.out.println("Visiting assignment performance: " + assignmentPerformance.getAssignmentName() + " with grade " + assignmentPerformance.getGrade());
    }
}
