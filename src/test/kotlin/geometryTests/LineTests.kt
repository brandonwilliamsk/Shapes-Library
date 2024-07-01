package geometryTests
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import geometry.Point
import geometry.Line
import org.junit.jupiter.api.assertThrows

class LineTest {

    @Test
    fun testGetPoints() {
        val point1 = Point(1.0, 2.0)
        val point2 = Point(3.0, 4.0)
        val line = Line(point1, point2)
        val points = line.getPoints()
        assertEquals(point1, points[0])
        assertEquals(point2, points[1])
    }

    @Test
    fun testGetPoint1() {
        val point1 = Point(1.0, 2.0)
        val point2 = Point(3.0, 4.0)
        val line = Line(point1, point2)
        assertEquals(point1, line.getPoint1())
    }

    @Test
    fun testGetPoint2() {
        val point1 = Point(1.0, 2.0)
        val point2 = Point(3.0, 4.0)
        val line = Line(point1, point2)
        assertEquals(point2, line.getPoint2())
    }

    @Test
    fun testGetSlope() {
        val line = Line(Point(1.0, 2.0), Point(3.0, 4.0))
        assertEquals(1.0, line.getSlope())
    }

    @Test
    fun testGetLength() {
        val line = Line(Point(1.0, 2.0), Point(4.0, 6.0))
        assertEquals(5.0, line.getLength())
    }

    @Test
    fun testMove() {
        val line = Line(Point(1.0, 2.0), Point(3.0, 4.0))
        line.move(1.0, 1.0)
        assertEquals(Point(2.0, 3.0), line.getPoints()[0])
        assertEquals(Point(4.0, 5.0), line.getPoints()[1])
    }
    @Test
    fun testInvalidPoint1() {
        assertThrows<IllegalArgumentException> {
            Line(Point(Double.NaN, 2.0), Point(3.0, 4.0))
        }
    }

    @Test
    fun testInvalidPoint2() {
        assertThrows<IllegalArgumentException> {
            Line(Point(1.0, 2.0), Point(Double.POSITIVE_INFINITY, 4.0))
        }
    }
}
