package bscc.extendsToDelegation;

public class ExtendsToDelegation {

}


abstract class Super {
    protected void m() {
        // implem1
    }
}

class A extends Super {
    public void altaMetoda() {
        m(); // apelez impl 1
    }
}
class C extends Super {
    public void altaMetoda() {
        m(); // apelez impl 1
    }
}

class B extends Super {
    public void altaMetoda() {
        m(); // implem 2 !! TZEAPA !
    }
    @Override
    protected void m() {
        // implem2
    }
}