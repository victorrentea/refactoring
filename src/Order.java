import java.util.ArrayList;
import java.util.List;

public class Order {
    enum Status {
        NEW, IN_PROCESS, SHIPPED, DELIVERED
    }
    private Status status;
    private List<OrderLine> orderLines = new ArrayList<>();

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
}
