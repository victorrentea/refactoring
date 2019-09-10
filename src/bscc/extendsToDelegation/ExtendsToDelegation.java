package bscc.extendsToDelegation;

public class ExtendsToDelegation {

}



//interface IImplem {
//    void m();
//}
class Implem1 /*implements IImplem */{
    public void m() {
        // implem1
    }
}
class Implem2 /*implements IImplem */{
    public void m() {
        // implem2
    }
}
// ----------------------------

abstract class Super {
    public void metodaDinBaza() {
        if (this instanceof A) {
            A a = (A) this;

        }
    }
}
class A extends Super {

    private final Implem1 implem = new Implem1();

    public void altaMetoda() {
        implem.m(); // apelez impl 1
    }
}
class C extends Super {
    private final Implem1 implem = new Implem1();

    public void altaMetoda() {
        implem.m(); // apelez impl 1
    }
}

class B extends Super {
    private final Implem2 implem = new Implem2();

    public void altaMetoda() {
        implem.m(); // implem 2 !! TZEAPA !
    }
}