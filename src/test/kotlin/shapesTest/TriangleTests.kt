package shapesTest
import shapes.*
import geometry.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class TriangleTest {

    @Test
    fun testGetPoints() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        val points = triangle.getPoints()
        assertEquals(Point(0.0, 0.0), points[0])
        assertEquals(Point(4.0, 0.0), points[1])
        assertEquals(Point(0.0, 3.0), points[2])
    }

    @Test
    fun testGetArea() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        assertEquals(6.0, triangle.getArea())
    }

    @Test
    fun testMove() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        triangle.move(1.0, 1.0)
        assertEquals(Point(1.0, 1.0), triangle.getPoints()[0])
        assertEquals(Point(5.0, 1.0), triangle.getPoints()[1])
        assertEquals(Point(1.0, 4.0), triangle.getPoints()[2])
    }

    @Test
    fun testCreateTriangleWithZeroArea() {
        assertThrows<IllegalArgumentException> {
            Triangle(Point(0.0, 0.0), Point(0.0, 0.0), Point(0.0, 0.0))
        }
    }


    @Test
    fun testTriangleAreaGreaterThanZero() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        assertTrue(triangle.getArea() > 0.0)
    }
    @Test
    fun testCreateTriangleWithNaN() {
        assertThrows<IllegalArgumentException> {
            Triangle(Point(Double.NaN, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        }
        assertThrows<IllegalArgumentException> {
            Triangle(Point(0.0, Double.NaN), Point(4.0, 0.0), Point(0.0, 3.0))
        }
        assertThrows<IllegalArgumentException> {
            Triangle(Point(0.0, 0.0), Point(Double.NaN, 0.0), Point(0.0, 3.0))
        }
        assertThrows<IllegalArgumentException> {
            Triangle(Point(0.0, 0.0), Point(4.0, Double.NaN), Point(0.0, 3.0))
        }
        assertThrows<IllegalArgumentException> {
            Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(Double.NaN, 3.0))
        }
        assertThrows<IllegalArgumentException> {
            Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, Double.NaN))
        }
    }
}
