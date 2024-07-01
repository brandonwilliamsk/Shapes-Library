package shapesTest
import shapes.*
import geometry.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

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
}
