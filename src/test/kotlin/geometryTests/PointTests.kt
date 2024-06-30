package GeometryTests
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import geometry.Point


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
}
