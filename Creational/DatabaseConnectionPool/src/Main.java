public class Main {
    public static void main(String[] args) {
        DatabaseConnectionPool pool = DatabaseConnectionPool.getInstance();
        
        DatabaseConnection connection1 = pool.getConnection();
        DatabaseConnection connection2 = pool.getConnection();

        System.out.println("Connection 1: " + connection1);
        System.out.println("Connection 2: " + connection2);

        System.out.println("Are both connections the same? " + (connection1 == connection2));
    }
}

