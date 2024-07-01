package shapes

import geometry.Point
import geometry.AreaCalculator

open class Ellipse(private val center: Point, private val radiusX: Double, private val radiusY: Double) : ShapeAbstract() {
    init {
        validateArea()
        validateRadius(radiusX)
        validateRadius(radiusY)
        validateInputIsNumber(radiusX)
        validateInputIsNumber(radiusY)
    }

    override fun move(deltaX: Double, deltaY: Double) {
        validateInputIsNumber(deltaX)
        validateInputIsNumber(deltaY)
        center.move(deltaX, deltaY)
    }

    override fun getPoints(): List<Point> = listOf(center)

    override fun calculateArea(): Double = AreaCalculator.ellipseArea(radiusX, radiusY)
}
