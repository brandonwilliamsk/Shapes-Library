package shapesTest
import geometry.*
import shapes.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RectangleTest {

    @Test
    fun testGetPoints() {
        val rect = Rectangle(Point(1.0, 2.0), Point(4.0, 6.0))
        val points = rect.getPoints()
        assertEquals(Point(1.0, 2.0), points[0])
        assertEquals(Point(4.0, 6.0), points[1])
    }

    @Test
    fun testGetArea() {
        val rect = Rectangle(Point(1.0, 2.0), Point(4.0, 6.0))
        assertEquals(12.0, rect.getArea())
    }

    @Test
    fun testMove() {
        val rect = Rectangle(Point(1.0, 2.0), Point(4.0, 6.0))
        rect.move(1.0, 1.0)
        assertEquals(Point(2.0, 3.0), rect.getPoints()[0])
        assertEquals(Point(5.0, 7.0), rect.getPoints()[1])
    }
}
