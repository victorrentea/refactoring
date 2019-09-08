package victor.refactoring.fifteen;

public class Play3Strategy {

    // TODO introduce Strategy Design Pattern
    private int calculateComission(String userCountry, int basePrice) {
        if ("US".equals(userCountry)) {
            System.out.println("Big Ugly Logic (50 lines)");
            return basePrice * 2 + 1;
        } else if ("CN".equals(userCountry)) {
            System.out.println("More logic");
            return basePrice * 5 + 2;
        } else if ("UK".equals(userCountry)) {
            System.out.println("Taxes, taxes");
            return basePrice + 10;
        }
        throw new IllegalArgumentException(userCountry);
    }

}
