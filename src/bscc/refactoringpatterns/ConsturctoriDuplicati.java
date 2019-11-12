package bscc.refactoringpatterns;

public class ConsturctoriDuplicati {
}

class A2 {
    private final String nameUpper;
    private final int age;

    // all args constructor
    A2(String nameUpper, int age) {
        if (age <= 0) throw new IllegalArgumentException();
        this.nameUpper = nameUpper.toUpperCase();
        this.age = age;
    }
    A2(String nameUpper) {
//        this.nameUpper = nameUpper.toUpperCase();
//        this.age = 18;
        this(nameUpper, 18);
    }
    A2(int age) {
//        if (age <= 0) throw new IllegalArgumentException();
//        this.nameUpper = "jdoe".toUpperCase();
//        this.age = age;
        this("jdoe", age);
    }
    A2() {
        this("jdoe", 18);
    }


}
