import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sandwich {
    private String name;
    private List<SandwichIngredient> ingredients = new ArrayList<SandwichIngredient>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean add (SandwichIngredient sandwichIngredient){
        ingredients.add(sandwichIngredient);
    return  true;
    }
    public Sandwich clone (){
        Sandwich sandwich = new Sandwich();
        sandwich.setName(getName());
        for (SandwichIngredient ingredient : ingredients) {
            sandwich.add(ingredient);
        }
        return sandwich;
    }
}
