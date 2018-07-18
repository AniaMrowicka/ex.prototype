public class Main {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.setName("kanapka");
        sandwich.add(SandwichIngredient.TOMATO);
        sandwich.add(SandwichIngredient.HAM);

        Sandwich sandwich2 = new Sandwich();
        sandwich2.add(SandwichIngredient.CHEESE);
        sandwich2.add(SandwichIngredient.CUCUMBER);

        Sandwich sandwich3 = new Sandwich();
        sandwich3.add(SandwichIngredient.JAM);
        sandwich3.add(SandwichIngredient.CHEESE);

        Sandwich clone = sandwich.clone();

        System.out.println(clone.equals(sandwich));
        System.out.println(clone.getName().equals(sandwich.getName()));
    }
}
