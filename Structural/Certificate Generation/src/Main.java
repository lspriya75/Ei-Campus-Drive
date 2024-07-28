public class Main {
    public static void main(String[] args) {
        CertificateFactory factory = new CertificateFactory();

        Student student1 = new Student("John Doe", "Java Programming");
        Student student2 = new Student("Jane Smith", "Data Structures");
        Student student3 = new Student("John Doe", "Java Programming");

        Certificate certificate1 = factory.getCertificate(student1, CertificateType.COMPLETION);
        Certificate certificate2 = factory.getCertificate(student2, CertificateType.COMPLETION);
        Certificate certificate3 = factory.getCertificate(student3, CertificateType.COMPLETION);

        certificate1.display();
        certificate2.display();
        certificate3.display();

        System.out.println("certificate1 == certificate3: " + (certificate1 == certificate3));
    }
}
