package victor.refactoring.fifteen;

import victor.refactoring.fifteen.stuff.*;

import java.time.DayOfWeek;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Play1 {
    // TODO reorder + rename
    public void reorderParams() {
        String d = "D", a = "A", b = "B", c = "C";
        stuff1(a, b, c, d);
    }

    private void stuff1(String a, String b, String c, String d) {
        System.out.println("Heavy logic using params: " + a + b + c + d);
    }

    // TODO Ctrl-Z. enlarge extraction
    // TODO early return (guards)
    // TODO distill switches
    public int computePrice(DayOfWeek day, boolean isPremiere) {
        if (day == null) {
            throw new IllegalArgumentException("No day provided!");
        }
        int baseCost = onlyTheSwitch(day);
        System.out.println("More logic computing final cost using " + isPremiere);
        return baseCost * 2;
    }

    private int onlyTheSwitch(DayOfWeek day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY: return 6;
            case FRIDAY: return 4;
            case TUESDAY:
            case THURSDAY:
            case MONDAY: return 3;
//            case WEDNESDAY: throw new IllegalArgumentException()// TODO possible bug
            default: throw new IllegalArgumentException(day.name());
        }
    }



    // TODO extract var; extract met; inline var
    public void buyCoupleTicket() {
        buyTicket(1);
        buyTicket(2);
        System.out.println("More logic here");
        // TODO implement buy group ticket
        for (int i = 0; i < 6; i++) {
            buyTicket(i);
        }
        }

    private void buyTicket(int index) {
        System.out.println("Allocate ticket " + index);
    }

    // TODO encapsulate conditionals
    // TODO 'feature envy' smell
    public void cancelOrder(Order order) {
        if (canBeCancelled(order)) {
            System.out.println("Logic to cancel order");
        } else {
            throw new IllegalArgumentException("Order cannot be cancelled!");
        }
    }

    private boolean canBeCancelled(Order order) {
        return order.isNew() && order.hasNoSpecialOffers() || order.isPaymentFailed();
    }

    // TODO Extract to fifteen.stuff.MathUtil
    // TODO Create Value Object
    public List<CarModel> filterCarModels(CarSearchCriteria criteria, List<CarModel> models) {
        List<CarModel> results = new ArrayList<>(models);
        results.removeIf(model -> ! model.getYearInterval().intersects(criteria.getYearInterval()));
        System.out.println("More filtering logic");
        return results;
    }

    // TODO Extract method object
    public void search(String name) {
        Tz Tz = new Tz(name).invoke();
        Map<String, Object> params = Tz.getParams();
        String query = Tz.getQuery();

        System.out.println("Build and run the query: " + query + " with params: " + params);
    }

    // TODO extract pure (mind the side effects)
    public List<UserDto> getAllUsers() {
        return getFromRepository().stream().map(this::convertUser).collect(toList());
    }

    private UserDto convertUser(User user) {
        UserDto dto = new UserDto();
        dto.name = user.getName().toUpperCase();
        dto.email = user.getEmail();
        return dto;
    }

    private List<User> getFromRepository() {
        return Arrays.asList(new User()); // fake ;)
    }











    private class Tz {
        private String name;
        private Map<String, Object> params;
        private String query;

        public Tz(String name) {
            this.name = name;
        }
        public Map<String, Object> getParams() {
            return params;
        }
        public String getQuery() {
            return query;
        }
        public Tz invoke() {
            params = new HashMap<>();
            query = "SELECT e FROM Person e WHERE 1 = 1 ";

            if (name != null) {
                query += "    AND e.name = :name   ";
                params.put("name", name);
            } // + 20 similar
            return this;
        }
    }
}
