import java.util.Random;

public class Barista implements Runnable {

    Counter counter;

    Ingredients infiniteIngredient;
    IngredientsGiven ingredientsGiven;

    public Barista (Ingredients ingredientsGiven, Counter counter){
        this.counter = counter;
        this.infiniteIngredient = ingredientsGiven;
    }

    public void run(){
        while (true) {
            ingredientsGiven = counter.get(infiniteIngredient);
        }
    }

}
