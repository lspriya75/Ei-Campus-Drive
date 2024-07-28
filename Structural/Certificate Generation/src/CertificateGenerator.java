public class CertificateGenerator {
    private CertificateFactory factory;

    public CertificateGenerator(CertificateFactory factory) {
        this.factory = factory;
    }

    public Certificate generateCertificate(Student student, CertificateType type) {
        return factory.getCertificate(student, type);
    }
}
