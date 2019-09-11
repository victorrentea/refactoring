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
        change();
        //chestii
        sendNotification("a");
        //chestii
        //chestii
    }

    protected void siPasta() {
        // lgoica
    }
    protected void siPasta2() {
        // lgoica
    }
    protected void siPasta3() {
        // lgoica
    }
    protected void siPasta4() {
        // lgoica
    }
    protected void sieu() {
        // lgoica
    }
    protected void siPasta6() {
        // lgoica
    }
    protected void siPasta7() {
        // lgoica
    }
    protected void siPasta9() {
        // lgoica
    }


    protected void change() {
        // default behavior
        throw new RuntimeException("Not implemented");
    }
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
    protected void change() {
        // in felu A
    }
}
class C extends Super {
    private final Implem1 implem = new Implem1();

    public void altaMetoda() {
        implem.m(); // apelez impl 1
    }

    protected void change() {
        // in felu B
    }
}

class B extends Super {
    private final Implem2 implem = new Implem2();

    public void altaMetoda() {
        implem.m(); // implem 2 !! TZEAPA !
    }

    protected void change() {
        // in felu C
    }
}
class D extends Super {
    public void simplu() {
        change();

//        String jpql = """
//        SELECT s FROM Student
//        JOIN s.viata
//        """;
    }
}