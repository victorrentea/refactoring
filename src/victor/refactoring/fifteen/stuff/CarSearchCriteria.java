package victor.refactoring.fifteen.stuff;

import victor.refactoring.fifteen.Interval;

public class CarSearchCriteria {
    private final Interval yearInterval;


    public CarSearchCriteria(Interval yearInterval) {
        this.yearInterval = yearInterval;
    }

    public Interval getYearInterval() {
        return yearInterval;
    }
}
