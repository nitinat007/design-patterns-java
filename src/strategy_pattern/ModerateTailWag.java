package strategy_pattern;

public class ModerateTailWag implements WagTailBehavior{
    @Override
    public void wag() {
        System.out.println(" Tail present. Moderate wag");
    }
}
