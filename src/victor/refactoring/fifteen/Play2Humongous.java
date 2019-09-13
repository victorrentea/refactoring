package victor.refactoring.fifteen;

public class Play2Humongous {

    public int bigForTrue(String a) {
        System.out.println("Huge complex code A with " + a);
        System.out.println("More optional logic");
        if (a != null) {
            System.out.println("Heavy Logic With many return points - TEST ME! " + a);
            return 1;
        }
        System.out.println("Yet more code");
        return 0;
    }
    public int bigForFalse(String a) {
        System.out.println("Huge complex code A with " + a);
        if (a != null) {
            System.out.println("Heavy Logic With many return points - TEST ME! " + a);
            return 1;
        }
        System.out.println("Yet more code");
        return 0;
    }
}

class OtherClass {
    private Play2Humongous play2 = new Play2Humongous(); // Fake @Autowired
    public void clientCode() {
        System.out.println(play2.bigForTrue("1")); // UC 134 = true
        System.out.println(play2.bigForTrue("2")); // UC 673 = true
        System.out.println(play2.bigForTrue("3")); // UC 142 = true
        System.out.println(play2.bigForFalse("4")); // UC 12 = false
    }
}

