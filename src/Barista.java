import java.util.Random;

public class Barista extends Thread{

    Counter counter;

    Ingredients infiniteIngredient;
    IngredientsGiven ingredientsGiven;

    public Barista (Ingredients ingredientsGiven, Counter counter){
        this.counter = counter;
        this.infiniteIngredient = ingredientsGiven;
    }

    public void run(){
        for (int n = 1; n <= 20; n++) {

            while (counter.isEmpty() == true){};
            if ((counter.seeIngredients().getIngredient1() != infiniteIngredient) && (counter.seeIngredients().getIngredient2() != infiniteIngredient)){
                ingredientsGiven = counter.get();
                System.out.println("got the stuff\n");
                //System.out.println("made a drink with " + ingredientsGiven.toString() + " and " + infiniteIngredient.toString() +"\n");
            }

        }
    }

}
