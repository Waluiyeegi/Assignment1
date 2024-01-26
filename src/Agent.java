import java.util.Random;

public class Agent implements Runnable{

    IngredientsGiven ingredientsGiven;
    Counter counter;

    public Agent (Counter counter){
        this.counter = counter;
    }
    public void run(){
        for (int n = 1; n <= 20; n++) {
            //System.out.println("waiting \n");
            while (!counter.isEmpty()){}
            //System.out.println("waiting 2\n");
            Random rand = new Random();
            int randomNumber = rand.nextInt(3);
            switch (randomNumber){
                case 0:
                    ingredientsGiven = new IngredientsGiven(Ingredients.Beans, Ingredients.Sugar);
                    break;
                case 1:
                    ingredientsGiven = new IngredientsGiven(Ingredients.Beans, Ingredients.Water);
                    break;
                case 2:
                    ingredientsGiven = new IngredientsGiven(Ingredients.Sugar, Ingredients.Water);
                    break;
            }
            counter.put(ingredientsGiven);
        }
    }

}
