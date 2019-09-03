import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Play {
    public void reorderParams() {
        String d = "D", a = "A", b = "B", c = "C";
        System.out.println("Heavy logic using params: " + a + b + c + d);
    }

    // TODO enlarge extraction
    // TODO early return (guards)
    // TODO distill switches
    public int computeCost(DayOfWeek day, boolean isPremiere) {
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
                order.getOrderLines().stream().noneMatch(OrderLine::isSpecialOffer)) {
            System.out.println("Logic to cancel order");
        } else {
            throw new IllegalArgumentException("Order cannot be cancelled!");
        }
    }

    // TODO Extract to MathUtil
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

    // TODO wrap call
    public int humongousMethod(String b) {
        System.out.println("Huge complex code");
        if (b == null) {
            return 1;
        }
        System.out.println("With different return points");
        return 0;
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


}
