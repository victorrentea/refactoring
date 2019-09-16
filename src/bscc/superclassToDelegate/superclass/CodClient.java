package bscc.superclassToDelegate.superclass;

class Super {
    private String data;

    private void metodaMare1() {
        //chestii
        //chestii
        System.out.println("Ceva original (TM)");
    }
    private void metodaMare2() {
        //chestii
        //chestii
    }

    protected String ansamblu() {
        //incearca sa incapsuleze ceva.
        // sa se apere de hoarde subclase.
        data = "aaaa";
        metodaMare1();
        metodaMare2();
        return data;
    }


}


class Mea extends Super {
    //abordare cu pasi mai mici:
//    private Super s = new Super();
//
//    protected String ansamblu() {
//        return s.ansamblu();
//    }


    public void logicaMea() {
        System.out.println(ansamblu());
        //
//        data = "aaaa";
//        metodaMare1();
//        metodaMare2();
//        System.out.println(data);
    }

//    @Override
    public void metodaMare1() {
//        altceva
        System.out.println("Altceva");
    }
}

public class CodClient {
    public static void main(String[] args) {
        Mea mea = new Mea();
        mea.metodaMare1();
        System.out.println("-0-----------");
        mea.logicaMea();

    }
}