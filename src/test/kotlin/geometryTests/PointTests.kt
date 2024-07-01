package geometryTests
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import geometry.Point
import org.junit.jupiter.api.assertThrows


class PointTest {

    @Test
    fun testGetXAndY() {
        val point = Point(3.0, 4.0)
        assertEquals(3.0, point.getX())
        assertEquals(4.0, point.getY())
    }

    @Test
    fun testClone() {
        val point = Point(3.0, 4.0)
        val clone = point.clone()
        assertEquals(point.getX(), clone.getX())
        assertEquals(point.getY(), clone.getY())
    }

    @Test
    fun testMove() {
        val point = Point(3.0, 4.0)
        point.move(1.0, 2.0)
        assertEquals(4.0, point.getX())
        assertEquals(6.0, point.getY())
    }
    @Test
    fun testValidPointCreation() {
        val point = Point(3.0, 4.0)
        assertEquals(3.0, point.getX())
        assertEquals(4.0, point.getY())
    }

    @Test
    fun testInvalidPointCreationNaN() {
        assertThrows<IllegalArgumentException> {
            Point(Double.NaN, 4.0)
        }
        assertThrows<IllegalArgumentException> {
            Point(3.0, Double.NaN)
        }
    }

    @Test
    fun testInvalidPointCreationInfinity() {
        assertThrows<IllegalArgumentException> {
            Point(Double.POSITIVE_INFINITY, 4.0)
        }
        assertThrows<IllegalArgumentException> {
            Point(3.0, Double.NEGATIVE_INFINITY)
        }
    }

    @Test
    fun testMoveWithInvalidValues() {
        val point = Point(3.0, 4.0)
        assertThrows<IllegalArgumentException> {
            point.move(Double.NaN, 2.0)
        }
        assertThrows<IllegalArgumentException> {
            point.move(1.0, Double.POSITIVE_INFINITY)
        }
    }
}
