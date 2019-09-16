package bscc.switchvspolymorphism.delegate;


abstract class Dog {
    protected final Bark bark;

    protected Dog(Bark bark) {
        this.bark = bark;
    }

    public abstract void sleep();
    public abstract void bite();

    public void play() {
        bite();
        for (int i = 0; i < 5; i++) {
            bark.bark();
        }
    }
}

interface Bark {
    void bark();
}
class LongBark implements Bark {
    @Override
    public void bark() {
        System.out.println("haAAA-haaaM!");
    }
}
class SimpleBark implements Bark {
    @Override
    public void bark() {
        System.out.println("Ham-HAM!");
    }
}

class Doberman extends Dog {

    Doberman() {
        super(new SimpleBark());
    }

    @Override
    public void sleep() {

    }

    @Override
    public void bite() {

    }
}

class Haskey extends Dog {

    Haskey() {
        super(new LongBark());
    }

    @Override
    public void sleep() {

    }

    @Override
    public void bite() {
    }
}

class Pechinez extends Dog {
    Pechinez() {
        super(new SimpleBark());
    }
    @Override
    public void sleep() {

    }

    @Override
    public void bite() {

    }
}