package bscc.switchvspolymorphism.poly;

public class Switch {
}


//enum Breed  {
//    DOBERMAN,
//    HASKEY
//}

abstract class Dog {
//    Breed breed;

    public abstract void bark();/* {
        switch (breed) {
            case DOBERMAN:
                System.out.println("Ham-HAM!"); break;
            case HASKEY:
                System.out.println("haAAA-haaaM!"); break;
        }
    }*/
    public abstract void sleep();/* {
        switch (breed) {
            case DOBERMAN:
                System.out.println("Sforrr"); break;
            case HASKEY:
                System.out.println("Sforrr"); break;
        }
    }*/
    public abstract void bite();/* {
        switch (breed) {
            case DOBERMAN:
                System.out.println("Auchj"); break;
            case HASKEY:
                System.out.println("Sforrr"); break;
        }
    }*/
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