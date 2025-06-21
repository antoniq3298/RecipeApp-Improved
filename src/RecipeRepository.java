import java.sql.*;
import java.util.*;

public class RecipeRepository {
    private final Connection conn;

    public RecipeRepository(Connection conn) { this.conn = conn; }

    public void addRecipe(Recipe r) throws SQLException {
        String sql = "INSERT INTO recipes (title, ingredients, instructions, category) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, r.getTitle());
            stmt.setString(2, r.getIngredients());
            stmt.setString(3, r.getInstructions());
            stmt.setString(4, r.getCategory());
            stmt.executeUpdate();
        }
    }

    public List<Recipe> getAllRecipes() throws SQLException {
        List<Recipe> list = new ArrayList<>();
        String sql = "SELECT * FROM recipes";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Recipe(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("ingredients"),
                    rs.getString("instructions"),
                    rs.getString("category")
                ));
            }
        }
        return list;
    }
}