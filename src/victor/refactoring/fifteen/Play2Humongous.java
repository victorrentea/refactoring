package victor.refactoring.fifteen;

public class Play2Humongous {

    // TODO do yet one more thing before and after, every time. Z
    // TODO avoid boolean params
    // TODO extract'n'test + mock away
    public int humongousMethod(String a, boolean boulean) {
        System.out.println("Huge complex code A with " + a);
        if (boulean) {
            System.out.println("More optional logic");
        }
        if (Integer.parseInt(a) == 1) {
            System.out.println("Heavy Logic With many return points - TEST ME! " + a);
            return 1;
        }
        System.out.println("Yet more code");
        return 0;
    }

    public void clientCode() {
        System.out.println(humongousMethod("1",true));
        System.out.println(humongousMethod("2",true));
        System.out.println(humongousMethod("3",false));
    }
}


// Done? Now think of a real-life deeply nested function. "BOSS-level" :)
