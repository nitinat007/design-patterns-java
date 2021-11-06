package strategy_pattern;

public class Pomeranian extends Dog{

    public Pomeranian(){
        this.tailBehavior= new ModerateTailWag();
        this.name = "pomeranian : chintu";
    }
    @Override
    public void bark() {
        System.out.println("Bark: Low: wuff wuff");
    }

    @Override
    public void eat() {
        System.out.println("Eat: Less: aata daal sabji :D");
    }
}
