package shapes

import geometry.AreaCalculator
import geometry.Point

class Triangle(private val pointA: Point, private val pointB: Point, private val pointC: Point) : ShapeAbstract() {
    init {
        validateArea()
    }

    override fun move(deltaX: Double, deltaY: Double) {
        validateInputIsNumber(deltaX)
        validateInputIsNumber(deltaY)
        pointA.move(deltaX, deltaY)
        pointB.move(deltaX, deltaY)
        pointC.move(deltaX, deltaY)
    }

    override fun getPoints(): List<Point> = listOf(pointA, pointB, pointC)

    override fun calculateArea(): Double = AreaCalculator.triangleArea(pointA, pointB, pointC)
}
