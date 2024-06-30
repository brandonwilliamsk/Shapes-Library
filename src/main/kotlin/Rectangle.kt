package shapes

import kotlin.math.abs

open class Rectangle(private val topLeft: Point, private val bottomRight: Point) : Shape() {
    init {
        if (topLeft.getX() == bottomRight.getX() || topLeft.getY() == bottomRight.getY()) {
            throw IllegalArgumentException("A rectangle cannot have 0 width or height")
        }
    }

    override fun move(deltaX: Double, deltaY: Double) {
        topLeft.move(deltaX, deltaY)
        bottomRight.move(deltaX, deltaY)
    }

    override fun getPoints(): List<Point> = listOf(topLeft, bottomRight)

    override fun calculateArea(): Double {
        val width = abs(bottomRight.getX() - topLeft.getX())
        val height = abs(bottomRight.getY() - topLeft.getY())
        return AreaCalculator.rectangleArea(width, height)
    }
}
