import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Play {
    public void reorderParams() {
        String d = "D", a = "A", b = "B", c = "C";
        System.out.println("Heavy logic using params: " + a + b + c + d);
    }

    public int computeCost(DayOfWeek day, boolean isPremiere) {
        int baseCost = 0;
        switch (day) {
            case SATURDAY:
            case SUNDAY: baseCost = 6; break;
            case FRIDAY: baseCost = 4; break;
            case TUESDAY:
            case THURSDAY:
            case MONDAY: baseCost = 3; break;
        }
        System.out.println("More logic computing final cost");
        return baseCost * 2;
    }

    public void buyCoupleTicket() {
        System.out.println("Allocate ticket 1");
        System.out.println("Allocate ticket 2");
        System.out.println("More logic here");
        // TODO implement buy group ticket
    }

}
