package bscc.inheritance.superclassToDelegate.delegate;

import java.util.function.Function;

class DelegateInLocDeSuper {
    private String data;

    private int metodaMare1(String s) {
        System.out.println("Original");
        return Integer.parseInt(s);
    }

    private void metodaMare2() {
        //chestii
        //chestii
    }

    protected String ansamblu(Function<String, Integer> pasVariabil) {
        //incearca sa incapsuleze ceva.
        // sa se apere de hoarde subclase.
        data = "aaaa";
        pasVariabil.apply("1");
        metodaMare2();
        return data;
    }
}


class Mea  {
    public void logicaMea() {
        DelegateInLocDeSuper d = new DelegateInLocDeSuper();
        System.out.println(d.ansamblu(this::metodaMare1));
    }



    public int metodaMare1(String s) {
        System.out.println("Altceva");
        return Integer.parseInt(s);
    }
}

public class CodClient {
//    public static void main(String[] args) {
//        Mea mea = new Mea();
//        mea.metodaMare1();
//        System.out.println("-0-----------");
//        mea.logicaMea();
//
//    }
}