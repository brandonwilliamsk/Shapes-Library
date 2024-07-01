package shapesTest
import shapes.*
import geometry.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CircleTest {

    @Test
    fun testGetPoints() {
        val circle = Circle(Point(2.0, 3.0), 5.0)
        val points = circle.getPoints()
        assertEquals(Point(2.0, 3.0), points[0])
    }

    @Test
    fun testGetArea() {
        val circle = Circle(Point(2.0, 3.0), 5.0)
        assertEquals(Math.PI * 5.0 * 5.0, circle.getArea())
    }

    @Test
    fun testMove() {
        val circle = Circle(Point(2.0, 3.0), 5.0)
        circle.move(1.0, 1.0)
        assertEquals(Point(3.0, 4.0), circle.getPoints()[0])
    }
}
