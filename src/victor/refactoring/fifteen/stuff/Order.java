package victor.refactoring.fifteen.stuff;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public boolean hasNoSpecialOffers() {
        return orderLines.stream().noneMatch(OrderLine::isSpecialOffer);
    }

    public boolean isPaymentFailed() {
        return status == Status.PAYMENT_FAILED;
    }

    public boolean isNew() {
        return status == Status.NEW;
    }

    public boolean canBeCancelled() {
        return isNew() && hasNoSpecialOffers() || isPaymentFailed();
    }

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
