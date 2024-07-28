import java.util.LinkedList;
import java.util.Queue;

public class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;
    private Queue<DatabaseConnection> connectionPool;

    private DatabaseConnectionPool() {
        connectionPool = new LinkedList<>();
        // Initialize the pool with a few connections
        for (int i = 0; i < 5; i++) {
            connectionPool.add(new DatabaseConnection());
        }
    }

    public static synchronized DatabaseConnectionPool getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionPool();
        }
        return instance;
    }

    public synchronized DatabaseConnection getConnection() {
        if (connectionPool.isEmpty()) {
            // Handle case when pool is empty (e.g., create a new connection or throw an exception)
            return new DatabaseConnection();
        }
        return connectionPool.poll();
    }

    public synchronized void releaseConnection(DatabaseConnection connection) {
        connectionPool.offer(connection);
    }
}
