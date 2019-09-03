package bscc.switchvspolymorphism.switches;

public class Switch {
}


enum Breed  {
    DOBERMAN,
    HASKEY,
    PECHINEZ
}
class Dog {
    Breed breed;

//    public void bark() {
//        switch (breed) {
//            case DOBERMAN -> System.out.println("Ham-HAM!");
//            case HASKEY -> System.out.println("haAAA-haaaM!");
//            case PECHINEZ -> System.out.println("Piu-piu!");
//        }
//    }
//
//    public void sleep() {
//        switch (breed) {
//            case DOBERMAN -> System.out.println("Sforrr");
//            case HASKEY -> System.out.println("Sforrr");
//            default -> throw new IllegalArgumentException(breed.name()); // JDD
//        }
//    }
//    public void bite() {
//        switch (breed) {
//            case DOBERMAN -> System.out.println("Auchj");
//            case HASKEY -> System.out.println("Sforrr");
//            // buba!
//        }
//    }
//    public int purici() {
//        return switch (breed) {
//            case DOBERMAN -> 1;
//            case HASKEY -> 100;
//            case PECHINEZ -> 2;
//        };
//    }
}
