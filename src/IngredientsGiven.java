public class IngredientsGiven {
    private Ingredients ingredient1;
    private Ingredients ingredient2;

    public IngredientsGiven(Ingredients ingredient1, Ingredients ingredient2){
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
    }

    public Ingredients getIngredient1() {
        return ingredient1;
    }

    public Ingredients getIngredient2() {
        return ingredient2;
    }

    public String toString(){
        return ingredient1.name() + " and " + ingredient2.name();
    }
}
