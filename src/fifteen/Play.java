package fifteen;

import fifteen.stuff.*;

import java.time.DayOfWeek;
import java.util.*;

public class Play {
    public void reorderParams() {
        String d = "D", a = "A", b = "B", c = "C";
        System.out.println("Heavy logic using params: " + a + b + c + d);
    }

    // TODO Ctrl-Z. enlarge extraction
    // TODO early return (guards)
    // TODO distill switches
    public int computePrice(DayOfWeek day, boolean isPremiere) {
        int baseCost = 0;
        if (day != null) {
            switch (day) {
                case SATURDAY:
                case SUNDAY: baseCost = 6; break;
                case FRIDAY: baseCost = 4; break;
                case TUESDAY:
                case THURSDAY:
                case MONDAY: baseCost = 3; break;
            }
        } else {
            throw new IllegalArgumentException("No day provided!");
        }
        System.out.println("More logic computing final cost using " + isPremiere);
        return baseCost * 2;
    }

    // TODO extract var+met then inline var
    public void buyCoupleTicket() {
        System.out.println("Allocate ticket 1");
        System.out.println("Allocate ticket 2");
        System.out.println("More logic here");
        // TODO implement buy group ticket
    }

    // TODO encapsulate conditionals
    // TODO 'feature envy' smell
    public void cancelOrder(Order order) {
        if (order.getStatus() == Order.Status.NEW &&
                order.getOrderLines().stream().noneMatch(OrderLine::isSpecialOffer)
            || order.getStatus() == Order.Status.PAYMENT_FAILED) {
            System.out.println("Logic to cancel order");
        } else {
            throw new IllegalArgumentException("fifteen.stuff.Order cannot be cancelled!");
        }
    }

    // TODO Extract to fifteen.stuff.MathUtil
    // TODO Create Value Object
    public List<CarModel> filterCarModels(CarSearchCriteria criteria, List<CarModel> models) {
        List<CarModel> results = new ArrayList<>(models);
        results.removeIf(model -> ! intersects(
                model.getStartYear(), model.getEndYear(),
                criteria.getStartYear(), criteria.getEndYear()));
        System.out.println("More filtering logic");
        return results;
    }
    // http://world.std.com/~swmcd/steven/tech/interval.html
    private boolean intersects(int start1, int end1, int start2, int end2) {
        return start1 <= end2 && start2 <= end1;
    }

    // TODO Extract method object

    public void search(String name) {
        Map<String, Object> params = new HashMap<>();
        String query = "SELECT e FROM Person e WHERE 1 = 1 ";

        if (name != null) {
            query += " AND e.name = :name";
            params.put("name", name);
        } // + 20 similar

        System.out.println("Launch the query: " + query + " with params: " + params);
    }
    // TODO extract pure (mind the side effects)

    public List<UserDto> getAllUsers() {
        List<User> allUsers = getFromRepository();
        List<UserDto> userDtos = new ArrayList<>();
        for (User user : allUsers) {
            UserDto dto = new UserDto();
            dto.name = user.getName().toUpperCase();
            dto.email = user.getEmail();
            userDtos.add(dto);
        }
        return userDtos;
    }
    private List<User> getFromRepository() {
        return Arrays.asList(new User()); // fake
    }

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
