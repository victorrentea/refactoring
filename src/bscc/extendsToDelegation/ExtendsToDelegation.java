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
        //chestii
        writeHeader();
        //chestii
        writeBody();
        writeFooter();
        //chestii
        //chestii
    }

    protected abstract void writeHeader();
    protected abstract void writeBody();
    protected abstract void writeFooter();
}
class A extends Super {

    private final Implem1 implem = new Implem1();

    public void altaMetoda() {
        implem.m(); // apelez impl 1
    }

    protected void writeHeader() {
        // in felu A
    }
}
class C extends Super {
    private final Implem1 implem = new Implem1();

    public void altaMetoda() {
        implem.m(); // apelez impl 1
    }

    protected void writeHeader() {
        // in felu B
    }
}

class B extends Super {
    private final Implem2 implem = new Implem2();

    public void altaMetoda() {
        implem.m(); // implem 2 !! TZEAPA !
    }

    protected void writeHeader() {
        // in felu C
    }
}