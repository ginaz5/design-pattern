package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private Connection conn = null;
    // eager loading
//    private static DbSingleton instance = new DbSingleton();

    // Lazy loading - create instance only when needed
    private static class LazyHolder {
        static final DbSingleton INSTANCE = new DbSingleton();
    }

    private DbSingleton() {
        try {
            String jdbcURL = "jdbc:h2:mem:testdb";
            conn = DriverManager.getConnection(jdbcURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbSingleton getInstance() {
        // The JVM loads classes when they are first accessed, and
        // JVM guarantees that class initialization (which includes the initialization of static fields) is thread-safe
        return LazyHolder.INSTANCE;
    }

    public Connection getConnection() {
        return conn;
    }
}
