import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(5, 3));

        var areaCalculator = new AreaCalculator();

        for(Shape s : shapes)
            s.accept(areaCalculator);

        ShapeDrawer shapeDrawer = new ShapeDrawer();
        shapeDrawer.visit(new Circle(20));
        shapeDrawer.visit(new Rectangle(5,6));
    }
}
