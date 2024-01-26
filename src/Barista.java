import java.util.Random;

public class Barista implements Runnable {

    Counter counter;

    Ingredients infiniteIngredient;
    IngredientsGiven ingredientsGiven;

    int amountOfCups;

    public Barista (Ingredients ingredientsGiven, Counter counter){
        this.counter = counter;
        this.infiniteIngredient = ingredientsGiven;
        this.amountOfCups = 0;
    }

    public void run(){
        while (int n = 1; n <= 20; n++) {
            //System.out.println("doin \n");
            while (counter.isEmpty()){};
            if ((counter.seeIngredients().getIngredient1() != infiniteIngredient) && (counter.seeIngredients().getIngredient2() != infiniteIngredient)) {
                //System.out.println("doin2 \n");
                //System.out.println("got the stuff and " + infiniteIngredient.toString() + "\n");
                ingredientsGiven = counter.get();
                amountOfCups++;
                //System.out.println("made a drink with " + ingredientsGiven.toString() + " and " + infiniteIngredient.toString() +"\n");
            }

            System.out.println(n + "\n");


        }
    }

}
