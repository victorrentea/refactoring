package victor.refactoring.fifteen;

public class Play2Humongous {

    public int metPtTrue(String a) {
        logicBefore(a);
        System.out.println("More optional logic");
        if (logicAfter(a)) return 1;
        return 0;
    }

    private boolean logicAfter(String a) {
        if (Integer.parseInt(a) == 1) {
            System.out.println("Heavy Logic With many return points - TEST ME! " + a);
            return true;
        }
        System.out.println("Yet more code");
        return false;
    }

    public int metPtFalse(String a) {
        logicBefore(a);
        if (logicAfter(a)) return 1;
        return 0;
    }

    private void logicBefore(String a) {
        System.out.println("Huge complex code A with " + a);
    }
}

class OtherClass {
    private Play2Humongous play2 = new Play2Humongous(); // Fake @Autowired
    public void clientCode() {
        System.out.println(play2.metPtTrue("1")); // UC 134
        System.out.println(play2.metPtTrue("2")); // UC 673
        System.out.println(play2.metPtTrue("3")); // UC 142
        System.out.println(play2.metPtFalse("4")); // UC 12
    }
}

