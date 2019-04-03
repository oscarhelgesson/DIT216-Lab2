
package recipesearch;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import se.chalmers.ait.dat215.lab2.Recipe;
import se.chalmers.ait.dat215.lab2.RecipeDatabase;


public class RecipeSearchController implements Initializable {

    @FXML SplitPane searchPane;
    @FXML AnchorPane recipeDetailPane;
    @FXML ComboBox mainIngredientCombo;
    @FXML ComboBox cuisineCombo;
    @FXML RadioButton allRadio;
    @FXML RadioButton easyRadio;
    @FXML RadioButton mediumRadio;
    @FXML RadioButton hardRadio;
    @FXML Spinner maxPriceSpinner;
    @FXML Slider maxTimeSlider;
    @FXML FlowPane recipeFlowPane;


    RecipeDatabase db = RecipeDatabase.getSharedInstance();
    RecipeBackendController rbc = new RecipeBackendController();
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        updateRecipeList();
    }
    private void updateRecipeList(){
        recipeFlowPane.getChildren().clear();
        List<Recipe> recipes = rbc.getRecipes();
        for (Recipe recipe : recipes) {
            recipeFlowPane.getChildren().add(new RecipeListItem(recipe, this));
        }
    }

}