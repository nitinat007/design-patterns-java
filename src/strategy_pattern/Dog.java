package strategy_pattern;

public abstract class Dog {

    String name;
    WagTailBehavior tailBehavior;

    public void wagTail(){
        tailBehavior.wag();
    }

    public void setWagTailBehavior(WagTailBehavior behavior){
        this.tailBehavior = behavior;
    }

    public abstract void bark();

    public abstract void eat();


}
