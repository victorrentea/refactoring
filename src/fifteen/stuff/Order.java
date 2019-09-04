package fifteen.stuff;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public enum Status {
        NEW, IN_PROCESS, SHIPPED, DELIVERED, PAYMENT_FAILED
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
