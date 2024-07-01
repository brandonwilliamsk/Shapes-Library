package shapes

import geometry.Point
import geometry.AreaCalculator

open class Ellipse(private val center: Point, private val radiusX: Double, private val radiusY: Double) : shapeAbstract() {
    init {
        require(radiusX > 0 && radiusY > 0) {
            "Both radii must be greater than zero"
        }
    }

    override fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }

    override fun getPoints(): List<Point> = listOf(center)

    override fun calculateArea(): Double = AreaCalculator.ellipseArea(radiusX, radiusY)
}
