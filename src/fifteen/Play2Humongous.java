package fifteen;

import fifteen.stuff.*;

import java.time.DayOfWeek;
import java.util.*;

public class Play2Humongous {

    // TODO avoid boolean params
    // TODO wrap call when b=false
    // TODO extract'n'test + mock away
    public int humongousMethod(String a, boolean boulean) {
        System.out.println("Huge complex code A with " + a);
        if (boulean) {
            System.out.println("More optional logic");
        }
        if (Integer.parseInt(a) == 1) {
            System.out.println("With different return points");
            return 1;
        }
        System.out.println("Yet more code");
        return 0;
    }
}
