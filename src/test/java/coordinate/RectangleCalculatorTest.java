package coordinate;

import coordinate.model.Point;
import coordinate.distance.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleCalculatorTest {


    @Test
    void 사각형_넓이_구하기() {
        Coordinates rectangle = new Coordinates();
        rectangle.add(new Point(10, 10));
        rectangle.add(new Point(22, 10));
        rectangle.add(new Point(22, 18));
        rectangle.add(new Point(10, 18));

        RectangleCalculator rectangleCalculator = new RectangleCalculator(rectangle);
        assertEquals(96, rectangleCalculator.calculateArea());
    }

    @Test
    void create() {
        Coordinates threePoints = new Coordinates();
        threePoints.add(new Point(10, 10));
        threePoints.add(new Point(22, 10));
        threePoints.add(new Point(22, 18));

        assertThrows(IllegalArgumentException.class, () -> new RectangleCalculator(threePoints));
    }
}
