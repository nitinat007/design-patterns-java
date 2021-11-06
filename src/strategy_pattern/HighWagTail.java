package strategy_pattern;

public class HighWagTail implements WagTailBehavior{
    @Override
    public void wag() {
        System.out.println(" Tail present. Wag a lot");
    }
}
