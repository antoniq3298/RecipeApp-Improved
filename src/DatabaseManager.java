import java.sql.*;

public class DatabaseManager {
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:recipes.db");
    }

    public static void initDatabase(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS recipes (id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, ingredients TEXT, instructions TEXT, category TEXT)";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }
}