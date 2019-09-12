package victor.refactoring.fifteen.stuff;

import victor.refactoring.fifteen.Interval;

public class CarModel {
    private final Interval yearInterval;

    public CarModel(Interval yearInterval) {
        this.yearInterval = yearInterval;
    }

    public Interval getYearInterval() {
        return yearInterval;
    }
}
