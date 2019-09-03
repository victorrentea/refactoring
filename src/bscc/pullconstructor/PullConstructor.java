package bscc.pullconstructor;

public class PullConstructor {


}

class CopyCtr {
    private String a;

    public CopyCtr(String a) {
        this.a = a;
    }

    public CopyCtr() {
    }
    public CopyCtr(CopyCtr other) {
        this.a = other.a;
    }
}

class A extends CopyCtr{
    private String p;
    public A(A other) {
        super(other);
        this.p = other.p;
    }
}
class B  extends CopyCtr {
    private String s;
    public B(B other) {
        super(other);
        this.s = other.s;
    }
}