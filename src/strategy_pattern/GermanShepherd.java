package strategy_pattern;

public class GermanShepherd extends Dog{

    public GermanShepherd(){
        this.tailBehavior= new NoWagTail();
        this.name = "GermanShepherd : rocky";
    }
    @Override
    public void bark() {
        System.out.println("Bark: High: Bhoww Bhoww");
    }

    @Override
    public void eat() {
        System.out.println("Eat: More: Chicken Meat Fish");
    }
}
