package visitor;

public class ExamPerformance implements Student {
    private String examName;
    private int grade;

    public ExamPerformance(String examName, int grade) {
        this.examName = examName;
        this.grade = grade;
    }

    public String getExamName() {
        return examName;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
