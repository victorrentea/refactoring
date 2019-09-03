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
        System.out.println("Buy ticket 1");
        System.out.println("Buy ticket 2");
        System.out.println("More logic here");
    }

    public void enlargeExtraction(String fromDateStr, String toDateStr) {
        DayOfWeek.valueOf("a");
        LocalDate fromDate = LocalDate.parse(fromDateStr, DateTimeFormatter.ISO_DATE);
        LocalDate toDate = LocalDate.parse(toDateStr, DateTimeFormatter.ISO_DATE);

        System.out.println("Further logic using " + fromDate + " and " + toDate);
    }


    public static void main(String[] args) {
        new Play().enlargeExtraction("2019-01-0a1", "2020-01-01");
    }
}
