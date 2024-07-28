import java.util.HashMap;
import java.util.Map;

public class CertificateFactory {
    private Map<String, Certificate> certificatePool = new HashMap<>();

    public Certificate getCertificate(Student student, CertificateType type) {
        String key = student.getName() + student.getCourse() + type;

        if (!certificatePool.containsKey(key)) {
            certificatePool.put(key, new Certificate(student.getName(), student.getCourse(), type));
        }

        return certificatePool.get(key);
    }
}
