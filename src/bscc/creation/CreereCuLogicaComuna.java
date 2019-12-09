package bscc.creation;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CreereCuLogicaComuna {
    public static void main(String[] args) {
        System.out.println(new CreereCuLogicaComuna().getShapes("HAPPY"));
    }

    List<Shape> getShapes(String mood) {
        ShapeFactory factory = new ShapeFactory();
        return Arrays.asList(factory.createSquare("HAPPY"), factory.createCircle("ANGRY"));
    }
}


class ShapeFactory {
    public Square createSquare(String mood) {
        // biz logic
        // apelui de servicii web
        // LOGICA MASIVA
        return new Square(getColorByMood(mood), getBorderSize());
    }

    public Circle createCircle(String mood) {
        return new Circle(getColorByMood(mood), getBorderSize());
    }

    private Color getColorByMood(String mood) {
        switch (mood) {
            case "HAPPY":return Color.YELLOW;
            case "ANGRY":return Color.RED;
            default: return Color.WHITE;
        }
    }

    private int getBorderSize() {
        return 10 + new Random().nextInt(10);
    }
}
abstract class Shape {
    private final Color color;
    protected Shape(Color color) {
        this.color = color;
    }
}
class Square extends Shape{
    private final int edge;

    public Square(Color color, int edge) {
        super(color);
        this.edge = edge;
    }
}
class Circle extends Shape{
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }
}