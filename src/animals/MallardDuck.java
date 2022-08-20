package animals;

import animals.decorators.Quackable;

public class MallardDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
