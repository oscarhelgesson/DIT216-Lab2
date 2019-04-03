
package recipesearch;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RecipeSearch extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        ResourceBundle bundle = java.util.ResourceBundle.getBundle("recipesearch.resources.RecipeSearch");

        Parent root = FXMLLoader.load(getClass().getResource("C:\\Users\\46763\\Desktop\\Lab2\\RecipeSearch\\src\\recipesearch\\recipe_search.fxml"), bundle);
        Scene scene = new Scene(root, 800, 500);

        stage.setTitle(bundle.getString("application.name"));
        stage.setScene(scene);
        stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
