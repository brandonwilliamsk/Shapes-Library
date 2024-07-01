package shapes
import geometry.*
import kotlin.math.abs

open class Rectangle(private val topLeft: Point, private val bottomRight: Point) : ShapeAbstract() {

    init {
        validateArea()
    }

    override fun move(deltaX: Double, deltaY: Double) {
        validateInputIsNumber(deltaX)
        validateInputIsNumber(deltaY)
        topLeft.move(deltaX, deltaY)
        bottomRight.move(deltaX, deltaY)
    }

    override fun getPoints(): List<Point> = listOf(topLeft, bottomRight)

    override fun calculateArea(): Double {
        val width = abs(bottomRight.getX() - topLeft.getX())
        val height = abs(bottomRight.getY() - topLeft.getY())
        val area = AreaCalculator.rectangleArea(width, height)


        return area
    }
}
