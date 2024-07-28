package visitor;

public class AssignmentPerformance implements Student {
    private String assignmentName;
    private int grade;

    public AssignmentPerformance(String assignmentName, int grade) {
        this.assignmentName = assignmentName;
        this.grade = grade;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

