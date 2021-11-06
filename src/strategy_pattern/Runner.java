package strategy_pattern;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Pomeranian());
        dogList.add(new GermanShepherd());

        for ( Dog dog: dogList) {
            System.out.println("--------------");
            System.out.println(dog.name);
            dog.bark();
            dog.eat();
            dog.wagTail();
            //dog.setWagTailBehavior(new HighWagTail()); set custom behavior at runtime
            //dog.wagTail();
        }
    }
}
