package victor.refactoring.fifteen.stuff;

public class TestExtract {
    private final BigUnfriendlyClass big;

    public TestExtract(BigUnfriendlyClass big) {
        this.big = big;
    }

    public void main(String[] args) {


        System.out.println(big.m(1));
        System.out.println(big.n(1));
    }
}

class BigUnfriendlyClass {

    private final Bla bla = new Bla();

    public long m(long a) {
        return bla.n(a) + bla.p(a);
    }

    public long n(long a) {
        return bla.n(a);
    }

    private long p(long a) {
        return bla.p(a);
    }

    private long x(long a) {
        return bla.x(a);
    }
}

