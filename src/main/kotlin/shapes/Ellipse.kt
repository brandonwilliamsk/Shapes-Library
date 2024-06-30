package shapes
import geometry.Point
import geometry.AreaCalculator


open class Ellipse(private val center: Point, private val radiusX: Double, private val radiusY: Double) : Shape() {
    override fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }

    override fun getPoints(): List<Point> = listOf(center)

    override fun calculateArea(): Double = AreaCalculator.ellipseArea(radiusX, radiusY)
}
