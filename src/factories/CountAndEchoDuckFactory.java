package factories;

import animals.DuckCall;
import animals.MallardDuck;
import animals.RedHeadDuck;
import animals.RubberDuck;
import animals.decorators.QuackCounter;
import animals.decorators.QuackEcho;
import animals.decorators.Quackable;

public class CountAndEchoDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedHeadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new QuackEcho(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}
