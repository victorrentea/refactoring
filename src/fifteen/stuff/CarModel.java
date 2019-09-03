package fifteen.stuff;

public class CarModel {
    private final int startYear;
    private final int endYear;

    public CarModel(int startYear, int endYear) {
        if (startYear > endYear) throw new IllegalArgumentException("start larger than end");
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public int getStartYear() {
        return startYear;
    }
}
