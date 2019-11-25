package bscc;

public class Creere {

    public static void main(String[] args) {
        Y y = new Y(1, "a");
        Y y2 = new Y(3);


    }

}


class Y {
    private final int a;
    private final String s;
    private Integer b;

    public Y(int a, String s) {
        this(a, s, null);
    }


    public Y(int a) {
        this(a, "FISC", null);
    }

    public Y(int a, String s, Integer b) {
        this.a=a;
        this.s=s;
        this.b=b;
    }



}