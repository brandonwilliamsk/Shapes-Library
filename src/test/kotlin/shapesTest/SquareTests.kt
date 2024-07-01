package shapesTest
import geometry.*
import shapes.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SquareTest {

    @Test
    fun testGetPoints() {
        val square = Square(Point(1.0, 2.0), 3.0)
        val points = square.getPoints()
        assertEquals(Point(1.0, 2.0), points[0])
        assertEquals(Point(4.0, 5.0), points[1])
    }

    @Test
    fun testGetArea() {
        val square = Square(Point(1.0, 2.0), 3.0)
        assertEquals(9.0, square.getArea())
    }

    @Test
    fun testMove() {
        val square = Square(Point(1.0, 2.0), 3.0)
        square.move(1.0, 1.0)
        assertEquals(Point(2.0, 3.0), square.getPoints()[0])
        assertEquals(Point(5.0, 6.0), square.getPoints()[1])
    }
    @Test
    fun testSquareProperties() {
        val square = Square(Point(1.0, 2.0), 3.0)
        val points = square.getPoints()
        val sideLength = points[1].getX() - points[0].getX()
        assertEquals(sideLength, points[1].getY() - points[0].getY())
    }
}
