package recipesearch;

import se.chalmers.ait.dat215.lab2.Recipe;
import se.chalmers.ait.dat215.lab2.RecipeDatabase;
import se.chalmers.ait.dat215.lab2.SearchFilter;

import java.util.List;

public class RecipeBackendController {

    RecipeDatabase db = RecipeDatabase.getSharedInstance();

    private String cuisine = null;
    private String mainIngredient = null;
    private String difficulty = null;
    private int maxPrice = 0;
    private int maxTime = 0;

    public List<Recipe> getRecipes(){
        List<Recipe> recipes = db.search(new SearchFilter(difficulty, maxTime, cuisine, maxPrice, mainIngredient));
        return recipes;
    }

    public void setCuisine(String cuisine){
        if (cuisine.equals("Sverige") || cuisine.equals("Grekland") || cuisine.equals("Indien") || cuisine.equals("Asien") || cuisine.equals("Afrika") || cuisine.equals("Frankrike")) {
            this.cuisine = cuisine;
        } else {
            this.cuisine = null;
        }
    }

    public void setMainIngredient (String mainIngredient){
        if(mainIngredient.equals("Kött") || mainIngredient.equals("Fisk") || mainIngredient.equals("Kyckling") || mainIngredient.equals("Vegetarisk")) {
            this.mainIngredient = mainIngredient;
        } else {
            this.mainIngredient = null;
        }
    }

    public void setDifficulty(String difficulty){

        if (difficulty.equals("Lätt") || difficulty.equals("Mellan") || difficulty.equals("Svår")) {
            this.difficulty = difficulty;
        } else {
            this.difficulty = null;
        }
    }

    public void setMaxPrice(int maxPrice){
        if (maxPrice < 0){
            this.maxPrice = 0;
        } else {
            this.maxPrice = maxPrice;
        }
    }

    public void setMaxTime(int maxTime){
        if (maxTime > 150 || maxTime < 0){
            this.maxTime = 0;
        } else if (maxTime % 10 == 0){
            this.maxTime = maxTime;
        } else {
            this.maxTime = maxTime;
        }
    }
}
