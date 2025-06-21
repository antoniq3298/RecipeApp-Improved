import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DatabaseManager.connect()) {
            DatabaseManager.initDatabase(conn);
            RecipeRepository repo = new RecipeRepository(conn);

            Scanner sc = new Scanner(System.in);
            System.out.println("Add new recipe (title, ingredients, instructions, category):");
            Recipe r = new Recipe(0, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            repo.addRecipe(r);

            System.out.println("All recipes:");
            for (Recipe rec : repo.getAllRecipes()) {
                System.out.println(rec.getTitle() + " - " + rec.getCategory());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}