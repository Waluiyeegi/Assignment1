public class Counter {
    private IngredientsGiven contents = null;

    /**
     * State of the counter.
     */
    private boolean empty = true;

    private int increment = 1;

    public synchronized void put(IngredientsGiven obj) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        contents = obj;
        empty = false;
        System.out.println("put " + contents.toString() + " on the counter" + "\n");
        notifyAll();
    }

    public synchronized IngredientsGiven get(Ingredients infiniteIngredient) {
        while (empty || infiniteIngredient == contents.getIngredient1() || infiniteIngredient == contents.getIngredient2()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        IngredientsGiven obj = contents;

        // Mark the box as empty.
        contents = null;
        empty = true;
        System.out.println("got " + obj.toString() + " from the counter and on " + Thread.currentThread().getName() + ".  This is my " + increment + " coffee.\n");
        increment++;
        notifyAll();
        return obj;

    }

    public IngredientsGiven seeIngredients(){
        return contents;
    }

    public boolean isEmpty(){
        return empty;
    }

}
