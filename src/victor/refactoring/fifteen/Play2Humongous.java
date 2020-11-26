package victor.refactoring.fifteen;

public class Play2Humongous {

    // TODO do one more thing before and after, every time. Z
    // TODO efficient sins: add more optional logic inside "BOSS LEVEL"
    // TODO avoid boolean params
    // TODO extract'n'test + mock away
    public int humongousMethod(String a, boolean bullean) {
        System.out.println("Huge complex code A with " + a);
        if (bullean) {
            System.out.println("More optional logic");
        }
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
        System.out.println(play2.humongousMethod("1",true)); // UC 134 = true
        System.out.println(play2.humongousMethod("2",true)); // UC 673 = true
        System.out.println(play2.humongousMethod("3",true)); // UC 142 = true
        System.out.println(play2.humongousMethod("4",false)); // UC 12 = false
    }
}

