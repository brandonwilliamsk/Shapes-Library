package shapesTest
import shapes.*
import geometry.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

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
    @Test
    fun testCreateCircleWithZeroRadius() {
        assertThrows<IllegalArgumentException> {
            Circle(Point(2.0, 3.0), 0.0)
        }
    }

    @Test
    fun testCreateCircleWithNegativeRadius() {
        assertThrows<IllegalArgumentException> {
            Circle(Point(2.0, 3.0), -1.0)
        }
    }
    @Test
    fun testCreateCircleWithNaNRadius() {
        assertThrows<IllegalArgumentException> {
            Circle(Point(2.0, 3.0), Double.NaN)
        }
    }
    @Test
    fun testCreateCircleWithNaNPoint() {
        assertThrows<IllegalArgumentException> {
            Circle(Point(Double.NaN, 3.0), 5.0)
        }
    }
}
