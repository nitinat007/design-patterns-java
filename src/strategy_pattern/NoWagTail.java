package strategy_pattern;

public class NoWagTail implements WagTailBehavior{
    @Override
    public void wag() {
        System.out.println(" Tail cut, No wag");
    }
}
