public class Certificate {
    private String studentName;
    private String courseName;
    private CertificateType type;

    public Certificate(String studentName, String courseName, CertificateType type) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.type = type;
    }

    public void display() {
        System.out.println("Certificate: " + type + "\nStudent: " + studentName + "\nCourse: " + courseName);
    }
}
