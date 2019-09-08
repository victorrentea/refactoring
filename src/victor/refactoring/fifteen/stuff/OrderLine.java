package victor.refactoring.fifteen.stuff;

public class OrderLine {
    private final boolean specialOffer;

    public OrderLine(boolean specialOffer) {
        this.specialOffer = specialOffer;
    }

    public boolean isSpecialOffer() {
        return specialOffer;
    }
}
