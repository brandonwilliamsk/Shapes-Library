package shapesTest
import shapes.*
import geometry.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EllipseTest {

    @Test
    fun testGetPoints() {
        val ellipse = Ellipse(Point(2.0, 3.0), 4.0, 5.0)
        val points = ellipse.getPoints()
        assertEquals(Point(2.0, 3.0), points[0])
    }

    @Test
    fun testGetArea() {
        val ellipse = Ellipse(Point(2.0, 3.0), 4.0, 5.0)
        assertEquals(Math.PI * 4.0 * 5.0, ellipse.getArea())
    }

    @Test
    fun testMove() {
        val ellipse = Ellipse(Point(2.0, 3.0), 4.0, 5.0)
        ellipse.move(1.0, 1.0)
        assertEquals(Point(3.0, 4.0), ellipse.getPoints()[0])
    }
}
