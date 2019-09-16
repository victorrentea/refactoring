package bscc.switchvspolymorphism.poly;

public class Switch {
}


//enum Breed  {
//    DOBERMAN,
//    HASKEY
//}

abstract class Dog {
//    Breed breed;

    public abstract void bark();
    public abstract void sleep();
    public abstract void bite();
}

class Doberman extends Dog {

    @Override
    public void bark() {
        System.out.println("Ham-HAM!");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void bite() {

    }
}

class Haskey extends Dog {

    @Override
    public void bark() {
        System.out.println("haAAA-haaaM!");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void bite() {

    }
}
class Pechinez extends Dog {

    @Override
    public void bark() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void bite() {

    }
}