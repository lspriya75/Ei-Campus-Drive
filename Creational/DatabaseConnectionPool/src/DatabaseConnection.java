public class DatabaseConnection {
    private static int counter = 0;
    private final int id;

    public DatabaseConnection() {
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return "DatabaseConnection{id=" + id + "}";
    }
}
