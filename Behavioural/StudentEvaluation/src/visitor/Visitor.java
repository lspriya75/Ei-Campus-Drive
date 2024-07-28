package visitor;

public interface Visitor {
    void visit(ExamPerformance examPerformance);
    void visit(AssignmentPerformance assignmentPerformance);
}
