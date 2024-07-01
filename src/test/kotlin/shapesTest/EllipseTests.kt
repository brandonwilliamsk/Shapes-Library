package shapesTest

import geometry.Point
import shapes.Ellipse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

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
        val area = ellipse.getArea()
        assertEquals(Math.PI * 4.0 * 5.0, area)
    }

    @Test
    fun testMove() {
        val ellipse = Ellipse(Point(2.0, 3.0), 4.0, 5.0)
        ellipse.move(1.0, 1.0)
        assertEquals(Point(3.0, 4.0), ellipse.getPoints()[0])
    }
}
