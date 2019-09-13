package victor.refactoring.fifteen.stuff;

public class MathUtil {
    // http://world.std.com/~swmcd/steven/tech/interval.html
    public static boolean intervalsIntersect(int start1, int end1, int start2, int end2) {
        return start1 <= end2 && start2 <= end1;
    }
}
