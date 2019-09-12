package victor.refactoring.fifteen;

import victor.refactoring.fifteen.stuff.*;

import java.time.DayOfWeek;
import java.util.*;
import java.util.stream.Collectors;

public class Play1 {
    // TODO reorder + rename
    public void reorderParams() {
        String d = "D", a = "A", b = "B", c = "C";
        numeInteligent(a, b, c, d);
    }

    private void numeInteligent(String a, String b, String c, String d) {
        System.out.println("Heavy logic using params: " + a + b + c + d);
    }

    // TODO Ctrl-Z. enlarge extraction
    // TODO early return (guards)
    // TODO distill switches
    public int computePrice(DayOfWeek day, boolean isPremiere) {
        if (day == null) {
            throw new IllegalArgumentException("No day provided!");
        }
        int baseCost = doarSwitchul(day);
        System.out.println("More logic computing final cost using " + isPremiere);
        return baseCost * 2;
    }

    private int doarSwitchul(DayOfWeek day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY: return 6;
            case FRIDAY: return 4;
            case TUESDAY:
            case THURSDAY:
            case MONDAY: return 3;
            case WEDNESDAY: return 0; // tocmai am gasit un bug
            default: throw new IllegalArgumentException(day.name());
        }
    }

    // TODO extract var; extract met; inline var
    public void buyCoupleTicket() {
        allocateOneTicket(1);
        allocateOneTicket(2);
        System.out.println("More logic here");
        // TODO implement buy group ticket
    }

    private void allocateOneTicket(int index) {
        System.out.println("Allocate ticket " + index);
    }

    // TODO encapsulate conditionals
    // TODO 'feature envy' smell
    public void cancelOrder(Order order) {
        if (order.canBeCancelled()) {
            System.out.println("Logic to cancel order");
        } else {
            throw new IllegalArgumentException("Order cannot be cancelled!");
        }
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
        CumVreiTu cumVreiTu = new CumVreiTu(name).invoke();
        Map<String, Object> params = cumVreiTu.getParams();
        String query = cumVreiTu.getQuery();

        System.out.println("Build and run the query: " + query + " with params: " + params);
    }

    // TODO extract pure (mind the side effects)
    public List<UserDto> getAllUsers() {
        List<User> allUsers = getFromRepository();
        return allUsers.stream().map(this::convertUser).collect(Collectors.toList());
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

}
