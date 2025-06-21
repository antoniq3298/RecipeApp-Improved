public class Recipe {
    private int id;
    private String title;
    private String ingredients;
    private String instructions;
    private String category;

    public Recipe(int id, String title, String ingredients, String instructions, String category) {
        this.id = id;
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.category = category;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getIngredients() { return ingredients; }
    public String getInstructions() { return instructions; }
    public String getCategory() { return category; }
}