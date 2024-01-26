public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread agent = new Thread(new Agent(counter), "produce");
        Thread baristaSugar = new Thread(new Barista(Ingredients.Sugar,counter), "Consumer Sugar");
        Thread baristaWater = new Thread(new Barista(Ingredients.Water,counter), "Consumer Water");
        Thread baristaBeans = new Thread(new Barista(Ingredients.Beans,counter), "Consumer Beans");

        agent.start();
        baristaSugar.start();
        baristaWater.start();
        baristaBeans.start();

    }
}