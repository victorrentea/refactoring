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
        pasLipsa();
        //chestii
        sendNotification("a");
        //chestii
        //chestii
    }


    protected abstract void pasLipsa();
    protected void sendNotification(String a) {
        // nimic aici :/
    }
}
class A extends Super {

    private final Implem1 implem = new Implem1();

    public void altaMetoda() {
        implem.m(); // apelez impl 1
    }

    @Override
    protected void sendNotification(String a) {
        //ceva inteligent // doar clasa A vrea sa faca ceva aici !!!
    }

    @Override
    protected void pasLipsa() {
        // in felu A
    }
}
class C extends Super {
    private final Implem1 implem = new Implem1();

    public void altaMetoda() {
        implem.m(); // apelez impl 1
    }

    @Override
    protected void pasLipsa() {
        // in felu B
    }
}

class B extends Super {
    private final Implem2 implem = new Implem2();

    public void altaMetoda() {
        implem.m(); // implem 2 !! TZEAPA !
    }

    @Override
    protected void pasLipsa() {
        // in felu C
    }
}